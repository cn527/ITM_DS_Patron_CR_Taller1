// Esta clase hereda de ManejarBillete y representa un dispensador específico para billetes de $5000.
// Forma parte de la cadena de responsabilidad para la dispensación de dinero.

package servicios;

public class Billetes5 extends ManejarBillete{
    // Constructor que inicializa la cantidad de billetes de $5000 disponibles
    public Billetes5(int count) {
        super(count, 5000); // Llama al constructor de la clase base con el valor de $5000
    }
}
