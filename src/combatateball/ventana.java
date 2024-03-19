package combatateball;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dialog.ModalExclusionType;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ventana extends JFrame {
	private JLabel personaje;
	private JLabel ataque;
	int x,y;
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana frame = new ventana();
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

	public ventana() {
		
		/*
		String url = System.getProperty("user.dir"+"\\goku\\");
		public combo() {
			personaje.addItem(url+"2.png");
			/*
			
		}
		
		//*ventana contenedor padre contentPane*/
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 964, 678);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//**contendor del persoonaje contenedor_personaje**//
		JPanel contenedor_personaje = new JPanel();
		contenedor_personaje.setBounds(0, 0, 1403, 800);
		contenedor_personaje.setBackground(new Color(192, 192, 192));
		contentPane.add(contenedor_personaje);
		contenedor_personaje.setFocusable(true);
		contenedor_personaje.setLayout(null);
		
		//**personaje JLabel**//
		JLabel personaje = new JLabel("");
		personaje.setBounds(193, 120, 136, 210);
		personaje.setIcon(new ImageIcon(ventana.class.getResource("/combatateball/goku/0.png")));
		contenedor_personaje.add(personaje);
		
		JLabel ataque = new JLabel("");
	
	/*
		JLabel fondo = new JLabel("");
		fondo.setBounds(-452, -108, 1634, 800);
		fondo.setIcon(new ImageIcon(ventana.class.getResource("/combatateball/goku/fondo.png")));
		contenedor_personaje.add(fondo);
			
		public void teclaX() {
			ImageIcon foco;
			foco = new ImageIcon(getClass().getResource("/goku/0.png"));
			Icon focoIcono=new ImageIcon(foco.getImage().getScaledInatance(personaje.getWidth(),personaje.getHeight(),Image.SCALE_SMOOTN));
			personaje.setIcon(focoIcono);
			
		}
		*/
		
		//**funcion botones movimientos**//
		contenedor_personaje.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(java.awt.event.KeyEvent evt) {
				x=personaje.getX();
				y=personaje.getY();
				System.out.println(contenedor_personaje.getLocation());
				
				switch(evt.getExtendedKeyCode()) {
				
				//*volar  recto teclado numerico*//
				case KeyEvent.VK_NUMPAD8:
					personaje.setLocation(x,y-8);
					break;
				case KeyEvent.VK_NUMPAD2:
				personaje.setLocation(x,y+8);
					break;
				case KeyEvent.VK_NUMPAD4:
					personaje.setLocation(x-8,y);
					break;
				case KeyEvent.VK_NUMPAD6:
					personaje.setLocation(x+8,y);
					break;
					
					//*volar  recto flechas*//
				case KeyEvent.VK_UP:
					personaje.setLocation(x,y-8);
					break;
				case KeyEvent.VK_DOWN:
					personaje.setLocation(x,y+8);
					break;
				case KeyEvent.VK_LEFT:
					personaje.setLocation(x-8,y);
					break;
				case KeyEvent.VK_RIGHT:
					personaje.setLocation(x+8,y);
					break;
					
					
					//*volar  diagonal*//
				case KeyEvent.VK_NUMPAD7:
					personaje.setLocation(x-8,y-8);
					break;
				case KeyEvent.VK_NUMPAD3:
					personaje.setLocation(x+8,y+8);
					break;
				case KeyEvent.VK_NUMPAD1:
					personaje.setLocation(x-8,y+8);
					break;
				case KeyEvent.VK_NUMPAD9:
					personaje.setLocation(x+8,y-8);
					break;
				
				case KeyEvent.VK_X:
				
					ataque.setBounds(x+14, y, 136, 210);
					ataque.setIcon(new ImageIcon(ventana.class.getResource("/ataques/13.png")));
					contenedor_personaje.add(ataque);
					break;
				case KeyEvent.VK_Z:
					personaje.setBounds(x, y, 136, 210);
					personaje.setIcon(new ImageIcon(ventana.class.getResource("/combatateball/goku/5.png")));
					contenedor_personaje.add(personaje);
				
				
					break;
				case KeyEvent.VK_Y:
					personaje.setBounds(x, y, 136, 210);
					personaje.setIcon(new ImageIcon(ventana.class.getResource("/combatateball/goku/1.png")));
					contenedor_personaje.add(personaje);
					break;
				case KeyEvent.VK_B:
					personaje.setBounds(x, y, 136, 210);
					personaje.setIcon(new ImageIcon(ventana.class.getResource("/combatateball/goku/1.png")));
					contenedor_personaje.add(personaje);
					break;
					
					
				
				
				}

			}
		});
		
		
	}

}
