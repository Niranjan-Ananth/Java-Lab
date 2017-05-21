import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Demo {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setLayout(new FlowLayout());
		f.setSize(800, 800);
		JLabel l1 = new JLabel("Source");
		JLabel l2 = new JLabel("Destination");
		JTextField t1 = new JTextField();
		t1.setColumns(30);
		JTextField t2 = new JTextField();
		t2.setColumns(30);
		JButton b1 = new JButton("Start");
		JButton b2 = new JButton("Stop");
		JTextArea ta = new JTextArea(40,40);
		ta.setLineWrap(true);
		ta.setWrapStyleWord(true);
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(b1);
		f.add(ta);
		f.setVisible(true);
		JProgressBar pb = new JProgressBar(0,100);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String src = t1.getText();
				String dest = t2.getText();
				pb.setIndeterminate(true);
				pb.setString("Copying");
				pb.setStringPainted(true);
				pb.setVisible(true);
				try(BufferedReader br = new BufferedReader(new FileReader(new File(src)))) {
					System.out.println("HERE");
					f.add(pb);
					f.add(b2);
					f.setVisible(true);
					String line;
					PrintWriter fout = new PrintWriter(new File(dest));
					while((line = br.readLine())!=null){
						fout.println(line);
					}
					fout.close();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String src = t2.getText();
				pb.setVisible(false);
				b1.setEnabled(false);
				b2.setEnabled(false);
				try(BufferedReader br = new BufferedReader(new FileReader(new File(src)))){
					String line;
					ta.setText("");
					while((line = br.readLine())!=null){
						ta.append(line);
					}
				}catch(Exception ex){
					ex.printStackTrace();
				}
			}
		});
	}

}
