import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin extends JFrame{
    //JFrame Frame1 = new JFrame();

    Admin() {
        setSize(3200,1600);
        JButton B1 = new JButton("Add Teachers");
        B1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		AddTeachers add= new AddTeachers();
        		add.setVisible(true);
        	}
        });
        B1.setFont(new Font(Font.SERIF, Font.BOLD, 20));
        B1.setBounds(540,280,400,60);
        setVisible(true);
        add(B1);
        setLayout(null);
        JButton B2 = new JButton("Assign locations to teachers");
        B2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Assignlocations ass = new Assignlocations();
        		ass.setVisible(true);
        	}
        });
        B2.setBounds(540,400,400,60);
        B2.setFont(new Font(Font.SERIF, Font.BOLD, 20));
        setVisible(true);
        add(B2);
        setLayout(null);
        JButton B3 = new JButton("View House Member Details ");
        B3.setBounds(540,520,400,60);
        B3.setFont(new Font(Font.SERIF, Font.BOLD, 20));
        setVisible(true);
        add(B3);
        setLayout(null);
        
        B3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        			admstatus obj=new admstatus();
                }
        });
        
        JButton logoutButton = new JButton("LOGOUT");
        logoutButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		JOptionPane.showMessageDialog(null,"Are you sure you want to exit ?");
        		
        		CENSUS login = new CENSUS();
        		login.setVisible(true);
        		dispose();
        	}
        });
        logoutButton.setBounds(1400,130,100,40);
        add(logoutButton);
        
        JLabel l1=new JLabel("Welcome Admin ");
		l1.setBounds(540,20,1200,100);
		l1.setFont(new Font(Font.SERIF, Font.BOLD,  59));
		add(l1);
        
		//background
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
        
        B1.setForeground(Color.white);
        B1.setBackground(Color.black);

        B2.setForeground(Color.white);
        B2.setBackground(Color.black);
        
        B3.setForeground(Color.white);
        B3.setBackground(Color.black);

        logoutButton.setForeground(Color.white);
        logoutButton.setBackground(Color.black);
        
    }
    public static void main(String args[]){
        Admin obj = new Admin();
    }
}

