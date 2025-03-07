// Realizado por Yuliana Sanmartin - Juan José Molina - Cristian Navarro

import servicios.*;

public class Cliente {
    //Primero se instancia las clases billetes y definimos la cantidad de billetes por cada uno, actualmente hay 5 billetes por cada tipo
    public static void main(String[] args) throws Exception {
    IDispensador h100 = new Billetes100(10);
    IDispensador h50 = new Billetes50(10);
    IDispensador h20 = new Billetes20(10);
    IDispensador h10 = new Billetes10(10);
    IDispensador h5 = new Billetes5(10);
        
        // Aquí se define el órden de la cadena
        h100.setNext(h50);
        h50.setNext(h20);
        h20.setNext(h10);
        h10.setNext(h5);
       
        //Se lee la cantidad a dispensar y se entrega al dinero (resultado), aquí usamos el método leerEnteroMultiplo5000 de la clase validación para que no haya error al ingresar los valores
        int amount = Validaciones.leerEnteroMultiploDe5000("Ingrese la cantidad de dinero a dispensar");
        System.out.println("Procesando solicitud de $" + amount);
        h100.handle(amount);
    }
}
