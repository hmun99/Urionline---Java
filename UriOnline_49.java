
package urionline_49;
import java.util.Scanner;
public class UriOnline_49 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int[] a = new int[4];
       int n = sc.nextInt();
       int i;
       int x = 0,y = 0;
       if(n < 10000){
       for (i = 0; i < n;i++){
           a[i] =sc.nextInt();
           
       }
       }
       for(i= 0; i<n;i++){
        if(a[i]>-10000000 && a[i]<10000000){
        if(a[i]>=10 && a[i]<=20){
              x++;
           }
           else{
               y++;
           }
       }
      
    }
       System.out.printf("%d in\n",x);
       System.out.printf("%d out\n",y);
}
}
