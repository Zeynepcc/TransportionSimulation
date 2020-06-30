package Gui;
import javax.swing.*;
import java.awt.*;
import Action.Actions;

public class Model {

    private JLabel res2 = null;
    private JButton yukle = null;
    private JLabel bakiyegoster = null;
    private JPanel panel = null;
    static JFrame frame = null;
    private JLabel res1 = null;
    public JButton buton1 = null;
    public JTextField mad = null;
    public JTextField msoyad = null;
    public JTextField mtc = null;
    public JTextField dogumtarihi = null;
    public JButton tlyukle = null;
    public JLabel profil = null;
    public JTextField karttur = null;
    String kartyaz, tcyaz, soyadyaz, dogumyaz, turyaz;
    String adyaz;
    double bakiye;
   
    Actions a;

    public Model() {
        init();
    }

    public Model(String kartyaz, String tcyaz, String adyaz, String soyadyaz, String dogumyaz, double bakiyeyaz) {

        init();
        this.kartyaz = kartyaz;
        this.tcyaz = tcyaz;
        this.adyaz = adyaz;
        this.soyadyaz = soyadyaz;
        this.dogumyaz = dogumyaz;
        this.bakiye = bakiyeyaz;
    }
 
    
    // model verilerini set etmek icin yeni 1 function olusdurdum
    // isdersen eskisi gibide yapa bilirsin
    public void setModelData(){
    	karttur.setText(kartyaz.toString());
        mtc.setText(tcyaz.toString());
        mad.setText(adyaz.toString());
        msoyad.setText(soyadyaz.toString());
        dogumtarihi.setText(dogumyaz.toString());
        bakiyegoster.setText(String.valueOf(bakiye));
        
    }
    
