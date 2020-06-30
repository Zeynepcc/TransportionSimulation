package Gui;



import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;

import javax.swing.*;
import Action.Actions;

public class Kayit {
	
	private Model mod = null;
	private JPanel panel2 = null;
	private JTextField tc = null;
	private JTextField ad = null;
	private JTextField soyad = null;
	private JComboBox kart = null;
	private JFormattedTextField dogum = null;
	private JLabel lad = null;
	private JLabel lsoyad = null;
	private JLabel ldogum = null;
	private JLabel lkart = null;
	private JLabel ltc = null;
	private JButton but = null;
	private JFrame frame2 = null;
	Actions a ;
	public Kayit() {
		init();
	}
	public void init()
	{
		
		String[] tur = new String[3];
		  tur[0] = "TAM";
	      tur[1] = "ÖÐRENCÝ";
	      tur[2] = "YAÞLI";
		frame2 = new JFrame("Üyelik");
		frame2.setSize(300, 400);
		lkart = new JLabel("KART TÜRÜ  : ");
		ltc = new JLabel("TC KÝMLÝK  : ");
		lad = new JLabel("AD  : ");
		lsoyad = new JLabel("SOYAD  : ");
		ldogum = new JLabel("ALIM TARÝHÝ  : ");
		kart = new JComboBox();
		tc = new JTextField();
		ad = new JTextField();
		soyad = new JTextField();
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		java.util.Date dd = new java.util.Date();
		String s = sdf.format(dd);
		dogum = new JFormattedTextField(s);
		
		panel2 = new JPanel();
		frame2.add(getPanel2());
		getPanel2().setLayout(null);
		getLkart().setBounds(80, 20, 90, 30);
		//getKart().setBounds(120 , 28 , 87 , 30 );
		
		kart.setBounds(46, 42, 140, 20);
		ComboBoxModel model = new DefaultComboBoxModel(tur);
		kart.setModel(model);
		
		getLtc().setBounds(40, 47, 200, 80);
	    getTc().setBounds(120 , 77 , 90 , 30 );
	    
		getLad().setBounds(40, 100, 200, 80);
		getAd().setBounds(120 ,126 , 90 , 30 );
		
		getLsoyad().setBounds(40, 147, 200, 80);
		getSoyad().setBounds(120 , 175 , 90 , 30 );
		
		getLdogum().setBounds(20, 194, 200, 80);
		getDogum().setBounds(120 , 224 , 90 , 30 );
		
		
		getPanel2().add(getLad());
		getPanel2().add(getAd());
		getPanel2().add(getLkart());
		getPanel2().add(getKart());
		getPanel2().add(getLtc());
		getPanel2().add(getTc());
		getPanel2().add(getLsoyad());
		getPanel2().add(getSoyad());
		getPanel2().add(getLdogum());
		getPanel2().add(getDogum());
		getPanel2().add(getBut());
		frame2.setVisible(true);
		/*String kartyaz = getKart().getText(); // ALGILAMIYOR
		String tcyaz = getTc().getText();
		String adyaz= getAd().getText();
		String soyadyaz=getSoyad().getText();
		String dogumyaz = "1997";
		double bakiyeyaz = 0;*/
		//Action4 but4 = new Action4(kartyaz, tcyaz, adyaz, soyadyaz, dogumyaz, bakiyeyaz); 
		


	//	getBut().addActionListener(new ActionListener() { 
			//@Override
			/*public void actionPerformed(ActionEvent e) {
				
				String kartyaz = getKart().getText();
				String tcyaz = getTc().getText();
				String adyaz = getAd().getText();
				String soyadyaz =getSoyad().getText();
				String dogumyaz = getDogum().getText();
				 new Model(kartyaz , tcyaz ,  adyaz , soyadyaz , dogumyaz );
				
				
	     	} 
		});*/	
		 tc.addKeyListener(new KeyAdapter() {
			    public void keyTyped(KeyEvent e) {
			      char c = e.getKeyChar();
			      if (!((c >= '0') && (c <= '9') ||
			         (c == KeyEvent.VK_BACK_SPACE) ||
			         (c == KeyEvent.VK_DELETE))) {
			        e.consume();
			      }
			    }
			  });
		 tc.addKeyListener(new KeyAdapter() {
			    public void keyTyped(KeyEvent e) { 
			        if ((tc.getText().length() == 11) ) 
			        {
			        	e.consume(); 
			        }
			           
			    }  
			});
		}
		public JPanel getPanel2() {
		return panel2;
	}
	public void setPanel2(JPanel panel) {
		this.panel2 = panel;
	}
	public JTextField getTc() {
		return tc;
	}
	public void setTc(JTextField tc) {
		this.tc = tc;
	}
	public JTextField getAd() {
		return ad;
	}
	public void setAd(JTextField ad) {
		this.ad = ad;
	}
	public JTextField getSoyad() {
		return soyad;
	}
	public void setSoyad(JTextField soyad) {
		this.soyad = soyad;
	}
	public JComboBox getKart() {
		return kart;
	}
	public void setKart(JComboBox kart) {
		this.kart = kart;
	}
	public JTextField getDogum() {
		return dogum;
	}

	public JLabel getLad() {
		return lad;
	}
	public void setLad(JLabel lad) {
		this.lad = lad;
	}
	public JLabel getLsoyad() {
		return lsoyad;
	}
	public void setLsoyad(JLabel lsoyad) {
		this.lsoyad = lsoyad;
	}
	public JLabel getLdogum() {
		return ldogum;
	}
	public void setLdogum(JLabel ldogum) {
		this.ldogum = ldogum;
	}
	public JLabel getLkart() {
		return lkart;
	}
	public void setLkart(JLabel lkart) {
		this.lkart = lkart;
	}
	public JLabel getLtc() {
		return ltc;
	}
	public void setLtc(JLabel ltc) {
		this.ltc = ltc;
	}
	public JButton getBut() {
		if(but == null) {
			but = new JButton("KAYIT");
			but.setBounds(120 , 273 , 90 , 30 );
			but.addActionListener(this.getA());
		}
		return but;
	}
	public void setBut(JButton but) {
		this.but = but;
	}
	public JFrame getFrame2() {
		return frame2;
	}
	public void setFrame2(JFrame frame2) {
		this.frame2 = frame2;
	}
	public void setDogum(JTextField dogum) {
		this.dogum = (JFormattedTextField) dogum;
	}
	public Actions getA() {
		if(this.a==null)
			this.a=new Actions(this);
		return a;
	}
	public void setA(Actions a) {
		this.a = a;
	}
	public Model getMod() {
		if(mod==null)
			this.mod=new Model();
		return mod;
	}
	public void setMod(Model mod) {
		this.mod = mod;
	}
	
	
}
