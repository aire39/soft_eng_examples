//
// Created by Sean on 4/21/2023.
//

#include "Text.h"
#include "TextType.h"

Text::Text(std::string text)
{
    SetText(std::move(text));
}

Text::Text(std::string text, TextType * text_type)
{
  SetText(std::move(text));
  SetTextType(text_type);
}

void Text::SetText(std::string new_text)
{
  text = std::move(new_text);
}

void Text::SetTextType(TextType * text_type)
{
  textType = text_type;
}

const std::string & Text::GetText()
{
  return text;
}
