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
public class prev_exam extends admin_prev_exam{
    public void menu_exam(){
        Scanner baca = new Scanner(System.in);
        
        admin_prev_exam prev = new admin_prev_exam();
        prev.print4();
        System.out.println("Choose : ");
        String choose = baca.nextLine();
        System.out.println("Your choice has been successfully added to Shopping Cart");
    }
}
