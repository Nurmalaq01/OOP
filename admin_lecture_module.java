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
public class admin_lecture_module {
    public void print1(){
        String mdl = null;
        int prc = 0;
        System.out.println("E-SMARTPLACE");
        System.out.println("-------------------------------");
        System.out.println("\t\tModule Name\t\t||\tPrice\t|");
        System.out.println("-------------------------------");
        System.out.println(mdl+"\t\t\t\t||"+prc+"\t\t|");
        System.out.println("-------------------------------");
    }
    public void print2(){
        String md = null;
        int har = 0;
        System.out.println("E-SMARTPLACE");
        System.out.println("-------------------------------");
        System.out.println("\t\tModule Name\t\t||\tPrice\t|");
        System.out.println("-------------------------------");
        System.out.println(md+"\t\t\t\t||"+har+"\t\t|");
        System.out.println("-------------------------------");
    }
    public void print3(){
        String mod1 = null;
        int harg = 0;
        System.out.println("E-SMARTPLACE");
        System.out.println("-------------------------------");
        System.out.println("\t\tModule Name\t\t||\tPrice\t|");
        System.out.println("-------------------------------");
        System.out.println(mod1+"\t\t\t\t||"+harg+"\t\t|");
        System.out.println("-------------------------------");
    }
    public void LM(){
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
                        admin_lecture_module cetak = new admin_lecture_module();
                        cetak.print1();
                        break;
                    case 2 :
                        System.out.println("Input module name : ");
                        String modul = baca.nextLine();
                        data.add(modul);
                        System.out.println("Input price : ");
                        int price = baca.nextInt();
                        data.add(price);
                        System.out.println("Successfully added data");
                        break;
                    case 3 :
                        System.out.println("Input module name : ");
                        modul = baca.nextLine();
                        data.remove(modul);
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
                        admin_lecture_module cetak = new admin_lecture_module();
                        cetak.print2();
                        break;
                    case 2 :
                        System.out.println("Input module name : ");
                        String mod = baca.nextLine();
                        data.add(mod);
                        System.out.println("Input price : ");
                        int harga = baca.nextInt();
                        data.add(harga);
                        System.out.println("Successfully added data");
                        break;
                    case 3 :
                        System.out.println("Input module name : ");
                        mod = baca.nextLine();
                        data.remove(mod);
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
                        admin_lecture_module cetak = new admin_lecture_module();
                        cetak.print3();
                        break;
                    case 2 :
                        System.out.println("Input module name : ");
                        String mod = baca.nextLine();
                        data.add(mod);
                        System.out.println("Input price : ");
                        int harga = baca.nextInt();
                        data.add(harga);
                        System.out.println("Successfully added data");
                        break;
                    case 3 :
                        System.out.println("Input module name : ");
                        mod = baca.nextLine();
                        data.remove(mod);
                        break;
                    case 4 :
                           data.removeAll(data);
                           break;
                }break;
        }
    }
}

