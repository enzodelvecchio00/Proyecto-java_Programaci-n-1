package emailapp;

import java.util.Scanner;

public class Email {

	private String PrimerNombre;
	private String Apellido;
	private String Contraseña;
	private String Departamento;
	private int CapacidadMailBox = 500;
	private int ContraseñaDefaultLength = 8;
	private String Correo;
	private String CorreoAlternativo;
	private String EmpresaSufijo = "aeyempresa.com";
	
	//Constructor que recibe primer y Apellido
	public Email (String PrimerNombre,String Apellido) {
		this.PrimerNombre = PrimerNombre;
		this.Apellido = Apellido;
		
		//Llamar al metodo que pregunte por el departamento y me devuelva el valor de departamento
		this.Departamento = setDepartamento();
		//Llamar al metodo que regresa una contraseña al azar
		this.Contraseña = ContraseñaRandom(ContraseñaDefaultLength);
		System.out.print("Tu contraseña es: " + this.Contraseña + "\n" );
		//Combinar elementos para generar un email
		Correo = PrimerNombre.toLowerCase() + "." + Apellido.toLowerCase() + "@" + Departamento.toLowerCase() + "." + EmpresaSufijo.toLowerCase();
		
		
	}
	//Preguntar por el departamento 
	private String setDepartamento() {
		System.out.print("Nuevo empleado: " + PrimerNombre + " " + Apellido + " \nIntroduce el departamento\n 1_Ventas.\n 2_Administracion.\n 3_Desarrollo.\n 0_Ninguno.\nIngrese el codigo del departamento:  ");
		Scanner in = new Scanner(System.in);
		int DepOpcion = in.nextInt();
		if (DepOpcion == 1) {
			return "Ventas"  + "\n";
		}else if(DepOpcion == 2) {
			return("Administracion"  + "\n");
		}else if(DepOpcion == 3) {
			return("Desarrollo"  + "\n");
		}else {
			return "";
		}
		
		
		
	}
	
	
	//Generar una contraseña al azar
	private String ContraseñaRandom(int length) {
		
		String ContraseñaSet = ("ABCDEFGHIJKLMNÑOPQRSTUVWXYZ0123456789!@#$");
		char contraseña[] = new char[length];
		for (int i=0; i<length; i++) {
			int RandomNum = (int) (Math.random() * ContraseñaSet.length());
			contraseña[i] = ContraseñaSet.charAt(RandomNum);
		}
		return new String(contraseña);
	}
	
	
	//Asignamos la capacidad del mailbox
	public void setCapacidadMailBox(int capacidad) {
		this.CapacidadMailBox = capacidad;
	}
	
	//Asignar el correo alternativo
	public void setCorreoAlternativo(String CorreoAlt) {
		this.CorreoAlternativo = CorreoAlt;
	}
	
	//Cambiar la contraseña
	public void CambiarContraseña(String contraseña) {
		this.Contraseña = contraseña;
	}
	//
	
	public int getCapacidadMailBox() {return CapacidadMailBox; }
	public String getCorreoAlternativo() {return CorreoAlternativo + "\n";}
	public String getContraseña() {return Contraseña; }
	
	public String MostrarInfo() {
		return "Nombre: " + PrimerNombre + "\nApellido: " + Apellido + "\nCorreo de la compañia: " + Correo + "\nCapacidad del MailBox: " + CapacidadMailBox + "mb";
	}
	public String MostrarContra() {
		return "\nContraseña: " + Contraseña + "\n";
	}
	
}
