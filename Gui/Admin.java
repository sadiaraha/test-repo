import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Admin extends JFrame implements ActionListener
{
    private Container c;
    private ImageIcon adimg,emimg,roomimg,drimg;
    private JLabel adimglabel,emimglabel,roomimglabel,drimglabel;
    private Font f;
    private JButton embutton,roombutton,logout;
    
    public Admin()
    {
        this.setSize(1170,654);
        this.setLocationRelativeTo(null);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Hotel Hub - Admin");
        
        c = this.getContentPane();
        c.setLayout(null);	    
        c.setBackground(Color.BLACK);
        
        adimg = new ImageIcon(getClass().getResource("Images/admin.PNG"));
	adimglabel = new JLabel(adimg);
	adimglabel.setBounds(516,0,654,654);
	c.add(adimglabel);
        
        f = new Font ( "Tahoma", Font.BOLD, 18);
        
        embutton = new JButton("Add Employee");
	embutton.setBounds(250,165,200,32);
        embutton.setFont(f);
	c.add(embutton);
        embutton.addActionListener(this);
        
        roombutton = new JButton("Add Rooms");
	roombutton.setBounds(250,365,200,32);
        roombutton.setFont(f);
	c.add(roombutton);
        roombutton.addActionListener(this);
        
        emimg = new ImageIcon(getClass().getResource("Images/employee.jpg"));
	emimglabel = new JLabel(emimg);
	emimglabel.setBounds(70,100,140,140);
	c.add(emimglabel);
        
        roomimg = new ImageIcon(getClass().getResource("Images/room.jpg"));
	roomimglabel = new JLabel(roomimg);
	roomimglabel.setBounds(70,310,140,140);
	c.add(roomimglabel);
        
        logout = new JButton("Log Out");
	logout.setBounds(200,510,130,45);
        logout.setFont(f);
        logout.setBackground(Color.red);
        logout.setForeground(Color.WHITE);
	c.add(logout);
        logout.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == logout)
        {
            Dashboard dash = new Dashboard();
	    dash.setVisible(true);
            this.dispose();
        }
        
        else if (e.getSource() == roombutton)
        {
            AddRoom addr = new AddRoom();
	    addr.setVisible(true);
            this.dispose();
        }
        
        else if (e.getSource() == embutton)
        {
            AddEmployee adde = new AddEmployee();
	    adde.setVisible(true);
            this.dispose();
        }
    }
    
    public static void main(String [] args)
	{
            Admin ad = new Admin();
	    ad.setVisible(true);	
        }

}
