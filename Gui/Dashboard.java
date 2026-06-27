import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Dashboard extends JFrame implements ActionListener
{
    private Container c;
    private ImageIcon dashimg,recimg,adimg;
    private JLabel dashimglabel,recimglabel,adimglabel;
    private Font f;
    private JButton b1,b2;
    
    public Dashboard()
    {
        this.setSize(1170,654);
        this.setLocationRelativeTo(null);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Hotel Hub - Dashboard");
        
        c = this.getContentPane();
        c.setLayout(null);	    
        c.setBackground(Color.LIGHT_GRAY);
        
        dashimg = new ImageIcon(getClass().getResource("Images/Dashboard.gif"));
	dashimglabel = new JLabel(dashimg);
	dashimglabel.setBounds(0,0,1170,654);
	c.add(dashimglabel);
        
        f = new Font ( "Tahoma", Font.BOLD, 18);
        
        b1 = new JButton("Reception");
	b1.setBounds(280,450,140,35);
        b1.setFont(f);
	dashimglabel.add(b1);
        
        b2 = new JButton("Admin");
	b2.setBounds(765,450,140,35);
        b2.setFont(f);
	dashimglabel.add(b2);
        b2.addActionListener(this);
        
        recimg = new ImageIcon(getClass().getResource("Images/Reception.png"));
	recimglabel = new JLabel(recimg);
	recimglabel.setBounds(200,120,300,300);
	dashimglabel.add(recimglabel);
        
        adimg = new ImageIcon(getClass().getResource("Images/boss.png"));
	adimglabel = new JLabel(adimg);
	adimglabel.setBounds(680,120,300,300);
	dashimglabel.add(adimglabel);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == b2)
        {
            LoginPage2 log2 = new LoginPage2();
	    log2.setVisible(true);
            this.dispose();
        }
            
    }
    
    public static void main(String [] args)
	{
            Dashboard dash = new Dashboard();
	    dash.setVisible(true);	
        }

}