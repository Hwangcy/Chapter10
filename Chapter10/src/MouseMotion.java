import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseMotion extends JFrame {
	JPanel contentPane = new JPanel();

	MouseMotion() {
		setTitle("MouseMotion"); //title정하기
		setSize(300, 300); //size정하기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(contentPane);
		contentPane.setBackground(Color.GREEN);
		contentPane.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				contentPane.setBackground(Color.YELLOW);
			}

			public void mouseMoved(MouseEvent e) {
				contentPane.setBackground(Color.GREEN);
			}
		});
		//
		setVisible(true);
	}

	public static void main(String[] args) {
		new MouseMotion();
	}
}