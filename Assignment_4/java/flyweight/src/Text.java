public class Text {
    private String text;
    TextType textType = null;

    Text(String text) {
        SetText(text);
    }

    Text(String text, TextType text_type) {
        SetText(text);
        SetTextType(text_type);
    }

    void SetText(String text) {
        this.text = text;
    }

    void SetTextType(TextType text_type) {
        textType = text_type;
    }

    String Gettext() {
        return text;
    }

    TextType GetTextType() {
        return textType;
    }
}
