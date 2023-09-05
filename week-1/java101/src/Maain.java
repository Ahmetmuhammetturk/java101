import java.util.Scanner;

public class Maain {
    public static void main(String[] args) {

        double kdvsizFiyat,kdvliFiyat;
        double kdvTutari;

        Scanner inp = new Scanner(System.in);
        System.out.print("Ürün tutarı : ");
        kdvsizFiyat= inp.nextDouble();
        boolean kosul1 = (0<kdvsizFiyat && kdvsizFiyat<=1000) ;

        double a = kosul1 ? (kdvTutari = 0.18) : (kdvTutari = 0.08);
        kdvliFiyat= kdvsizFiyat*kdvTutari+kdvsizFiyat;

        System.out.println("KDV'li Fiyat:" + kdvliFiyat);
        System.out.println("KDV'siz Fiyat:"+ kdvsizFiyat);
        System.out.println("KDV Oranı :" + kdvTutari);
        System.out.println("KDV Tutarı:" + kdvsizFiyat*kdvTutari);



















    }
}
