package combatateball;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;

public class ventana extends JFrame {
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
		JLabel personaje1 = new JLabel("");
		personaje1.setBounds(193, 120, 136, 210);
		personaje1.setIcon(new ImageIcon(ventana.class.getResource("/combatateball/goku/0.png")));
		contenedor_personaje.add(personaje1);
		personaje1.setVisible(false);
		
		//**personaje JLabel**//
				JLabel personaje2 = new JLabel("");
				personaje2.setBounds(693, 120, 136, 210);
				personaje2.setIcon(new ImageIcon(ventana.class.getResource("/combatateball/goku/0.png")));
				contenedor_personaje.add(personaje2);
				personaje2.setVisible(false);
		
				JLabel maquina = new JLabel("");
				maquina.setBounds(493, 120, 136, 210);
				maquina.setIcon(new ImageIcon(ventana.class.getResource("/combatateball/goku/0.png")));
				contenedor_personaje.add(maquina);
				maquina.setVisible(false);
				
		JLabel ataques = new JLabel("");
		ataques.setBounds(331, 132, 118, 187);
		contenedor_personaje.add(ataques);
		JLabel titulo1 = new JLabel("jugador vs  jugador");
		titulo1.setHorizontalAlignment(SwingConstants.CENTER);
		titulo1.setBounds(458, 15, 281, 14);
		contenedor_personaje.add(titulo1);
		titulo1.setVisible(false);
		
		JLabel titulo2 = new JLabel("jugador1 vs maquina");
		titulo2.setBounds(506, 15, 181, 14);
		contenedor_personaje.add(titulo2);
		titulo2.setVisible(false);
		
