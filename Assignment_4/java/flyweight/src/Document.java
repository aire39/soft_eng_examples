import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.io.*;
import java.util.Scanner;
import java.util.Vector;

// referenced: https://stackoverflow.com/questions/9650992/how-to-change-text-color-in-the-jtextarea for the JPane work

public class Document {
    private Vector<Text> texts;
    private FlyWeightText flyweightText;
    private String filename;

    private JTextPane textPane;
    private JFrame jframe;

    Document(String filename) {
        texts = new Vector<>();
        flyweightText = new FlyWeightText();
        this.filename = filename;

        EmptyBorder eb = new EmptyBorder(new Insets(10, 10, 10, 10));
        textPane = new JTextPane();
        textPane.setBorder(eb);
        textPane.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        textPane.setMargin(new Insets(5, 5, 5, 5));

        jframe = new JFrame("Title");
        jframe.add(textPane);
        jframe.setSize(new Dimension(640, 480));
    }

    void AddText(String new_text) {
        TextType text_type = flyweightText.GetLastTextType();
        Text text = new Text(new_text, text_type);
        texts.add(text);
    }

    void AddText(String new_text, FontType font_type, int font_size, ColorType color_type) {
        TextType text_type = flyweightText.GetTextType(font_type, font_size, color_type);
        Text text = new Text(new_text, text_type);
        texts.add(text);
    }

    void Save() throws IOException {
        FileWriter output_file = new FileWriter(filename);

        for (Text t : texts) {
            output_file.write(t.Gettext() + "\n");
            output_file.write(t.GetTextType().GetPropertiesAsString() + "\n");
        }

        output_file.close();
    }

    void Load(String filename) throws IOException {
        BufferedReader input_file = new BufferedReader(new FileReader(filename));

        String text = new String();

        FontType font_type;
        int font_size;
        ColorType color_type;

        int read_text_on_even = 0;
        String text_line;
        while ((text_line = input_file.readLine()) != null) {
            if ((read_text_on_even % 2) == 0) {
                text = text_line;
            }
            else {
                Scanner line_reader = new Scanner(text_line);
                Vector<String> words = new Vector<>();

                while (line_reader.hasNext()) {
                    words.add(line_reader.next());
                }

                switch (words.get(0)) {
                    case "ARIAL":
                        font_type = FontType.ARIAL;
                     break;

                    case "CALIBRI":
                        font_type = FontType.CALIBRI;
                        break;

                    case "VERDANA":
                        font_type = FontType.VERDANA;
                        break;
                    default:
                        font_type = FontType.ARIAL;
                        System.err.println("Unable to recognize font type. default to Arial!");
                }

                font_size = Integer.parseInt(words.get(1));

                color_type = new ColorType(Short.parseShort(words.get(2)), Short.parseShort(words.get(3)), Short.parseShort(words.get(4)));

                System.out.println("Loading text and propties from " + filename + ": " + text + " " + font_type.toString() + "  " + font_size + " " + color_type.toString());
                AddText(text, font_type, font_size, color_type);
            }

            read_text_on_even += 1;

        }
    }

    private void appendToPane(JTextPane text_pane, String msg, Color color, int font_size, FontType font_type) {
        StyleContext style_context = StyleContext.getDefaultStyleContext();
        AttributeSet attribute_set = style_context.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, color);

        switch (font_type) {
            case ARIAL:
                attribute_set = style_context.addAttribute(attribute_set, StyleConstants.FontFamily, "Arial");
                break;

            case CALIBRI:
                attribute_set = style_context.addAttribute(attribute_set, StyleConstants.FontFamily, "Calibri");
                break;

            case VERDANA:
                attribute_set = style_context.addAttribute(attribute_set, StyleConstants.FontFamily, "Verdana");
                break;
        }

        attribute_set = style_context.addAttribute(attribute_set, StyleConstants.Alignment, StyleConstants.ALIGN_JUSTIFIED);
        attribute_set = style_context.addAttribute(attribute_set, StyleConstants.Size, font_size);

        int len = text_pane.getDocument().getLength();
        text_pane.setCaretPosition(len);
        text_pane.setCharacterAttributes(attribute_set, false);
        text_pane.replaceSelection(msg);
    }
    void Show() {

        for (Text t : texts) {
            int font_size = t.textType.GetFontSize();
            ColorType color_type = t.textType.GetColorType();
            FontType font_type = t.textType.GetFontType();

            appendToPane(textPane, t.Gettext(), new Color(color_type.red, color_type.green, color_type.blue), font_size, font_type);
        }

        textPane.setVisible(true);
        jframe.setVisible(true);
    }
}
