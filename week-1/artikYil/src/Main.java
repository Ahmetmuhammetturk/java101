import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year, ayear;


        Scanner inp = new Scanner(System.in);


        System.out.print("Yıl Giriniz : ");
        year = inp.nextInt();

        if ((year % 400 == 0) && (year % 100 == 0)) {
            System.out.print(year + "Bir Artık Yıldır ! ");

        } else if ((year % 4 == 0) && (year % 100 != 0)) {
            System.out.print(year + "Bir Artık Yıldır ! ");

        } else {
            System.out.print(year + "Bir Artık Yıl Değildir ! ");
        }

    }

}



