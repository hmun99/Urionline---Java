
package urionline_8;

import java.util.Scanner;


public class UriOnline_8 {

    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int x,y,z;
        x = a*b;
        y = d*c;
        z = x-y; 
        System.out.println("DIFERENCA = "+z);
    }
    
}
