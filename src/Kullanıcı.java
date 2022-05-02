import java.util.ArrayList;
import java.util.Scanner;

public class Kullanıcı extends Oyuncu{


    public Kullanıcı() {
        super();
    }
    public Kullanıcı(int oyunucuID, int skor, String oyuncuAdi) {
        super(oyunucuID, skor, oyuncuAdi);
    }

    public void skorGoster(){
        System.out.println("-----KULLANICI PUAN =" +this.skor);
    }

    public int kartSec(int secim){

        return secim;

    }
}
