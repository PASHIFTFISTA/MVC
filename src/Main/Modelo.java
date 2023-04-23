package Main;

public class Modelo {
	private Modelo miModelo;
	private Vista miVista;
	private final String usr;
	private final String pwd;
	private String resultado;
	private int fallos;
	
	
	public Modelo () {
		this.usr = "Pedro";
		this.pwd = "Camacho";
	}
	
	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}

	public void setVista(Vista miVista) {
		this.miVista = miVista;
	}

	public void login(String usr2, String pwd2) {
		// TODO Auto-generated method stub
		if (this.usr.equals(pwd2)&&this.pwd.equals(pwd2)) {
			resultado = "Correcto";
			fallos = 0;
		} else {
			fallos++;
			if (fallos==3) {
				resultado = "Cerrar";
			} else {
				resultado = "Incorrecto";
			}
		}
	}
	
	
}
