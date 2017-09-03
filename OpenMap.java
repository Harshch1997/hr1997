/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metro;

import java.awt.Color;
import java.awt.Graphics;
import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Harsh
 */
public class OpenMap extends JFrame {

	private List l2 = new ArrayList(1000);

	public OpenMap(List l2) {
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		setSize(1400, 750);
		this.l2 = l2;
		setVisible(true);
	}

	public List getL2() {
		return l2;
	}

	@Override
	public void paint(Graphics g) {

		int xrr[] = new int[l2.size()];
		int yrr[] = new int[l2.size()];
		int arr[] = new int[l2.size()];
		Iterator o = l2.iterator();
		int k = 0;
		while (o.hasNext()) {
			arr[k] = (int) o.next();
			k++;
		}
		for (int j = 0; j < arr.length; j++) {
			int stationId = arr[j];
			int coordinates[] = createStationData(stationId);
			xrr[j] = coordinates[0];
			yrr[j] = coordinates[1];
		}

		super.paint(g);
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 1400, 750);

		g.setColor(Color.WHITE);
		g.fillArc(75, 75, 8, 8, 0, 360);
		g.fillArc(125, 100, 8, 8, 0, 360);
		g.fillArc(175, 125, 8, 8, 0, 360);
		g.fillArc(225, 150, 8, 8, 0, 360);
		g.fillArc(275, 175, 8, 8, 0, 360);
		g.fillArc(325, 200, 8, 8, 0, 360);
		g.fillArc(375, 225, 8, 8, 0, 360);
		g.fillArc(425, 250, 8, 8, 0, 360);
		g.fillArc(475, 275, 8, 8, 0, 360);
		g.fillArc(565, 310, 8, 8, 0, 360);
		g.fillArc(650, 350, 8, 8, 0, 360);
		g.fillArc(570, 375, 8, 8, 0, 360);
		g.fillArc(490, 385, 8, 8, 0, 360);
		g.fillArc(430, 390, 8, 8, 0, 360);
		g.fillArc(370, 400, 8, 8, 0, 360);
		g.fillArc(290, 410, 8, 8, 0, 360);
		g.fillArc(230, 420, 8, 8, 0, 360);
		g.fillArc(155, 440, 8, 8, 0, 360);
		g.fillArc(95, 450, 8, 8, 0, 360);
		g.fillArc(50, 470, 8, 8, 0, 360);
		g.fillArc(8, 480, 8, 8, 0, 360);
		g.fillArc(600, 240, 8, 8, 0, 360);
		g.fillArc(660, 210, 8, 8, 0, 360);
		g.fillArc(720, 180, 8, 8, 0, 360);
		g.fillArc(800, 140, 8, 8, 0, 360);
		g.fillArc(850, 110, 8, 8, 0, 360);
		g.fillArc(900, 80, 8, 8, 0, 360);
		g.fillArc(950, 45, 8, 8, 0, 360);
		g.fillArc(730, 250, 8, 8, 0, 360);
		g.fillArc(820, 230, 8, 8, 0, 360);
		g.fillArc(920, 210, 8, 8, 0, 360);
		g.fillArc(1020, 190, 8, 8, 0, 360);
		g.fillArc(1120, 170, 8, 8, 0, 360);
		g.fillArc(1220, 150, 8, 8, 0, 360);
		g.fillArc(720, 400, 8, 8, 0, 360);
		g.fillArc(750, 420, 8, 8, 0, 360);
		g.fillArc(800, 440, 8, 8, 0, 360);
		g.fillArc(850, 470, 8, 8, 0, 360);
		g.fillArc(880, 500, 8, 8, 0, 360);
		g.fillArc(910, 530, 8, 8, 0, 360);
		g.fillArc(940, 560, 8, 8, 0, 360);
		g.fillArc(990, 590, 8, 8, 0, 360);
		g.fillArc(1040, 620, 8, 8, 0, 360);
		g.fillArc(1090, 650, 8, 8, 0, 360);
		g.fillArc(1150, 680, 8, 8, 0, 360);
		g.fillArc(1200, 700, 8, 8, 0, 360);
		g.fillArc(800, 570, 8, 8, 0, 360);
		g.fillArc(750, 590, 8, 8, 0, 360);
		g.fillArc(650, 610, 8, 8, 0, 360);
		g.fillArc(550, 630, 8, 8, 0, 360);
		g.fillArc(450, 650, 8, 8, 0, 360);
		g.fillArc(350, 670, 8, 8, 0, 360);
		g.fillArc(250, 690, 8, 8, 0, 360);
		g.fillArc(150, 710, 8, 8, 0, 360);
		g.fillArc(50, 730, 8, 8, 0, 360);
		g.fillArc(1100, 500, 8, 8, 0, 360);
		g.fillArc(1200, 420, 8, 8, 0, 360);
		g.fillArc(1260, 360, 8, 8, 0, 360);
		g.fillArc(1120, 300, 8, 8, 0, 360);
		g.fillArc(1060, 250, 8, 8, 0, 360);

