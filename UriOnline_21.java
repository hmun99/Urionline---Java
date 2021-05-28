
package urionline_21;

import java.util.Scanner;


public class UriOnline_21 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,year,months,days;
        n = sc.nextInt();
        year = n/365;
        System.out.printf("%d ano(s)\n",year);
        year = n%365;
        months = year/30;
        days = year%30;
         System.out.printf("%d mes(es)\n",months);
         System.out.printf("%d dia(s)\n",days);
        
        
        
    }
    
}
