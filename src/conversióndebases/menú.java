/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Paquetes:
package conversióndebases;
//Importes:
import javax.swing.*;
/**
 * @author Andrés J. Jiménez Leandro
 * @date 2017-01-19 Jueves
 * @version 1.0
 **/
public class menú {
    //Variables:
    int opt = 0;
    String menu = "";
    /**
     * MÉTODO CONSTRUCTOR:
     **/
    public menú(int opt) {
        this.opt = opt;
    }
    /**
     *Menú:
     **/ 
    public void menu() {   
        //Opciones del Menú:
        this.opt = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Decimal a Binario\n2. Binario a Decimal", "Menú", JOptionPane.WARNING_MESSAGE));
        //Instancia de la Clase "Convertidores":
        convertidores c = new convertidores();        
        //Menú:
        switch (opt) {
            case 1:
                //Decimal a Binario:                
                c.decBin();
                break;
            case 2:
                //Binario a Decimal:
                c.binDec();
                break;
            default:
                JOptionPane.showMessageDialog(null, "No es una Opción", "ERROR", JOptionPane.ERROR_MESSAGE);
                break;
        }//Fin del Switch
    }//Fin del método
    /**
     * Obtenedor de Opt
     * @return opt
     **/
    public int getOpt() {
        return opt;
    }
    /**
     * Seteador de Opt
     * @param opt
     **/
    public void setOpt(int opt) {
        this.opt = opt;
    }
    /**
     * Obtenedor de Menu
     * @return Menu
     **/
    public String getMenu() {
        return menu;
    }
    /**
     * Seteador de Menu
     * @param menu
     **/
    public void setMenu(String menu) {
        this.menu = menu;
    }    
}//Fin de clase menú