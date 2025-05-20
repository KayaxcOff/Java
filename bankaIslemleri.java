import java.util.Scanner;

public class BankaIslemleri {

    public double paraCek(double istenilenPara, double bakiye) {
        if (istenilenPara > bakiye) {
            System.out.println("Yetersiz bakiye!");
        } else {
            bakiye -= istenilenPara;
            System.out.println("Para çekme işlemi başarılı.");
        }
        return bakiye;
    }

    public double paraYatir(double yuklenecekPara, double bakiye) {
        bakiye += yuklenecekPara;
        System.out.println("Para yatırma işlemi başarılı.");
        return bakiye;
    }

    public void bakiyeGoster(double bakiye) {
        System.out.println("Bakiyeniz: " + bakiye);
    }

    public double paraTransfer(double transfer, double bakiye) {
        Scanner input = new Scanner(System.in);
        int gecerliID = 123456789;
        System.out.println("Alıcının ID'sini giriniz: ");
        int girilenID = input.nextInt();

        if(girilenID == gecerliID) {
            if(bakiye > transfer) {
                bakiye -= transfer;
            } else if (bakiye == transfer) {
                System.out.println("Bakiyeniz bitti.");
            } else {
                System.out.println("Bakiyeniz yetersiz!");
            }
        } else {
            System.out.println("Girdiğiniz ID yanlıştır !");
        }

        return bakiye;
    }
}
