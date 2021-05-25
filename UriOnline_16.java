
package urionline_16;


import static java.lang.Math.sqrt;
import java.util.Scanner;


public class UriOnline_16 {

    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        float x1,x2,y1,y2;
        x1 = sc.nextFloat();
        y1 = sc.nextFloat();
        x2 = sc.nextFloat();
        y2 = sc.nextFloat();
        float p1 = (x2-x1)*(x2-x1);
        float p2 = (y2-y1)*(y2-y1);
        double p = sqrt(p1+p2);
        System.out.printf("%.4f\n",p);
      }
    
}
