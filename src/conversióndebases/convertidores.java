/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Paquetes:
package conversióndebases;
//Importes:
import java.util.*;
import javax.swing.*;
/**
 * @author Andrés J. Jiménez Leandro
 * @date 2017-01-19 Jueves
 * @version 1.0
 **/
public class convertidores {
    //Constructor Vacío:
    public convertidores() {}    
    /**
     * De Binario a Decimal
     **/
    public void binDec(){
     //Variables:
     long numero, aux, digito, decimal;
     int exponente;
     boolean esBinario;
     //Scanner sc = new Scanner(System.in);
    //Leer un número por teclado y comprobar que sí es binario:
     do {
          /*System.out.print("Introduce un numero binario: ");
          numero = sc.nextLong();*/
          numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un Número Binario: "));
          //Declaración de Variables:
          esBinario = true;
          aux = numero;
          //Comprobamos que sea un número binario, es decir, que esté formado solo por ceros y unos:          
          while (aux != 0) {
                     digito = aux % 10; //última cifra del número
                     if (digito != 0 && digito != 1) { //si no es 0 ó 1
                          esBinario = false; //no es un número binario
                     }
                     aux = aux / 10; //quitamos la última cifra para repetir el proceso
           }
      } while (!esBinario); //se vuelve a pedir si no es binario
      //Proceso para pasar de binario a decimal:
      exponente = 0;
      decimal = 0; //será el equivalente en base decimal
      //Ciclo para Cambiar a Decimal:
      while (numero != 0) { //mientras número sea diferente a cero
                //se toma la última cifra
                digito = numero % 10;
                //se multiplica por la potencia de 2 correspondiente y se suma al número
                decimal = decimal + digito * (int) Math.pow(2, exponente);
                //se aumenta el exponente
                exponente++;
                //se quita la última cifra para repetir el proceso
                numero = numero / 10;
      }//Fin de Ciclo
      //System.out.println("Decimal: " + decimal);
      JOptionPane.showMessageDialog(null, "Decimal: " + decimal, "Conversión Hecha", JOptionPane.WARNING_MESSAGE);
   }//Fin de Método de Binario a Decimal 
     /**
     * De Binario a Decimal
     **/
    public void decBin(){
        //Variables:
        int numero, exp, digito;
        double binario;
        //Scanner sc = new Scanner(System.in);        
        //Ciclo para evitar q sea menor que cero:
        do{  
            /*System.out.print("Introduce un numero entero >= 0: ");
            numero = sc.nextInt();*/
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero entero mayor ó igual a Cero: "));
        }while(numero<0);
        //Definición de variables:
        exp=0;
        binario=0;
        //Ciclo de Conversión:
        while(numero!=0){ //número debe ser diferente de cero
                digito = numero % 2; //usando el residuo de la división entre 2 (uso de mod)            
                binario = binario + digito * Math.pow(10, exp);   
                exp++;
                numero = numero/2;
        }
        //System.out.printf("Binario: %.0f %n", binario); //Impresión 
        JOptionPane.showMessageDialog(null, String.format("Binario: %.0f %n", binario));
    }//Fin de Método de Decimal a Binario    
}//Fin de Clase