package figuras;

/**
 * @author              Nombre Apellidos
 * @version             1.0
 * @since               1.0
 */
public class Circunferencia {
    /**
     * El radio de la circunferencia
     */
    private double radio;

    /**
     * El color de la circunferencia
     */
    private String color;

    /**
     * Getter del atributo radio, devuelve el valor actual del atributo radio
     *
     * @return radio
     */
    public double getRadio() {
        return radio;
    }
    /**
     * Setter del atributo radio, asigna un valor dado al atributo radio
     *
     * @param radio radio de la circunferencia
     * */
    public void setRadio(double radio) {
        this.radio = radio;
    }
    /**
     * Constructor que asigna al atributo radio el valor dado como parámetro
     *
     * @param radio radio de la circunferencia
     * */
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    /**
     * Muestra en pantalla el diámetro, color y área de la circunferencia
     *
     */
    public void imprimir() {
        color = "rojo";
        System.out.println("Di�metro: " + 2 * radio);
        System.out.println("Color: " + color);
        double area = 2 * 3.1416 * radio * radio;
        System.out.println(area);
    }
    /**
     * Verifica si dos circunferencias son iguales
     * <p>
     * Se Compara una circunferencia(this) con otra(otro) en base al radio.
     * Se puede decidir si se tienen en cuenta los decimales o no al comparar.
     * <p>
     *
     * @param  considerarDecimales Indica si hay que tomar en cuenta los decimales del radio de la circunferencia
     * @param  otro Otra circunferencia
     * @return True si el radio de la circunferencia es igual al de la otra circunferencia, si no lo es devuelve false
     */
    public boolean esIgual(boolean considerarDecimales, Circunferencia otro) {
        double radio1 = this.radio;
        double radio2 = otro.getRadio();
        if (considerarDecimales) {
            if (radio1 == radio2)
                return true;
            else
                return false;
        } else {
            if (Math.abs(radio1 - radio2) < 1)
                return true;
            else
                return false;
        }
    }
}