    public void init() {

        frame = new JFrame("Ankara Kent Kart");
        getFrame().setExtendedState(JFrame.MAXIMIZED_BOTH);
        panel = new JPanel();
        getPanel().setBackground(Color.blue);
        //panel2 = new JPanel();
        //panel2.setBackground(Color.WHITE);
        res1 = new JLabel(new ImageIcon("C://Users//Zeynep//Desktop//Nesne//Kent Kart//src//Kart.png"));
		profil = new JLabel(new ImageIcon("C://Users//Zeynep//Desktop//Nesne//Kent Kart//src//jim.jpg"));
		res2 = new JLabel(new ImageIcon("C://Users//Zeynep//Desktop//Nesne//Kent Kart//src//resim.png"));
        bakiyegoster = new JLabel("Bakiyeniz");
        getRes2().setBounds(0, 0, 1900, 600);
        getProfil().setBounds(40, 120, 250, 260);
        getPanel().setLayout(null);
        getRes1().setBounds(0, 0, 700, 440);
        getPanel().add(getRes1());
        getPanel().add(getButon1());
        getPanel().add(getTlyukle());

        //getGoster().setVisible(false);
      

       // getYukle().setBounds(860, 450, 180, 60);
        Font f = new Font("Arial", Font.BOLD, 25);
        getBakiyegoster().setBounds(870, -60, 1000, 600);
        getBakiyegoster().setFont(f);

        getRes2().setComponentZOrder(getYukle(), 0);
        getRes2().setComponentZOrder(getBakiyegoster(), 0);
        mtc = new JTextField("");
        getTc().setBounds(480, 160, 120, 30);
        mad = new JTextField(" ");
        mad.setText("");
        getAd().setBounds(480, 200, 120, 30);
        msoyad = new JTextField("");
        getSoyad().setBounds(480, 240, 120, 30);
        dogumtarihi = new JTextField("");
        getDogumtarihi().setBounds(480, 287, 120, 30);
        karttur = new JTextField("");
        getKarttur().setBounds(40, 50, 247, 60);
        
        getKarttur().setFont(f);
        
        
        getPanel().add(getAd());
        getPanel().add(getSoyad());
        getPanel().add(getTc());
        getPanel().add(getProfil());
        getPanel().add(getDogumtarihi());
        getPanel().add(getKarttur());

        getRes1().setComponentZOrder(getTc(), 0);
        getRes1().setComponentZOrder(getAd(), 0);
        getRes1().setComponentZOrder(getSoyad(), 0);
        getRes1().setComponentZOrder(getDogumtarihi(), 0);
        getRes1().setComponentZOrder(getProfil(), 0);
        getRes1().setComponentZOrder(getKarttur(), 0);

       // getYukle().addActionListener(this.getA());

        getPanel().add(getRes2());
        getFrame().add(getPanel());

    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public JLabel getRes1() {
        return res1;
    }

    public void setRes1(JLabel res1) {
        this.res1 = res1;
    }

    public JButton getButon1() {
        if (buton1 == null) {
            buton1 = new JButton("Kart Satın Al");
            buton1.setBounds(230, 470, 200, 80);
            buton1.addActionListener(this.getA());
        }
        return buton1;
    }

    public void setButon1(JButton buton1) {
        this.buton1 = buton1;
    }

    public JTextField getAd() {
        return mad;
    }

    public void setAd(JTextField ad) {
        this.mad = ad;
    }

    public JTextField getSoyad() {
        return msoyad;
    }

    public void setSoyad(JTextField soyad) {
        this.msoyad = soyad;
    }

    public JTextField getTc() {
        return mtc;
    }

    public void setTc(JTextField tc) {
        this.mtc = tc;
    }

    public JTextField getDogumtarihi() {
        return dogumtarihi;
    }

    public void setDogumtarihi(JTextField dogumtarihi) {
        this.dogumtarihi = dogumtarihi;
    }

    public JButton getTlyukle() {
        if (tlyukle == null) {
            tlyukle = new JButton("TL Yükleyiniz");
            getTlyukle().setBounds(230, 559, 200, 80);
            getTlyukle().addActionListener(this.getA());
        }
        return tlyukle;
    }

    public void setTlyukle(JButton tlyukle) {
        this.tlyukle = tlyukle;
    }

    public JLabel getProfil() {
        return profil;
    }

    public void setProfil(JLabel profil) {
        this.profil = profil;
    }

    public JTextField getKarttur() {
        return karttur;
    }

    public void setKarttur(JTextField karttur) {
        this.karttur = karttur;
    }

    public JLabel getRes2() {
        return res2;
    }

    public void setRes2(JLabel res2) {
        this.res2 = res2;
    }

    public JButton getYukle() {
    	if(yukle == null)
		{
			yukle = new JButton("Kartı Okutun");
			yukle.setBounds(860, 450, 180, 60);
			yukle.addActionListener(this.getA());
		}
		return yukle;
    }

    public void setYukle(JButton yukle) {
        this.yukle = yukle;
    }

    public JLabel getBakiyegoster() {
        return bakiyegoster;
    }

    public void setBakiyegoster(JLabel bakiyegoster) {
        this.bakiyegoster = bakiyegoster;
    }

    public JTextField getMad() {
        return mad;
    }

    public void setMad(JTextField mad) {
        this.mad = mad;
    }

    public JTextField getMsoyad() {
        return msoyad;
    }

    public void setMsoyad(JTextField msoyad) {
        this.msoyad = msoyad;
    }

    public JTextField getMtc() {
        return mtc;
    }

    public void setMtc(JTextField mtc) {
        this.mtc = mtc;
    }

    public String getKartyaz() {
        return kartyaz;
    }

    public void setKartyaz(String kartyaz) {
        this.kartyaz = kartyaz;
    }

    public String getTcyaz() {
        return tcyaz;
    }

    public void setTcyaz(String tcyaz) {
        this.tcyaz = tcyaz;
    }

    public String getAdyaz() {
        return adyaz;
    }

    public void setAdyaz(String adyaz) {
        this.adyaz = adyaz;
    }

    public String getSoyadyaz() {
        return soyadyaz;
    }

    public void setSoyadyaz(String soyadyaz) {
        this.soyadyaz = soyadyaz;
    }

    public String getDogumyaz() {
        return dogumyaz;
    }

    public void setDogumyaz(String dogumyaz) {
        this.dogumyaz = dogumyaz;
    }

    public String getTuryaz() {
        return turyaz;
    }

    public void setTuryaz(String turyaz) {
        this.turyaz = turyaz;
    }

    public Actions getA() {
        if (this.a == null) {
            this.a = new Actions(this);
        }
        return a;
    }

    public void setA(Actions a) {
        this.a = a;
    }

    /*getTlyukle().addActionListener(new ActionListener() { 
	@Override
	public void actionPerformed(ActionEvent e) {
		
		getTly();
	} 
});*/
 /*getButon1().addActionListener(new ActionListener() { 
	@Override
	public void actionPerformed(ActionEvent e) {
		getKyt();
		getFrame().setVisible(false); // arkadaki frame'i kapat�yordu			
	} 
});*/
}
