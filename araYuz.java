public class AraYuz {
    public void ekran(String isim, String soyAd, double bakiye) {
        System.out.println("---------------");
        System.out.println(">> Adınız:" + " " + isim);
        System.out.println(">> Soyadınız:" + " " + soyAd);
        System.out.println("---------------");
        System.out.println("-} Bakiye:" + " " + bakiye);
        System.out.println("---------------");
    }

    public void islemMenusu() {
        System.out.println("1 - Para çekme\n2 - Para yatirma\n3 - Bakiye görüntüleme\n4 - Para transferi");
    }

}
