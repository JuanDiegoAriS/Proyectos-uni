import controller.Controlador;
import view.Vista;


public class App {
        public static void main(String[] args) throws Exception {
            System.out.println("Hello Object-Oriented Programing - MVC Pattern Class");

            Vista objVista = new Vista() ;
            Controlador objControlador = new Controlador(objVista) ;

            objControlador.ejecutar() ;
        }
}
