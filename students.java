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
public class students {
    
    public void student_menu() {
        Scanner baca = new Scanner(System.in);
        
        System.out.println("++Menu++");
        System.out.println("1. Lecture Module");
        System.out.println("2. Previous Exam Paper");
        System.out.println("3. Practice Paper");
        System.out.println("4. Shopping Cart");
        System.out.println("Choose : ");
        int b = baca.nextInt();
        
        switch(b){
            case 1 :
                lecture_module lecture = new lecture_module();
                lecture.menu_module();
                break;
            case 2 :
                prev_exam prev = new prev_exam();
                prev.menu_exam();
                break;
            case 3 :
                practice paper = new practice();
                paper.menu_practice();
                break;
            case 4 :
                shopping_cart shop = new shopping_cart();
                shop.menu_shopping_cart();
                break;
        }
    }
}
