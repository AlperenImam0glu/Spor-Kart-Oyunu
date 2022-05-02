public class Futbolcu  extends Sporcu{
    private int penaltı, serbestAtis ,kaleciKarsiKarsiya;

    public Futbolcu() {
        super();
    }

    public Futbolcu(int oyuncuID, String oyuncuAdi,boolean kartKullanildiMi, int penaltı, int serbestAtis, int kaleciKarsiKarsiya) {
        super(oyuncuID, oyuncuAdi,kartKullanildiMi);
        this.penaltı = penaltı;
        this.serbestAtis = serbestAtis;
        this.kaleciKarsiKarsiya = kaleciKarsiKarsiya;
    }

    @Override
    public void sporcuPuaniGoster() {
        super.sporcuPuaniGoster();
    }

    public int getPenaltı() {
        return penaltı;
    }

    public void setPenaltı(int penaltı) {
        this.penaltı = penaltı;
    }

    public int getSerbestAtis() {
        return serbestAtis;
    }

    public void setSerbestAtis(int serbestAtis) {
        this.serbestAtis = serbestAtis;
    }

    public int getKaleciKarsiKarsiya() {
        return kaleciKarsiKarsiya;
    }

    public void setKaleciKarsiKarsiya(int kaleciKarsiKarsiya) {
        this.kaleciKarsiKarsiya = kaleciKarsiKarsiya;
    }
}
