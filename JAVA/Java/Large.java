import java.util.*;

public class Large{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        if (n1>n2){
            System.out.println(n1+" is the Largest");
        }else{
            System.out.println(n2+" is the Largest");
        }
    }
}