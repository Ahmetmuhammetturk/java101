import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fizik, turkce, kimya, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = input.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce = input.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = input.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik = input.nextInt();

        double avarage = (mat + fizik + turkce + kimya + muzik) / 5;

        if (avarage<=55){
            System.out.println("Sınıftan Kaldınız , Seneye Tekrar Görüşmek Üzere ! ");
        }else {
            System.out.println("Sınıfı Geçtiniz , Tebrikler ! ");
        }
        System.out.println("ORTALAMANIZ : "+ avarage);

    }
}