
package urionline_14;

import static java.lang.Math.abs;
import java.util.Scanner;

public class UriOnline_14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int maxA,maxB;
        maxA = (a+b+abs(a-b))/2;
        maxB = (maxA+c+abs(maxA-c))/2;
        System.out.printf("%d eh o maior\n",maxB);
      
    }
    
}
