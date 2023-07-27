package Challenge_One_Conversor.Clases_Conversor;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;
/**
 * Clase Menu de elecciones
 * @author Nery Orellana
 * @version 1.0
 */

/**
 * El metodo MenusConversorMonedas se utiliza mas que_todo para mostrar las opciones de conversion disponibles dentro del arraylist Objetc[].
 * @param_MonedaMenu obtiene el atributo seleccionado por el usuario y lo manda a la clase main para su utilizacion
 * @return seleccionMoneda
 */
public class MenusConversorMonedas {

    public int menuMonedas(){
        Object[] ConversionMonedas = { "Lempiras a Dolar", "Lempiras a Euro","Lempiras a Libras Esterlinas","Lempiras a Yen Japonés","Lempiras a Won sul-coreano","-Dolar a Lempira","-Euro a Lempira",
        "-Libras Esterlinas a Lempira","-Yen Japonés a Lempira","-Won sul-coreano a Lempira"};
        Object MonedaMenu = JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion", "Menu",
                JOptionPane.DEFAULT_OPTION, null, ConversionMonedas, ConversionMonedas[0]);
        List<Object> lista = Arrays.asList(ConversionMonedas);
        int seleccionMoneda =lista.indexOf(MonedaMenu);

        return seleccionMoneda;
    }

    /**
     * El metodo MmenuConversorseleccion muestra un menu con las primeras opciones del conversor de monedas
     * @param_SeleccionMenuConversion obtiene el atributo seleccionado por el usuario y lo manda a la clase main para su utilizacion
     * @return SeleccionMenuConversion
     */
    public String menuConversorseleccion(){
        //Arreglo de Objetos
        Object[] ConversorMenu = { "Conversor de Monedas", "Conversor de temperatura" };
        String SeleccionMenuConversion = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion", "Menu",
                JOptionPane.INFORMATION_MESSAGE, null, ConversorMenu,ConversorMenu[0]);
            if(SeleccionMenuConversion==null){
                try {
                    new ValidacionGenerales().Confirmacion(JOptionPane.CANCEL_OPTION);
                }catch (Exception ex){
                    System.out.println(ex);
                }

            }
        return SeleccionMenuConversion;
    }


}
