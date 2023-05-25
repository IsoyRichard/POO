public class Color {

    // Atributos
    private int red;
    private int green;
    private int blue;

    /**
     * Constructor de la clase que recie los colores de la clase
     */
    public Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    /**
     * Retorna el bytedelcolor rojo
     */
    public int getRed() {
        return red;
    }

    /**
     * Retornael byte verde
     */
    public int getGreen() {
        return green;
    }

    /**
     * Retorna el color azul
     */
    public int getBlue() {
        return blue;
    }

    @Override
    public String toString() {
        return String.format("Red: %d Green: %d Blue: %d", red, green, blue);
    }
}