
package urionline_31;

import java.util.Scanner;

public class UriOnline_31 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a,b;
       a = sc.nextInt();
       b = sc.nextInt();
       if (b%a == 0 || a%b == 0){
           System.out.printf("Sao Multiplos\n");
       }
       else{
            System.out.printf("Nao sao Multiplos\n");
       }
    }
    
}
