import javax.swing.*;

public class Btn extends JButton {
    private int konumx;
    private int konumy;
    private int deger;
    private boolean kullanim;

    public Btn(int konumx, int konumy, int deger, boolean kullanim) {
        this.konumx = konumx;
        this.konumy = konumy;
        this.deger = deger;
        this.kullanim = kullanim;
    }

    public int getKonumx() {
        return konumx;
    }

    public void setKonumx(int konumx) {
        this.konumx = konumx;
    }

    public int getKonumy() {
        return konumy;
    }

    public void setKonumy(int konumy) {
        this.konumy = konumy;
    }

    public int getDeger() {
        return deger;
    }

    public void setDeger(int deger) {
        this.deger = deger;
    }

    public boolean isKullanim() {
        return kullanim;
    }

    public void setKullanim(boolean kullanim) {
        this.kullanim = kullanim;
    }






}
