
package urionline_28;

import java.util.Scanner;

public class UriOnline_28 {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       float x,y;
       x = sc.nextFloat();
       y = sc.nextFloat();
       
       if (x == 0 && y == 0 ){
           System.out.printf("Origem\n");
       }
       else if(x == 0 && y !=0 ){
         System.out.printf("Eixo Y\n"); 
       }
       else if( x != 0 && y == 0 ){
         System.out.printf("Eixo X\n"); 
       }
       else if( x > 0 && y < 0){
          System.out.printf("Q4\n");
       }
        else if( x < 0 && y > 0){
          System.out.printf("Q2\n");
       }
        else if( x < 0 && y < 0){
          System.out.printf("Q3\n");
       }
        else{
            System.out.printf("Q1\n");
        }
    }
    
}
