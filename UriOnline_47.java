
package urionline_47;

import java.util.Scanner;

public class UriOnline_47 {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       int i;
       for (i = x; i <= x+11;i++){
           if(i%2 != 0){
               System.out.print(i+"\n");
                       
           }
       }
    }
    
}
