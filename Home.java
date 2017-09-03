package metro;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Home extends javax.swing.JFrame implements ActionListener {

	private JLabel appTitle;
	private JLabel startStationLabel;
	private JLabel endStationLabel;
	private JTextField startStationField;
	private JTextField endStationField;
	private JLabel line;
	private JButton calculateButton;
	private JLabel fareLabel;
	private JLabel fareValue;
	private JLabel noOfStationLabel;
	private JLabel noOfStationValue;
	private JButton seeMap;
	private JButton seeAlter;
	private JButton reset;
	private static final int BASE_FARE = 10; 
	private List stationList ; 
				
	
	public Home() {

		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int screenWidth = (int) dimension.getWidth();
		int screenHeight = (int) dimension.getHeight();

		int centreX = screenWidth / 2;
		int centreY = screenHeight / 2;

		int frameWidth = 500;
		int frameHeight = 800;

		int frameStartX = centreX - (frameWidth / 2);
		int frameStartY = centreY - (frameHeight / 2);

		appTitle = new JLabel("-----DELHI METRO RAILWAY CORPORATION-----");
		appTitle.setBounds(0, 10, frameWidth, 50);
		appTitle.setFont(new Font("Serif", Font.PLAIN, 24));
		add(appTitle);

		startStationLabel = new JLabel("Start Station");
		startStationLabel.setBounds(10, 70, 100, 40);
		startStationLabel.setFont(new Font("Serif", Font.PLAIN, 20));
		add(startStationLabel);

		startStationField = new JTextField();
		startStationField.setBounds(140, 80, 150, 30);
		startStationField.setFont(new Font("Serif", Font.PLAIN, 20));
		add(startStationField);

		endStationLabel = new JLabel("End Station");
		endStationLabel.setBounds(10, 130, 100, 40);
		endStationLabel.setFont(new Font("Serif", Font.PLAIN, 20));
		add(endStationLabel);

		endStationField = new JTextField();
		endStationField.setBounds(140, 140, 150, 30);
		endStationField.setFont(new Font("Serif", Font.PLAIN, 20));
		add(endStationField);

		calculateButton = new JButton("Calculate");
		calculateButton.setBounds(140, 220, 150, 40);
		add(calculateButton);
		calculateButton.addActionListener(this);

		line = new JLabel("------------------------------------------------------------------------------------");
		line.setBounds(0, 280, frameWidth, 50);
		line.setFont(new Font("Serif", Font.PLAIN, 24));
		add(line);

		fareLabel = new JLabel("Total Fare");
		fareLabel.setBounds(10, 340, 100, 40);
		fareLabel.setFont(new Font("Serif", Font.PLAIN, 20));
		add(fareLabel);

		fareValue = new JLabel();
		fareValue.setBounds(140, 340, 150, 30);
		fareValue.setFont(new Font("Serif", Font.PLAIN, 20));
		add(fareValue);

		noOfStationLabel = new JLabel("No of Stations");
		noOfStationLabel.setBounds(10, 400, 100, 40);
		noOfStationLabel.setFont(new Font("Serif", Font.PLAIN, 20));
		add(noOfStationLabel);

		noOfStationValue = new JLabel();
		noOfStationValue.setBounds(140, 400, 150, 30);
		noOfStationValue.setFont(new Font("Serif", Font.PLAIN, 20));
		add(noOfStationValue);

		seeMap = new JButton("seeMap");
		seeMap.setBounds(20, 490, frameWidth / 2 - 30, 50);
		add(seeMap);
		seeMap.addActionListener(this);

		seeAlter = new JButton("See Alternate Route");
		seeAlter.setBounds(frameWidth / 2, 490, frameWidth / 2 - 30, 50);
		add(seeAlter);
		seeAlter.addActionListener(this);

		reset = new JButton("Reset");
		reset.setBounds(100, 580, frameWidth - 200, 50);
		add(reset);
		reset.addActionListener(this);

		setBounds(frameStartX, frameStartY, frameWidth, frameHeight);
		setLayout(null);
		setVisible(true);
		setResizable(false);

	}

	public static void main(String[] args) {
		new Home();

	}

	@Override
	public void actionPerformed(ActionEvent event) {

		if (event.getSource() == reset) {
			System.out.println("reset pressed");
		} else if (event.getSource() == seeMap) {

			if(this.stationList!=null){
				new OpenMap(this.stationList);
			}
		
		} else if (event.getSource() == seeAlter) {
			System.out.println("seeAlter pressed");
		} else if (event.getSource() == calculateButton) {
			String startStationValue = startStationField.getText();
			String endStationValue = endStationField.getText();

			if (!startStationValue.equals("") && !endStationValue.equals("")) {

				try {

					Class.forName("com.mysql.jdbc.Driver");

					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/metro_db", "root", "");

					PreparedStatement preparedStatement = con.prepareStatement("select * from station_info where sname = ? or sname = ?");
					preparedStatement.setString(1,startStationValue);
					preparedStatement.setString(2,endStationValue);
					
					
					ResultSet rs  = preparedStatement.executeQuery();
					
					int cs_id = 0;
					int ds_id = 0;
				
					
					while(rs.next())
					{
						if(rs.getString(2).equals(startStationValue))
						{
							cs_id = rs.getInt(1);
						}
						else if(rs.getString(2).equals(endStationValue))
						{
							ds_id = rs.getInt(1);
						}
					}
					
					System.out.println(cs_id+","+ds_id);
					
					List stationList = Calculate.distance(cs_id,ds_id);
			        
					this.stationList = stationList;
					int noOfStations = stationList.size()-1;
					
					noOfStationValue.setText(""+noOfStations);
			        
			        if(noOfStations==1)
			        {
			        	fareValue.setText(""+BASE_FARE);
			        }else{
			        	int actualFare = BASE_FARE+noOfStations-1;
			        	fareValue.setText(""+actualFare);
			        }
			        
			        
					con.close();
				} catch (Exception e) {
					System.out.println(e);
				}
			}

		}

	}

	

}
