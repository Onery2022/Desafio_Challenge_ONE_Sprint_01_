package Challenge_One_Conversor.Clases_Conversor;

import javax.swing.*;
/**
 * Clase validaciones generales se utiliza para hacer algunas validaciones requeridas
 * @author Nery Orellana
 * @version 1.0
 */
public class ValidacionGenerales {
       //validar datos de entrada
    boolean validacion;

    /**
     * El metodo ValidarDatos se utiliza para validar que se ingrese un numero entero y no aceptar otro tipo de caracter
     * recibe el parametro, verifica si no es nulo y despues lo ingrese en un try catch para detectar el error y devolver en caso sea entero
     * un true o en caso no sea entero un false
     * si llega a ser nulo el sistema manda a validar la opcion que el usuario selecciono en el metodo Confirmacion y termina el programa
     * @param Pdato
     * @return
     */
    public boolean ValidarDatos(String Pdato){
        if(Pdato!=null){
            try{
                Integer.parseInt(Pdato);
                return this.validacion=true;
            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Error solo se aceptan Numeros", "Error en la entrada de datos", JOptionPane.ERROR_MESSAGE);

                return this.validacion=false;

            }
        }else if(Pdato==null){
            try{
                Confirmacion(JOptionPane.CANCEL_OPTION);
                return this.validacion=true;
            }catch (Exception ex){

            }



        }
   return validacion;
    }

    /**
     * El metodo Confirmacion se utiliza para finalizar el programa dependiendo la opcion que escoja el usuario
     * si por medio del JOptionPane el usuario utiliza la opcion YES_OPTION le programa continua con normalidad
     * Si utiliza la opcion NO.OPTION el programa finaliza por medio del system.exit(0)
     * Si utiliza la opcion CANCEL.OPTION el programa finaliza por medio del system.exit(0)
     * @param Popcion
     * @return
     */
    //Metodo para validar seleccion final
    public int Confirmacion(int Popcion){
        if(Popcion==JOptionPane.YES_OPTION){
            return 0;
        }else if(Popcion==JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "Programa Finalizado","Programa",JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
            return 1;
        }else{
            JOptionPane.showMessageDialog(null, "Programa Finalizado", "Programa", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
            return 1;
        }
    }
}
