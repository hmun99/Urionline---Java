
package urionline_10;

import java.util.Scanner;

public class UriOnline_10 {

    
    public static void main(String[] args) {
        double salary,sold,total;
        String name;
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        salary = sc.nextDouble();
        sold = sc.nextDouble();
        
        total = salary +(sold*.15);
        System.out.printf("TOTAL = R$ %.2f\n",total);
    }
    
}
