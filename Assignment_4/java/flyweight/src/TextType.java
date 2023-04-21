public class TextType {

    FontType fontType;
    int fontSize;
    ColorType colorType;

    TextType(FontType font_type, int font_size, ColorType color_type) {
        fontType = font_type;
        fontSize = font_size;
        colorType = color_type;
    }

    FontType GetFontType() {
        return fontType;
    }

    int GetFontSize() {
        return fontSize;
    }

    ColorType GetColorType() {
        return colorType;
    }

    String GetPropertiesAsString() {
        String properties = fontType.toString() + " " + fontSize + " " + colorType.toString();
        return properties;
    }
}
