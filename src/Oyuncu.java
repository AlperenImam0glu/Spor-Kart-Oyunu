import java.util.Random;
public class Oyuncu {

    int oyunucuID, skor;
    String oyuncuAdi;


    public Oyuncu() {
    }
    public Oyuncu(int oyunucuID, int skor, String oyuncuAdi) {
        this.oyunucuID = oyunucuID;
        this.skor = skor;
        this.oyuncuAdi = oyuncuAdi;
    }


    public static int[] kartDagit(int kartlar[]){
        int []kontrol ={1,2,3,4,5,6,7,8};
        boolean a=true;
        int b=0;
        Random r=new Random(); //random sınıfı
        for(int i =0; i<4;i++){
            while(a) {
                b= 1 + r.nextInt(8);
                kartlar[i] =b;
                for(int j=0;j<4;j++){
                    if(j==i){
                        continue;
                    }
                    else if(kartlar[i]==kartlar[j]){
                        a=true;
                        break;
                    }
                    else{
                        a=false;
                    }

                }
            }
            kontrol[b-1]=0;
            a=true;
        }

        int ara =4;
        for(int i =0;i<8;i++){
            if(kontrol[i]!=0) {
                kartlar[ara] = kontrol[i];
                ara++;
            }
        }


        return kartlar;
    }

    public static int bkartDagit(int[] bkartlar){
        return 0;
    }

    public int kartListesi(int[]kartlar){
        return  0;
    }

    public void skorGoster(){

    }

    public static void kartGoster(int[]kullaniciFkartlar,int[]kullaniciBkartlar){
        System.out.println("====================================================================");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                if (kullaniciFkartlar[i] == Test.liste.get(j).getOyuncuID() && !Test.liste.get(j).kartKullanildiMi) {
                    System.out.println("("+(i+1)+")"+"id = ["+ Test.liste.get(j).getOyuncuID()+"]"+Test.liste.get(j).getOyuncuAdi() + " | serbest atış=" + Test.liste.get(j).getSerbestAtis() + " | penaltı =" + Test.liste.get(j).getPenaltı() + " | kaleciye karşı =" + Test.liste.get(j).getKaleciKarsiKarsiya()+"dogruluk ="+Test.liste.get(j).kartKullanildiMi);
                    j = 8;
                }
            }
        }
        System.out.println("-----");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                if (kullaniciBkartlar[i] == Test.liste2.get(j).getOyuncuID() &&  !Test.liste2.get(j).kartKullanildiMi) {
                    System.out.println("("+(i+1)+")"+"id = ["+ Test.liste2.get(j).getOyuncuID()+"]"+Test.liste2.get(j).getOyuncuAdi() + " | serbest atış=" + Test.liste2.get(j).getSerbestAtis() + " | ikilik =" + Test.liste2.get(j).getIkilik() + "  | Üçlük =" + Test.liste2.get(j).getUcluk());
                }
            }

        }

        System.out.println("====================================================================");

    }

    public int kartSec(int[]kartlar){
        return  0;
    }


}
