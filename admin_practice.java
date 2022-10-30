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
public class admin_practice {
    public void print5(){
        String mdl = null;
        int prc = 0;
        System.out.println("E-SMARTPLACE");
        System.out.println("-------------------------------");
        System.out.println("\t\tModule Name\t\t||\tPrice\t|");
        System.out.println("-------------------------------");
        System.out.println(mdl+"\t\t\t\t||"+prc+"\t\t|");
        System.out.println("-------------------------------");
    }
    public void print6(){
        String md = null;
        int har = 0;
        System.out.println("E-SMARTPLACE");
        System.out.println("-------------------------------");
        System.out.println("\t\tModule Name\t\t||\tPrice\t|");
        System.out.println("-------------------------------");
        System.out.println(md+"\t\t\t\t||"+har+"\t\t|");
        System.out.println("-------------------------------");
    }
    public void print7(){
        String modl = null;
        int harg = 0;
        System.out.println("E-SMARTPLACE");
        System.out.println("-------------------------------");
        System.out.println("\t\tModule Name\t\t||\tPrice\t|");
        System.out.println("-------------------------------");
        System.out.println(modl+"\t\t\t\t||"+harg+"\t\t|");
        System.out.println("-------------------------------");
    }
    public void PP(){
        Scanner baca = new Scanner(System.in);
        ArrayList data = new ArrayList();
        
        System.out.println("Choose the subject");
        System.out.println("1. Object Oriented Programming");
        System.out.println("2. Mobile Application");
        System.out.println("3. Software Engineering");
        System.out.println("Choose : ");
        int e = baca.nextInt();
        
        switch(e){
            case 1 :
                System.out.println("Manage Product");
                System.out.println("1. Show");
                System.out.println("2. Add");
                System.out.println("3. Remove");
                System.out.println("4. Delete All");
                System.out.println("Choose : ");
                int pilih2 = baca.nextInt();
                
                switch(pilih2){
                    case 1 :
                        admin_practice cetak = new admin_practice();
                        cetak.print5();
                        break;
                    case 2 :
                        System.out.println("Input practice paper name : ");
                        String practice = baca.nextLine();
                        data.add(practice);
                        System.out.println("Input price : ");
                        int price2 = baca.nextInt();
                        data.add(price2);
                        System.out.println("Successfully added data");
                        break;
                    case 3 :
                        System.out.println("Input module name : ");
                        practice = baca.nextLine();
                        data.remove(practice);
                        break;
                    case 4 :
                        data.removeAll(data);
                        break;
                }break;
            case 2 :
                System.out.println("Manage Product");
                System.out.println("1. Show");
                System.out.println("2. Add");
                System.out.println("3. Remove");
                System.out.println("4. Delete All");
                System.out.println("Choose : ");
                int pilih3 = baca.nextInt();
                
                switch(pilih3){
                    case 1 :
                        admin_practice cetak = new admin_practice();
                        cetak.print6();
                        break;
                    case 2 :
                        System.out.println("Input practice paper name : ");
                        String prc = baca.nextLine();
                        data.add(prc);
                        System.out.println("Input price : ");
                        int harga = baca.nextInt();
                        data.add(harga);
                        System.out.println("Successfully added data");
                        break;
                    case 3 :
                        System.out.println("Input module name : ");
                        prc = baca.nextLine();
                        data.remove(prc);
                        break;
                    case 4 :
                           data.removeAll(data);
                           break;
                }break;
            case 3 :
                System.out.println("Manage Product");
                System.out.println("1. Show");
                System.out.println("2. Add");
                System.out.println("3. Remove");
                System.out.println("4. Delete All");
                System.out.println("Choose : ");
                int pilih4 = baca.nextInt();
                
                switch(pilih4){
                    case 1 :
                        admin_practice cetak = new admin_practice();
                        cetak.print7();
                        break;
                    case 2 :
                        System.out.println("Input practice paper name : ");
                        String pr = baca.nextLine();
                        data.add(pr);
                        System.out.println("Input price : ");
                        int harga = baca.nextInt();
                        data.add(harga);
                        System.out.println("Successfully added data");
                        break;
                    case 3 :
                        System.out.println("Input module name : ");
                        pr = baca.nextLine();
                        data.remove(pr);
                        break;
                    case 4 :
                           data.removeAll(data);
                           break;
                }break;
        }
    }
}
