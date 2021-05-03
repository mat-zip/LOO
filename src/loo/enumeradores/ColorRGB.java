package loo.enumeradores;

public enum ColorRGB {
    RED(255,0,0),
    GREEN(0,255,0),
    BLUE(0,0,255),
    BLACK(0,0,0),
    WHITE(255,255,255);

    private int r, g, b;

    private ColorRGB(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    @Override
    public String toString() {
        return "RGB:" + r + "," + g + "," + b;
    }
}
