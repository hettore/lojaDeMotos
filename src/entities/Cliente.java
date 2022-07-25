package entities;

import java.util.Scanner;

public class Cliente {
	
	public static String nome;
	public static String email;
	
	public Cliente(String nome, String email) {
		Cliente.nome = nome;
		Cliente.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		Cliente.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		Cliente.email = email;
	}
	

		//Cliente cliente1 = new Cliente(sc.nextLine(), sc.nextLine());
	
	//sc.close();

}
