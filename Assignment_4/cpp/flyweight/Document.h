#pragma once

#include <fstream>
#include <vector>
#include <memory>
#include <string>
#include <tuple>
#include "Text.h"
#include "TextType.h"
#include "FlyWeightText.h"

class Document {
  public:
    Document() = delete;
    explicit Document(std::string name);

    void AddText(std::string new_text);
    void AddText(std::string new_text, FontType font_type, int font_size, ColorType color_type);

    std::string GetFilename();

    void Save();

    void operator<< (const std::string & rhs)
    {
      AddText(rhs);
    }

    void operator<< (const std::tuple<FontType, int, ColorType> & rhs)
    {
      FontType font;
      int text_size = 0;
      ColorType color_type{};

      std::tie(font, text_size, color_type) = rhs;
      flyweightText.GetTextType(font, text_size, color_type);
    }

  private:
    std::vector<Text> texts;
    FlyWeightText flyweightText;
    std::string filename;
};
