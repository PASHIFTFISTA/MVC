package Main;

public class Controlador {

	private Modelo miModelo;
	private Vista miVista;
	
	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}

	public void setVista(Vista miVista) {
		this.miVista = miVista;
	}


	public void login() {
		// TODO Auto-generated method stub
		String usr = miVista.getUsr();
		String pwd = miVista.getPwd();
		miModelo.login(usr,pwd);
	}
}
