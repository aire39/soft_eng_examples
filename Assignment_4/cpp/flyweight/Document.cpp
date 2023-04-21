//
// Created by Sean on 4/21/2023.
//

#include "Document.h"
#include <iostream>
#include <utility>

Document::Document(std::string name)
{
    filename = name;
}

void Document::AddText(std::string new_text)
{
  auto text_type = flyweightText.GetLastUsedTextType();
  texts.emplace_back(std::move(new_text), text_type);
}

void Document::AddText(std::string text, FontType font_type, int font_size, ColorType color_type)
{
  auto text_type = flyweightText.GetTextType(font_type, font_size, color_type);
  texts.emplace_back(std::move(text), text_type);
}

std::string Document::GetFilename()
{
  return filename;
}

void Document::Save()
{
  std::ofstream output (filename);

  for (auto & t : texts)
  {
      output << t.GetText();
  }

  output.close();

  std::cout << "Saved file: " << filename << std::endl;
}
