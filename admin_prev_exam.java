/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ujianakhiroop;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author noname
 */
public class admin_prev_exam {
    public void print4(){
        String year = null;
        int prc2 = 0;
        System.out.println("E-SMARTPLACE");
        System.out.println("-------------------------------");
        System.out.println("\t\tYear\t\t||\tPrice\t|");
        System.out.println("-------------------------------");
        System.out.println(year+"\t\t\t\t||"+prc2+"\t\t|");
        System.out.println("-------------------------------");
    }
    
    public void PE(){
        Scanner baca = new Scanner(System.in);
        ArrayList data = new ArrayList();
        
        System.out.println("Manage Product");
        System.out.println("1. Show");
        System.out.println("2. Add");
        System.out.println("3. Remove");
        System.out.println("4. Delete All");
        System.out.println("Choose : ");
        int pilih2 = baca.nextInt();
                
           switch(pilih2){
                case 1 :
                    admin_prev_exam cetak = new admin_prev_exam();
                    cetak.print4();
                    break;
                case 2 :
                    System.out.println("Input exam year : ");
                    int yr = baca.nextInt();
                    data.add(yr);
                    System.out.println("Input price : ");
                    int pr = baca.nextInt();
                    data.add(pr);
                    System.out.println("Successfully added data");
                    break;
                case 3 :
                    System.out.println("Input module name : ");
                    yr = baca.nextInt();
                    data.remove(yr);
                    System.out.println("Successfully remove data");
                    break;
                case 4 :
                    data.removeAll(data);
                    break;
                }
}     
    
}
