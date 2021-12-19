
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.*;

import javax.swing.*;  

public class tab extends JFrame{  
tab(){  
	JTabbedPane tp=new JTabbedPane(); 
	tp.setBounds(50,30,1430,720);  

    JPanel p1=new JPanel();
    p1.setLayout(null);
    
    JPanel p2=new JPanel();  
    p2.setLayout(null);
     
   JLabel l1=new JLabel("Name");
    l1.setBounds(550,100,100,30);
    l1.setFont(new Font(Font.SERIF, Font.BOLD, 27));
    
    JTextField textField1 = new JTextField(30);
    textField1.setBounds(640,100,180,30);
    textField1.setVisible(true);
    p1.add(textField1);
    setVisible(true);
    p1.add(l1); 
    
    JLabel m1=new JLabel("Name");
    m1.setBounds(550,100,100,30);
    m1.setFont(new Font(Font.SERIF, Font.BOLD, 27));
    
    JTextField textfield1 = new JTextField(30);
    textfield1.setBounds(640,100,180,30);
    textfield1.setVisible(true);
    p2.add(textfield1);
    setVisible(true);
    p2.add(m1); 
   
    
    JLabel l2=new JLabel("Gender");
    l2.setBounds(980,100,100,30);
    l2.setFont(new Font(Font.SERIF, Font.BOLD, 27));
    
    p1.add(l2);
    
    String[] gender = {"Male","Female","Others"};
    JComboBox cb1 = new JComboBox(gender);
    cb1.setBounds(1100,100,180,30);
    cb1.setVisible(true);
    p1.add(cb1);
    setLayout(null); 
    
    JLabel m2=new JLabel("Gender");
    m2.setBounds(980,100,100,30);
    m2.setFont(new Font(Font.SERIF, Font.BOLD, 27));
    
    p2.add(m2);
    
    String[] gender1 = {"Male","Female","Others"};
    JComboBox Cb1 = new JComboBox(gender);
    Cb1.setBounds(1100,100,180,30);
    Cb1.setVisible(true);
    p2.add(Cb1);
    setLayout(null); 
    
    JLabel J0 = new JLabel("House.No ");
    J0.setFont(new Font(Font.SERIF, Font.BOLD ,27));
    J0.setBounds(60,100,120,30);
    J0.setVisible(true);
    p1.add(J0);
    setLayout(null);
    
    JTextField textField0 = new JTextField(30);
    textField0.setBounds(230,100,180,30);
    textField0.setVisible(true);
    p1.add(textField0);
    setVisible(true);
    
    JLabel j0 = new JLabel("House.No ");
    j0.setFont(new Font(Font.SERIF, Font.BOLD ,27));
    j0.setBounds(60,100,120,30);
    j0.setVisible(true);
    p2.add(j0);
    setLayout(null);
    
    JTextField textfield0 = new JTextField(30);
    textfield0.setBounds(230,100,180,30);
    textfield0.setVisible(true);
    p2.add(textfield0);
    setVisible(true);
        
        
    JLabel J3 = new JLabel("Date of Birth ");
    J3.setFont(new Font(Font.SERIF, Font.BOLD ,27));
    J3.setBounds(60,180,160,30);
    J3.setVisible(true);
    p1.add(J3);
    setLayout(null);
    
    JTextField textField3 = new JTextField("DD-MM-YYYY");
    textField3.setBounds(230,180,180,30);
    textField3.setVisible(true);
    p1.add(textField3);
    setVisible(true);
    
    JLabel j3 = new JLabel("Date of Birth ");
    j3.setFont(new Font(Font.SERIF, Font.BOLD ,27));
    j3.setBounds(60,180,160,30);
    j3.setVisible(true);
    p2.add(j3);
    setLayout(null);
    
    JTextField textfield3 = new JTextField("DD-MM-YYYY");
    textfield3.setBounds(230,180,180,30);
    textfield3.setVisible(true);
    p2.add(textfield3);
    setVisible(true);
    
    JLabel J5 = new JLabel("Age");
    J5.setFont(new Font(Font.SERIF, Font.BOLD ,27));
    J5.setBounds(550,180,100,35);
    J5.setVisible(true);
    p1.add(J5);
    setLayout(null);
    
    JTextField textField5 = new JTextField();
    textField5.setBounds(640,180,180,30);
    textField5.setVisible(true);
    p1.add(textField5);
    setVisible(true);
    
    JLabel j5 = new JLabel("Age");
    j5.setFont(new Font(Font.SERIF, Font.BOLD ,27));
    j5.setBounds(550,180,100,35);
    j5.setVisible(true);
    p2.add(j5);
    setLayout(null);
    
    JTextField textfield5 = new JTextField(30);
    textfield5.setBounds(640,180,180,30);
    textfield5.setVisible(true);
    p2.add(textfield5);
    setVisible(true);
    
    JLabel J4 = new JLabel("Aadhaar.No  ");
    J4.setFont(new Font(Font.SERIF, Font.BOLD ,25));
    J4.setBounds(980,180,170,30);
    J4.setVisible(true);
    p1.add(J4);
    setLayout(null);
    
    JTextField textField4 = new JTextField(30);
    textField4.setBounds(1115,180,180,30);
    textField4.setVisible(true);
    p1.add(textField4);
    setVisible(true);
    
    JLabel j4 = new JLabel("Aadhaar.No  ");
    j4.setFont(new Font(Font.SERIF, Font.BOLD ,25));
    j4.setBounds(980,180,170,30);
    j4.setVisible(true);
    p2.add(j4);
    setLayout(null);
    
    JTextField textfield4 = new JTextField(30);
    textfield4.setBounds(1115,180,180,30);
    textfield4.setVisible(true);
    p2.add(textfield4);
    setVisible(true);
    
    JLabel J13 = new JLabel("Marital Status ");
    J13.setFont(new Font(Font.SERIF, Font.BOLD ,25));
    J13.setBounds(60,260,160,30);
    J13.setVisible(true);
    p1.add(J13);
    setLayout(null);
    
    String[] mar = {"Single","Married","Widow","Divorced"};
    JComboBox cb6 = new JComboBox(mar);
    cb6.setBounds(230,260,180,30);
    cb6.setVisible(true);
    p1.add(cb6);
    setLayout(null);
    
    JLabel j13 = new JLabel("Marital Status ");
    j13.setFont(new Font(Font.SERIF, Font.BOLD ,25));
    j13.setBounds(60,260,160,30);
    j13.setVisible(true);
    p2.add(j13);
    setLayout(null);
    
    String[] mari = {"Single","Married","Widow","Divorced"};
    JComboBox Cb6 = new JComboBox(mar);
    Cb6.setBounds(230,260,180,30);
    Cb6.setVisible(true);
    p2.add(Cb6);
    setLayout(null);
    
    JLabel J12 = new JLabel("Country ");
    J12.setFont(new Font(Font.SERIF, Font.BOLD ,25));
    J12.setBounds(550,260,100,35);
    J12.setVisible(true);
    p1.add(J12);
    setLayout(null);
    
    String[] country = {"India"};
    JComboBox cb2 = new JComboBox(country);
    cb2.setBounds(643,260,180,30);
    cb2.setVisible(true);
    p1.add(cb2);
    setLayout(null);
    
    JLabel j12 = new JLabel("Country ");
    j12.setFont(new Font(Font.SERIF, Font.BOLD ,25));
    j12.setBounds(550,260,100,35);
    j12.setVisible(true);
    p2.add(j12);
    setLayout(null);
    
    String[] Country = {"India"};
    JComboBox Cb2 = new JComboBox(country);
    Cb2.setBounds(643,260,180,30);
    Cb2.setVisible(true);
    p2.add(Cb2);
    setLayout(null);
    
    
    JLabel J11 = new JLabel("State ");
    J11.setFont(new Font(Font.SERIF, Font.BOLD ,27));
    J11.setBounds(980,260,100,35);
    J11.setVisible(true);
    p1.add(J11);
    setLayout(null);
    
    String[] states = {"Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Goa","Gujarat","Haryana","Himachal Pradesh","Jharkhand","Karnataka","Kerala","Madhya Pradesh","Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan","Sikkim","Tamil Nadu","Telangana","Tripura","Uttarakhand","Uttar Pradesh"};
    JComboBox cb = new JComboBox(states);
    cb.setBounds(1100,260,180,30);
    cb.setVisible(true);
    p1.add(cb);
    setLayout(null);
    
    JLabel j11 = new JLabel("State ");
   j11.setFont(new Font(Font.SERIF, Font.BOLD ,27));
    j11.setBounds(980,260,100,35);
    j11.setVisible(true);
    p2.add(j11);
    setLayout(null);
    
    String[] States = {"Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Goa","Gujarat","Haryana","Himachal Pradesh","Jharkhand","Karnataka","Kerala","Madhya Pradesh","Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan","Sikkim","Tamil Nadu","Telangana","Tripura","Uttarakhand","Uttar Pradesh"};
    JComboBox Cb = new JComboBox(states);
    Cb.setBounds(1100,260,180,30);
    Cb.setVisible(true);
    p2.add(Cb);
    setLayout(null);
    
    JLabel J9 = new JLabel("District ");
    J9.setFont(new Font(Font.SERIF, Font.BOLD ,27));
    J9.setBounds(60,340,160,30);
    J9.setVisible(true);
    p1.add(J9);
    setLayout(null);
    
    JTextField textField9 = new JTextField(30);
    textField9.setBounds(230,340,180,30);
    textField9.setVisible(true);
    p1.add(textField9);
    setVisible(true);
    
    JLabel j9 = new JLabel("District ");
    j9.setFont(new Font(Font.SERIF, Font.BOLD ,27));
    j9.setBounds(60,340,160,30);
    j9.setVisible(true);
    p2.add(j9);
    setLayout(null);
    
    JTextField textfield9 = new JTextField(30);
    textfield9.setBounds(230,340,180,30);
    textfield9.setVisible(true);
    p2.add(textfield9);
    setVisible(true);
    
    JLabel J8 = new JLabel("City ");
    J8.setFont(new Font(Font.SERIF, Font.BOLD ,27));
    J8.setBounds(550,340,100,35);
    J8.setVisible(true);
    p1.add(J8);
    setLayout(null);
    
    JTextField textField8 = new JTextField(30);
    textField8.setBounds(643,340,180,30);
    textField8.setVisible(true);
    p1.add(textField8);
    setVisible(true);
    
    JLabel j8 = new JLabel("City ");
    j8.setFont(new Font(Font.SERIF, Font.BOLD ,27));
    j8.setBounds(550,340,100,35);
    j8.setVisible(true);
    p2.add(j8);
    setLayout(null);
    
    JTextField textfield8 = new JTextField(30);
    textfield8.setBounds(643,340,180,30);
    textfield8.setVisible(true);
    p2.add(textfield8);
    setVisible(true);
    
    JLabel J7 = new JLabel("Street ");
    J7.setFont(new Font(Font.SERIF, Font.BOLD ,27));
    J7.setBounds(980,340,100,35);
    J7.setVisible(true);
    p1.add(J7);
    setLayout(null);
    
    JTextField textField7 = new JTextField(30);
    textField7.setBounds(1100,340,180,30);
    textField7.setVisible(true);
    p1.add(textField7);
    setVisible(true);
    
    JLabel j7 = new JLabel("Street ");
    j7.setFont(new Font(Font.SERIF, Font.BOLD ,27));
    j7.setBounds(980,340,100,35);
    j7.setVisible(true);
    p2.add(j7);
    setLayout(null);
    
    JTextField textfield7 = new JTextField(30);
    textfield7.setBounds(1100,340,180,30);
    textfield7.setVisible(true);
    p2.add(textfield7);
    setVisible(true);
    
    JLabel J10 = new JLabel("Pincode ");
    J10.setFont(new Font(Font.SERIF, Font.BOLD ,26));
    J10.setBounds(550,420,100,35);
    J10.setVisible(true);
    p1.add(J10);
    setLayout(null);
    
    JTextField textField10 = new JTextField(30);
    textField10.setBounds(647,420,180,30);
    textField10.setVisible(true);
    p1.add(textField10);
    setVisible(true);
    
    JLabel j10 = new JLabel("Pincode ");
    j10.setFont(new Font(Font.SERIF, Font.BOLD ,26));
    j10.setBounds(550,420,100,35);
    j10.setVisible(true);
    p2.add(j10);
    setLayout(null);
    
    JTextField textfield10 = new JTextField(30);
    textfield10.setBounds(647,420,180,30);
    textfield10.setVisible(true);
    p2.add(textfield10);
    setVisible(true);
    
    add(p1);
    add(p2);
    tp.add("Add",p1);  
    tp.add("Update",p2);  
    
    add(tp);
    
    
    setSize(1600,1200); 
  
    JButton submit = new JButton("Add Details");
    submit.setFont(new Font(Font.SERIF, Font.BOLD ,26));
    submit.setBounds(550,520,300,50);
    p1.add(submit);
    submit.addActionListener(new  ActionListener() {
        public void actionPerformed(ActionEvent e) {
        	    String str= textField1.getText();
        	    String str1= textField0.getText();
        	    String str2= textField3.getText();
        	    String str3= textField5.getText();
        	    String str4= textField4.getText();
        	    int length=str4.length();
        	    String str5= textField9.getText();
        	    String str6= textField8.getText();
        	    String str7= textField7.getText();
        	    String str8= textField10.getText();
        	    if (str.equals("")){
        	        JOptionPane.showMessageDialog(null,"Please enter your name");
        	    }
        	    
        	    
        	    else if (str1.equals("")){
        	        JOptionPane.showMessageDialog(null,"House_no is mandatory");
        	    }
        	    
        	    
        	    else if (str2.equals("")){
        	        JOptionPane.showMessageDialog(null,"Please enter your date of birth");
        	    }
        	    
        	    
        	    else if (str3.equals("")){
        	        JOptionPane.showMessageDialog(null,"Enter your age");
        	    }
        	    
        	    
        	    else if (str4.equals("")){
        	        JOptionPane.showMessageDialog(null,"Aadhar_No is mandatory");
        	    }
        	    
        	    
        	    else if (length>12 || length<12)
    		    {
    		    	JOptionPane.showMessageDialog(null,"Aadhar_No must contain only 12 digits");
    		    }
    		    
        	    
        	   
        	    else if (str5.equals("")){
        	        JOptionPane.showMessageDialog(null,"Enter district name");
        	    }
        	    
        	    
        	    else if (str6.equals("")){
        	        JOptionPane.showMessageDialog(null,"Enter your city name");
        	    }
        	    
        	    
        	    else if (str7.equals("")){
        	        JOptionPane.showMessageDialog(null,"Enter your street");
        	    }
        	    
        	    
        	    else if (str8.equals("")){
        	        JOptionPane.showMessageDialog(null,"PINCODE is mandatory");
        	    }
        	    
        	    else
        	    {
        	    	try{
                		Connection connect = ConnectDB.getConnection();
                		Statement stm = connect.createStatement();
        	        	
                		String sql =("insert into users (Name,Gender,DOB,Aadhar,Age,MaritalStatus,Country,State,District,City,Street,House_no,Pincode) values('"+textField1.getText()+"','"+cb1.getSelectedItem()+"','"+textField3.getText()+"','"+textField4.getText()+"','"+textField5.getText()+"','"+cb6.getSelectedItem()+"','"+cb2.getSelectedItem()+"','"+cb.getSelectedItem()+"', '"+textField9.getText()+"','"+textField8.getText()+"','"+textField7.getText()+"','"+textField0.getText()+"','"+textField10.getText()+"');");
                		String sql1 =("insert into login (username,password) values('"+textField4.getText()+"','"+textField3.getText()+"')");
                		ResultSet rs = stm.executeQuery(sql);
                		ResultSet rd = stm.executeQuery(sql1);
                		
                    }
                    catch(SQLException e1) {
                		// TODO Auto-generated catch block
        				e1.printStackTrace();
        				}
            		JOptionPane.showMessageDialog(null,"Details added successfully");

        			//dispose();
        			}
        	    }
        	    
            
        	
            
       });
    submit.setForeground(Color.white);
    submit.setBackground(Color.black);
    
    JButton update = new JButton("Update Details");
    update.setBounds(550,520,300,50);
    update.setFont(new Font(Font.SERIF, Font.BOLD ,26));
    p2.add(update);
    update.addActionListener(new  ActionListener() {
        public void actionPerformed(ActionEvent e) {
        	
        	 String st= textfield1.getText();
     	    String st1= textfield0.getText();
     	    String st2= textfield3.getText();
     	    String st3= textfield5.getText();
     	    String st4= textfield4.getText();
     	    int length=st4.length();
     	    String st5= textfield9.getText();
     	    String st6= textfield8.getText();
     	    String st7= textfield7.getText();
     	    String st8= textfield10.getText();
     	    if (st.equals("")){
     	        JOptionPane.showMessageDialog(null,"Please enter your name.");
     	    }
     	    
     	    
     	    else if (st1.equals("")){
     	        JOptionPane.showMessageDialog(null,"House_no is mandatory");
     	    }
     	    
     	    
     	    else if (st2.equals("")){
     	        JOptionPane.showMessageDialog(null,"Please enter your date of birth");
     	    }
     	    
     	    
     	    else if (st3.equals("")){
     	        JOptionPane.showMessageDialog(null,"Enter your age");
     	    }
     	    
     	    
     	    else if (st4.equals("")){
     	        JOptionPane.showMessageDialog(null,"Aadhar_No is mandatory");
     	    }
     	    
     	    
     	    else if (length>12 || length<12)
 		    {
 		    	JOptionPane.showMessageDialog(null,"Aadhar_No must contain only 12 digits");
 		    }
 		    
     	    
     	   
     	    else if (st5.equals("")){
     	        JOptionPane.showMessageDialog(null,"Enter district name");
     	    }
     	    
     	    
     	    else if (st6.equals("")){
     	        JOptionPane.showMessageDialog(null,"Enter your city name");
     	    }
     	    
     	    
     	    else if (st7.equals("")){
     	        JOptionPane.showMessageDialog(null,"Enter your street");
     	    }
     	    
     	    
     	    else if (st8.equals("")){
     	        JOptionPane.showMessageDialog(null,"PINCODE is mandatory");
     	    }
     	    
        else 
        {
        	try{
        		Connection connect = ConnectDB.getConnection();
        		Statement stm1 = connect.createStatement();
        		String a=textfield4.getText();
        		String h=textfield0.getText();
	        	String q1="select * from users where aadhar='"+a+"' and house_no='"+h+"' ";
        		
        		ResultSet rs = stm1.executeQuery(q1);
        		String aadhar;
        		String h_no;
        		if (rs.next()) {
      		      aadhar= rs.getString("aadhar");
      		      h_no= rs.getString("house_no");
      		      if (a.equals(aadhar) && h.equals(h_no))
      		      {
      		    	
          		    	JOptionPane.showMessageDialog(null,"Details updated Successfully");
          		   
      		    	Statement stm2 = connect.createStatement();
      		    	String q2="update users set Name= '"+textfield1.getText()+"',Gender='"+Cb1.getSelectedItem()+"',DOB='"+textfield3.getText()+"',Age='"+textfield5.getText()+"',MaritalStatus='"+Cb6.getSelectedItem()+"',Country='"+Cb2.getSelectedItem()+"',State='"+Cb.getSelectedItem()+"',District='"+textfield9.getText()+"',City='"+textfield8.getText()+"',Street='"+textfield7.getText()+"',Pincode='"+textfield10.getText()+"' where House_no='"+h_no+"' and Aadhar='"+aadhar+"'";
      		    	ResultSet rs1 = stm2.executeQuery(q2);
      		    	
      		      }
        		}
      		    
      		    else
      		    {
      		    	JOptionPane.showMessageDialog(null,"No such record to update");
      		    }
      		      
        		}
        		
        		
            
            catch(SQLException e1) {
        		// TODO Auto-generated catch block
				e1.printStackTrace();
				}
        }
        	
			//dispose();
			}
            
       });
    update.setForeground(Color.white);
    update.setBackground(Color.black);
    
    
    ImageIcon bg = new ImageIcon("C:\\\\Users\\\\dell\\\\Dropbox\\\\My PC (DESKTOP-EJPRT30)\\\\Downloads\\\\emblem.png");
    Image i = bg.getImage();
    Image tem_img = i.getScaledInstance(150, 120, Image.SCALE_SMOOTH);
    bg = new ImageIcon(tem_img);
    JLabel background1 = new JLabel("", bg, JLabel.CENTER);
    background1.setBounds(10, 20, 120, 120);
    
    ImageIcon bg1 = new ImageIcon("C:\\\\Users\\\\dell\\\\Dropbox\\\\My PC (DESKTOP-EJPRT30)\\\\Downloads\\\\75.png");
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
    
    //add(background2);
    //add(background1);
    
    Icon icon = new ImageIcon("C:\\Users\\dell\\OneDrive\\Pictures\\back.png");
    JButton backButton = new JButton(icon);
    
    backButton.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		
    		new User().setVisible(true);
    		dispose();
    	}
    });
    backButton.setBounds(10,10,100,60);
    backButton.setBackground(Color.white);
    backButton.setOpaque(false);
    p2.add(backButton);
    backButton.setBorderPainted(false);
    
    Icon icon1 = new ImageIcon("C:\\Users\\dell\\OneDrive\\Pictures\\back.png");
    JButton backButton1 = new JButton(icon);
    
    backButton1.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		
    		new User().setVisible(true);
    		dispose();
    	}
    });
    backButton1.setBounds(10,10,100,60);
    backButton1.setBackground(Color.white);
    backButton1.setOpaque(false);
    p1.add(backButton1);
    backButton1.setBorderPainted(false);
    
	   p1.setBackground(new Color(253,235,235));
	   p2.setBackground(new Color(204,255,255));
	   tp.setBackground(new Color(0,0,0,25));
	   tp.setOpaque(false);
	    add(background);
	    setLayout(null);  
	    setVisible(true);  
}  

public static void main(String[] args) {  
    new tab();  
	}
}  
