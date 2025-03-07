package servicios;

import java.util.Scanner;

public class Validaciones {
        
    private static final Scanner scanner = new Scanner(System.in); // Se declara un único Scanner estático para leer entrada de usuario

    public static int leerEnteroMultiploDe5000(String mensaje) {
        int num = 0;

        do {
            try {
                System.out.print(mensaje + ": ");
                num = Integer.parseInt(scanner.nextLine()); // Captura la entrada y la convierte en entero

                if (num <= 0) {
                    System.out.println("ERROR: El número debe ser mayor que cero."); // Valida que el número sea positivo
                } else if (num % 5000 != 0) {
                    System.out.println("ERROR: El número debe ser múltiplo de 5000."); // Verifica que sea múltiplo de 5000
                } else {
                    return num; // Si cumple las condiciones, retorna el número
                }
            } catch (NumberFormatException e) {
                System.out.println("ERROR: Ingrese un número válido."); // Maneja errores si el usuario ingresa algo que no es un número
            }
        } while (true); // Repite hasta que el usuario ingrese un valor válido
    }

}
