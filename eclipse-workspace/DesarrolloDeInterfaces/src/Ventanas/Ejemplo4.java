package Ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLayeredPane;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejemplo4 {

	private JFrame frame;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JButton btnNewButton;
	private JButton btnNewButton_4;
	private JButton btnNewButton_1;
	private JButton btnNewButton_3;
	private JButton btnNewButton_2;
	private JButton btnNewButton_5;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo4 window = new Ejemplo4();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejemplo4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 434, 262);
		frame.getContentPane().add(layeredPane);
		layeredPane.setLayout(null);
		
		panel_1 = new JPanel();
		layeredPane.setLayer(panel_1, 2);
		panel_1.setBounds(0, 0, 434, 262);
		panel_1.setBackground(new Color(0, 0, 64));
		layeredPane.add(panel_1);
		panel_1.setLayout(null);
		
		panel_2 = new JPanel();//NARANJA
		panel_2.setBounds(0, 0, 434, 262);
		panel_2.setBackground(Color.RED);
		layeredPane.add(panel_2);
		panel_2.setLayout(null);

		
		btnNewButton_1 = new JButton("aaaaaa");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panel.setVisible(false);
				panel_1.setVisible(false);
				panel_2.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(335, 228, 89, 23);
		panel_1.add(btnNewButton_1);
		
		btnNewButton_3 = new JButton("panel morado");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(false);
				panel.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(236, 228, 89, 23);
		panel_1.add(btnNewButton_3);
		
		panel = new JPanel();//MORADO
		panel.setBounds(0, 0, 434, 262);
		panel.setBackground(new Color(128, 0, 128));
		layeredPane.add(panel);
		panel.setLayout(null);
		
		btnNewButton = new JButton("panel naranja");
		btnNewButton.setBounds(335, 228, 89, 23);
		panel.add(btnNewButton);
		
				
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);//MORADO
				panel_2.setVisible(true);//NARANJA
			}
		});
		
		
		btnNewButton_4 = new JButton("panel azul");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				panel_1.setVisible(true);
			}
		});
		btnNewButton_4.setBounds(221, 228, 89, 23);
		panel.add(btnNewButton_4);
		
		
		btnNewButton_2 = new JButton("panel morado");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_2.setVisible(false);
				panel.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(236, 228, 89, 23);
		panel_2.add(btnNewButton_2);
		
		btnNewButton_5 = new JButton("panel azul");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_2.setVisible(false);
				panel_1.setVisible(true);
			}
		});
		btnNewButton_5.setBounds(335, 228, 89, 23);
		panel_2.add(btnNewButton_5);
	}
}
