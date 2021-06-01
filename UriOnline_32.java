
package urionline_32;

import java.util.Scanner;


public class UriOnline_32 {

   
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double a,b,c;
       double tempx;
       a = sc.nextDouble();
       b = sc.nextDouble();
       c = sc.nextDouble();
       if(a<b){
           tempx = a;
           a = b;
           b = tempx;
       }
       if(b<c){
           tempx = b;
           b = c;
           c = tempx;
       }
       if(a<b){
          tempx = a;
           a = b;
           b = tempx;
       }
      if(a>=(b+c)){
      System.out.printf("NAO FORMA TRIANGULO\n");
            }
      else if(a*a == (b*b+c*c)){
         System.out.printf("TRIANGULO RETANGULO\n");
      }
      else if(a*a > (b*b+ c*c)){
      System.out.printf("TRIANGULO OBTUSANGULO\n");
       }
      else if(a*a<(b*b + c*c)){
       System.out.printf("TRIANGULO ACUTANGULO\n");
               }
      else if(a == b && b == c){
        System.out.printf("TRIANGULO EQUILATERO\n");
        }
      else if(a == b || b == c){
        System.out.printf("TRIANGULO ISOSCELES\n");
       }
    }
    
}
