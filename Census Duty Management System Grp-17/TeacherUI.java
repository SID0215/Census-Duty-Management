import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ItemEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TeacherUI  extends JFrame {
    JFrame Frame2 = new JFrame();
    TeacherUI(){
        setSize(1920,1080);
        final JLabel label = new JLabel();            
        label.setHorizontalAlignment(JLabel.CENTER);    
        label.setSize(400,100);    
        JLabel J1 = new JLabel("Name ");
        J1.setFont(new Font(Font.SERIF, Font.BOLD ,20));
        J1.setBounds(500,150,200,30);
        J1.setVisible(true);
        add(J1);
        setLayout(null);
        
        JTextField textField1 = new JTextField(30);
        textField1.setBounds(700,150,200,30);
        textField1.setVisible(true);
        add(textField1);
        setVisible(true);
        
        JLabel J2 = new JLabel("Gender ");
        J2.setFont(new Font(Font.SERIF, Font.BOLD ,20));
        J2.setBounds(500,200,200,30);
        J2.setVisible(true);
        add(J2);
        setLayout(null);
        
        String[] gender = {"select your Gender","Male","Female","Others"};
        JComboBox cb1 = new JComboBox(gender);
        cb1.setBounds(700,200,200,30);
        cb1.setVisible(true);
        add(cb1);
        setLayout(null);
        
        JLabel J3 = new JLabel("Date of Birth ");
        J3.setFont(new Font(Font.SERIF, Font.BOLD ,20));
        J3.setBounds(500,250,200,30);
        J3.setVisible(true);
        add(J3);
        setLayout(null);
        
        JTextField textField3 = new JTextField(30);
        textField3.setBounds(700,250,200,30);
        textField3.setVisible(true);
        add(textField3);
        setVisible(true);
        
        JLabel J4 = new JLabel("Aadhaar No  ");
        J4.setFont(new Font(Font.SERIF, Font.BOLD ,20));
        J4.setBounds(500,350,200,30);
        J4.setVisible(true);
        add(J4);
        setLayout(null);
        
        JTextField textField4 = new JTextField(30);
        textField4.setBounds(700,350,200,30);
        textField4.setVisible(true);
        add(textField4);
        setVisible(true);
        
        JLabel J5 = new JLabel("Age");
        J5.setFont(new Font(Font.SERIF, Font.BOLD ,20));
        J5.setBounds(500,300,200,30);
        J5.setVisible(true);
        add(J5);
        setLayout(null);
        
        JTextField textField5 = new JTextField(30);
        textField5.setBounds(700,300,200,30);
        textField5.setVisible(true);
        add(textField5);
        setVisible(true);
        
       /* JLabel J6 = new JLabel("Martial Status ");
        J6.setFont(new Font(Font.SERIF, Font.BOLD ,20));
        J6.setBounds(500,350,200,30);
        J6.setVisible(true);
        add(J6);
        setLayout(null);*/

        /*JRadioButton but1 = new JRadioButton("Married");
        JRadioButton but2 = new JRadioButton("UNMarried");
        but1.setBounds(700,330,160,30);
        but2.setBounds(700,360,160,30);
        add(but1);add(but2);
        but1.setVisible(true);
      
        setVisible(true);
        setVisible(true);*/
        JLabel J13 = new JLabel("Marital status ");
        J13.setFont(new Font(Font.SERIF, Font.BOLD ,20));
        J13.setBounds(500,400,200,30);
        J13.setVisible(true);
        add(J13);
        setLayout(null);
        
        String[] mar = {"select ","married","unmarried"};
        JComboBox cb6 = new JComboBox(mar);
        cb6.setBounds(700,400,200,30);
        cb6.setVisible(true);
        add(cb6);
        setLayout(null);
        
        JLabel J12 = new JLabel("Country ");
        J12.setFont(new Font(Font.SERIF, Font.BOLD ,20));
        J12.setBounds(500,650,200,30);
        J12.setVisible(true);
        add(J12);
        setLayout(null);
        
        String[] country = {"select a country","India"};
        JComboBox cb2 = new JComboBox(country);
        cb2.setBounds(700,650,200,30);
        cb2.setVisible(true);
        add(cb2);
        setLayout(null);
        
        JLabel J11 = new JLabel("State ");
	    J11.setFont(new Font(Font.SERIF, Font.BOLD ,20));
	    J11.setBounds(500,600,200,30);
	    J11.setVisible(true);
	    add(J11);
	    setLayout(null);
	    
	    String[] states = {"select a state","Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Goa","Gujarat","Haryana","Himachal Pradesh","Jharkhand","Karnataka","Kerala","Madhya Pradesh","Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan","Sikkim","Tamil Nadu","Telangana","Tripura","Uttarakhand","Uttar Pradesh"};
        JComboBox cb = new JComboBox(states);
        cb.setBounds(700,600,200,30);
        cb.setVisible(true);
        add(cb);
        setLayout(null);
        
        JLabel J9 = new JLabel("District ");
	    J9.setFont(new Font(Font.SERIF, Font.BOLD ,20));
	    J9.setBounds(500,550,200,30);
	    J9.setVisible(true);
	    add(J9);
	    setLayout(null);
	    
	    JTextField textField9 = new JTextField(30);
	    textField9.setBounds(700,550,200,30);
	    textField9.setVisible(true);
	    add(textField9);
	    setVisible(true);
	    
	    JLabel J8 = new JLabel("City ");
	    J8.setFont(new Font(Font.SERIF, Font.BOLD ,20));
	    J8.setBounds(500,500,200,30);
	    J8.setVisible(true);
	    add(J8);
	    setLayout(null);
	    
	    JTextField textField8 = new JTextField(30);
	    textField8.setBounds(700,500,200,30);
	    textField8.setVisible(true);
	    add(textField8);
	    setVisible(true);
	    
	    JLabel J7 = new JLabel("Street ");
	    J7.setFont(new Font(Font.SERIF, Font.BOLD ,20));
	    J7.setBounds(500,450,200,30);
	    J7.setVisible(true);
	    add(J7);
	    setLayout(null);
	    
	    JTextField textField7 = new JTextField(30);
	    textField7.setBounds(700,450,200,30);
	    textField7.setVisible(true);
	    add(textField7);
	    setVisible(true);
	    
	    JLabel J0 = new JLabel("House.No ");
	    J0.setFont(new Font(Font.SERIF, Font.BOLD ,20));
	    J0.setBounds(500,100,200,30);
	    J0.setVisible(true);
	    add(J0);
	    setLayout(null);
	    
	    JTextField textField0 = new JTextField(30);
	    textField0.setBounds(700,100,200,30);
	    textField0.setVisible(true);
	    add(textField0);
	    setVisible(true);
	    
	    JLabel J10 = new JLabel("Pincode ");
	    J10.setFont(new Font(Font.SERIF, Font.BOLD ,20));
	    J10.setBounds(500,700,200,30);
	    J10.setVisible(true);
	    add(J10);
	    setLayout(null);
	    
	    JTextField textField10 = new JTextField(30);
	    textField10.setBounds(700,700,200,30);
	    textField10.setVisible(true);
	    add(textField10);
	    setVisible(true);
	    
        JButton submit = new JButton("Submit Details");
        submit.setBounds(610, 750,200, 30);
        add(submit);
        submit.addActionListener(new  ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	Connection connect = ConnectDB.getConnection();
     		   
				try {
					Statement st = connect.createStatement();
					String sql = "insert into users (name,gender,dob,aadhar,age,maritalstatus,country,state,district,city,street,house_no,pincode) values"+ "('"+textField1.getText()+"','"+cb1.getSelectedItem()+"','"+textField3.getText()+"','"+textField4.getText()+"','"+textField5.getText()+"','"+cb6.getSelectedItem()+"','"+cb2.getSelectedItem()+"','"+cb.getSelectedItem()+"', '"+textField9.getText()+"','"+textField8.getText()+"','"+textField7.getText()+"','"+textField0.getText()+"','"+textField10.getText()+"')";
					st.execute(sql);
					String sql1 = "insert into login (username,password) values('"+textField4.getText()+"','"+textField3.getText()+"')";
					st.execute(sql1);
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(null,"Details Added Successfully");        			
		}
  });
        
        submit.setForeground(Color.white);
        submit.setBackground(Color.black);
        
        /*but1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		 if	(but1.isSelected()) {
        			but2.setSelected(false); 
        		 }
        		 }
        });
        
        but2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		 if	(but2.isSelected()) { 
        			but1.setSelected(false);
        	}
        		 }
    		
        });*/
        
        ImageIcon bg = new ImageIcon("C:\\Users\\dell\\Dropbox\\My PC (DESKTOP-EJPRT30)\\Downloads\\emblem.png");
        Image i = bg.getImage();
        Image tem_img = i.getScaledInstance(150, 120, Image.SCALE_SMOOTH);
        bg = new ImageIcon(tem_img);
        JLabel background1 = new JLabel("", bg, JLabel.CENTER);
        background1.setBounds(10, 20, 120, 120);
        
        ImageIcon bg1 = new ImageIcon("C:\\Users\\dell\\Dropbox\\My PC (DESKTOP-EJPRT30)\\Downloads\\75.png");
        Image i1 = bg1.getImage();
        Image tem_img2 = i1.getScaledInstance(400, 130, Image.SCALE_SMOOTH);
        bg = new ImageIcon(tem_img);
        JLabel background2 = new JLabel("", bg1, JLabel.CENTER);
        background2.setBounds(1200, 5, 480, 152);
        
        
        ImageIcon background_image = new ImageIcon("C:\\\\Users\\\\dell\\\\Dropbox\\\\My PC (DESKTOP-EJPRT30)\\\\Downloads\\\\WhatsApp Image 2021-12-04 at 7.43.34 PM.jpeg");
        Image img = background_image.getImage();
        Image temp_img = img.getScaledInstance(1920,1080, Image.SCALE_SMOOTH);
        background_image = new ImageIcon(temp_img);
        JLabel background = new JLabel("", background_image, JLabel.CENTER);
        background.setBounds(0, 0,1920,800);
        
        add(background2);
        add(background1);
        add(background);
     }

    public static void main(String args[]){
        TeacherUI obj = new TeacherUI();
    }
}