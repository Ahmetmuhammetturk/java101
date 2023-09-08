import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age;
        double zodiac;
        String burc = "";


        Scanner inp = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz : ");
        age = inp.nextInt();

        zodiac = age % 12;
        if (age > 2023) {
            System.out.print("Hatalı Doğum Tarihi Girdiniz !");
        } else {
            if (zodiac == 0) {
                burc = "Maymun";
            } else if (zodiac == 1) {
                burc = "Horoz";
            } else if (zodiac == 2) {
                burc = "Köpek";
            } else if (zodiac == 3) {
                burc = "Domuz";
            } else if (zodiac == 4) {
                burc = "Fare";
            } else if (zodiac == 5) {
                burc = "Öküz";
            } else if (zodiac == 6) {
                burc = "Kaplan";
            } else if (zodiac == 7) {
                burc = "Tavşan";
            } else if (zodiac == 8) {
                burc = "Ejderha";
            } else if (zodiac == 9) {
                burc = "Yılan";
            } else if (zodiac == 10) {
                burc = "At";
            } else if (zodiac == 11) {
                burc = "Koyun";
            }
            System.out.print("Çin Zodyağı Burcunuz : " + burc);


        }


    }
}