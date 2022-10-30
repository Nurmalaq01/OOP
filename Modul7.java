/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul7;

import java.util.Scanner;

    class pet{
        private String name;
        private String type;
        private int health;
        String sound = new String();
        String nama = new String();
        int no = 0;
        Scanner baca = new Scanner(System.in);
    
    pet(String name, String type, int health){
        this.name = name;
        this.type = type;
        this.health = health;
}

    public void set_data(String name, String type, int health){
        this.name = name;
        this.type = type;
        this.health = health;
}
    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
    public int getHealth(){
        return health;
    }
    
    public void add_pet(){
        do{
        System.out.println("Input pet health [1-90]: ");
        this.health = baca.nextInt();
        }while(health<1 || health>90);
        
        do{
        System.out.println("Input pet name [5-15 characters]: ");
        this.name = baca.nextLine();
        }while(name.length()<5 || name.length()>15);
        
        do{
        System.out.println("Input pet type [kit | puppy | kitten]: ");
        this.type = baca.nextLine();
        }while(type!="kit" || type!="puppy" || type!="kitten");
    }
    public void view(){
        System.out.println("+===================================================================+");
        System.out.println("+ No |          Name         |    Type    |     Sound   | Health +");
        System.out.println("+===================================================================+");
        System.out.println("+"+no+ " "+ "|"+nama+ " "+ "|"+this.type+ " "+ "|"+sound+ " "+ "|"+ this.health+ " "+ "+");
        System.out.println("+===================================================================+");
        no++;
        if(type=="kit"){
            sound = "clucking";
            nama = "Rabbit"+this.name;
        }
        else if(type=="puppy"){
            sound = "bark bark";
            nama = "Dog"+this.name;
        }
        else if(type=="kitten"){
            sound = "meow meow";
            nama = "Cat"+this.name;
        }
        else{
            System.out.println("+===================================================================+");
            System.out.println("+ No |          Name         |    Type    |     Sound   | Health +");
            System.out.println("+===================================================================+");
            System.out.println("+ Empty");
            System.out.println("+===================================================================+");
        }
        
    }
    public void update_data(){
            System.out.println("+===================================================================+");
            System.out.println("+ No |          Name         |    Type    |     Sound   | Health +");
            System.out.println("+===================================================================+");
            System.out.println("+"+no+ " "+ "|"+nama+ " "+ "|"+this.type+ " "+ "|"+sound+ " "+ "|"+ this.health+ " "+ "+");
            System.out.println("+===================================================================+");
            no++;
            System.out.println("Choose pet number to update [1-"+no+"]: ");
            int choose =  baca.nextInt();
            do{
            System.out.println("Update pet health [1 - 90]: ");
            this.health = baca.nextInt();
            }while(health<1 || health>90);
            System.out.println("Pet health updated.....");
    }
    public void treat(){
        System.out.println("+===================================================================+");
        System.out.println("+ No |          Name         |    Type    |     Sound   | Health +");
        System.out.println("+===================================================================+");
        System.out.println("+"+no+ " "+ "|"+nama+ " "+ "|"+this.type+ " "+ "|"+sound+ " "+ "|"+ this.health+ " "+ "+");
        System.out.println("+===================================================================+");
        no++;
        System.out.println("Choose pet number to update [1-"+no+"]: ");
        int choose =  baca.nextInt();
    }
    }
/**
 *
 * @author noname
 */
public class Modul7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        pet hewan[] = new pet[5];
        int all = 0;
        int pilih;
        
        do{
        System.out.println("+=======================+");
        System.out.println("+ Menu");
        System.out.println("+=======================+");
        System.out.println("+ 1. Add Sick Pet       +");
        System.out.println("+ 2. View Sick List     +");
        System.out.println("+ 3. Update Pet Health  +");
        System.out.println("+ 4. Treat Pet          +");
        System.out.println("+ 5. Exit Program       +");
        System.out.println("+=======================+");
        System.out.println("Choice >> ");
        pilih = baca.nextInt();
        
        if(pilih==1){
            hewan[all].add_pet();
        }
        else if(pilih==2){
            hewan[all].view();
        }
        else if(pilih==3){
            hewan[all].update_data();
        }
        else if(pilih==4){
            hewan[all].treat();
        }
        else {
            System.out.println("Thanks for using BJ-Vet Program");
        }
        }while(pilih!=5);
    }
}
    
