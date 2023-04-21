public class ColorType {
    public short red;
    public short green;
    public short blue;

    ColorType(short red, short green, short blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    boolean IsSame(ColorType color_type) {
        return ((red == color_type.red) && (green == color_type.green) && (blue == color_type.blue));
    }

    public String toString() {
        String color = red + " " + green + " " + blue;
        return color;
    }

    static ColorType Black() {
        return new ColorType((short) 0, (short) 0, (short) 0);
    }

    static ColorType Red() {
        return new ColorType((short) 255, (short) 0, (short) 0);
    }

    static ColorType Green() {
        return new ColorType((short) 0, (short) 255, (short) 0);
    }

    static ColorType Blue() {
        return new ColorType((short) 0, (short) 0, (short) 255);
    }
}
