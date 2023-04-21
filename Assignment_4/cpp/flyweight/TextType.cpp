//
// Created by Sean on 4/21/2023.
//

#include "TextType.h"

TextType::TextType(FontType font, int font_size, ColorType color_type)
  : font(font)
  , fontSize(font_size)
  , colorType(color_type)
{
}

const FontType & TextType::GetFont()
{
  return font;
}

const int & TextType::GetFontSize()
{
  return fontSize;
}

const ColorType & TextType::GetColorType()
{
  return colorType;
}