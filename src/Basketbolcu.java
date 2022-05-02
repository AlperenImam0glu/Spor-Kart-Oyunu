public class Basketbolcu extends Sporcu {

    private int ikilik;
    private int ucluk;
    private int serbestAtis;

    public Basketbolcu() {
        super();
    }

    public Basketbolcu(int oyuncuID, String oyuncuAdi,boolean kartKullanildiMi, int ikilik, int ucluk, int serbestAtis) {
        super(oyuncuID, oyuncuAdi,kartKullanildiMi);
        this.ikilik = ikilik;
        this.ucluk = ucluk;
        this.serbestAtis = serbestAtis;
    }

    public void sporcuPuaniGoster() {
        super.sporcuPuaniGoster();
    }

    public int getIkilik() {
        return ikilik;
    }

    public void setIkilik(int ikilik) {
        this.ikilik = ikilik;
    }

    public int getUcluk() {
        return ucluk;
    }

    public void setUcluk(int ucluk) {
        this.ucluk = ucluk;
    }

    public int getSerbestAtis() {
        return serbestAtis;
    }

    public void setSerbestAtis(int serbestAtis) {
        this.serbestAtis = serbestAtis;
    }


}
