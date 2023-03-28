
package javaapplication32;

import java.util.Scanner;

public class JavaApplication32 {
    static boolean isAsal(int a){
        boolean result=false;
        int counter=0;
        
        if(a <= 2){
            return (a==2)? true:false;
        }
        for (int i = 1; i <= a; i++) {
           if(a%i==0){
               counter++;
           }   
        }
        return (counter==2)? true: false;
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("sayi:  ");
        int s1=input.nextInt();
        System.out.println(isAsal(s1));  
       
        
    }
    
}
