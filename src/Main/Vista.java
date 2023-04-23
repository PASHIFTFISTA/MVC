package Main;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class  Vista extends JFrame {
	
	private Controlador miControlador;
	private Modelo miModelo;
	private JTextField textUsr;
	private JPasswordField passwordUsr;
	
	public Vista() {
		setTitle("Login MVC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setBounds(72, 89, 66, 21);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contrase\u00F1a");
		lblNewLabel_1.setBounds(61, 120, 66, 13);
		getContentPane().add(lblNewLabel_1);
		
		passwordUsr = new JPasswordField();
		passwordUsr.setBounds(166, 117, 104, 21);
		getContentPane().add(passwordUsr);
		
		textUsr = new JTextField();
		textUsr.setBounds(166, 90, 104, 19);
		getContentPane().add(textUsr);
		textUsr.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.login();
			}
		});
		btnLogin.setBounds(205, 171, 85, 21);
		getContentPane().add(btnLogin);
		
		JLabel lblRespuesta = new JLabel("");
		lblRespuesta.setBounds(195, 148, 75, 13);
		getContentPane().add(lblRespuesta);
	}
	
	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}
	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}

	public String getUsr() {
		// TODO Auto-generated method stub
		return textUsr.getText();
	}

	public String getPwd() {
		// TODO Auto-generated method stub
		return paramString().valueOf(passwordUsr.getPassword());
	}
	
	
}
