package Ventanas;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.SwingConstants;


public class Ejemplo3 {

	private JFrame frame;
	private JTextField textField;
	private int contador = 0;
	private JPanel panel_1;
	private JPanel panel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo3 window = new Ejemplo3();
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
	public Ejemplo3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Dimension monitor = Toolkit.getDefaultToolkit().getScreenSize();
		int height = (int)monitor.getHeight();
		int width = (int)monitor.getWidth();
		frame = new JFrame();
		
		// Para posicionar la pantalla en el centro:
			// (resolucion_x/2)-(mi ventana_x/2), (resolucion_y/2)-(mi ventana_y/2)
		
		// La comparación de setBounds y de setLocation es que con setBounds tambien puedes jugar
		// con el tamaño de la ventana a parte de solo posicionarla
		frame.setBounds(100, 100, 450, 300);
		
		// Aqui tambien lo posicionaría en el centro pero solo indica la posicion de la pantalla.
		frame.setLocation((width/2)-(frame.getWidth()/2), (height/2)-(frame.getHeight()/2));
		
		// Setea la localizacion en la pantalla en función de nada, por lo tanto
		// nos pone la entana en el centro. para localizar las venanas en el centro.
		//frame.setLocationRelativeTo(null);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Card layout lo que hace es que veamos las ventanas superpuestas una encima de otra como 
		// si fueran cartas.
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(64, 0, 64));
		panel.setForeground(new Color(0, 128, 0));
		frame.getContentPane().add(panel, "name_11849613275200");
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Click");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contador++;
				// Hacemos un casting para que pase de int a String.
				textField.setText(Integer.toString(contador));
				
			}
		});
		btnNewButton.setBounds(95, 112, 89, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Numero de clicks");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 128, 128));
		lblNewLabel.setBounds(237, 73, 89, 14);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(240, 115, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Next");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				panel_1.setVisible(true);
				
			}
		});
		btnNewButton_1.setBounds(335, 227, 89, 23);
		panel.add(btnNewButton_1);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 128, 0));
		panel_1.setForeground(new Color(64, 0, 128));
		frame.getContentPane().add(panel_1, "name_11901265226500");
		panel_1.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Return");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(false);
				panel.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(10, 227, 89, 23);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Finish");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(false);
				panel_2.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(335, 227, 89, 23);
		panel_1.add(btnNewButton_3);
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 0));
		frame.getContentPane().add(panel_2, "name_12093207752000");
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("GRACIAS");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel_1.setBounds(101, 76, 234, 103);
		panel_2.add(lblNewLabel_1);
	}
}
