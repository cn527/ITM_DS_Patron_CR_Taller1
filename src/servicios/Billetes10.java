// Esta clase hereda de ManejarBillete y representa un dispensador específico para billetes de $10000.
// Forma parte de la cadena de responsabilidad para la dispensación de dinero.

package servicios;

public class Billetes10 extends ManejarBillete{
    // Constructor que inicializa la cantidad de billetes de $10000 disponibles
    public Billetes10(int count) {
        super(count, 10000); // Llama al constructor de la clase base con el valor de $10000
    }
}
