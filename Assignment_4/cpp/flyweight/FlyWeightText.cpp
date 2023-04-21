//
// Created by Sean on 4/21/2023.
//

#include "FlyWeightText.h"
#include "TextType.h"

#include <iostream>

TextType * FlyWeightText::GetTextType(FontType font_type, int font_size, ColorType color_type)
{
  TextType * text_type_return = nullptr;
  for (auto & t : textTypes)
  {
    if ((t->GetFont() == font_type) && (t->GetFontSize() == font_size) && (t->GetColorType() == color_type))
    {
      std::cout << "found existing text type to use!" << std::endl;
      text_type_return = t.get();
      lastUsedTextType = text_type_return;
      break;
    }
  }

  if (!text_type_return)
  {
    std::cout << "unique text type created and will add to list of text types!" << std::endl;
    auto new_text_type = std::make_unique<TextType>(font_type, font_size, color_type);
    textTypes.push_back(std::move(new_text_type));
    text_type_return = textTypes[textTypes.size()-1].get();
    lastUsedTextType = text_type_return;
  }

  return text_type_return;
}

TextType * FlyWeightText::GetLastUsedTextType()
{
  if (!lastUsedTextType)
  {
    auto new_text_type = std::make_unique<TextType>(FontType::Arial, 12, ColorType::Black());
    textTypes.push_back(std::move(new_text_type));
    lastUsedTextType = textTypes[textTypes.size()-1].get();
  }

  return lastUsedTextType;
}
