// Esta clase hereda de ManejarBillete y representa un dispensador específico para billetes de $50000.
// Forma parte de la cadena de responsabilidad para la dispensación de dinero.

package servicios;

public class Billetes50 extends ManejarBillete{
        // Constructor que inicializa la cantidad de billetes de $50000 disponibles
    public Billetes50(int count) {
        super(count, 50000); // Llama al constructor de la clase base con el valor de $50000
    }
}
