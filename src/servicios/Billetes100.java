// Esta clase hereda de ManejarBillete y representa un dispensador específico para billetes de $100000.
// Forma parte de la cadena de responsabilidad para la dispensación de dinero.

package servicios;

public class Billetes100 extends ManejarBillete{
        // Constructor que inicializa la cantidad de billetes de $100000 disponibles
    public Billetes100(int count) {
        super(count, 100000); // Llama al constructor de la clase base con el valor de $100000
    }
}
