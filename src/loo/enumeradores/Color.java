package loo.enumeradores;

public enum Color{
    RED, GREEN, BLACK, BLUE, WHITE,;

    @Override
    public String toString() {
    return "Color: " + name();
    }
}
