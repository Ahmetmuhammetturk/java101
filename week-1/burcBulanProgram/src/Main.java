import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int month, day;
        String burc = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz Ay : ");
        month = input.nextInt();

        System.out.print("Doğduğunuz Gün : ");
        day = input.nextInt();

        if ((day >= 1 && day <= 31) && (month >= 1 && month <= 12)) {
            if (month == 1) {
                if (day <= 20) {
                    burc = "Oğlak";
                } else {
                    burc = "Kova";
                }
            } else if (month == 2 ) {
                if (day <= 29) {
                    burc = "Kova";
                } else {
                    isError = true;
                }
            } else if (month == 3) {
                if (day <= 19) {
                    burc = "Balık";
                } else {
                    burc = "Koç";
                }
            } else if (month == 4 ) {
                if (day <= 30) {
                    burc = "Koç";
                } else {
                    isError=true;
                }
            } else if (month == 5) {
                if (day <= 20) {
                    burc = "Boğa";
                } else {
                    burc = "İkizler";
                }
            } else if (month == 6) {
                if (day <= 30) {
                    burc = "İkizler";
                } else {
                    isError=true;
                }
            } else if (month == 7) {
                if (day <= 21) {
                    burc = "Yengeç";
                } else {
                    burc = "Aslan";
                }
            } else if (month == 8) {
                if (day <= 21) {
                    burc = "Aslan";
                } else {
                    burc = "Başak";
                }
            } else if (month == 9) {
                if (day <= 30) {
                    burc = "Başak";
                } else {
                   isError=true;
                }
            } else if (month == 10) {
                if (day <= 21) {
                    burc = "Terazi";
                } else {
                    burc = "Akrep";
                }
            } else if (month == 11) {
                if (day <= 30) {
                    burc = "Akrep";
                } else {
                    isError=true;
                }
            } else if (month == 12) {
                if (day <= 20) {
                    burc = "Yay";
                } else {
                    burc = "Oğlak";
                }
            }

        } else {
            isError = true;
        }
        if (isError) {
            System.out.println("Hatalı gün veya ay girdiniz ! ");
        } else {
            System.out.print("Burcunuz : " + burc);
        }


    }


}
