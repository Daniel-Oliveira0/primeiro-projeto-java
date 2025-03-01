// define o pacote onde a clase está localizada
package principal;

import entities.Cliente;
import repositories.ClienteRepository;

// definição da classe
// public é obrigatório => define a visibilidade da classe
public class Program {
	
	// método 'main' (função) pra executar o projeto
	public static void main(String[] args) {

		// imprimir mensagem
		System.out.println("Hello, word");
		
	 // [classe] [objeto]  [Inicialização] 
		Cliente cliente = new Cliente();
		
		cliente.setIdCliente(1);
		cliente.setNome("Daniel Vinicius");
		cliente.setCpf("123.456.789-00");
		cliente.setEmail("danielvn@gmail.com");
		
		System.out.println("\nDADOS DO CLIENTE\n");
		System.out.println("\nId do cliente: " + cliente.getIdCliente());
		System.out.println("\nNOME: " + cliente.getNome());
		System.out.println("\nCPF DO CLIENTE: " + cliente.getCpf());
		System.out.println("\nEMAIL DO CLIENTE: " + cliente.getEmail());
		
		// [classe]           [objeto]              [Inicialização]
		ClienteRepository clienteRepository = new ClienteRepository();
		clienteRepository.exportarTxt(cliente);
	}

}
