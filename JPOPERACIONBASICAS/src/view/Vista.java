package view;  // Paquete donde se encuentra la clase

import java.util.Scanner;  // Importación de la clase Scanner para la entrada de datos

/**
 * Clase Vista que maneja la interacción con el usuario.
 */
public class Vista {
    private Scanner scanner;  // Objeto Scanner para la entrada del usuario
    
    /**
     * Constructor de la clase Vista.
     * Inicializa el objeto Scanner.
     */
    public Vista() {
        scanner = new Scanner(System.in);
    }

    /**
     * Método para mostrar un mensaje en la consola.
     * @param mensaje Texto que se mostrará al usuario.
     */
    public void mMostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    /**
     * Método para leer un número ingresado por el usuario.
     * @param mensaje Mensaje que se mostrará antes de solicitar el número.
     * @return Número ingresado por el usuario de tipo double.
     */
    public double mLeerNumero(String mensaje) {
        System.out.println(mensaje);  // Muestra el mensaje en la consola
        return scanner.nextDouble();  // Captura y retorna el número ingresado
    }

    /**
     * Método para mostrar un resultado en la consola.
     * @param mensaje Texto descriptivo del resultado.
     * @param resultado Valor numérico a mostrar.
     */
    public void mMostrarResultado(String mensaje, double resultado) {
        System.out.println(mensaje + resultado);
    }

    /**
     * Método para cerrar el Scanner y liberar recursos.
     */
    public void mCerrarScanner() {
        scanner.close();
    }
}

