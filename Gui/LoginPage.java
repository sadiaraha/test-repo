import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage extends JFrame implements ActionListener
{
    private Container c;
    private ImageIcon logimg;
    private JLabel logimglabel,l,l1,l2;
    private JPanel p;
    private Font f,f1,f2;
    private JTextField tf;
    private JPasswordField pf;
    private JButton b1,b2;
    
    public LoginPage()
    {
        this.setSize(1200,700);
        this.setLocationRelativeTo(null);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Hotel Hub - LogIN");
        
        c = this.getContentPane();
        c.setLayout(null);	    
        c.setBackground(Color.LIGHT_GRAY);
        
        
        logimg = new ImageIcon(getClass().getResource("Images/log.jpg"));
	logimglabel = new JLabel(logimg);
	logimglabel.setBounds(0,0,1200,700);
	c.add(logimglabel);
        
        p = new JPanel ();
        p.setBounds (700,140,450,330);
        p.setBackground(Color.LIGHT_GRAY);
        p.setLayout(null);
        logimglabel.add(p);
        
        f1 = new Font ( "Arial", Font.BOLD, 22);
        f = new Font ( "Arial", Font.BOLD, 50);
        f2 = new Font ( "Arial", Font.BOLD, 15);
        
        l = new JLabel("LOGIN");
	l.setBounds(150,10,200,100);
        l.setForeground(Color.MAGENTA);
        l.setFont(f);
	p.add(l);
        
        l1 = new JLabel("Enter Username : ");
	l1.setBounds(20,100,200,50);
        l1.setForeground(Color.DARK_GRAY);
        l1.setFont(f1);
	p.add(l1);
        
        l2 = new JLabel("Enter Password : ");
	l2.setBounds(20,170,200,50);
        l2.setForeground(Color.DARK_GRAY);
        l2.setFont(f1);
	p.add(l2);
        
        tf = new JTextField("");
	tf.setBounds(240,100,200,50);
        tf.setBackground(Color.WHITE);
        tf.setForeground(Color.DARK_GRAY);
        tf.setFont(f1);
	p.add(tf);
        
        pf = new JPasswordField("");
	pf.setBounds(240,170,200,50);
        pf.setBackground(Color.WHITE);
        pf.setForeground(Color.DARK_GRAY);
        pf.setFont(f1);
        pf.setEchoChar('*');
        p.add(pf);
        
        b1 = new JButton("Back");
	b1.setBounds(60,260,150,50);
        b1.setFont(f1);
	p.add(b1);
        b1.addActionListener(this);
        
        b2 = new JButton("Login");
	b2.setBounds(240,260,150,50);
        b2.setFont(f1);
	p.add(b2);
        b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b2) 
        {
            String username = tf.getText();
            String password = new String(pf.getPassword());
            
            if (isValidCredentials(username, password)) 
            {
                Dashboard dash = new Dashboard();
	        dash.setVisible(true);
                this.dispose();
            } 
            else
            {
                JOptionPane.showMessageDialog(this, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } 
        else if (e.getSource() == b1) {
            HomePage home = new HomePage();
	    home.setVisible(true);
            this.dispose();
        }
    } 

    private boolean isValidCredentials(String username, String password) {
        for (int i = 0; i < userNames.defaultUsernames.length; i++) {
            if (userNames.defaultUsernames[i].equals(username) && userNames.defaultPasswords[i].equals(password)) {
                JOptionPane.showMessageDialog(this, "Login Successful! \nWelcome " + username);
                return true;
            }
        }
        return false;
    }
    
    private void forDispose()
    {
        this.dispose();
    }
    
    public static void main(String [] args)
	{
            LoginPage log = new LoginPage();
	    log.setVisible(true);	
	}
}