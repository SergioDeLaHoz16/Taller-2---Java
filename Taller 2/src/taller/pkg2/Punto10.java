/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.pkg2;

import java.util.Scanner;

/**
 *
 * @author Sergio De La Hoz
 */
public class Punto1{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, res, inv=0;
        Scanner x=new Scanner(System.in); 
        System.out.println("Invertidor de números");
        System.out.println("Ingrese el número que se Invertirá ");
         num=x.nextInt();
        
        while (num!=0){
            res=num%10;
            inv=res+(inv*10);
            num=num/10;
            
        }
       System.out.printf("Número normal Invertido será %d: \n", inv);
    }
    
}
