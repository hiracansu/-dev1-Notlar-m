import java.util.Scanner;

public class Soru1 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("1. siparis tutari: ");
        double bir = keyboard.nextDouble();
        System.out.print("2. siparis tutari: ");
        double iki =keyboard.nextDouble();
        System.out.print("3. siparis tutari: ");
        double uc =keyboard.nextDouble();
        System.out.print("4. siparis tutari: ");
        double dort =keyboard.nextDouble();
        System.out.print("5. siparis tutari: ");
        double bes =keyboard.nextDouble();

        double ortalama = (bir + iki + uc + dort + bes) / 5;
        System.out.println("Hediye cekinizin tutari " + ortalama);

        double bir_eksi_ortalama = bir-ortalama;
        double iki_eksi_ortalama = iki-ortalama;
        double uc_eksi_ortalama = uc-ortalama;
        double dort_eksi_ortalama = dort-ortalama;
        double bes_eksi_ortalama = bes-ortalama;


        System.out.println("1. siparis tutari ile cek tutari arasindaki fark: " + bir_eksi_ortalama );
        System.out.println("2. siparis tutari ile cek tutari arasindaki fark: " + iki_eksi_ortalama );
        System.out.println("3. siparis tutari ile cek tutari arasindaki fark: " + uc_eksi_ortalama);
        System.out.println("4. siparis tutari ile cek tutari arasindaki fark: " + dort_eksi_ortalama );
        System.out.println("5. siparis tutari ile cek tutari arasindaki fark: " + bes_eksi_ortalama );

        double toplam = bir_eksi_ortalama * bir_eksi_ortalama + iki_eksi_ortalama * iki_eksi_ortalama + uc_eksi_ortalama* uc_eksi_ortalama + dort_eksi_ortalama*dort_eksi_ortalama + bes_eksi_ortalama*bes_eksi_ortalama;
        double standart_sapma = Math.sqrt(toplam/ 5) ;

        System.out.println("Siparis tutarlarinin standart sapmasi: " +standart_sapma);

    }
}

//191101053