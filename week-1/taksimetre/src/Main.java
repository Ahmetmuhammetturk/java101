import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int km ;
        double perKM =2.20, total , start=10 ;

        Scanner imput = new Scanner(System.in);
        System.out.print("Mesafeyi KM cinsinden giriniz : ");
        km = imput.nextInt();

        total = km * perKM;
        total+= start;

        total= (total<20) ? 20 : total;

        System.out.print("Toplam Tutar : " + total );









    }
}