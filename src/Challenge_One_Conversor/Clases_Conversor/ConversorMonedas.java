package Challenge_One_Conversor.Clases_Conversor;

import javax.swing.*;
/**
 * Clase Converdor de monedas
 * @author Nery Orellana
 * @version 1.0
 */

public class ConversorMonedas {
    /**
     * Clase conversor de monedas se utiliza para recibir los parametros tanto de la conversion de la moneda como el monto del mismo
     * para ser evaluados y realizar las operaciones de conversion necesarias
     * @param Dolar,Euro,LibrasEsterlinas,Yen_Japonés,Won_sul_coreano,DolaraLempira,EuroaLempira,LibrasEsterlinasaLempira,Yen_JaponésaLempira,Won_sul_coreanoaLempira
     * Se tomo la decision de almacenar de manera fija cada tipo de cambio de moneda
     * @param dineroM,dineroL
     * asi mismo se tomo la decicion de almacenar cada atributo de cada moneda en unos array list para su utilizacion, bien se podia haber
     * puesto desde un inicio cada cambio de moneda en los array sin necesidad de crear los atributos por aparte pero no se hiba a lograr
     * entennder bien a que tipo de moneda hiba a hacer referecia dentro del array por eso se coloco los atributos de cada tipo de moneda dentro
     * del array para asi si en un futuro cambia el valor de algun tipo de moneda solo seria necesario cambiarlo en el atributo correspondiente
     */

    //Atributos conversion local a  extrangeras
     private double Dolar = 0.041;
     private double Euro = 0.037;

     private double LibrasEsterlinas= 0.032;
     private double Yen_Japonés= 5.74;

     private double Won_sul_coreano= 51.87;

    //Atributos conversion monedas extrangeras a locales
    private double DolaraLempira =24.63;
    private double EuroaLempira = 27.20;
    private double LibrasEsterlinasaLempira = 31.88;
    private double Yen_JaponésaLempira = 0.18;
    private double Won_sul_coreanoaLempira =0.019;

     //Atributos Especiales
    private double Convercion;
     private String Moneda="";
    String DescripcionMoneda="";

   //Areglo de Objeto
     private String [] monedas2={"$","€","£","¥","₩","L"}; //Orden del arrayList Dolar,Euro,LibrasEsterlinas,Yen_Japonés,Won_sul_coreano
    private final double [] dineroM={Dolar , Euro, LibrasEsterlinas, Yen_Japonés,Won_sul_coreano };
    private final double [] dineroL={DolaraLempira,EuroaLempira,LibrasEsterlinasaLempira,Yen_JaponésaLempira,Won_sul_coreanoaLempira };


    //Metodos

    /**
     * El metodo SeleccionConversionMonedas se utiliza para convertir la moneda local a extrangera
     * recibe los siguientes parametros que vienen desde la clase main
     * @param seleccionMoneda
     * @param pMoneda
     * @return el resultado que devuelve se almacena el en atributo de Moneda y es el resultado de las operaciones
     * realizadas.
     */
    public String SeleccionConversionMonedas(int seleccionMoneda, double pMoneda) {
        if (seleccionMoneda < dineroM.length && seleccionMoneda >= 0) {
            for (int i = 0; i < dineroM.length; i++) {
                if (dineroM[i] == seleccionMoneda) ;
                Convercion = pMoneda * dineroM[seleccionMoneda];
            }
            Moneda = monedas2[seleccionMoneda] + " " + (Convercion) + MonedaEleccion(monedas2[seleccionMoneda]);

        } else if (seleccionMoneda >= dineroM.length) {
            seleccionMoneda = ReasignacionMoneda(seleccionMoneda);

            for (int i = 0; i < dineroL.length; i++) {
                if (dineroL[i] == seleccionMoneda) ;
                Convercion = pMoneda * dineroL[seleccionMoneda];
            }
            Moneda = monedas2[5] + " " + (this.Convercion) + MonedaEleccion(monedas2[5]);
        } else {
            new ValidacionGenerales().Confirmacion(JOptionPane.CANCEL_OPTION);
        }
        return this.Moneda;
    }

    /**
     * El metodo ReasignacionMoneda se encarga de realigar los valores para su utilizacion
     * ya que desde la clase MenuConversorMonedas dentro del metodo menuMonedas se manda la eleccion del conversor, el array tiene
     * 9 valores dentro y el metodo SeleccionConversionMonedas dentro de sus for compara los valores de la seleccion con el array de los
     * tipo de cambio de moneda ejemplo dineroM[i] == seleccionMoneda y como dentro de ese array dineroM[i] solo existen 5 elementos no se puede comparar
     * y surge un error por esa razon se obto por la reasigancion, que lo que hace es que recibe un valor y dependiendo ese valor le reasiga
     * otro que pueda ser utilizado.
     * @param PMoneda
     *
     * @return PMoneda;
     */
    public int ReasignacionMoneda(int PMoneda) {
        if (PMoneda == 5) {
            PMoneda = 0;
        } else if (PMoneda == 6) {
            PMoneda = 1;
        } else if (PMoneda == 7) {
            PMoneda = 2;
        } else if (PMoneda == 8) {
            PMoneda = 3;
        } else if (PMoneda == 9) {
            PMoneda = 4;
        }
        return PMoneda;
    }
    //Metodo para seleccionar la descripcion

    /**
     * Metodo utilizado mas que todo para devoler una descripcion corta de la conversion que se realizo por medio del siguiente parametro
     * @param Peleccion
     * @return dependiendo la eleccion que se realizo se hace una pequeña comparacion y se devuelve un string con la descripcion
     * correspondiente
     */
    public String MonedaEleccion(String Peleccion){
           if(Peleccion.equals(monedas2[0])){ //"$"
               this.DescripcionMoneda=" Dolares";
           }
           else if(Peleccion.equals(monedas2[1])){ //"€"
               this.DescripcionMoneda=" Euros";
            }
           else if(Peleccion.equals(monedas2[2])){ // £
               this.DescripcionMoneda=" LibrasEsterlinas";
           }
           else if(Peleccion.equals(monedas2[3])){ // ¥
               this.DescripcionMoneda=" Yen Japonés";
           }
           else if(Peleccion.equals(monedas2[4])){ // ₩
               this.DescripcionMoneda=" Won surcoreano";
           }
           else if(Peleccion.equals(monedas2[5])){ // ₩
               this.DescripcionMoneda=" Lempiras";
           }
     return this.DescripcionMoneda;
    }
}
