
package urionline_48;

import java.util.Scanner;

public class UriOnline_48 {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       int y = sc.nextInt();
       int sum = 0;
       int i;
       for (i = y+1; i < x;i++){
           if(i%2 != 0){
               sum = sum+i;            
           }
       }
       System.out.print(sum+"\n");
    }
    
}
