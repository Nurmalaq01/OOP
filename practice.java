/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ujianakhiroop;

import java.util.Scanner;

/**
 *
 * @author noname
 */
public class practice extends admin_practice{
    public void menu_practice(){
        Scanner baca = new Scanner(System.in);
        
        System.out.println("Choose the subject");
        System.out.println("1. Object Oriented Programming");
        System.out.println("2. Mobile Application");
        System.out.println("3. Software Engineering");
        System.out.println("Choose : ");
        int c = baca.nextInt();
        
        switch(c){
            case 1 :
                admin_practice prt = new admin_practice();
                prt.print5();
                System.out.println("Choose : ");
                int d = baca.nextInt();
                System.out.println("Your choice has been successfully added to Shopping Cart");
                break;
            case 2 :
                admin_practice prt2 = new admin_practice();
                prt2.print6();
                System.out.println("Choose : ");
                int f = baca.nextInt();
                System.out.println("Your choice has been successfully added to Shopping Cart");
                break;
            case 3 :
                admin_practice prt3 = new admin_practice();
                prt3.print7();
                System.out.println("Choose : ");
                int g = baca.nextInt();
                System.out.println("Your choice has been successfully added to Shopping Cart");
                break;
        }
    }
}
