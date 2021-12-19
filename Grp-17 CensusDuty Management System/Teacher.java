import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Teacher extends JFrame {
    Teacher(){
        setSize(1600,1200);
        
        JButton B1 = new JButton("View Location Assigned by Admin");
        B1.setFont(new Font(Font.SERIF, Font.BOLD, 20));
        B1.setBounds(580,300,400,60);
        setVisible(true);
        add(B1);
        setLayout(null);
       
        B1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
            new viewassignlocations().setVisible(true);	
            dispose();
        	}
        });
        
        
        JButton B2 = new JButton("Add House Member Details");
        B2.setBounds(580,420,400,60);
        B2.setFont(new Font(Font.SERIF, Font.BOLD, 20));
        setVisible(true);
        add(B2);
        setLayout(null);
       
        B2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		 TeacherUI add = new TeacherUI();
        		 add.setVisible(true);
        		 dispose();
        	}
        });
        
        JButton logoutButton = new JButton("LOGOUT");
        
        logoutButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		int c = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit ?", "Alert",JOptionPane.OK_CANCEL_OPTION);
        		if(c == JOptionPane.OK_OPTION) {
        		
        		CENSUS login = new CENSUS();
        		login.setVisible(true);
        		dispose();
        	}
        	}
        });
        logoutButton.setBounds(1400,50,100,40);
        add(logoutButton);
        
        JLabel l1=new JLabel("Welcome Teacher ");
		l1.setBounds(550,20,1200,100);
		l1.setFont(new Font(Font.SERIF, Font.BOLD,  59));
		add(l1);
        
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
        background2.setBounds(990, 5, 480, 152);
        
        
        ImageIcon background_image = new ImageIcon("C:\\\\Users\\\\dell\\\\Dropbox\\\\My PC (DESKTOP-EJPRT30)\\\\Downloads\\\\WhatsApp Image 2021-12-04 at 7.43.34 PM.jpeg");
        Image img = background_image.getImage();
        Image temp_img = img.getScaledInstance(1920,1080, Image.SCALE_SMOOTH);
        background_image = new ImageIcon(temp_img);
        JLabel background = new JLabel("", background_image, JLabel.CENTER);
        background.setBounds(0, 0,1920,800);
        
        add(background2);
        add(background1);
        add(background);
        B1.setForeground(Color.black);
        B1.setBackground(Color.black);
        B1.setOpaque(false);
        
        Border emptyBorder = BorderFactory.createEmptyBorder();
        logoutButton.setBorder(emptyBorder);
        
        B2.setForeground(Color.black);
        B2.setBackground(Color.black);
        B2.setOpaque(false);
        
        logoutButton.setForeground(Color.black);
        logoutButton.setBackground(Color.black);
        logoutButton.setOpaque(false);
    }
     
    public static void main(String args[]){
        Teacher obj = new Teacher();
        
    }
}
