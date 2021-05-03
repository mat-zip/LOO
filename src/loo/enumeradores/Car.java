package loo.enumeradores;

public class Car {
    private Color bodyColor;
    private ColorRGB bodyColorRGB;

    public Car(Color c) {
        this.bodyColor = c;
    }

    public Car(ColorRGB c) {
        this.bodyColorRGB = c;
    }

    public Color getDecalColor() {
        if ( bodyColor == Color.BLACK)
            return Color.WHITE;
        else if ( bodyColor == Color.RED)
            return Color.BLACK;
        else
            return null;
    }

    public ColorRGB getDecalColorRGB() {
        if ( bodyColorRGB == ColorRGB.BLACK)
            return ColorRGB.WHITE;
        if ( bodyColorRGB == ColorRGB.RED)
            return ColorRGB.BLACK;
        else
            return null;
    }
}

