import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Project extends JFrame {
	JLabel l1, l2,l3;
	SimpleDateFormat d1 ,d2,d3;
	Project(String s1) {
		super(s1);
	}
	Project() {

	}
void setComponents() {
	l1 = new JLabel();
	l2 = new JLabel();
	l3 = new JLabel();

	l1.setFont(new Font("Verdana", Font.BOLD, 40));
	Color c1 = Color.RED;
	Color c2 = c1.brighter();
	l1.setForeground(c2);
	l1.setBackground(Color.BLACK);
	l1.setOpaque(true);

	l2.setFont(new Font("Verdana", Font.BOLD, 40));
	l2.setForeground(c2);
	l2.setBackground(Color.green);
	l2.setOpaque(true);

	l3.setFont(new Font("Verdana", Font.BOLD, 40));
	l3.setForeground(c2);
	l3.setBackground(Color.YELLOW);
	l3.setOpaque(true);

	setLayout(null);
	add(l1);
	add(l2);
	add(l3);

	l1.setBounds(50, 50, 350, 100);
	l2.setBounds(50,300,300,100);
	l3.setBounds(400,50,350,100);
		
	d1 = new SimpleDateFormat("hh:mm:ss a");
	d2 = new SimpleDateFormat("dd:MM:YYYY");
	d3 = new SimpleDateFormat("EEEEE");

	String time = d1.format(Calendar.getInstance().getTime());
	l1.setText(time);

	String day = d2.format(Calendar.getInstance().getTime());
	l2.setText(day);
			
	String ways = d3.format(Calendar.getInstance().getTime());
	l3.setText(ways);


	while (true) {
		time = d1.format(Calendar.getInstance().getTime());
		l1.setText(time);

		day = d2.format(Calendar.getInstance().getTime());
	        l2.setText(day);

		ways = d3.format(Calendar.getInstance().getTime());
	        l3.setText(ways);

	    try {
		Thread.sleep(1000);
       	        }
	    catch (Exception e) {

	      }
	    }
	}

	public static void main(String[] args) {
		Project pp = new Project("Digital Clock");
		pp.setVisible(true);
		pp.setSize(500, 500);
		pp.setDefaultCloseOperation(EXIT_ON_CLOSE);
		pp.setComponents();
	}
}
