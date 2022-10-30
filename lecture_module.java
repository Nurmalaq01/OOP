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
public class lecture_module extends admin_lecture_module{
    public void menu_module() {
        Scanner baca = new Scanner(System.in);
        
        System.out.println("Choose the subject");
        System.out.println("1. Object Oriented Programming");
        System.out.println("2. Mobile Application");
        System.out.println("3. Software Engineering");
        System.out.println("Choose : ");
        int c = baca.nextInt();
        
        switch(c){
            case 1 :
                admin_lecture_module prt = new admin_lecture_module();
                prt.print1();
                System.out.println("Choose : ");
                String d = baca.nextLine();
                System.out.println("Your choice has been successfully added to Shopping Cart");
                break;
            case 2 :
                admin_lecture_module prt2 = new admin_lecture_module();
                prt2.print2();
                System.out.println("Choose : ");
                String f = baca.nextLine();
                System.out.println("Your choice has been successfully added to Shopping Cart");
                break;
            case 3 :
                admin_lecture_module prt3 = new admin_lecture_module();
                prt3.print3();
                System.out.println("Choose : ");
                String g = baca.nextLine();
                System.out.println("Your choice has been successfully added to Shopping Cart");
                break;
        }
    }
}
