package JAVA.Java;

public class Factorial {
    public static void main(String[] args) {
        fact(5);
}
static void fact(int a){
    int fac=1;
    for(int i=a;i>=1;i--)
        fac=fac*i;
    System.out.print(fac);
}
}
