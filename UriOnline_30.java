
package urionline_30;

import java.util.Scanner;

public class UriOnline_30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a,b,c;
        float area;
        float trap;
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        if((a < ((float)(b+c)))&& (b < ((float)(a+c)))&& (c < ((float)(a+b)))){
            area = a+b+c;
            System.out.printf("Perimetro = %.1f\n",area);
        }
        else{
            trap = (c*(a+b))/2;
            System.out.printf("Area = %.1f\n",trap);
        }
        
    }
    
}
