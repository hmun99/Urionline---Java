
package urionline_6;

import java.util.Scanner;


public class UriOnline_6 {


    public static void main(String[] args) {
       Scanner x = new Scanner(System.in);
       float a = x.nextFloat();
       float b = x.nextFloat();
       double s = (((a*3.5)+(b*7.5))/(3.5+7.5));
       System.out.printf("MEDIA = %.5f\n",s);
      
    }
    
}
