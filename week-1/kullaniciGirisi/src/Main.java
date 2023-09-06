import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password, newPassword, repass;

        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanıcı Adınızı Giriniz :");
        userName = inp.nextLine();

        System.out.print("Şifreniz :");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java101")) {
            System.out.print("Giriş Yaptınız ");
        } else {
            System.out.print("Giriş Başarısız Şifre Yenilemek İster Misiniz?\nİsterseniz 1'e İstemezseniz Herhangi Bir Tuşa Basınız: ");
            repass = inp.nextLine();
            if (repass.equals("1")) {
                System.out.print("Yeni Şifre Giriniz :");
                newPassword = inp.nextLine();
                if (newPassword.equals("java101")) {
                    System.out.print("Şifre Oluşturulamadı , lütfen başka bir şifre giriniz");
                } else {
                    System.out.print("Giriş Başarılı.");
                }
            }


        }

    }
}