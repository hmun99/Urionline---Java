
package urionline_41;

import java.util.Scanner;

public class UriOnline_41 {


    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int i,c = 0;
       float [] a = new float[6];
       for (i = 0; i<6;i++){
           a[i] = sc.nextFloat();
            }
      for (i = 0; i<6;i++){
           if (a[i]>0){
               c++;
           }
            }
      System.out.printf("%d valores positivos\n",c);
       
    }
    
}
