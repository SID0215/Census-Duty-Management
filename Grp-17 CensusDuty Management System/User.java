import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.awt.event.ItemEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.*;
import javax.swing.plaf.basic.BasicArrowButton;
public class User extends JFrame {
    User(){
        setSize(1600,1200);
     
        
        setLayout(null);
        JButton B1 = new JButton("Add / Update house member ");
        B1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		tab obj = new tab();
        		obj.setVisible(true);
        		dispose();
        	}
        });
        B1.setFont(new Font(Font.SERIF, Font.BOLD, 20));
        B1.setBounds(580,300,400,60);
        setVisible(true);
        add(B1);
        setLayout(null);
        
        JButton B2 = new JButton("View Status");
        B2.setBounds(580,420,400,60);
        B2.setFont(new Font(Font.SERIF, Font.BOLD, 20));
 
        setVisible(true);
        add(B2);
        setLayout(null);
        
        B2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {  
        		stat obj=new stat();
        	}
        });
        
        
        setLayout(null);
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
        logoutButton.setLayout(null);
        add(logoutButton);
        
        JLabel l1=new JLabel("Welcome User ");
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
        
        B2.setForeground(Color.black);
        B2.setBackground(new Color(192,192,192));
        B2.setOpaque(false);
        
        logoutButton.setForeground(Color.black);
        logoutButton.setBackground(Color.black);
        logoutButton.setOpaque(false);
    }
    public static void main(String args[]) {
        User obj = new User();
    }
}

