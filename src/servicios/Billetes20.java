// Esta clase hereda de ManejarBillete y representa un dispensador específico para billetes de $20000.
// Forma parte de la cadena de responsabilidad para la dispensación de dinero.

package servicios;

public class Billetes20 extends ManejarBillete{
        // Constructor que inicializa la cantidad de billetes de $20000 disponibles
    public Billetes20(int count) {
        super(count, 20000); // Llama al constructor de la clase base con el valor de $20000
    }
}
