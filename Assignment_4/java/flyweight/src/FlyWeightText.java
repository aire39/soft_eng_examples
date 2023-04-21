import java.util.Vector;

public class FlyWeightText {
    private final Vector<TextType> textTypes;
    private TextType lastTextType;

    FlyWeightText() {
        textTypes = new Vector<>();
    }

    TextType GetTextType(FontType font_type, int font_size, ColorType color_type) {
        TextType text_type_return = null;


        for (TextType tt : textTypes) {
            if ((tt.GetFontType() == font_type) && (tt.GetFontSize() == font_size) && (tt.GetColorType().IsSame(color_type))) {
              text_type_return = tt;
              lastTextType = text_type_return;
              System.out.println("Found existing TexType!");
              break;
            }
        }

        if (text_type_return == null) {
            text_type_return = new TextType(font_type, font_size, color_type);
            textTypes.add(text_type_return);
            lastTextType = text_type_return;
            System.out.println("Creating new TexType!");
        }

        return text_type_return;
    }

    TextType GetLastTextType() {
        return lastTextType;
    }
}
