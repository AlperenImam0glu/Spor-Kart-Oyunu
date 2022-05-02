public class Sporcu {
    private int oyuncuID, skor;
    String oyuncuAdi;
    boolean kartKullanildiMi ;


    public Sporcu() {
    }

    public Sporcu(int oyuncuID, String oyuncuAdi,boolean kullanim) {
        this.oyuncuID = oyuncuID;
        this.oyuncuAdi = oyuncuAdi;
        this.kartKullanildiMi = kullanim;


    }

    public void sporcuPuaniGoster(){}

    public int puanGoster(){
        return 0;
    }





    public int getOyuncuID() {
        return oyuncuID;
    }

    public void setOyuncuID(int oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    public int getSkor() {
        return skor;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }

    public String getOyuncuAdi() {
        return oyuncuAdi;
    }

    public boolean isKullanim() {
        return kartKullanildiMi;
    }

    public void setKullanim(boolean kullanim) {
        this.kartKullanildiMi = kullanim;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }


}
