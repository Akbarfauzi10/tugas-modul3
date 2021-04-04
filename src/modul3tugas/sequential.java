/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3tugas;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class sequential {
    public static void main(String[] args) {
        System.out.println(" ***  Sequential Search *** "+"\n");
        int data[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20} ;
        int found = 0;
         System.out.print("isi angka adalah: ");
       for (int i = 0; i < data.length; i++) {
           System.out.print(data[i] + " ");
       }
       System.out.println("");
        Scanner scan = new Scanner(System.in);
          System.out.print(" input nomor: "+ "\n");
        int key = scan.nextInt();
               
       System.out.println("");
       for (int i = 0; i <= data.length; i++) {
           if(key == data[i]) {
               found = 1;
               System.out.print("data "+key+" berada pada index ke"  +i+"\n");
               break;
           }
       }
       
       if (found == 1){
            System.out.println("data telah ditemukan");
       }
       System.out.println("\n");
       System.out.println();
       System.out.println(":) :)   Mohamad Akbar Fauzi  :( :(");
       
               
           }
       } 
       
        
        