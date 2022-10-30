/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ujianakhiroop;

import java.util.Scanner;

/**
 *
 * @author noname
 */
public class E_SMARTPLACE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        
        System.out.println("E-SMARTPLACE");
        System.out.println("\t\tWELCOME");
        System.out.println("\t*********************");
        System.out.println("Login as");
        System.out.println("1. Student");
        System.out.println("2. Admin");
        System.out.println("Choose : ");
        int a = baca.nextInt();
        
        switch(a){
            case 1 :
                students std = new students();
                std.student_menu();
                break;
            case 2 :
                admin adm = new admin();
                adm.admin_menu();
                break;
        }
    }
    
}
