
package urionline_11;

import java.util.Scanner;


public class UriOnline_11 {

    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int code1 = sc.nextInt();
      int unit1 = sc.nextInt();
      float price1 = sc.nextFloat();
      int code2 = sc.nextInt();
      int unit2 = sc.nextInt();
      float price2 = sc.nextFloat();
      float total,total2;
      total = unit1*price1;
      total2 = unit2*price2;
      total = total+total2;
      System.out.printf("VALOR A PAGAR: R$ %.2f",total);
     
    }
    
}
