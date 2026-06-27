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

public class LoginPage2 extends JFrame implements ActionListener
{
    private Container c;
    private ImageIcon logimg;
    private JLabel logimglabel,l,l1,l2;
    private JPanel p;
    private Font f,f1,f2;
    private JTextField tf;
    private JPasswordField pf;
    private JButton b1,b2;
    
    public LoginPage2()
    {
        this.setSize(500,300);
        this.setLocationRelativeTo(null);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Hotel Hub - LogIN");
        
        c = this.getContentPane();
        c.setLayout(null);	    
        c.setBackground(Color.LIGHT_GRAY);
       
        f1 = new Font ( "Arial", Font.BOLD, 22);
        f = new Font ( "Arial", Font.BOLD, 30);
        f2 = new Font ( "Arial", Font.BOLD, 25);
        
        l = new JLabel("ADMIN LOGIN");
	l.setBounds(110,20,300,40);
        l.setForeground(Color.BLACK);
        l.setFont(f);
	c.add(l);
        
        l1 = new JLabel("Enter Username : ");
	l1.setBounds(20,80,200,40);
        l1.setForeground(Color.DARK_GRAY);
        l1.setFont(f1);
	c.add(l1);
        
        l2 = new JLabel("Enter Password : ");
	l2.setBounds(20,140,200,40);
        l2.setForeground(Color.DARK_GRAY);
        l2.setFont(f1);
	c.add(l2);
        
        tf = new JTextField("");
	tf.setBounds(220,80,200,35);
        tf.setBackground(Color.WHITE);
        tf.setForeground(Color.DARK_GRAY);
        tf.setFont(f1);
	c.add(tf);
        
        pf = new JPasswordField("");
	pf.setBounds(220,140,200,35);
        pf.setBackground(Color.WHITE);
        pf.setForeground(Color.DARK_GRAY);
        pf.setFont(f1);
        pf.setEchoChar('*');
        c.add(pf);
        
        b1 = new JButton("Back");
	b1.setBounds(60,200,150,45);
        b1.setFont(f2);
        b1.setBackground(Color.red);
        b1.setForeground(Color.WHITE);
	c.add(b1);
        b1.addActionListener(this);
        
        b2 = new JButton("Login");
	b2.setBounds(250,200,150,45);
        b2.setFont(f2);
        b2.setBackground(Color.red);
        b2.setForeground(Color.WHITE);
	c.add(b2);
        b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b2) 
        {
            String username = tf.getText();
            String password = new String(pf.getPassword());
            
            if (isValidCredentials(username, password)) 
            {
                Admin ad = new Admin();
	        ad.setVisible(true);
                this.dispose();
            } 
            else
            {
                JOptionPane.showMessageDialog(this, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } 
        else if (e.getSource() == b1) {
            Dashboard dash = new Dashboard();
	    dash.setVisible(true);
            this.dispose();
        }
    } 

    private boolean isValidCredentials(String username, String password) {
        for (int i = 0; i < AdminNames.adminUsernames.length; i++) {
            if (AdminNames.adminUsernames[i].equals(username) && AdminNames.adminPasswords[i].equals(password)) {
                JOptionPane.showMessageDialog(this, "Login Successful! \nWelcome Admin " + username);
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
            LoginPage2 log2 = new LoginPage2();
	    log2.setVisible(true);	
	}
}