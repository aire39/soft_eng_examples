#pragma once
#include <cstdint>

enum class FontType {Arial, Calibri, Verdana};
struct ColorType
{
  uint8_t r;
  uint8_t g;
  uint8_t b;

  static ColorType Black()
  {
    return {0, 0, 0};
  }

  static ColorType Red()
  {
    return {255, 0, 0};
  }

  static ColorType Green()
  {
    return {0, 255, 0};
  }

  static ColorType Blue()
  {
    return {0, 0, 255};
  }

  bool operator==(const ColorType & color_type) const
  {
    return ((r == color_type.r) && (g == color_type.g) && (b == color_type.b));
  }
};

class TextType {
  public:
    TextType(FontType font, int font_size, ColorType color_type);

    const FontType & GetFont();
    const int & GetFontSize();
    const ColorType & GetColorType();

  private:
    FontType font;
    int fontSize;
    ColorType colorType;
};
