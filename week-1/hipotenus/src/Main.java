
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b;
        double c;
        Double u;

        Scanner inp = new Scanner(System.in);
        System.out.print("DİK KENAR 1:");
        a= inp.nextInt();
        System.out.print("DİK KENAR 2:");
        b= inp.nextInt();
        System.out.print("HİPOTENÜS :");
        c= inp.nextDouble();

        u = (a+b+c) / 2 ;
        double alan = (a*b/2);
        System.out.println(alan);





















    }
}