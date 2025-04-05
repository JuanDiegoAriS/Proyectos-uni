package model; //  Paquete donde se encuentra la clase

/** 
 * La clase Operaciones representa en modelo matematico que permite realizar
 * operaciones basicas como suma, resta y multiplicacion con dos numeros.
 * forma parte del modelo en la arquitectura MVC.
 * 
 * @author Juan Diego Arias Silva
 * @version 1.0
 * @since 2025-04-4

 */
public class Operaciones {



        /**
        * Primer numero para realizar las operaciones matematicas.
        */
          private double numeroUno; 

        /**
         * Segundo numero para realizar operaciones matematicas.
        */
        private double numeroDos;

        /**
         * Constructor por defecto de la clase Operaciones.
        * Inicializa los atributos en cero.
        */
        public Operaciones() {
               this.numeroUno = 0;
               this.numeroDos = 0;
        }
        /**
        * Constructor sobrecargado que inicializa los valores de los atributos.
        * 
        * @param numeroUno Primer numero de la operacion.
        * @param numeroDos Segundo numero de la operacion.
        */
        public Operaciones (double numeroUno, double numeroDos) {
               this.numeroUno = numeroUno;
              this.numeroDos = numeroDos;
        }
        /**
        *  Obtiene el valor del primer numero
        * @return Valor numeroUno.
        */
        public double getNumeroUno(){
             return numeroUno;
        }
        /**
        *  Establece el valor del primer numero.
        * 
         * @param numeroUno Nuevo valor para numeroUno.
        */
        public void setNumeroUno(double numeroUno) {
               this.numeroUno = numeroUno;
        }
        /**
         * Obtine el valor del segundo numero.
        * @return Valor de numeroDos.
         */
        public double getNumeroDos(){
               return numeroDos;
        }
        /**
        *  Establece el valor del segundo numero.
        * @param numeroDos Nuevo valor para numeroDos
         */
        public void setNumeroDos(double numeroDos) {
               this.numeroDos = numeroDos;
        }
        /**
        *  Realiza la suma de dos numeros.
        *
        * @param numeroUno Primer numero a sumar.
        * @param numeroDos Segundo numero a sumar.
        * @return Resultado de la resta.
        */
        public double mSuma(double numeroUno, double numeroDos) {
               return numeroUno + numeroDos;
        }
        /**
        *  Realiza resta de dos numeros. 
        * @param numeroUno Minuendo de la operacion.
        * @param numeroDos Sustraendo de la operacion
        * @return Resultado de la resta.
        */
        public double mResta(double numeroUno, double numeroDos) {
               return numeroUno - numeroDos;
        }
        /**
        *  Realiza multiplicacion de dos numeros
        * @param numeroUno Primer numero a multiplicar.
        * @param numeroDos Segundo numero a multiplicar.
        * @return Resultado de la multiplicacion.
        */
        public double mMultiplicar(double numeroUno, double numeroDos) {
               return numeroUno * numeroDos;
        }
        
}
