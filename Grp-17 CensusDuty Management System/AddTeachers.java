import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddTeachers extends JFrame {
    AddTeachers(){
        setSize(3200,1600);
        
        JLabel J1 = new JLabel("Teacher_ID ");
        J1.setFont(new Font(Font.SERIF, Font.BOLD ,20));
        J1.setBounds(550,250,200,30);
        J1.setVisible(true);
        add(J1);
        setLayout(null);
        
        JTextField textField1 = new JTextField(30);
        textField1.setBounds(700,250,200,30);
        textField1.setVisible(true);
        add(textField1);
        setVisible(true);
        
        JLabel J2 = new JLabel("LastName ");
        J2.setFont(new Font(Font.SERIF, Font.BOLD ,20));
        J2.setBounds(550,300,200,30);
        J2.setVisible(true);
        add(J2);
        setLayout(null);
        
        JTextField textField2 = new JTextField(30);
        textField2.setBounds(700,300,200,30);
        textField2.setVisible(true);
        add(textField2);
        setVisible(true);
        
        JLabel J3 = new JLabel("FirstName ");
        J3.setFont(new Font(Font.SERIF, Font.BOLD ,20));
        J3.setBounds(550,350,200,30);
        J3.setVisible(true);
        add(J3);
        setLayout(null);
        
        JTextField textField3 = new JTextField(30);
        textField3.setBounds(700,350,200,30);
        textField3.setVisible(true);
        add(textField3);
        setVisible(true);
        
        JCheckBox b = new JCheckBox("ConfirmDetails");
        b.setBounds(700, 390, 200, 30);
        b.setVisible(true);
        add(b);
        
        JButton add = new JButton("AddTeacher");
        add.setBounds(650, 440, 200, 30);
        add(add);
        add.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if (e.getSource() == add){
        			Connection connect = ConnectDB.getConnection();
        		   
        				try {
							Statement st = connect.createStatement();
							String sql = "insert into teacher (teacher_id,firstname,lastname) values('"+textField1.getText()+"','"+textField2.getText()+"','"+textField3.getText()+"')";
							st.execute(sql);
							String sql1 = "insert into login (username,password) values('"+textField1.getText()+"','"+textField2.getText()+"')";
							st.execute(sql1);
							
							
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
        				JOptionPane.showMessageDialog(null,"Teacher Added Successfully");        			
        		}
        	}
        });
        
        Icon icon = new ImageIcon("C:\\Users\\dell\\OneDrive\\Pictures\\back.png");
        JButton backButton = new JButton(icon);
        
        backButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		new Admin().setVisible(true);
        		dispose();
        	}
        });
        backButton.setBounds(35,150,100,60);
        add(backButton);
        backButton.setBackground(Color.white);
        backButton.setOpaque(false);
      
        	//background
      		ImageIcon bg = new ImageIcon("C:\\Users\\dell\\Dropbox\\My PC (DESKTOP-EJPRT30)\\Downloads\\emblem.png");
              Image i = bg.getImage();
              Image tem_img = i.getScaledInstance(150, 120, Image.SCALE_SMOOTH);
              bg = new ImageIcon(tem_img);
              JLabel background1 = new JLabel("", bg, JLabel.CENTER);
              background1.setBounds(10, 20, 120, 120);
              
              ImageIcon bg1 = new ImageIcon("C:\\Users\\dell\\Dropbox\\My PC (DESKTOP-EJPRT30)\\Downloads\\sw.png");
              Image i1 = bg1.getImage();
              Image tem_img2 = i1.getScaledInstance(400, 130, Image.SCALE_SMOOTH);
              bg = new ImageIcon(tem_img);
              JLabel background2 = new JLabel("", bg1, JLabel.CENTER);
              background2.setBounds(1110, 5, 480, 152);
              
              
              ImageIcon background_image = new ImageIcon("C:\\Users\\dell\\Dropbox\\My PC (DESKTOP-EJPRT30)\\Downloads\\WhatsApp Image 2021-12-04 at 7.43.34 PM.jpeg");
              Image img = background_image.getImage();
              Image temp_img = img.getScaledInstance(1920,1080, Image.SCALE_SMOOTH);
              background_image = new ImageIcon(temp_img);
              JLabel background = new JLabel("", background_image, JLabel.CENTER);
              background.setBounds(0, 0,1920,800);
              
              add(background2);
              add(background1);
              add(background);

              add.setForeground(Color.white);
              add.setBackground(Color.black);
              backButton.setBorderPainted(false);
              
    }
public static void main(String args[]){
        AddTeachers obj = new AddTeachers();
    
        }
    }
