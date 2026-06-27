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

public class AddEmployee extends JFrame implements ActionListener
{
    private Container c;
    private ImageIcon adempimg;
    private JLabel adempimglabel,l1,l2,l3,l4,l5,l6,l7,l8,l9;
    private Font f,f1,f2;
    private JButton jb1,jb2;
    private JTextField tf1,tf2,tf3,tf4,tf5,tf6;
    private JComboBox cb1,cb2;
    private String[] genders = {"Male","Female"};
    private String[] jobs = {"Front Desk Clerk","Porters","Housekeeping","Kitchen Staff","Room Service","Waiter","Manager","Accountant"};
    private String gender,job;
    
    public AddEmployee()
    {
        this.setSize(900,550);
        this.setLocationRelativeTo(null);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Hotel Hub - Add Employee");
        
        c = this.getContentPane();
        c.setLayout(null);	    
        c.setBackground(Color.BLACK);
        
        adempimg = new ImageIcon(getClass().getResource("Images/addemp.jpg"));
	adempimglabel = new JLabel(adempimg);
	adempimglabel.setBounds(0,0,900,550);
	c.add(adempimglabel);
        
        f = new Font ( "Tahoma", Font.BOLD, 40);
        f1 = new Font ( "Tahoma", Font.BOLD, 22);
        f2 = new Font ( "Tahoma", Font.BOLD, 30);
        
        l1 = new JLabel("Add Employee Details");
	l1.setBounds(120,30,500,50);
        l1.setForeground(Color.BLACK);
        l1.setFont(f);
	adempimglabel.add(l1);
        
        l2 = new JLabel("Name : ");
	l2.setBounds(50,95,200,30);
        l2.setForeground(Color.BLACK);
        l2.setFont(f1);
	adempimglabel.add(l2);
        
        l3 = new JLabel("Age : ");
	l3.setBounds(50,140,200,30);
        l3.setForeground(Color.BLACK);
        l3.setFont(f1);
	adempimglabel.add(l3);
        
        l4 = new JLabel("Gender : ");
	l4.setBounds(50,185,200,30);
        l4.setForeground(Color.BLACK);
        l4.setFont(f1);
	adempimglabel.add(l4);
        
        l5 = new JLabel("Job : ");
	l5.setBounds(50,230,200,30);
        l5.setForeground(Color.BLACK);
        l5.setFont(f1);
	adempimglabel.add(l5);
        
        l6 = new JLabel("Salary : ");
	l6.setBounds(50,275,200,30);
        l6.setForeground(Color.BLACK);
        l6.setFont(f1);
	adempimglabel.add(l6);
        
        l7 = new JLabel("Phone : ");
	l7.setBounds(50,320,200,30);
        l7.setForeground(Color.BLACK);
        l7.setFont(f1);
	adempimglabel.add(l7);
        
        l8 = new JLabel("Nid : ");
	l8.setBounds(50,365,200,30);
        l8.setForeground(Color.BLACK);
        l8.setFont(f1);
	adempimglabel.add(l8);
        
        l9 = new JLabel("Email : ");
	l9.setBounds(50,410,200,30);
        l9.setForeground(Color.BLACK);
        l9.setFont(f1);
	adempimglabel.add(l9);
        
        
        tf1 = new JTextField("");
	tf1.setBounds(150,95,200,30);
        tf1.setBackground(Color.WHITE);
        tf1.setForeground(Color.DARK_GRAY);
        tf1.setFont(f1);
	adempimglabel.add(tf1);
        
        tf2 = new JTextField("");
	tf2.setBounds(130,140,150,30);
        tf2.setBackground(Color.WHITE);
        tf2.setForeground(Color.DARK_GRAY);
        tf2.setFont(f1);
	adempimglabel.add(tf2);
        
        tf3 = new JTextField("");
	tf3.setBounds(150,275,150,30);
        tf3.setBackground(Color.WHITE);
        tf3.setForeground(Color.DARK_GRAY);
        tf3.setFont(f1);
	adempimglabel.add(tf3);
        
        tf4 = new JTextField("");
	tf4.setBounds(150,320,150,30);
        tf4.setBackground(Color.WHITE);
        tf4.setForeground(Color.DARK_GRAY);
        tf4.setFont(f1);
	adempimglabel.add(tf4);
        
        tf5 = new JTextField("");
	tf5.setBounds(120,365,150,30);
        tf5.setBackground(Color.WHITE);
        tf5.setForeground(Color.DARK_GRAY);
        tf5.setFont(f1);
	adempimglabel.add(tf5);
        
        tf6 = new JTextField("");
	tf6.setBounds(140,410,150,30);
        tf6.setBackground(Color.WHITE);
        tf6.setForeground(Color.DARK_GRAY);
        tf6.setFont(f1);
	adempimglabel.add(tf6);
        
        
        cb1 = new JComboBox(genders);
	cb1.setBounds(160,185,200,30);
        cb1.setBackground(Color.WHITE);
        cb1.setForeground(Color.DARK_GRAY);
        cb1.setFont(f1);
        adempimglabel.add(cb1);
        cb1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                gender = cb1.getSelectedItem().toString();
            }
        });
        
        cb2 = new JComboBox(jobs);
	cb2.setBounds(120,230,200,30);
        cb2.setBackground(Color.WHITE);
        cb2.setForeground(Color.DARK_GRAY);
        cb2.setFont(f1);
        adempimglabel.add(cb2);
        cb2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                job = cb2.getSelectedItem().toString();
            }
        });
        
        jb1 = new JButton("Add");
	jb1.setBounds(520,420,120,40);
        jb1.setBackground(Color.PINK);
        jb1.setForeground(Color.WHITE);
        jb1.setFont(f2);
	adempimglabel.add(jb1);
        jb1.addActionListener(this);
        
        jb2 = new JButton("Back");
	jb2.setBounds(680,420,120,40);
        jb2.setBackground(Color.PINK);
        jb2.setForeground(Color.WHITE);
        jb2.setFont(f2);
	adempimglabel.add(jb2);
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
            String name = tf1.getText();
            String age = tf2.getText();
            String salary = tf3.getText();
            String phone = tf4.getText();
            String nid = tf5.getText();
            String email = tf6.getText();
            
            if (name.isEmpty() || age.isEmpty() || gender.isEmpty() || job.isEmpty() || salary.isEmpty() || phone.isEmpty() || nid.isEmpty() || email.isEmpty())
            {
                JOptionPane.showMessageDialog (c,"Please fill out the form properly", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            else 
            {
                addEmployeeCredentials(name,age,gender,job,salary,phone,nid,email);
                JOptionPane.showMessageDialog(this, "Employee Succesfully Added");
            }
        }
    }
    
    private void addEmployeeCredentials(String name, String age, String gender, String job, String phone, String salary, String nid, String email) {
        EmployeeClass.Name = Arrays.copyOf(EmployeeClass.Name, EmployeeClass.Name.length + 1);
        EmployeeClass.Name[EmployeeClass.Name.length - 1] = name;
        EmployeeClass.Age = Arrays.copyOf(EmployeeClass.Age, EmployeeClass.Age.length + 1);
        EmployeeClass.Age[EmployeeClass.Age.length - 1] = age;
        EmployeeClass.Gender = Arrays.copyOf(EmployeeClass.Gender, EmployeeClass.Gender.length + 1);
        EmployeeClass.Gender[EmployeeClass.Gender.length - 1] = gender;
        EmployeeClass.Job = Arrays.copyOf(EmployeeClass.Job, EmployeeClass.Job.length + 1);
        EmployeeClass.Job[EmployeeClass.Job.length - 1] = job;
        EmployeeClass.Salary = Arrays.copyOf(EmployeeClass.Salary, EmployeeClass.Salary.length + 1);
        EmployeeClass.Salary[EmployeeClass.Salary.length - 1] = salary;
        EmployeeClass.Phone = Arrays.copyOf(EmployeeClass.Phone, EmployeeClass.Phone.length + 1);
        EmployeeClass.Phone[EmployeeClass.Phone.length - 1] = phone;
        EmployeeClass.Nid = Arrays.copyOf(EmployeeClass.Nid, EmployeeClass.Nid.length + 1);
        EmployeeClass.Nid[EmployeeClass.Nid.length - 1] = nid;
        EmployeeClass.Email = Arrays.copyOf(EmployeeClass.Email, EmployeeClass.Email.length + 1);
        EmployeeClass.Email[EmployeeClass.Email.length - 1] = email;
           
    }
    
    public static void main(String [] args)
	{
            AddEmployee adde = new AddEmployee();
	    adde.setVisible(true);	 
        }

}