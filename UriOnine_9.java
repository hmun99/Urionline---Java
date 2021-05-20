
package urionine_9;

import java.util.Scanner;


public class UriOnine_9 {

    
    public static void main(String[] args) {
       int id,hour;
       float amount;
       double salary;
       Scanner sc = new Scanner(System.in);
       id = sc.nextInt();
       hour = sc.nextInt();
       amount = sc.nextFloat();
       salary = hour*amount;
       System.out.println("NUMBER = "+id);
       System.out.printf("SALARY = U$ %.2f\n",salary);
    }
    
}