		g.setColor(Color.WHITE);
		g.drawLine(75, 75, 125, 100);
		g.drawLine(125, 100, 175, 125);
		g.drawLine(175, 125, 225, 150);
		g.drawLine(225, 150, 275, 175);
		g.drawLine(275, 175, 325, 200);
		g.drawLine(325, 200, 375, 225);
		g.drawLine(375, 225, 425, 250);
		g.drawLine(425, 250, 475, 275);
		g.drawLine(475, 275, 565, 310);
		g.drawLine(565, 310, 650, 350);
		g.drawLine(650, 350, 570, 375);
		g.drawLine(570, 375, 490, 385);
		g.drawLine(490, 385, 430, 390);
		g.drawLine(430, 390, 370, 400);
		g.drawLine(370, 400, 290, 410);
		g.drawLine(290, 410, 230, 420);
		g.drawLine(230, 420, 155, 440);
		g.drawLine(155, 440, 95, 450);
		g.drawLine(95, 450, 50, 470);
		g.drawLine(50, 470, 8, 480);
		g.drawLine(475, 275, 600, 240);
		g.drawLine(600, 240, 660, 210);
		g.drawLine(660, 210, 720, 180);
		g.drawLine(720, 180, 800, 140);
		g.drawLine(800, 140, 850, 110);
		g.drawLine(850, 110, 900, 80);
		g.drawLine(900, 80, 950, 45);
		g.drawLine(600, 240, 730, 250);
		g.drawLine(730, 250, 820, 230);
		g.drawLine(820, 230, 920, 210);
		g.drawLine(920, 210, 1020, 190);
		g.drawLine(1020, 190, 1120, 170);
		g.drawLine(1120, 170, 1220, 150);
		g.drawLine(650, 350, 720, 400);
		g.drawLine(720, 400, 750, 420);
		g.drawLine(750, 420, 800, 440);
		g.drawLine(800, 440, 850, 470);
		g.drawLine(850, 470, 880, 500);
		g.drawLine(880, 500, 910, 530);
		g.drawLine(910, 530, 940, 560);
		g.drawLine(940, 560, 990, 590);
		g.drawLine(990, 590, 1040, 620);
		g.drawLine(1040, 620, 1090, 650);
		g.drawLine(1090, 650, 1150, 680);
		g.drawLine(1150, 680, 1200, 700);
		g.drawLine(940, 560, 800, 570);
		g.drawLine(800, 570, 750, 590);
		g.drawLine(750, 590, 650, 610);
		g.drawLine(650, 610, 550, 630);
		g.drawLine(550, 630, 450, 650);
		g.drawLine(450, 650, 350, 670);
		g.drawLine(350, 670, 250, 690);
		g.drawLine(250, 690, 150, 710);
		g.drawLine(150, 710, 50, 730);
		g.drawLine(940, 560, 1100, 500);
		g.drawLine(1100, 500, 1200, 420);
		g.drawLine(1200, 420, 1260, 360);
		g.drawLine(1260, 360, 1120, 300);
		g.drawLine(1120, 300, 1060, 250);
		g.drawLine(1060, 250, 1020, 190);

		g.setColor(Color.GREEN);
		g.drawString("mundka", 75, 75);
		g.drawString("nangloi", 125, 100);
		g.drawString("udyog nagar", 175, 125);
		g.drawString("peera garhi", 225, 150);
		g.drawString("paschim vihar", 275, 175);
		g.drawString("madipur", 325, 200);
		g.drawString("shivaji park", 375, 225);
		g.drawString("punjabi bagh", 425, 250);

