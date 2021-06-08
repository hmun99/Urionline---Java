
package urionline_44;

import java.util.Scanner;

public class UriOnline_44 {

    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
       int i,c = 0;
       float [] a = new float[6];
       for (i = 0; i<5;i++){
           a[i] = sc.nextFloat();
            }
      for (i = 0; i<5;i++){
           if (a[i]%2 == 0){
               c++;
           }
            }
      System.out.printf("%d valores pares\n",c);
       
    }
    
}
