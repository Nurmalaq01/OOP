/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul6;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author noname
 */
public class Modul6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int m,rdm;
      int input;
      Scanner baca = new Scanner(System.in);
      Random rand = new Random();
      int random_matrix1 = rand.nextInt(4);
      int random_matrix2 = rand.nextInt(4);
      int random_matrix3 = rand.nextInt(4);
      int random_matrix4 = rand.nextInt(4);
     
      do{
      System.out.println("Guess Multiplication Random Matrix");
      int[][] matrix = new int[5][5];
      for(int i=0;i<5;i++){
          for(int j=0;j<5;j++){
                rdm = rand.nextInt(100);
                matrix[i][j]=rdm;
          }
      }
      for(int baris=0;baris<5;baris++){
          for(int kolom=0;kolom<5;kolom++){
              System.out.print("["+baris+"]["+kolom+"]");
              System.out.printf("%2d"+"\t", matrix[baris][kolom]);
          }
          System.out.println();
      }
      System.out.print("What is the result of angka["+random_matrix1+"]["+random_matrix2+"] times angka ["+random_matrix3+"]["+random_matrix4+"] : ");
      int hasil = matrix[random_matrix1][random_matrix2]*matrix[random_matrix3][random_matrix4];
      int jawaban;
      
      jawaban = baca.nextInt();
      if (jawaban != hasil){
          System.out.println("You Are Wrong!");
      }
      else {
          System.out.println("You Are Brilliant");
      }
      System.out.println();
      System.out.println("Do You Want To Play Again");
      System.out.println("1. Yes");
      System.out.println("2. No");
      System.out.println("Choose : ");
      input = baca.nextInt();
      } while(input!=2);
    }
    
}
