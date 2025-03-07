package servicios;

public class ManejarBillete implements IDispensador {
    //Declaramos las variables
    protected IDispensador next; //refencia al siguiente dispensador en la cadena
    protected int count; // Número de billetes disponibles
    protected int billValue; // Valor del billete 

   //El constructor para iniciar el número de billetes y valor
    public ManejarBillete(int count, int billValue) {
        this.count = count;
        this.billValue = billValue;
    }
    //Los métodos de aquí son los que implementa de la interface por eso tienen el override

     // Configura el siguiente dispensador en la cadena de responsabilidad
    @Override
    public void setNext(IDispensador handler) {
        this.next = handler;
    }
    // Maneja la cómo funciona al dispensación de billetes según la cantidad
    @Override
    public void handle(int amount) {
        if (!canDispense(amount)) { // Verifica si es posible dispensar el monto exacto
            System.out.println("No se puede dispensar el monto exacto.");
            return;
        }

        int num = Math.min(amount / billValue, count); // Calcula cuántos billetes puede entregar
        int remainder = amount - (num * billValue); // Calcula el monto restante después de la dispensación

        if (num > 0) {
            System.out.println("Dispensando " + num + " billetes de $" + billValue);
            count -= num; // Reduce el número de billetes disponibles
        }

        if (remainder > 0 && next != null) {
            next.handle(remainder); //Pasa el monto restante al siguiente dispensador en la cadena
        }
    }
    // Verifica si el monto solicitado puede ser dispensado completamente, si agrego un monto mayor a la cantidad de dinero en billetes disponible me dirá que no hay dinero suficiente
    @Override
    public boolean canDispense(int amount) {
        int num = Math.min(amount / billValue, count);
        int remainder = amount - (num * billValue);
        
        if (remainder == 0) return true; //si no hay dinero restante, se puede dispensar completamente
        if (next != null) return next.canDispense(remainder); // Verifica si el siguiente dispensador puede manejar el resto
        return false; // Si no hay más dispensadores, no se puede completar la transacción
    }

}
