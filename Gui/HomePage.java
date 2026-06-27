import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HomePage extends JFrame implements ActionListener
{
    private JButton loginButton;
    private JButton signUpButton;
    private ImageIcon img;
    private JLabel image;
    private Container c;
    private Cursor cursor;
    
    public HomePage()
    {   
        this.setSize(500,760);
        this.setLocationRelativeTo(null);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Hotel Hub");
        
        c = this.getContentPane();
        c.setLayout(null);	    
        c.setBackground(Color.LIGHT_GRAY);

	img = new ImageIcon(getClass().getResource("Images/home.jpg"));
	image = new JLabel(img);
	image.setBounds(0,0,490,720);
	c.add(image);
        
        cursor = new Cursor(Cursor.HAND_CURSOR);

        loginButton = new JButton("LogIn");
        loginButton.setBounds(170,530,150,50);
        loginButton.setCursor(cursor);
        loginButton.setBackground(Color.DARK_GRAY);
        loginButton.setForeground(Color.ORANGE);
        loginButton.setFont(new Font("Serif",Font.BOLD,20));
        loginButton.addActionListener(this);
	image.add(loginButton);


    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) 
	{
            LoginPage log = new LoginPage();
	    log.setVisible(true);
            this.dispose();
	}
    }

    public static void main(String [] args)
	{
		HomePage p1 = new HomePage();
		p1.setVisible(true);	
	}
}
