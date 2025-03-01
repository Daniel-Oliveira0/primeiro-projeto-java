// localização da classe
package repositories;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.swing.JScrollBar;

import org.json.simple.JSONObject;

import entities.Cliente;

// definição da classe
public class ClienteRepository {

	//método para exportar os dados do cliente para um arquivo .txt
	public void exportarTxt(Cliente cliente) {
		
		try {
			//abrindo um arquivo em modo de escrita
			PrintWriter printWriter = new PrintWriter(new FileOutputStream(("c:\\temp\\clientes.txt"), true));
			
			//escrevendo os dados do cliente no arquivo
			printWriter.write("\nID DO CLIENTE....: " + cliente.getIdCliente());
			printWriter.write("\nNOME DO CLIENTE....: " + cliente.getNome());
			printWriter.write("\nCPF DO CLIENTE....: " + cliente.getCpf());
			printWriter.write("\nEMAIL DO CLIENTE....: " + cliente.getEmail());
			printWriter.write("..." );

			//salvar e fechar o arquivo
			printWriter.flush();
			printWriter.close();
			
			System.out.println("\nDados gravados com sucesso!\n");
		}
		
		catch(Exception e) { //captura do erro
			System.out.println("/nOcorreu um erro: " + e.getMessage());
		}
	}
	
	//método para exportar os dados do cliente para um arquivo .txt
	public void exportarJson(Cliente cliente) {
		
		try {
			PrintWriter printWriter = new PrintWriter(new FileOutputStream(new File("c:/temp//clientes.json")), true);
			
			HashMap<String, Object> mapa = new HashMap<String, Object>();
			mapa.put("idCliente", cliente.getIdCliente());
			mapa.put("nome", cliente.getNome());
			mapa.put("cpf", cliente.getCpf());
			mapa.put("email", cliente.getEmail());

			JSONObject json = new JSONObject(mapa);
			
			printWriter.write(json.toJSONString());
			printWriter.write("\n");
			
			printWriter.flush();
			printWriter.close();
			
			System.out.println("\nDados gravados com sucesso!\n");
		}catch(Exception e) {
			System.out.println("\nOcorreu um erro: " + e.getMessage());
		}
	}
}
















