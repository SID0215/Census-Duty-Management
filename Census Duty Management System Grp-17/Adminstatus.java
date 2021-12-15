import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.JTableHeader;
class admstatus extends JFrame
{
	admstatus ()
	{
		try {
			Connection conn = ConnectDB.getConnection();
			    String query1 = "SELECT * FROM users ;";
					  
				Statement stm1 = conn.createStatement();
				ResultSet res1 = stm1.executeQuery(query1);
			    	
			    String columns[] = { "House_no", "Name", "Gender","DOB","Age","Aadhar","MaritalStatus",
			    		  "Street","City","District","State","Country","Pincode"};
			      
			      String data[][] = new String[10][13];
			      int i = 0;
			     
			      while (res1.next()) {
			  
			        String house_no= res1.getString("House_no");
			        String name = res1.getString("Name");
			        String gender = res1.getString("Gender");
			        String dob = res1.getString("DOB");
			        String age = res1.getString("Age");
			        String aadhar = res1.getString("Aadhar");
			        String maritalstatus = res1.getString("MaritalStatus");
			        String street = res1.getString("Street");
			        String city = res1.getString("City");
			        String district = res1.getString("District");
			        String state = res1.getString("State");
			        String country = res1.getString("Country");
			        String pincode = res1.getString("Pincode");
			        
			        data[i][0] = house_no + "";
			        data[i][1] = name;
			        data[i][2] = gender;
			        data[i][3] = dob;
			        data[i][4] = age;
			        data[i][5] = aadhar;
			        data[i][6] = maritalstatus;
			        data[i][7] = street;
			        data[i][8] = city;
			        data[i][9] = district;
			        data[i][10] = state;
			        data[i][11] = country;
			        data[i][12] = pincode;
			        
			        i++;
			      }
			      
			      DefaultTableModel model = new DefaultTableModel(data, columns);
			      JTable table = new JTable(model);
			      table.setBounds(500,10,1600,1200);
			      table.setRowHeight(40);
			      
			      table.getColumnModel().getColumn(0).setPreferredWidth(35);
			      table.getColumnModel().getColumn(1).setPreferredWidth(100);
			      table.getColumnModel().getColumn(2).setPreferredWidth(35);
			      table.getColumnModel().getColumn(3).setPreferredWidth(38);
			      table.getColumnModel().getColumn(4).setPreferredWidth(35);
			      table.getColumnModel().getColumn(5).setPreferredWidth(60);
			      table.getColumnModel().getColumn(6).setPreferredWidth(60);
			      table.getColumnModel().getColumn(7).setPreferredWidth(50);
			      table.getColumnModel().getColumn(8).setPreferredWidth(60);
			      table.getColumnModel().getColumn(11).setPreferredWidth(40);
			      table.setShowGrid(true);
			      table.setShowVerticalLines(true);
			      table.setEnabled(false);
			      JScrollPane pane = new JScrollPane(table);
			      //JPanel panel = new JPanel();
			      //panel.setBounds(0,0,1600,1200);
			      //panel.setSize(1600,1200);
			      //panel.add(pane);
			      table.setBackground(new Color(152,251,152));
			      table.setForeground(Color.black);
			      JTableHeader tableHeader = table.getTableHeader();
			      
			      tableHeader.setBackground(new Color(255,165,0));
			      tableHeader.setForeground(Color.black);
			      
			      add(pane);
			      setSize(1600, 400);
			      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			      setVisible(true);}
					catch (Exception ex)
				    {
				    	  System.out.println(ex);
				    }
			   }
		}


public class Adminstatus  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new admstatus();
	}
			

}
