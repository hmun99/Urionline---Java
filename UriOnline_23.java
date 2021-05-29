
package urionline_23;

import java.util.Scanner;


public class UriOnline_23 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d,x,y;
        a = sc.nextInt();
        b = sc.nextInt();
        d = sc.nextInt();
        c = sc.nextInt();
        x = a+b;
        y = d+c;
        if((b>c && d>a)&&(x<y)&&(c>0 && d>0)&&(a%2 ==0)){
        System.out.printf("Valores aceitos\n");
    }
        else{
           System.out.printf("Valores nao aceitos\n"); 
        }
    }
    
}
