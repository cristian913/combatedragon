package combatateball;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class venta extends JFrame {


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					venta frame = new venta();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	 private JPanel contentPane;
	 private JPanel contenedor_personaje;
	 private  JLabel personaje1;

	 public void contenedorpadre() {
		 	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 964, 678);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			this.setExtendedState(JFrame.MAXIMIZED_BOTH);
			setContentPane(contentPane);
			contentPane.setLayout(null);
	 }
	 public void contenedorpersonaje() {
			JPanel contenedor_personaje = new JPanel();
			contenedor_personaje.setBounds(0, 0, 1403, 800);
			contenedor_personaje.setBackground(new Color(192, 192, 192));
			contentPane.add(contenedor_personaje);
			contenedor_personaje.setFocusable(true);
			contenedor_personaje.setLayout(null);
			
		
	 }
	 
	 public void personaje1() {
		 contenedorpersonaje();
			JLabel personaje2 = new JLabel("");
			personaje2.setBounds(693, 120, 136, 210);
			personaje2.setIcon(new ImageIcon(ventana.class.getResource("/combatateball/goku/0.png")));
			contenedor_personaje.add(personaje2);
			
		
	    }
	public venta() {
		contenedorpadre();
		contenedorpersonaje();
		personaje1();
		
		
		
		
		
	}
}
