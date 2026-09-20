
package studentThingy;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class StudentThingy {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        int[] arr = new int[5];
        String[] name = new String[5];
 
        for(int i = 0; i < 5; i++){
            System.out.println("enter a name");
            name[i] = temp.nextLine();
            System.out.println("enter a age");
            arr[i] = temp.nextInt();
        }    
        
        try{
        FileWriter file = new FileWriter("students information.txt");
        for(int x = 0; x <= 5; x++){
            file.write(name + " " + arr + "\n");
        }
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("no such files");       
        }
    }   
}