		JButton vsmaquina = new JButton("jugador vs maquina");
		JButton vsjugadores = new JButton("jugador vs jugador");
		vsjugadores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				titulo1.setVisible(true);
				personaje1.setVisible(true);
				personaje2.setVisible(true);
				vsjugadores.setVisible(false);
				vsmaquina.setVisible(false);
			}
		});
		vsjugadores.setBounds(193, 193, 169, 63);
		contenedor_personaje.add(vsjugadores);
		
		
		vsmaquina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				titulo2.setVisible(true);
				personaje1.setVisible(true);
				maquina.setVisible(true);
				vsjugadores.setVisible(false);
				vsmaquina.setVisible(false);
				
			}
		});
		vsmaquina.setBounds(498, 193, 169, 63);
		contenedor_personaje.add(vsmaquina);
		
		JButton salir = new JButton("salir");
		salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personaje1.setVisible(false);
				personaje2.setVisible(false);
				maquina.setVisible(false);
				vsjugadores.setVisible(true);
				vsmaquina.setVisible(true);
				titulo1.setVisible(false);
				titulo2.setVisible(false);
				
			}
		});
		salir.setBounds(833, 11, 89, 23);
		contenedor_personaje.add(salir);
		
		JProgressBar vidajugador1 = new JProgressBar();
		vidajugador1.setStringPainted(true);
		vidajugador1.setForeground(new Color(0, 128, 128));
		vidajugador1.setValue(100);
		vidajugador1.setBounds(38, 36, 281, 23);
		contenedor_personaje.add(vidajugador1);
		
		JProgressBar progressBar_1 = new JProgressBar();
		progressBar_1.setValue(100);
		progressBar_1.setStringPainted(true);
		progressBar_1.setForeground(new Color(0, 128, 128));
		progressBar_1.setBounds(699, 48, 281, 23);
		contenedor_personaje.add(progressBar_1);
		

	
		
	
	
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
				x=personaje1.getX();
				y=personaje1.getY();
				System.out.println(contenedor_personaje.getLocation());
				
				switch(evt.getExtendedKeyCode()) {
				
				//*volar  recto teclado numerico*//
				case KeyEvent.VK_NUMPAD8:
					personaje1.setLocation(x,y-8);
					break;
				case KeyEvent.VK_NUMPAD2:
				personaje1.setLocation(x,y+8);
					break;
				case KeyEvent.VK_NUMPAD4:
					personaje1.setLocation(x-8,y);
					break;
				case KeyEvent.VK_NUMPAD6:
					personaje1.setLocation(x+8,y);
					break;
					
					//*volar  recto flechas*//
				case KeyEvent.VK_UP:
					personaje1.setLocation(x,y-8);
					break;
				case KeyEvent.VK_DOWN:
					personaje1.setLocation(x,y+8);
					break;
				case KeyEvent.VK_LEFT:
					personaje1.setLocation(x-8,y);
					break;
				case KeyEvent.VK_RIGHT:
					personaje1.setLocation(x+8,y);
					break;
					
					
					//*volar  diagonal*//
				case KeyEvent.VK_NUMPAD7:
					personaje1.setLocation(x-8,y-8);
					personaje1.setIcon(new ImageIcon(ventana.class.getResource("/combatateball/goku/5.png")));
					contenedor_personaje.add(personaje1);
					break;
				case KeyEvent.VK_NUMPAD3:
					personaje1.setLocation(x+8,y+8);
					personaje1.setIcon(new ImageIcon(ventana.class.getResource("/combatateball/goku/23.png")));
					contenedor_personaje.add(personaje1);
					break;
				case KeyEvent.VK_NUMPAD1:
					personaje1.setLocation(x-8,y+8);
					personaje1.setIcon(new ImageIcon(ventana.class.getResource("/combatateball/goku/5.png")));
					contenedor_personaje.add(personaje1);
					break;
				case KeyEvent.VK_NUMPAD9:
					personaje1.setLocation(x+8,y-8);
					personaje1.setIcon(new ImageIcon(ventana.class.getResource("/combatateball/goku/23.png")));
					contenedor_personaje.add(personaje1);
					
					break;
				
				case KeyEvent.VK_X:
					
					Thread tx = new Thread() {
						String[] combo = {"/combatateball/goku/9.png",
										"/combatateball/goku/13.png", 
										"/combatateball/goku/16.png",
										"/combatateball/goku/7.png",
										"/combatateball/goku/10.png"};
						public void run() {
							 for (int i = 0; i < 6; i++) {
									
						    		personaje1.setLocation(x,y);
									personaje1.setIcon(new ImageIcon(ventana.class.getResource(combo[i])));
									contenedor_personaje.add(personaje1); 
									
									
											 try {
													 Thread.sleep(800);
													 
												} catch (InterruptedException e) {
													Logger.getLogger(ventana.class.getName()).log(Level.SEVERE,null,e);
												}
							
								 }
							
						}
					};
					tx.start();
					
				
					break;
				case KeyEvent.VK_Z:
					Thread tz = new Thread() {
						String[] combo = {"/combatateball/goku/1.png",
										"/combatateball/goku/2.png", 
										"/combatateball/goku/8.png",
										"/combatateball/goku/18.png"};
						public void run() {
							 for (int i = 0; i < 6; i++) {
									
						    		personaje1.setLocation(x,y);
									personaje1.setIcon(new ImageIcon(ventana.class.getResource(combo[i])));
									contenedor_personaje.add(personaje1); 
									
									
											 try {
													 Thread.sleep(800);
													 
												} catch (InterruptedException e) {
													Logger.getLogger(ventana.class.getName()).log(Level.SEVERE,null,e);
												}
							
								 }
							
						}
					};
					tz.start();
					
				
					break;
				case KeyEvent.VK_C:
					personaje1.setLocation(x,y);
					personaje1.setIcon(new ImageIcon(ventana.class.getResource("/combatateball/goku/30.png")));
					contenedor_personaje.add(personaje1);
					
					ataques.setLocation(x + 98, y + 2);
				    ataques.setIcon(new ImageIcon(ventana.class.getResource("/ataques/17.png")));
				    contenedor_personaje.add(ataques);
					break;
				case KeyEvent.VK_H:
					if(vidajugador1.getValue()>0) {
						vidajugador1.setValue(vidajugador1.getValue()-10);
						
					}else {
					
						JOptionPane.showMessageDialog(vidajugador1,"perdiste ok");
					}
					
					break;
				case KeyEvent.VK_V :
					personaje1.setLocation(x,y);
					personaje1.setIcon(new ImageIcon(ventana.class.getResource("/combatateball/goku/9.png")));
					contenedor_personaje.add(personaje1);
							
						
								
								
				        
					break;
				case KeyEvent.VK_Y:
						ataques.setLocation(x + 98, y + 2);
					    ataques.setIcon(new ImageIcon(ventana.class.getResource("/ataques/13.png")));
					    contenedor_personaje.add(ataques);
					    
					    int i = 0;
				        // Bucle do-while que imprime números del 0 al 9
				        do {
				        	ataques.setLocation(x + 98, y + 2);
				            i++;
				        } while (i < 10);
					
				
					
					
				
				
				}

			}

		
		});
		/*jugador 2*/
		//**funcion botones movimientos**//
		contenedor_personaje.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(java.awt.event.KeyEvent evt) {
				x=personaje2.getX();
				y=personaje2.getY();
				System.out.println(contenedor_personaje.getLocation());
				
				switch(evt.getExtendedKeyCode()) {
				
				//*volar  recto teclado numerico*//
				case KeyEvent.VK_NUMPAD8:
					personaje2.setLocation(x,y-8);
					break;
				case KeyEvent.VK_NUMPAD2:
				personaje2.setLocation(x,y+8);
					break;
				case KeyEvent.VK_NUMPAD4:
					personaje2.setLocation(x-8,y);
					break;
				case KeyEvent.VK_NUMPAD6:
					personaje2.setLocation(x+8,y);
					break;
					
					//*volar  recto flechas*//
				case KeyEvent.VK_UP:
					personaje2.setLocation(x,y-8);
					break;
				case KeyEvent.VK_DOWN:
					personaje2.setLocation(x,y+8);
					break;
				case KeyEvent.VK_LEFT:
					personaje2.setLocation(x-8,y);
					break;
				case KeyEvent.VK_RIGHT:
					personaje2.setLocation(x+8,y);
					break;
					
					
					//*volar  diagonal*//
				case KeyEvent.VK_NUMPAD7:
					personaje2.setLocation(x-8,y-8);
					personaje2.setIcon(new ImageIcon(ventana.class.getResource("/combatateball/goku/5.png")));
					contenedor_personaje.add(personaje2);
					break;
				case KeyEvent.VK_NUMPAD3:
					personaje2.setLocation(x+8,y+8);
					personaje2.setIcon(new ImageIcon(ventana.class.getResource("/combatateball/goku/23.png")));
					contenedor_personaje.add(personaje2);
					break;
				case KeyEvent.VK_NUMPAD1:
					personaje2.setLocation(x-8,y+8);
					personaje2.setIcon(new ImageIcon(ventana.class.getResource("/combatateball/goku/5.png")));
					contenedor_personaje.add(personaje2);
					break;
				case KeyEvent.VK_NUMPAD9:
					personaje2.setLocation(x+8,y-8);
					personaje2.setIcon(new ImageIcon(ventana.class.getResource("/combatateball/goku/23.png")));
					contenedor_personaje.add(personaje2);
					
					break;
				
				case KeyEvent.VK_X:
					personaje2.setLocation(x,y);
					personaje2.setIcon(new ImageIcon(ventana.class.getResource("/combatateball/goku/9.png")));
					contenedor_personaje.add(personaje2);
				
					break;
				case KeyEvent.VK_Z:
					personaje2.setLocation(x,y);
					personaje2.setIcon(new ImageIcon(ventana.class.getResource("/combatateball/goku/8.png")));
					contenedor_personaje.add(personaje2);
				
				
					break;
				case KeyEvent.VK_C:
					personaje2.setLocation(x,y);
					personaje2.setIcon(new ImageIcon(ventana.class.getResource("/combatateball/goku/21.png")));
					contenedor_personaje.add(personaje2);
					
					ataques.setLocation(x + 98, y + 2);
				    ataques.setIcon(new ImageIcon(ventana.class.getResource("/ataques/17.png")));
				    contenedor_personaje.add(ataques);
					break;
				case KeyEvent.VK_V:
					
	
					break;
				
					
					
				
				
				}

			}

		
		});
		
		
		
	}
}
