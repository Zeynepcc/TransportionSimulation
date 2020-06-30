package Gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Action.Actions;

//bakiye iþlemi yap
//ses iþlemi 
//veri geçirme
public class TLyukle {
	
	private JFrame frame3 = null;
	private JButton tl = null;
	private JLabel lbakiye = null;
	private JTextField textbakiye = null;
	private JPanel tlpanel = null;
	private double bakiyegelen ; 
	Actions a ;
	public TLyukle() {
		init();
		
		
	}
	public void init()
	{
		frame3 = new JFrame("TL yükleme platformu");
		getFrame3().setSize(250, 200);
		getFrame3().setVisible(true);
		getFrame3().setLayout(null);
		
		tlpanel = new JPanel();
		getTlpanel().setLayout(null);
		getTlpanel().setBounds(15, 20, 200, 200);
		
				
		lbakiye = new JLabel("Girilen bakiye : ");
		getLbakiye().setBounds(20, 20, 100, 40);
		
		textbakiye = new JTextField();
		getTextbakiye().setBounds(120,24 , 80, 30);
		
		getTlpanel().add(getTextbakiye());
		getTlpanel().add(getTl());
		getTlpanel().add(getLbakiye());
		getFrame3().add(getTlpanel());
		
	}

	public JFrame getFrame3() {
		return frame3;
	}

	public void setFrame3(JFrame frame3) {
		this.frame3 = frame3;
	}

	public JButton getTl() {
		if(tl == null)
		{
			tl = new JButton("Yukleyin");
			tl.setBounds(25, 70, 170, 30);
			tl.addActionListener(this.getA());
		}
		return tl;
	}

	public void setTl(JButton tl) {
		this.tl = tl;
	}

	public JLabel getLbakiye() {
		return lbakiye;
	}

	public void setLbakiye(JLabel lbakiye) {
		this.lbakiye = lbakiye;
	}

	public JTextField getTextbakiye() {
		return textbakiye;
	}

	public void setTextbakiye(JTextField textbakiye) {
		this.textbakiye = textbakiye;
	}

	public JPanel getTlpanel() {
		return tlpanel;
	}

	public void setTlpanel(JPanel tlpanel) {
		this.tlpanel = tlpanel;
	}
	public Actions getA() {
		if(this.a==null)
		{
			this.a=new Actions(this);
		}
		return a;
	}
	public void setA(Actions a) {
		this.a = a;
	}
	
	
}
