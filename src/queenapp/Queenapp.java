
package queenapp ;

import static java.time.Clock.system;
import java.util.Scanner;


public class Queenapp {

   
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Enter name:");
       String name = sc.nextLine();
       
       System.out.print("Enter birth year:");
       int by = sc.nextInt();
       
       int age = 2025 - by;
               
               System.out.println("\nHello" +name+"your age is "+age);
        
        
    }
    
}
