import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AddRoom extends JFrame implements ActionListener
{
    private Container c;
    private ImageIcon adroomimg;
    private JLabel adroomimglabel,l1,l2,l3,l4,l5,l6;
    private Font f,f1,f2;
    private JButton jb1,jb2;
    private JTextField tf1,tf2;
    private JComboBox cb1,cb2,cb3;
    private String[] Availability = {"Available","Occupied"};
    private String[] cleaning = {"Cleaned","Dirty"};
    private String[] bed = {"Single Bed","Double Bed"};
    private String available,clean,beds;
    
    public AddRoom()
    {
        this.setSize(900,550);
        this.setLocationRelativeTo(null);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Hotel Hub - Add Room");
        
        c = this.getContentPane();
        c.setLayout(null);	    
        c.setBackground(Color.BLACK);
        
        adroomimg = new ImageIcon(getClass().getResource("Images/addroom.jpg"));
	adroomimglabel = new JLabel(adroomimg);
	adroomimglabel.setBounds(0,0,900,550);
	c.add(adroomimglabel);
        
        f = new Font ( "Tahoma", Font.BOLD, 40);
        f1 = new Font ( "Tahoma", Font.BOLD, 22);
        f2 = new Font ( "Tahoma", Font.BOLD, 30);
        
        l1 = new JLabel("Add Rooms");
	l1.setBounds(120,50,500,50);
        l1.setForeground(Color.DARK_GRAY);
        l1.setFont(f);
	adroomimglabel.add(l1);
        
        l2 = new JLabel("Room Number : ");
	l2.setBounds(50,130,200,30);
        l2.setForeground(Color.BLACK);
        l2.setFont(f1);
	adroomimglabel.add(l2);
        
        l3 = new JLabel("Availability : ");
	l3.setBounds(50,180,200,30);
        l3.setForeground(Color.BLACK);
        l3.setFont(f1);
	adroomimglabel.add(l3);
        
        l4 = new JLabel("Cleaning Status : ");
	l4.setBounds(50,230,200,30);
        l4.setForeground(Color.BLACK);
        l4.setFont(f1);
	adroomimglabel.add(l4);
        
        l5 = new JLabel("Price : ");
	l5.setBounds(50,280,200,30);
        l5.setForeground(Color.BLACK);
        l5.setFont(f1);
	adroomimglabel.add(l5);
        
        l6 = new JLabel("Bed Type : ");
	l6.setBounds(50,330,200,30);
        l6.setForeground(Color.BLACK);
        l6.setFont(f1);
	adroomimglabel.add(l6);
        
        
        tf1 = new JTextField("");
	tf1.setBounds(240,130,200,30);
        tf1.setBackground(Color.WHITE);
        tf1.setForeground(Color.DARK_GRAY);
        tf1.setFont(f1);
	adroomimglabel.add(tf1);
        
        tf2 = new JTextField("");
	tf2.setBounds(150,280,150,30);
        tf2.setBackground(Color.WHITE);
        tf2.setForeground(Color.DARK_GRAY);
        tf2.setFont(f1);
	adroomimglabel.add(tf2);
        
        cb1 = new JComboBox(Availability);
	cb1.setBounds(205,180,200,30);
        cb1.setBackground(Color.WHITE);
        cb1.setForeground(Color.DARK_GRAY);
        cb1.setFont(f1);
        adroomimglabel.add(cb1);
        cb1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                available = cb1.getSelectedItem().toString();
            }
        });
        
        cb2 = new JComboBox(cleaning);
	cb2.setBounds(260,230,200,30);
        cb2.setBackground(Color.WHITE);
        cb2.setForeground(Color.DARK_GRAY);
        cb2.setFont(f1);
        adroomimglabel.add(cb2);
        cb2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                clean = cb2.getSelectedItem().toString();
            }
        });
        
        cb3 = new JComboBox(bed);
	cb3.setBounds(195,330,200,30);
        cb3.setBackground(Color.WHITE);
        cb3.setForeground(Color.DARK_GRAY);
        cb3.setFont(f1);
        adroomimglabel.add(cb3);
        cb3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                beds = cb3.getSelectedItem().toString();
            }
        });
        
        jb1 = new JButton("Add");
	jb1.setBounds(520,420,120,40);
        jb1.setBackground(Color.PINK);
        jb1.setForeground(Color.WHITE);
        jb1.setFont(f2);
	adroomimglabel.add(jb1);
        jb1.addActionListener(this);
        
        jb2 = new JButton("Back");
	jb2.setBounds(680,420,120,40);
        jb2.setBackground(Color.PINK);
        jb2.setForeground(Color.WHITE);
        jb2.setFont(f2);
	adroomimglabel.add(jb2);
        jb2.addActionListener(this);

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jb2)
        {
            Admin ad = new Admin();
	    ad.setVisible(true);
            this.dispose();
        }
        
        else if (e.getSource() == jb1)
        {
            String roomno = tf1.getText();
            String price = tf2.getText();
            if (available.isEmpty() || clean.isEmpty() || beds.isEmpty() || roomno.isEmpty() || price.isEmpty())
            {
                JOptionPane.showMessageDialog (c,"Please fill out the form properly", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            else 
            {
                addRoomCredentials(roomno,available,clean,price,beds);
                JOptionPane.showMessageDialog(this, "Room Succesfully Added");
            }
        }
    }
    
    private void addRoomCredentials(String roomno, String available, String clean, String price, String beds) {
        RoomsClass.roomNumber = Arrays.copyOf(RoomsClass.roomNumber, RoomsClass.roomNumber.length + 1);
        RoomsClass.roomNumber[RoomsClass.roomNumber.length - 1] = roomno;
        RoomsClass.availability = Arrays.copyOf(RoomsClass.availability, RoomsClass.availability.length + 1);
        RoomsClass.availability[RoomsClass.availability.length - 1] = available;
        RoomsClass.cleaningStatus = Arrays.copyOf(RoomsClass.cleaningStatus, RoomsClass.cleaningStatus.length + 1);
        RoomsClass.cleaningStatus[RoomsClass.cleaningStatus.length - 1] = clean;
        RoomsClass.price = Arrays.copyOf(RoomsClass.price, RoomsClass.price.length + 1);
        RoomsClass.price[RoomsClass.price.length - 1] = price;
        RoomsClass.bed = Arrays.copyOf(RoomsClass.bed, RoomsClass.bed.length + 1);
        RoomsClass.bed[RoomsClass.bed.length - 1] = beds;   
    }
    
    public static void main(String [] args)
	{
            AddRoom addr = new AddRoom();
	    addr.setVisible(true);	
        }

}