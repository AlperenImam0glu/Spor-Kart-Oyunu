import javax.management.remote.JMXConnectorFactory;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;

public class Test implements MouseListener {
    static ArrayList<Futbolcu> liste = new ArrayList<>();
    static ArrayList<Basketbolcu> liste2 = new ArrayList<>();
    static ArrayList<Integer> bilgisayarf = new ArrayList<Integer>();
    static ArrayList<Integer> bilgisyarb= new ArrayList<Integer>();
    static ArrayList<Integer> kullanicif = new ArrayList<Integer>();
    static ArrayList<Integer> kullanicib= new ArrayList<Integer>();
    int sayac = 0, fubolkartları = 0, basketkartları = 0;
    int secim =0,kullaniciskor=0,bilgisayarskor=0;
    JFrame ekran;
    Btn [][] butonlar = new Btn[2][5];
    JLabel[] yazılar = new JLabel[8];

    public Test() {
        oyun();
    }
    public void oyun () {

        Futbolcu f1 = new Futbolcu(1, "alex      ", false, 80, 75, 87);
        Futbolcu f2 = new Futbolcu(2, "quaresma  ", false, 85, 80, 87);
        Futbolcu f3 = new Futbolcu(3, "falcao    ", false, 90, 90, 95);
        Futbolcu f4 = new Futbolcu(4, "hasan ali ", false, 80, 80, 83);
        Futbolcu f5 = new Futbolcu(5, "arda turan", false, 75, 77, 80);
        Futbolcu f6 = new Futbolcu(6, "messi     ", false, 95, 90, 95);
        Futbolcu f7 = new Futbolcu(7, "rüştü     ", false, 75, 70, 90);
        Futbolcu f8 = new Futbolcu(8, "emenike   ", false, 65, 70, 71);
        Futbolcu f9 = new Futbolcu(9, "hasan   ", false, 100, 100, 100);


        Basketbolcu b1 = new Basketbolcu(1, "lebron          ", false, 97, 96, 97);
        Basketbolcu b2 = new Basketbolcu(2, "curry           ", false, 95, 99, 99);
        Basketbolcu b3 = new Basketbolcu(3, "jordan          ", false, 95, 92, 97);
        Basketbolcu b4 = new Basketbolcu(4, "cedi osman      ", false, 91, 90, 90);
        Basketbolcu b5 = new Basketbolcu(5, "kobe            ", false, 97, 98, 100);
        Basketbolcu b6 = new Basketbolcu(6, "Shaquille O`Neal", false, 96, 80, 80);
        Basketbolcu b7 = new Basketbolcu(7, "Abdul Jabbar    ", false, 90, 80, 80);
        Basketbolcu b8 = new Basketbolcu(8, "bobby           ", false, 90, 85, 90);




        liste.add(f1);
        liste.add(f2);
        liste.add(f3);
        liste.add(f4);
        liste.add(f5);
        liste.add(f6);
        liste.add(f7);
        liste.add(f8);
        liste.add(f9);

        liste2.add(b1);
        liste2.add(b2);
        liste2.add(b3);
        liste2.add(b4);
        liste2.add(b5);
        liste2.add(b6);
        liste2.add(b7);
        liste2.add(b8);


        ekran = new JFrame("OYUNCU KART OYUNU");

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Btn buton1 = new Btn(30, 30, 1, false);
        buton1.setBounds(30, 150, 200, 250);
        Btn buton2 = new Btn(200, 250, 1, false);
        buton2.setBounds(280, 150, 200, 250);
        Btn buton3 = new Btn(200, 250, 1, false);
        buton3.setBounds(530, 150, 200, 250);
        Btn buton4 = new Btn(200, 250, 1, false);
        buton4.setBounds(780, 150, 200, 250);
        Btn buton5 = new Btn(30, 30, 1, false);
        buton5.setBounds(30, 430, 200, 250);
        Btn buton6 = new Btn(200, 250, 1, false);
        buton6.setBounds(280, 430, 200, 250);
        Btn buton7 = new Btn(200, 250, 1, false);
        buton7.setBounds(530, 430, 200, 250);
        Btn buton8 = new Btn(200, 250, 1, false);
        buton8.setBounds(780, 430, 200, 250);
        Btn buton9 = new Btn(200, 250, 1, false);
        buton9.setBounds(1080, 100, 200, 250);
        Btn buton10 = new Btn(200, 250, 1, false);
        buton10.setBounds(1080, 410, 200, 250);
        buton1.setEnabled(true);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        JTextArea t = new JTextArea();
        t.setBounds(600, 300, 150, 20);
        ekran.add(t);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        JLabel l1 = new JLabel();
        l1.setText("BİLGİSAYAR SEÇİMİ");
        l1.setFont (l1.getFont ().deriveFont (17.0f));
        l1.setBounds(1100, 30, 170, 100);

        JLabel l2 = new JLabel();
        l2.setFont (l2.getFont ().deriveFont (17.0f));
        l2.setText("KULLANICI SEÇİMİ");
        l2.setBounds(1100, 340, 150, 100);

        JLabel l3 = new JLabel();
        l3.setFont (l3.getFont ().deriveFont (15.0f));
        l3.setText("KULLANICI ADI ");
        l3.setBounds(470, 260, 150, 100);

        JLabel l4 = new JLabel();
        l4.setFont (l4.getFont ().deriveFont (30.0f));
        l4.setText("KULLANICI =");
        l4.setBounds(50, 10, 350, 100);

        JLabel l5 = new JLabel();
        l5.setFont (l5.getFont ().deriveFont (30.0f));
        l5.setText("BİLGİSAYAR =");
        l5.setBounds(450, 10, 350, 100);

        JLabel l6 = new JLabel();
        l6.setBounds(245, 10, 150, 100);
        l6.setFont (l6.getFont ().deriveFont (30.0f));
        l6.setText(String.valueOf(kullaniciskor));
        JLabel l7 = new JLabel();

        l7.setBounds(670, 10, 150, 100);
        l7.setFont (l7.getFont ().deriveFont (30.0f));
        l7.setText(String.valueOf(bilgisayarskor));

        JLabel l8 = new JLabel();
        l8.setFont (l8.getFont ().deriveFont (20.0f));
        l8.setText("-------------------------");
        l8.setBounds(1100, 560, 200, 250);
        l8.setForeground(Color.green);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        JButton buton11 = new Btn(200, 250, 1, false);
        buton11.setBounds(630, 350, 100, 50);
        buton11.setText("BASLA");
        ekran.add(buton11);
        ekran.add(l3);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        JLabel puanAlan= new JLabel();
        puanAlan.setText("+10");
        puanAlan.setBounds(1300,500,100,50);
        puanAlan.setFont (puanAlan.getFont ().deriveFont (30.0f));
        puanAlan.setForeground(Color.red);
        ekran.add(puanAlan);
        puanAlan.setVisible(false);

        JLabel puanAlan2= new JLabel();
        puanAlan2.setText("+10");
        puanAlan2.setBounds(1300,190,100,50);
        puanAlan2.setFont (puanAlan.getFont ().deriveFont (30.0f));
        puanAlan2.setForeground(Color.red);
        ekran.add(puanAlan2);
        puanAlan2.setVisible(false);
        yazılar[5]=puanAlan;
        yazılar[6]=puanAlan2;


        JLabel puanAlan3= new JLabel();
        puanAlan3.setText("EŞİT");
        puanAlan3.setBounds(1300,350,100,50);
        puanAlan3.setFont (puanAlan.getFont ().deriveFont (30.0f));
        puanAlan3.setForeground(Color.red);
        ekran.add(puanAlan3);
        puanAlan3.setVisible(false);
        yazılar[7]=puanAlan3;

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        yazılar[0]=l6;
        yazılar[1]=l7;
        yazılar[2]=l8;
        yazılar[3]=l1;
        yazılar[4]=l2;

        ekran.add(l4);
        ekran.add(l5);
        ekran.add(l6);
        ekran.add(l7);
        ekran.add(l8);

        butonlar[0][0] = buton1;
        butonlar[0][1] = buton2;
        butonlar[0][2] = buton3;
        butonlar[0][3] = buton4;
        butonlar[0][4] = buton9;
        butonlar[1][0] = buton5;
        butonlar[1][1] = buton6;
        butonlar[1][2] = buton7;
        butonlar[1][3] = buton8;
        butonlar[1][4] = buton10;


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                butonlar[i][j].setVisible(false);
            }
            l1.setVisible(false);
            l2.setVisible(false);
            l4.setVisible(false);
            l5.setVisible(false);
            l6.setVisible(false);
            l7.setVisible(false);
            l8.setVisible(false);
        }

        ekran.add(buton1);
        ekran.add(buton2);
        ekran.add(buton3);
        ekran.add(buton4);
        ekran.add(buton5);
        ekran.add(buton6);
        ekran.add(buton7);
        ekran.add(buton8);
        ekran.add(buton9);
        ekran.add(buton10);
        ekran.add(l1);
        ekran.add(l2);

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        buton11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String isim ;
                isim=t.getText();

                if(isim.length()<1){
                    isim = "KULLANICI";
                }


                l4.setText(isim.toUpperCase()+" =");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 5; j++) {
                        butonlar[i][j].setVisible(true);
                    }

                }
                l1.setVisible(true);
                l2.setVisible(true);
                l4.setVisible(true);
                l5.setVisible(true);
                l6.setVisible(true);
                l7.setVisible(true);
                l8.setVisible(true);
                t.setVisible(false);
                l3.setVisible(false);
                buton11.setVisible(false);

            }

        });


        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        Kullanıcı kullanıcı = new Kullanıcı(1, 0, "Oyuncu");
        Bilgisayar bilgisayar = new Bilgisayar(2, 0, "bilgisayar");

        int[] tumKartlar = {0, 0, 0, 0, 0, 0, 0, 0,0};
        int[] kullaniciFkartlar = {0, 0, 0, 0};
        int[] BilgisayarFkartlar = {0, 0, 0, 0};
        int[] kullaniciBkartlar = {0, 0, 0, 0};
        int[] BilgisayarBkartlar = {0, 0, 0, 0};


        Oyuncu.kartDagit(tumKartlar);

        for (int i = 0; i < 4; i++) {
            kullaniciFkartlar[i] = tumKartlar[i];
            BilgisayarFkartlar[i] = tumKartlar[i + 4];
        }

        Oyuncu.kartDagit(tumKartlar);
        for (int i = 0; i < 4; i++) {
            kullaniciBkartlar[i] = tumKartlar[i];
            BilgisayarBkartlar[i] = tumKartlar[i + 4];
        }

        for (int i = 0; i < 4; i++) {

            System.out.println("  "+ kullaniciFkartlar[i]);

        }


        bilgisayarf.add(BilgisayarFkartlar[0]);
        bilgisayarf.add(BilgisayarFkartlar[1]);
        bilgisayarf.add(BilgisayarFkartlar[2]);
        bilgisayarf.add(BilgisayarFkartlar[3]);

        bilgisyarb.add(BilgisayarBkartlar[0]);
        bilgisyarb.add(BilgisayarBkartlar[1]);
        bilgisyarb.add(BilgisayarBkartlar[2]);
        bilgisyarb.add(BilgisayarBkartlar[3]);

        kullanicif.add(kullaniciFkartlar[0]);
        kullanicif.add(kullaniciFkartlar[1]);
        kullanicif.add(kullaniciFkartlar[2]);
        kullanicif.add(kullaniciFkartlar[3]);

        kullanicib.add(kullaniciBkartlar[0]);
        kullanicib.add(kullaniciBkartlar[1]);
        kullanicib.add(kullaniciBkartlar[2]);
        kullanicib.add(kullaniciBkartlar[3]);

        //////////////////////////////////////////////////////////////////////////////////////////

        butonKartEkle(kullaniciFkartlar,kullaniciBkartlar);

        for(int i=0;i<4;i++){
            butonlar[1][i].setEnabled(false);
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j <4; j++) {

                butonlar[i][j].addMouseListener(this);
            }
        }


        ekran.setSize(1400,800);
        ekran.setLayout(null);
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ekran.setVisible(true);


        System.out.println("        ------kartlar------");
        Oyuncu.kartGoster(kullaniciFkartlar, kullaniciBkartlar);



        kullanıcı.skorGoster();
        bilgisayar.skorGoster();


    }

    public void butonKartEkle(int[] kullaniciFkartlar, int[] kullaniciBkartlar){
        int a=0,b=0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j <4; j++) {
                if(i==0){
                    butonlar[i][j].setDeger(kullaniciFkartlar[a]);
                    a++;

                }
                else {
                    butonlar[i][j].setDeger(kullaniciBkartlar[b]);
                    b++;
                }
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j <4; j++) {
                if(i==0){

                    butonlar[i][j].setIcon(new javax.swing.ImageIcon(getClass().getResource("/png1/"+String.valueOf(butonlar[i][j].getDeger())+".png")));
                }
                else {
                    butonlar[i][j].setIcon(new javax.swing.ImageIcon(getClass().getResource("/png2/"+String.valueOf(butonlar[i][j].getDeger())+".png")));
                }
            }
        }

    } //butonlar[i][j].setIcon(new ImageIcon("C:\\Users\\Alperen İmamoğlu\\Desktop\\prolab 2\\fotolar\\futbolcu\\"+String.valueOf(butonlar[i][j].getDeger())+".png"));

    public  int bilgisayarKartsec(){

        Random random = new Random();
        int atama = 0;
        boolean a = true;
        if (sayac % 2 == 0) {
            while (a) {
                atama = 1 + random.nextInt(4);
                atama = atama - 1;
                if (liste.get(bilgisayarf.get(atama) - 1).kartKullanildiMi == false) {
                    System.out.println("\n\natama "+atama+"\n\n");
                    a=false;
                }

            }
            System.out.println("Bilgisayarın secimi = " + liste.get(bilgisayarf.get(atama) - 1).getOyuncuAdi() + " | serbest atış=" + Test.liste.get(bilgisayarf.get(atama) - 1).getSerbestAtis() + " | penaltı =" + Test.liste.get(bilgisayarf.get(atama) - 1).getPenaltı() + " | kaleciye karşı =" + Test.liste.get(bilgisayarf.get(atama) - 1).getKaleciKarsiKarsiya());
            //System.out.println("Bilgisayarın secimi = " + liste.get(bilgisayarf.get(atama) - 1).getOyuncuAdi() + " | serbest atış=" + Test.liste.get(bilgisyarFkartlar[atama] - 1).getSerbestAtis() + " | penaltı =" + Test.liste.get(bilgisyarFkartlar[atama] - 1).getPenaltı() + " | kaleciye karşı =" + Test.liste.get(bilgisyarFkartlar[atama] - 1).getKaleciKarsiKarsiya());
        } else {
            a = true;
            while (a) {
                atama = 1 + random.nextInt(4);
                atama = atama - 1;
                if (liste2.get(bilgisyarb.get(atama)- 1).kartKullanildiMi == false) {
                    a = false;
                }
            }
            System.out.println("Bilgisayarın secimi = " + liste2.get(bilgisyarb.get(atama) - 1).getOyuncuAdi()+ " | serbest atış=" + Test.liste2.get(bilgisyarb.get(atama) - 1).getSerbestAtis() + " | ikilik =" + Test.liste2.get(bilgisyarb.get(atama) - 1).getIkilik() + " | Üçlük =" + Test.liste2.get(bilgisyarb.get(atama) - 1).getUcluk());
            //   System.out.println("Bilgisayarın secimi = " + liste2.get(bilgisyarBkartlar[atama] - 1).getOyuncuAdi() + " | serbest atış=" + Test.liste2.get(bilgisyarBkartlar[atama] - 1).getSerbestAtis() + " | ikilik =" + Test.liste2.get(bilgisyarBkartlar[atama] - 1).getIkilik() + " | Üçlük =" + Test.liste2.get(bilgisyarBkartlar[atama] - 1).getUcluk());
        }

        return atama;
    }

    public boolean karsilastir(int KullaniciSecim) {
        int BilgisayarSecim=0;
        BilgisayarSecim=bilgisayarKartsec();
        boolean donus2 = true;

        Random random = new Random();
        int ws, donus = 0;
        ws = 1 + random.nextInt(3);


        if (sayac % 2 == 0) {

            for(int i=0;i<4;i++){
                if(kullanicif.get(i)==KullaniciSecim){
                    System.out.println("+");
                    KullaniciSecim =i;
                    break;
                }
            }

            butonlar[0][4].setIcon(new javax.swing.ImageIcon(getClass().getResource("/png1/"+String.valueOf(liste.get(bilgisayarf.get(BilgisayarSecim) - 1).getOyuncuID())+".png")));
            if (fubolkartları <= 4) {
                if (ws == 1) {
                    System.out.println("---------PENALTİ---------");
                    yazılar[2].setText("       PENALTI");

                    donus = penalti(KullaniciSecim, BilgisayarSecim);

                } else if (ws == 2) {
                    System.out.println("---------SERBEST ATIŞ F---------");
                    yazılar[2].setText("   SERBEST ATIŞ");
                    donus = serbestAtis(KullaniciSecim, BilgisayarSecim);

                } else if (ws == 3) {
                    System.out.println("---------KALECİYLE KARŞI KARŞIYA---------");
                    yazılar[2].setText("KALECİYLE KARŞI");
                    donus = kaleciyeKarsi(KullaniciSecim, BilgisayarSecim);

                }
                System.out.println();
                if (donus == 1) {
                    kullaniciskor+=10;
                    liste.get(kullanicif.get(KullaniciSecim)-1).kartKullanildiMi = true;
                    liste.get(bilgisayarf.get(BilgisayarSecim)-1).kartKullanildiMi = true;
                    fubolkartları += 1;

                    yazılar[5].setVisible(true);
                    yazılar[6].setVisible(false);
                    yazılar[7].setVisible(false);

                    donus2 = false;
                } else if (donus == 2) {

                    bilgisayarskor+=10;
                    liste.get(kullanicif.get(KullaniciSecim)-1 ).kartKullanildiMi = true;
                    liste.get(bilgisayarf.get(BilgisayarSecim) -1).kartKullanildiMi = true;
                    fubolkartları += 1;
                    yazılar[6].setVisible(true);
                    yazılar[5].setVisible(false);
                    yazılar[7].setVisible(false);
                    donus2 = false;
                } else if (donus == 0) {
                    System.out.println("****ESİT***");
                    yazılar[5].setVisible(false);
                    yazılar[6].setVisible(false);
                    yazılar[7].setVisible(true);
                }
            }

        } else {
            for(int i=0;i<4;i++){
                if(kullanicib.get(i)==KullaniciSecim){
                    System.out.println("+");
                    KullaniciSecim =i;
                    break;
                }
            }
            if (basketkartları <= 4) {
                butonlar[0][4].setIcon(new javax.swing.ImageIcon(getClass().getResource("/png2/"+String.valueOf(liste2.get(bilgisyarb.get(BilgisayarSecim) - 1).getOyuncuID())+".png")));

                if (ws == 1) {
                    System.out.println("---------SERBEST ATIŞ---------");
                    yazılar[2].setText("   SERBEST ATIŞ");

                    donus = bSerbestAtis(KullaniciSecim, BilgisayarSecim);

                } else if (ws == 2) {
                    System.out.println("---------İKİLİK---------");
                    yazılar[2].setText("        İKİLİK");

                    donus = ikilik(KullaniciSecim, BilgisayarSecim);
                } else if (ws == 3) {
                    System.out.println("---------ÜÇLÜK---------");
                    yazılar[2].setText("         ÜÇLÜK");

                    donus = ucluk(KullaniciSecim, BilgisayarSecim);
                }
                System.out.println("");

                if (donus == 1) {

                    kullaniciskor+=10;
                    liste2.get(kullanicib.get(KullaniciSecim) - 1).kartKullanildiMi = true;
                    liste2.get(bilgisyarb.get(BilgisayarSecim) - 1).kartKullanildiMi = true;

                    yazılar[5].setVisible(true);
                    yazılar[6].setVisible(false);
                    yazılar[7].setVisible(false);
                    basketkartları += 1;

                    donus2 = false;
                } else if (donus == 2) {
                    bilgisayarskor+=10;
                    liste2.get(kullanicib.get(KullaniciSecim) - 1).kartKullanildiMi = true;
                    liste2.get(bilgisyarb.get(BilgisayarSecim) - 1).kartKullanildiMi = true;
                    yazılar[6].setVisible(true);
                    yazılar[5].setVisible(false);
                    yazılar[7].setVisible(false);
                    basketkartları += 1;

                    donus2 = false;
                } else if (donus == 0) {
                    System.out.println("****ESİT***");
                    yazılar[5].setVisible(false);
                    yazılar[6].setVisible(false);
                    yazılar[7].setVisible(true);
                }

            }


        }

        System.out.println();

        if (basketkartları >= 4) {
            sayac = 50;
        } else if (fubolkartları >= 4) {
            sayac = 51;
        } else {
            sayac += 1;
        }

        if(kullaniciskor+bilgisayarskor==80){


            butonlar[0][4].setVisible(false);
            butonlar[1][4].setVisible(false);

            for (int i=2;i<5;i++){
                yazılar[i].setVisible(false);
            }


            JLabel l11 = new JLabel();
            l11.setFont (l11.getFont ().deriveFont (30.0f));
            l11.setBounds(270, 300, 300, 200);

            if(kullaniciskor>bilgisayarskor){
                l11.setForeground(Color.blue.brighter());
                l11.setText("!! KAZANDINIZ !!");
                System.out.println("kazandın");

            }
            else if(kullaniciskor<bilgisayarskor){
                l11.setForeground(Color.red);
                l11.setText("X KAYBETTİNİZ X");
                System.out.println("kaybettin");
            }
            else{
                l11.setForeground(Color.GREEN.brighter());
                l11.setText("BERABERE");
                System.out.println("beraber");
            }

            ekran.add(l11);
            ekran.setSize(800,800);

        }


        return donus2;
    }



    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public int penalti(int KullaniciSecim, int BilgisayarSecim) {
        int donus = 0;
        if (liste.get(kullanicif.get(KullaniciSecim)-1).getPenaltı() > liste.get(bilgisayarf.get(BilgisayarSecim) - 1).getPenaltı()) {
            //
            donus = 1;

        } else if (liste.get(kullanicif.get(KullaniciSecim)-1).getPenaltı() < liste.get(bilgisayarf.get(BilgisayarSecim) - 1).getPenaltı()) {
            donus = 2;
        } else if (liste.get(kullanicif.get(KullaniciSecim)-1).getPenaltı() == liste.get(bilgisayarf.get(BilgisayarSecim) - 1).getPenaltı()) {
            donus = 0;
        }

        return donus;
    }

    public int serbestAtis(int KullaniciSecim, int BilgisayarSecim) {
        int donus = 0;
        if (liste.get(kullanicif.get(KullaniciSecim)-1).getSerbestAtis() > liste.get(bilgisayarf.get(BilgisayarSecim) - 1).getSerbestAtis()) {
            //
            donus = 1;

        } else if (liste.get(kullanicif.get(KullaniciSecim)-1).getSerbestAtis() < liste.get(bilgisayarf.get(BilgisayarSecim) - 1).getSerbestAtis()) {
            donus = 2;
        } else if (liste.get(kullanicif.get(KullaniciSecim)-1).getSerbestAtis() == liste.get(bilgisayarf.get(BilgisayarSecim) - 1).getSerbestAtis()) {
            donus = 0;
        }

        return donus;
    }

    public int kaleciyeKarsi(int KullaniciSecim, int BilgisayarSecim) {
        int donus = 0;
        if (liste.get(kullanicif.get(KullaniciSecim)-1).getKaleciKarsiKarsiya() > liste.get(bilgisayarf.get(BilgisayarSecim) - 1).getKaleciKarsiKarsiya()) {
            donus = 1;

        } else if (liste.get(kullanicif.get(KullaniciSecim)-1).getKaleciKarsiKarsiya() < liste.get(bilgisayarf.get(BilgisayarSecim) - 1).getKaleciKarsiKarsiya()) {
            donus = 2;
        } else if (liste.get(kullanicif.get(KullaniciSecim)-1).getKaleciKarsiKarsiya() == liste.get(bilgisayarf.get(BilgisayarSecim) - 1).getKaleciKarsiKarsiya()) {
            donus = 0;
        }

        return donus;
    }

    public int bSerbestAtis(int KullaniciSecim, int BilgisayarSecim) {
        int donus = 0;
        if (liste2.get(kullanicib.get(KullaniciSecim) - 1).getSerbestAtis() > liste2.get(bilgisyarb.get(BilgisayarSecim) - 1).getSerbestAtis()) {
            //
            donus = 1;

        } else if (liste2.get(kullanicib.get(KullaniciSecim) - 1).getSerbestAtis() < liste2.get(bilgisyarb.get(BilgisayarSecim) - 1).getSerbestAtis()) {
            donus = 2;
        } else if (liste2.get(kullanicib.get(KullaniciSecim) - 1).getSerbestAtis() == liste2.get(bilgisyarb.get(BilgisayarSecim) - 1).getSerbestAtis()) {
            donus = 0;
        }

        return donus;
    }

    public int ikilik(int KullaniciSecim, int BilgisayarSecim) {
        int donus = 0;
        if (liste2.get(kullanicib.get(KullaniciSecim) - 1).getIkilik() > liste2.get(bilgisyarb.get(BilgisayarSecim) - 1).getIkilik()) {
            //
            donus = 1;

        } else if (liste2.get(kullanicib.get(KullaniciSecim) - 1).getIkilik() < liste2.get(bilgisyarb.get(BilgisayarSecim) - 1).getIkilik()) {
            donus = 2;
        } else if (liste2.get(kullanicib.get(KullaniciSecim) - 1).getIkilik() == liste2.get(bilgisyarb.get(BilgisayarSecim) - 1).getIkilik()) {
            donus = 0;
        }

        return donus;
    }

    public int ucluk(int KullaniciSecim, int BilgisayarSecim) {
        int donus = 0;
        if (liste2.get(kullanicib.get(KullaniciSecim) - 1).getUcluk() > liste2.get(bilgisyarb.get(BilgisayarSecim) - 1).getUcluk()) {
            //
            donus = 1;

        } else if (liste2.get(kullanicib.get(KullaniciSecim) - 1).getUcluk() < liste2.get(bilgisyarb.get(BilgisayarSecim) - 1).getUcluk()) {
            donus = 2;
        } else if (liste2.get(kullanicib.get(KullaniciSecim) - 1).getUcluk() == liste2.get(bilgisyarb.get(BilgisayarSecim) - 1).getUcluk()) {
            donus = 0;
        }

        return donus;
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



    @Override
    public void mouseClicked(MouseEvent e) {
        Btn b = (Btn)e.getComponent();
        System.out.println("kullanıcı puan ="+kullaniciskor+"    bilgisayar puan"+bilgisayarskor);


        if(sayac%2==0) {
            butonlar[1][4].setIcon(new javax.swing.ImageIcon(getClass().getResource("/png1/"+String.valueOf(b.getDeger())+".png")));

            for(int i=0;i<4;i++){
                butonlar[1][i].setEnabled(false);

            }

        }

        if (e.getButton() == 1) {
            System.out.println("\n\n\nsayac ="+sayac+"\n\n\n");

            System.out.println("TIKLANDI-------------+++++++++++++++++++++++++++++++++++++");
            secim = b.getDeger();

            if(sayac%2==0 && fubolkartları <=4) {

                if(sayac==50){
                    butonlar[1][4].setIcon(new javax.swing.ImageIcon(getClass().getResource("/png1/" + String.valueOf(b.getDeger()) + ".png")));

                    for (int i = 0; i < 4; i++) {
                        butonlar[1][i].setEnabled(true);
                    }

                }
                else {
                    butonlar[1][4].setIcon(new javax.swing.ImageIcon(getClass().getResource("/png1/" + String.valueOf(b.getDeger()) + ".png")));
                    for (int i = 0; i < 4; i++) {
                        butonlar[0][i].setEnabled(false);
                    }
                    for (int i = 0; i < 4; i++) {
                        butonlar[1][i].setEnabled(true);
                    }
                }

            }
            else if(sayac%2!=0 && basketkartları <= 4){

                if(sayac==51) {
                    butonlar[1][4].setIcon(new javax.swing.ImageIcon(getClass().getResource("/png2/" + String.valueOf(b.getDeger()) + ".png")));

                    for (int i = 0; i < 4; i++) {
                        butonlar[0][i].setEnabled(true);
                    }

                }
                else{
                    butonlar[1][4].setIcon(new javax.swing.ImageIcon(getClass().getResource("/png2/" + String.valueOf(b.getDeger()) + ".png")));

                    for (int i = 0; i < 4; i++) {
                        butonlar[1][i].setEnabled(false);
                    }
                    for (int i = 0; i < 4; i++) {
                        butonlar[0][i].setEnabled(true);
                    }

                }

            }
            System.out.println("\n\n\nSAYAC ="+sayac+"\n\n\n");
            boolean donus = true;
            donus = karsilastir(secim);
            b.setVisible(donus);
            yazılar[0].setText(String.valueOf(kullaniciskor));
            yazılar[1].setText(String.valueOf(bilgisayarskor));

        }



    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
