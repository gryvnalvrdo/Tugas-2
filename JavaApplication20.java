/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

import java.util.Scanner;

/**
 *
 * @author alver
 */
public class JavaApplication20
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        int x;
        char ulang;
        do
        {
        System.out.println("##  Daftar Menu Teh Ilkom ##");
        System.out.println("============================");
        System.out.println("1. Teh Susu");
        System.out.println("2. Teh Thai Tea");
        System.out.println("3. Teh Red Velvet");
        System.out.println("4. Teh Avocado");
        System.out.println("5. Teh Tarik");
        System.out.print("Pilihan Anda = ");
        x = scan.nextInt();
        switch (x) 
        {
            case 1 :
                System.out.println("Anda memilih Teh Susu");
                break;
            case 2 :
                System.out.println("Anda memilih Teh Thai Tea");
                break;
            case 3 :
                System.out.println("Anda memilih Teh Red Velvet");
                break;
            case 4 :
                System.out.println("Anda memilih Teh Avocado");
                break;
            case 5 :
                System.out.println("Anda memilih Teh Tarik");
                break;
            default :
                System.out.println("Menu yang Anda pilih tidak ada di pilihan");
                break;
        } 
            System.out.println();
            System.out.print("Ingin memilih menu lain(y/t) = ");
                ulang=scan.next().charAt(0);
   
        } while (ulang!='t');
                System.out.println("Terima Kasih");
               
        // TODO code application logic here
    }
    
}
