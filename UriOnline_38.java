
package urionline_38;

import java.util.Scanner;

public class UriOnline_38 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,x,y,z;
        a = sc.nextDouble();
        if( a >= 0.00 & a <= 2000.00){
            System.out.printf("Isento\n");
        }
        else if(a >= 2000.01 && a <= 3000.00 ){
            x = (a-2000.00)*.08;
            System.out.printf("R$ %.2f\n",x);
        }
        else if(a >= 3000.01 && a <= 4500.00 ){
            x = (a-3000.00)*.18+(1000.00*.08);
            System.out.printf("R$ %.2f\n",x);
        }
        else{
           x = (a-4500.00)*.28+(1500*.18)+(1000.00*.08);
            System.out.printf("R$ %.2f\n",x);
        }
    }
    
}
