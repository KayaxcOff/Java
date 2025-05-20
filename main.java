import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        AraYuz araYuz = new AraYuz();
        /*ParaCek paraCek = new ParaCek();
        ParaYatir paraYatir = new ParaYatir();
        ParaTransferi paraTransferi = new ParaTransferi();
        */
        BankaIslemleri bankaIslemleri = new BankaIslemleri();
        System.out.println("Adınızı giriniz: ");
        String isim = input.nextLine();

        System.out.println("Soy adınızı giriniz: ");
        String soyAd = input.nextLine();

        double bakiye = 1000;
        araYuz.ekran(isim, soyAd, bakiye);

        System.out.println("Devam etmek için bir tuşa tuşuna basınız");
        String devam = input.nextLine();
        araYuz.islemMenusu();
        System.out.println("Yapmak istediğiniz işlemi seçiniz \n>>");
        int secim = input.nextInt();

        switch (secim) {
            case 1:
                System.out.println("Ne kadar para çekmek isiyorsunuz: ");
                double azaltPara = input.nextDouble();
                bakiye = bankaIslemleri.paraCek(azaltPara, bakiye);
                break;

            case 2:
                System.out.println("Ne kadar para yatırmak istiyorsunuz: ");
                double eklePara = input.nextDouble();
                bakiye = bankaIslemleri.paraYatir(eklePara, bakiye);
                break;

            case 3:
                bankaIslemleri.bakiyeGoster(bakiye);
                break;

            case 4:
                System.out.println("Transfer edilecek para miktarını giriniz: ");
                double tranferPara = input.nextDouble();
                bakiye = bankaIslemleri.paraTransfer(tranferPara, bakiye);
                break;

            default:
                System.out.println("Hatalı tercih yaptınız!");
                break;
        }

        input.close();
    }
}
