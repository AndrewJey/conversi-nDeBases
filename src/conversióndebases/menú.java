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
        Object[] opciones = {"Decimal a binario", "Binario a decimal", "Salir"};
        while (true) {
            int seleccion = JOptionPane.showOptionDialog(null, "Elige una conversión", "Conversión de bases", JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            if (seleccion < 0 || seleccion == 2) return;
            this.opt = seleccion + 1;
            convertidores conversor = new convertidores();
            if (seleccion == 0) conversor.decBin(); else conversor.binDec();
        }
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