/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author asus
 */
public class Fix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int w=5;
        for (int y=1;y<=5;y++){
            for(int z=1;z<=y;z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
