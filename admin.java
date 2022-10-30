/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ujianakhiroop;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author noname
 */
public class admin {
    
    public void admin_menu() {
        Scanner baca = new Scanner(System.in);
        ArrayList data = new ArrayList();
        
        System.out.println("++Menu++");
        System.out.println("1. Lecture Module");
        System.out.println("2. Previous Exam Paper");
        System.out.println("3. Practice Paper");
        System.out.println("Choose : ");
        int pilih = baca.nextInt();
        
        switch(pilih) {
            case 1 :
                admin_lecture_module lm = new admin_lecture_module();
                lm.LM();
                break;
            case 2 :
                admin_prev_exam pe = new admin_prev_exam();
                pe.PE();
                break;
            case 3 :
                admin_practice pp = new admin_practice();
                pp.PP();
                break;
        }
    }
}
