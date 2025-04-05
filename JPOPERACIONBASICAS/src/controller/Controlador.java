package controller;  // Define el paquete donde se encuentra la clase

import model.Operaciones;  // Importa la clase Operaciones del paquete model
import view.Vista;  // Importa la clase Vista del paquete view

/**
 * Clase Controlador que maneja la lógica del programa y la interacción entre la vista y el modelo.
 */
public class Controlador {
    private Vista objVista;  // Objeto de la clase Vista para la interacción con el usuario
    private Operaciones objOperaciones;  // Objeto de la clase Operaciones para realizar cálculos

    /**
     * Constructor de la clase Controlador.
     * @param vista Instancia de la clase Vista que se usará para la entrada y salida de datos.
     */
    public Controlador(Vista vista) {
        this.objVista = vista;
    }

    /**
     * Método principal que ejecuta el flujo del programa.
     * Solicita dos números al usuario, realiza operaciones matemáticas y muestra los resultados.
     */
    public void ejecutar() {
        // Solicita el primer número al usuario
        double numeroUno = objVista.mLeerNumero("Ingrese el primer numero:  ");
        
        // Solicita el segundo número al usuario
        double numeroDos = objVista.mLeerNumero( "Ingrese el segundo numero: ");
        
        // Crea una instancia de la clase Operaciones
        objOperaciones = new Operaciones();

        // Realiza la suma y muestra el resultado
        objVista.mMostrarResultado("La suma es", objOperaciones.mSuma(numeroUno, numeroDos ) );

        // Realiza la resta y muestra el resultado (parece que aquí debería ir mResta en lugar de mSuma)
        objVista.mMostrarResultado("La resta es", objOperaciones.mSuma(numeroUno, numeroDos ) );

        // Realiza la multiplicación y muestra el resultado (parece que aquí debería ir mMultiplicacion en lugar de mSuma)
        objVista.mMostrarResultado("La multiplicaion es", objOperaciones.mSuma(numeroUno, numeroDos ) );
        
        // Cierra el Scanner para liberar recursos
        objVista.mCerrarScanner();
    }      
}


