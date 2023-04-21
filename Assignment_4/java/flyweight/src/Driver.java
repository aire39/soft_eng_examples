import java.io.IOException;

public class Driver {
    public static void main(String[] args) throws IOException {
        Document document = new Document("HelloWorldCS5800");

        document.AddText("This is the first Test", FontType.ARIAL, 12, ColorType.Black());
        document.AddText(" Test IS 2nd", FontType.ARIAL, 12, ColorType.Black());
        document.AddText(" What 3rd?", FontType.CALIBRI, 16, ColorType.Blue());
        document.AddText(" Next text!", FontType.CALIBRI, 12, ColorType.Red());

        document.Save();
        document.Show();

        Document document_2 = new Document("HelloWorldCS5800_2");
        document_2.Load("HelloWorldCS5800");
        document_2.AddText(" What 4th?", FontType.VERDANA, 16, ColorType.Blue());
        document_2.Save();

        document_2.Show();
    }
}