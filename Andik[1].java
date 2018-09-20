/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andik;

/**
 *
 * @author acer
 */
public class Andik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int umur = 20;
       String paras = "Cantik";
       String kepintaran = "pintar";
       if (umur <= 23 && umur >= 20 && kepintaran == "pintar" && paras == "Cantik") {
           System.out.println("Pasti tidak nolakk");
       } else if (umur <= 23 && umur >= 20 && paras == "Cantik") {
           System.out.println("boleh juga");
       } else if (umur >= 23 && paras == "Cantik") {
           System.out.println("gue pikir dulu");
       } else {
           System.out.println("Gakmau titik");
       }
    }
    
}
