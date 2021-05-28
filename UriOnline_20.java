
package urionline_20;

import java.util.Scanner;

public class UriOnline_20 {

   
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n,x,h,m,s;
      n = sc.nextInt();
      h = n/3600;
      x = n%3600;
      m = x/60;
      s = x%60;
      System.out.printf("%d:%d:%d\n",h,m,s);
        
    }
    
}
