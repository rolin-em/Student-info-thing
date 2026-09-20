/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rayyanstuff;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class RayyanStuff {
    public static void main(String[] args)throws IOException{
        Scanner temp = new Scanner(System.in);
        System.out.println("how many students do you wann add: ");
        NewClass[] arr = new NewClass[2];
        
        for(int i = 0; i < arr.length; i++){
            System.out.println("enter a name");
            String name = temp.nextLine();
            System.out.println("enter a age");
            int index = temp.nextInt();
            temp.nextLine();
            arr[i] = new NewClass(name,index);
            
        }    
        FileWriter file = new FileWriter("students information.txt");
        for(NewClass student : arr){
            file.write(student.name + " " + student.index + "\n");
       
        }
        file.close();
    }   
}
