package Challenge_One_Conversor.Metodo_Principal;

import Challenge_One_Conversor.Clases_Conversor.ConversorMonedas;
import Challenge_One_Conversor.Clases_Conversor.MenusConversorMonedas;
import Challenge_One_Conversor.Clases_Conversor.Usuario;
import Challenge_One_Conversor.Clases_Conversor.ValidacionGenerales;

import javax.swing.*;

/**
 * Metodo principal del conversor de monedas
 * @author Nery Orellana
 * @version 1.0
 */
public class main {
    public static void main(String[] args) {
        /**
         * Creacion de nuevas instancias para poder ejecutar los metodos requeridos
         * Instancia de Usuario se utiliza para almacenar y extraer la conversion de las monedas
         * Instancia ValidacionGenerales se utiliza para comprobar valores numericos
         * Instancia MenuConversorMonedas se encarga de mostrar y retornar los diferentes menus en el programa
         * Instancia ConversorMonedas se encarga de todos los procesos de conversion y retornar el resultado
         */
        //Instancia Clase Usuario
        Usuario usua = new Usuario();
        //Instancia Clase ValidacionGenerales
        ValidacionGenerales validar = new ValidacionGenerales();
        //Instancia Clase ValidacionGenerales
        MenusConversorMonedas M = new MenusConversorMonedas(); //Resumir esto
        //Conversor de monedas
        ConversorMonedas conversor = new ConversorMonedas();
        /**
         * Menu del Metodo principal donde se ejecutan las instancias
         * @param int dato=0 se utiliza para poder ejecutar el bucle do while, si al final de ciclo sigue siendo 0 vuelve
         *            a repetir el ciclo hasta que el valor cambie y rompa el ciclo
         *
         */
        //Seleccion del menu
        int dato = 0;
      do{
        if(M.menuConversorseleccion()=="Conversor de Monedas"){
            String validarMoneda= JOptionPane.showInputDialog(null, "Ingresa la cantida de dinero que deceas convertir","Menu", JOptionPane.QUESTION_MESSAGE);
            while(!validar.ValidarDatos(validarMoneda)){
                validarMoneda= JOptionPane.showInputDialog(" Ingrese de nuevo la cantidad de dinero a convertir");
            }
            /**
             * @param usua.setMoneda almacena el valor ingresado y lo manda a guadar en el getMoneda
             * @param conversor.SeleccionConversionMonedas(M.menuMonedas(),usua.getMoneda()) son los parametros que se envian para
             *                                                                             poder obtener un resultado
             * @JOptionPane ejecuta el resultado final
             *
             */
              usua.setMoneda(Integer.parseInt(validarMoneda));//parseo de string a int
                //Conversor de monedas
               JOptionPane.showMessageDialog(null, "Tienes:  "+conversor.SeleccionConversionMonedas(M.menuMonedas(),usua.getMoneda()));

        }else{
            JOptionPane.showMessageDialog(null, "Aun en Desarrollo","Programa",JOptionPane.QUESTION_MESSAGE);
        }
          /**
           * Menu final de ejecucion del programa que se ejecuta al momento de terminar una accion
           * @param Object[] almacena las 3 posibles soluciones si, no, cancelar dependiendo la seleccion
           *                 manda a validar la opcion y trae un resultado
           * @return validar.Confirmacion(dato) trae el valor para repetir el ciclo o terminarlo
           */
       // Menu Opciones
        Object[] options = {"Si", "No","Cancelar" };
        dato = JOptionPane.showOptionDialog(null, "¿Deceas Continuar?", "Seleccione una Opcion", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, options, options[0]);
                validar.Confirmacion(dato);

        }while(dato==0);

    }
}
