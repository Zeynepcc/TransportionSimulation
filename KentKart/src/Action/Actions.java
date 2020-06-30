package Action;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Gui.Kayit;
import Gui.Model;
import Gui.Ses;
import Gui.TLyukle;
import sun.audio.*;

public class Actions implements ActionListener {

    // static JFrame yaratdim burada 
    // sebebi Main de cagirdigin JFrameni almag icin
    // asagida e.getSource() == getM().getButon1() bu if satirindan sonra aldigimiz JFrameni korumag icin static yapdim
    // static leri arasdirsan gorursunki static veriler memory de ayni yerde saklanir yani her defasinda kullanmak isdediyinde ayni veri uzernde olur
    static JFrame frame = null;
    Model m = null;
    Kayit kyt = null;
    TLyukle tl = null;
    String kartyaz, tcyaz, adyaz, soyadyaz, dogumyaz ;
    double bakiye  =10;
    public Actions(Model m) {
        this.m = m;
    }
    public Actions(Kayit kyt) {
        this.kyt = kyt;
    }

    public Actions(TLyukle tl) {
		
    	this.tl = tl;
	}

	public Model getM() {
        return m;
    }

    public void setM(Model m) {
        this.m = m;
    }

    public Kayit getKyt() {
        if (kyt == null) {
            return kyt = new Kayit();
        } else {
            return kyt;
        }
    }

    public void setKyt(Kayit kyt) {
        this.kyt = kyt;
    }

    public TLyukle getTl() {
        if (tl == null) {
            return tl = new TLyukle();
        }
        return tl;
    }

    public void setTl(TLyukle tl) {
        this.tl = tl;
    }
   /* public void keyTyped(KeyEvent e) {
	      char c = e.getKeyChar();
	      if (!((c >= '0') && (c <= '9') ||
	         (c == KeyEvent.VK_BACK_SPACE) ||
	         (c == KeyEvent.VK_DELETE))) {
	        e.consume();
	      }
    }*/
    @Override
    public void actionPerformed(ActionEvent e) {

    	Ses s = new Ses();
        if (getM() == null) {
            this.m = new Model();
        }
        else if (e.getSource() == getM().getButon1()) {
        	
            frame = getM().getFrame();
            getKyt();

        }
        else if (e.getSource() == getM().getTlyukle()) {

            getTl();
        }
        else if(e.getSource() == getM().getYukle())
        {
        	if(m.getKarttur().getText().equals("ÖÐRENCÝ"))
        	{
            	if(bakiye < 1.25 )
    			{
            		s.Call("C:\\Users\\Zeynep\\Desktop\\Nesne\\KentKart2\\yetersizbakiye.wav");
    				JOptionPane.showMessageDialog(null, "Bakiyeniz yetersiz");
    			}
    			else
    			{
    				
    				s.Call("C:\\Users\\Zeynep\\Desktop\\Nesne\\KentKart2\\akbil.wav");
    			    getM().getBakiyegoster().setText(String.valueOf(bakiye-1.25));
    			    bakiye = bakiye - 1.25;
    			}
        	}
        	else if(m.getKarttur().getText().equals("TAM"))
        	{
        		if(bakiye < 2.5 )
    			{
        			s.Call("C:\\Users\\Zeynep\\Desktop\\Nesne\\KentKart2\\yetersizbakiye.wav");
    				JOptionPane.showMessageDialog(null, "Bakiyeniz yetersiz");
    			}
    			else
    			{
    				s.Call("C:\\Users\\Zeynep\\Desktop\\Nesne\\KentKart2\\akbil.wav");
    			    getM().getBakiyegoster().setText(String.valueOf(bakiye-2.5));
    			    bakiye = bakiye - 2.5;
    			}
        	}
        	else if(m.getKarttur().getText().equals("YAÞLI"))
        	{
        		s.Call("C:\\Users\\Zeynep\\Desktop\\Nesne\\KentKart2\\akbil.wav");
        		JOptionPane.showMessageDialog(null , "Ücretsiz");
        	}
        	else
        	{
        		JOptionPane.showMessageDialog(null , "Kart Satýn Alýn");
        	}
        }

        else if (e.getSource() == getKyt().getBut()) {


        	getKyt().getFrame2().setVisible(false);
        	dogumyaz = kyt.getDogum().getText();
        	kartyaz = kyt.getKart().getSelectedItem().toString();
            tcyaz = kyt.getTc().getText();
            adyaz = kyt.getAd().getText();
            soyadyaz = kyt.getSoyad().getText();
            if((tcyaz.length() == 0 )||(adyaz.length() == 0 )||(soyadyaz.length() ==0))
            {
            	
            	JOptionPane.showMessageDialog(null ,"Deðer gir");
            }
            // burada verileri Modele set ediyoruz
            else
            {
            Model m = new Model(kartyaz, tcyaz, adyaz, soyadyaz, dogumyaz, 10);
            
            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    m.setModelData();
                    getM().getFrame().setVisible(true);
                }
            });
            }

            // buradaki thread ile kapanmayi 100 milisaniye sonra yapoiyoruz isdersen artira bilirsin 
            // unutma 1000 -> 1 saniye demek
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(100);
                        frame.dispose();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Actions.class.getName()).log(Level.SEVERE, null, ex);
                    }finally{
                        // dispose ile eski formu kapatiyoruz
                        
                    }
                }
            }).start();
        }
        else if(e.getSource() == getTl().getTl())
        {
        	kyt.getFrame2().setVisible(false);
        	 EventQueue.invokeLater(new Runnable() {
                 @Override
                 public void run() {
                     m.setModelData();
                     getM().getFrame().setVisible(true);
                 }
             });
             // buradaki thread ile kapanmayi 100 milisaniye sonra yapoiyoruz isdersen artira bilirsin 
             // unutma 1000 -> 1 saniye demek
            /* new Thread(new Runnable() {
                 @Override
                 public void run() {
                     try {
                         Thread.sleep(100);
                         frame.dispose();
                     } catch (InterruptedException ex) {
                         Logger.getLogger(Actions.class.getName()).log(Level.SEVERE, null, ex);
                     }finally{
                         // dispose ile eski formu kapatiyoruz
                         
                     }
                 }
             }).start();
        	*/
        	JOptionPane.showMessageDialog(null ,tl.getTextbakiye().getText());	
        	
        }
        
    }
    

}

