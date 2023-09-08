import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double km, perKm, total ;
        int age, flyType;
        boolean isError = false;
        perKm = 0.10;

        Scanner inp = new Scanner(System.in);

        System.out.print("Mesafeyi KM türünden giriniz : ");
        km = inp.nextDouble();

        System.out.print("Yaşınızı giriniz : ");
        age = inp.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        flyType = inp.nextInt();

        total = km * perKm;
        switch (flyType){
            case 1 :
                if (age<12){
                    total*=0.5;
                }else if (age<25){
                    total*=0.9;
                }else if (age>65){
                    total*=0.7;
                }

            case 2 :
                if (age<12){
                    total*=0.8;
                    total*=2;
                    total*=0.5;
                }else if (age<25){
                    total*=0.8;
                    total*=2;
                    total*=0.9;
                }else if (age>65){
                    total*=0.8;
                    total*=5;
                    total*=0.7;
                }

        }if (flyType<1||flyType>2){
            System.out.print("Hatali Veri Girdiniz ! ");
        }else if (km<=0||age<0){
            System.out.print("Hatalı Veri Girdiniz ! ");
        }else {
            System.out.print("Toplam Tutar : "+total);
        }

    }
}