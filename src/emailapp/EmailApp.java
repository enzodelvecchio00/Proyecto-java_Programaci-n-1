package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		Email em1 = new Email("Lionel","Messi");
		
		//em1.setCorreoAlternativo("ejemplogmail.com");
		//System.out.print(em1.getCorreoAlternativo());
		
		em1.MostrarInfo();
		System.out.print(em1.MostrarInfo());



        // Cambiar la contraseña
        //String nuevaContraseña = "NuevaContraseña123";
        //em1.CambiarContraseña(nuevaContraseña);

        // Mostrar información después de cambiar la contraseña
        //System.out.println("\nInformación después de cambiar la contraseña:");
        //System.out.println(em1.MostrarInfo());
		//em1.MostrarContra();
		//System.out.print(em1.MostrarContra());
    }
	
	
}
	

