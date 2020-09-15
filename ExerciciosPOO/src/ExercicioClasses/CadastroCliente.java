package ExercicioClasses;

public class CadastroCliente {
	public static void main(String args[]) {
		//Instanciando o objeto
		Cliente cliente1= new Cliente ("Franco", 12345678, "Débito Automático", "Super Master Blaster");
		Cliente cliente2= new Cliente ("Weslley", 87654321, "Boleto", "Master Black");
		
		//Mostrar info dos clientes
		cliente1.mostrarCadastro();
		System.out.println();
		cliente2.mostrarCadastro();
		System.out.println();
		System.out.println("..:: Troca de plano ::..\n");
		cliente1.mudarPlano("Economy");
		cliente1.mostrarCadastro();
		
	}
}
