package JAVA.Java;
import java.util.*;
public class Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principle");
        int p = sc.nextInt();
        System.out.print("Enter years");
        int n = sc.nextInt();
        System.out.print("Enter Rate");
        int r = sc.nextInt();
        int inter = p*n*r;
        System.out.print("Interest "+inter);
    }
    
}
