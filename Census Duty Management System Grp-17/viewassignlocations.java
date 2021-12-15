import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class viewassignlocations extends JFrame {
    //JFrame Frame2 = new JFrame();
    viewassignlocations(){
        setSize(3200,1600);
        
        JLabel J1 = new JLabel("Teacher_ID ");
        J1.setFont(new Font(Font.SERIF, Font.BOLD ,20));
        J1.setBounds(550,150,200,30);
        J1.setVisible(true);
        add(J1);
        setLayout(null);
        
        JTextField textField1 = new JTextField(30);
        textField1.setBounds(700,150,200,30);
        textField1.setVisible(true);
        add(textField1);
        setVisible(true);
        
        //String name = JOptionPane.showInputDialog("Teacher_ID ");
    	
        JButton view = new JButton("View");
        view.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Connection connect = ConnectDB.getConnection();
        		PreparedStatement p;
        		String teacher_id = textField1.getText(); 
        		try {
        		String sql = "select * from assign_locations where teacher_id =  '"+teacher_id+"';";
        		p = connect.prepareStatement(sql);
        		ResultSet rs = p.executeQuery(); // Printing ID, name, email of customers
        		// of the SQL command above
        		rs.next();
        		JOptionPane.showMessageDialog(null,rs.getString("street") , "Assigned location", JOptionPane.INFORMATION_MESSAGE);
        		//JOptionPane.showMessageDialog(null,rs.getString("location") , "Assigned location", JOptionPane.INFORMATION_MESSAGE);
        		}

        		 // Catch block to handle exception
        		catch (Exception f) { // Print exception pop-up on screen
        		System.out.println(f.getMessage());
        	}
        	
        	}
        });
        view.setBounds(700,250,150,40);
        add(view);
        view.setForeground(Color.white);
        view.setBackground(Color.black);
        
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
        
        
        ImageIcon background_image = new ImageIcon("C:\\\\\\\\Users\\\\\\\\dell\\\\\\\\Dropbox\\\\\\\\My PC (DESKTOP-EJPRT30)\\\\\\\\Downloads\\\\\\\\WhatsApp Image 2021-12-04 at 7.43.34 PM.jpeg");
        Image img = background_image.getImage();
        Image temp_img = img.getScaledInstance(1920,1080, Image.SCALE_SMOOTH);
        background_image = new ImageIcon(temp_img);
        JLabel background = new JLabel("", background_image, JLabel.CENTER);
        background.setBounds(0, 0,1920,800);
        
        add(background2);
        add(background1);
        add(background);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		viewassignlocations obj = new viewassignlocations();
	}

}
