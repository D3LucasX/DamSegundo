package Ventanas;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Ejemplo5_imagenes {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo5_imagenes window = new Ejemplo5_imagenes();
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
	public Ejemplo5_imagenes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit()
				.getImage(Ejemplo5_imagenes.class.getResource("/imagenEscudoAtleticoMadrid.png"))); // Pilla la imagen como URL
		frame.setBounds(100, 100, 860, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(buscarImagen());
	}
	private Component buscarImagen() {
		BufferedImage fondo = null;

		// cargar la imagen
		try {
			fondo = ImageIO.read(new File("src/metropolitano.jpg")); // pilla la imagen como ruta
		} catch (IOException e) {
			e.printStackTrace();
		}

		Image foto = fondo;
		JPanel panelConFondo = new JPanel() {

			private static final long serialVersionUID = 1L;

			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(foto, 0, 0, 860, 600, null);
			}
		};
		return panelConFondo;
	}
}
