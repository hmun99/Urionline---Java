
package urionline_26;

import java.util.Scanner;


public class UriOnline_26 {

   
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a,b;
      float x;
      a = sc.nextInt();
      b = sc.nextInt();
      if(a == 1){
          x = (float) (b*4.00);
          System.out.printf("Total: R$ %.2f\n",x);
      }
      else if(a == 2){
          x = (float) (b*4.50);
          System.out.printf("Total: R$ %.2f\n",x);
      }
       else if(a == 3){
          x = (float) (b*5.00);
          System.out.printf("Total: R$ %.2f\n",x);
      }
       else if(a == 4){
          x = (float) (b*2.00);
          System.out.printf("Total: R$ %.2f\n",x);
      }
       else if(a == 5){
          x = (float) (b*1.50);
          System.out.printf("Total: R$ %.2f\n",x);
      }
    }
    
}