		g.drawString("ashok park main", 475, 275);
		g.setColor(Color.GREEN);
		g.drawString("satguru ram singh marg", 565, 310);
		g.setColor(new Color(83, 169, 255));
		g.drawString("kirti nagar", 650, 350);

		g.drawString("moti nagar", 580, 385);
		g.drawString("ramesh ", 500, 395);
		g.drawString("nagar ", 500, 405);
		g.drawString("rajouri", 440, 400);
		g.drawString("tagore", 380, 410);
		g.drawString("garden", 380, 420);
		g.drawString("subhash", 300, 420);
		g.drawString("nagar", 300, 430);
		g.drawString("tilak", 240, 430);
		g.drawString("nagar", 240, 440);
		g.drawString("janakpuri", 165, 450);
		g.drawString("uttam", 105, 460);
		g.drawString("nagar", 105, 470);
		g.drawString("nawada", 60, 480);
		g.drawString("dwarka", 18, 490);
		g.setColor(Color.red);
		g.drawString("inderlok ", 610, 250);

		g.drawString("kanhaiya nagar", 670, 220);
		g.drawString("netaji subhash place", 730, 190);
		g.drawString("kohat", 810, 150);
		g.drawString("pitampura", 860, 120);
		g.drawString("rohini", 910, 90);
		g.drawString("rithala", 960, 55);

		g.drawString("shastri nagar", 740, 260);
		g.drawString("pratap nagar", 830, 240);
		g.drawString("tis hazari", 930, 220);
		g.drawString("kashmiri gate", 1030, 200);
		g.drawString("welcome", 1130, 180);
		g.drawString("dilshad garden", 1230, 160);
		g.setColor(new Color(83, 169, 255));
		g.drawString("shadipur", 720, 400);
		g.drawString("patel nagar", 750, 420);
		g.drawString("rajender nagar", 800, 440);
		g.drawString("karol bagh", 850, 470);
		g.drawString("jhandewalan", 880, 500);
		g.drawString("rk-ashram marg", 910, 530);
		g.drawString("rajiv chowk", 940, 560);
		g.drawString("barakhamba", 990, 590);
		g.drawString("mandi house", 1040, 620);
		g.drawString("pragati maidan", 1090, 650);
		g.drawString("indraprastha", 1150, 680);
		g.drawString("yamuna bank", 1200, 700);
		g.setColor(new Color(213, 213, 0));
		g.drawString("patel chowk", 810, 580);
		g.drawString("ina", 760, 600);
		g.drawString("aiims", 660, 620);
		g.drawString("green park", 560, 640);
		g.drawString("malvaiya nagar", 460, 660);
		g.drawString("saket", 360, 680);
		g.drawString("qutab minar", 260, 700);
		g.drawString("mg road", 160, 720);
		g.drawString("huda city center", 60, 740);

		g.drawString("new delhi", 1100, 500);
		g.drawString("chawri bazar", 1200, 420);
		g.drawString("jama masjid", 1260, 360);
		g.drawString("chandni chowk", 1120, 300);
		g.drawString("delhi gate", 1060, 250);

		int e = 0;

		for (e = 0; e < arr.length; e++) {

			g.setColor(Color.ORANGE);
			g.drawLine(xrr[e], yrr[e], xrr[e + 1], yrr[e + 1]);

			if (e == 0) {

				g.setColor(Color.ORANGE);
				g.drawString("Start", xrr[e] + 15, yrr[e] - 25);
			}

			else if (e == (arr.length - 1)) {
				g.drawString("End", xrr[e], yrr[e] - 25);
			}

		}

	}
	
	
	private int[] createStationData(int stationId) {

		int coordinates[] = new int[2];
		try {

			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/metro_db", "root", "");

			PreparedStatement preparedStatement = con.prepareStatement("select * from station_info where sid = ?");
			preparedStatement.setInt(1,stationId);
			
			ResultSet rs  = preparedStatement.executeQuery();
			
			while(rs.next())
			{
				coordinates[0] = rs.getInt(3);
				coordinates[1] = rs.getInt(4);
			}
			con.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}		
		return coordinates;
		
	}
	
}
