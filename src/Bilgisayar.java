import java.util.ArrayList;
import java.util.Random;

public class Bilgisayar extends Oyuncu {

    public Bilgisayar() {
        super();
    }
    public Bilgisayar(int oyunucuID, int skor, String oyuncuAdi) {
        super(oyunucuID, skor, oyuncuAdi);
    }

    public int kartSec(int[] bilgisyarFkartlar, int[] bilgisyarBkartlar, int sayac, ArrayList<Futbolcu> liste, ArrayList<Basketbolcu> liste2){
        Random random = new Random();
        int atama = 0;
        boolean a = true;
        if (sayac % 2 == 0) {
            while (a) {
                atama = 1 + random.nextInt(4);
                atama = atama - 1;
                if (liste.get(bilgisyarFkartlar[atama] - 1).kartKullanildiMi == true) {

                } else {
                    a = false;
                }

            }

            System.out.println("Bilgisayarın secimi = " + liste.get(bilgisyarFkartlar[atama] - 1).getOyuncuAdi() + " | serbest atış=" + Test.liste.get(bilgisyarFkartlar[atama] - 1).getSerbestAtis() + " | penaltı =" + Test.liste.get(bilgisyarFkartlar[atama] - 1).getPenaltı() + " | kaleciye karşı =" + Test.liste.get(bilgisyarFkartlar[atama] - 1).getKaleciKarsiKarsiya());
        } else {
            a = true;
            while (a) {
                atama = 1 + random.nextInt(4);
                atama = atama - 1;
                if (liste2.get(bilgisyarBkartlar[atama] - 1).kartKullanildiMi == true) {

                } else {
                    a = false;
                }

            }

            System.out.println("Bilgisayarın secimi = " + liste2.get(bilgisyarBkartlar[atama] - 1).getOyuncuAdi() + " | serbest atış=" + Test.liste2.get(bilgisyarBkartlar[atama] - 1).getSerbestAtis() + " | ikilik =" + Test.liste2.get(bilgisyarBkartlar[atama] - 1).getIkilik() + " | Üçlük =" + Test.liste2.get(bilgisyarBkartlar[atama] - 1).getUcluk());
        }


        return atama;
    }

    public void skorGoster(){
        System.out.println("-----BİLGİSAYAR PUAN =" +this.skor);
    }
}
