#pragma once

#include <memory>
#include <vector>

#include "TextType.h"

class FlyWeightText
{
  public:
    FlyWeightText() = default;
    TextType * GetTextType(FontType font_type, int font_size, ColorType color_type);
    TextType * GetLastUsedTextType();

private:
    std::vector<std::unique_ptr<TextType>> textTypes;
    TextType * lastUsedTextType;
};
