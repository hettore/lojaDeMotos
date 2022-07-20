package entities;

import java.util.Scanner;

public class Loja {
	Scanner sc = new Scanner(System.in);

	public void chamarMenu() {
		System.out.println("------------------------------------------");
		System.out.println("Bem vindo(a) a loja de motos! ");
		System.out.println("Escolha uma opção do menu para continuar: ");
		System.out.println("Opção 1 para COMPRAR!");
		System.out.println("Opção 2 para Mais informações!");
		System.out.println("Opção 3 para Encerrar.");
		System.out.print("Opção desejada: ");
		int escolha = sc.nextInt();

		switch (escolha) {
		case 1:
			comprar();

			break;

		case 2:
			telefone();

			break;

		case 3:
			terminar();

			break;

		default:
			System.out.println("Escolha uma opção válida!");
			chamarMenu();

		}

	}

	public void telefone() {
		System.out.println();
		System.out.println("Por favor para mais informações entre em contato: ");
		System.out.println("Pelo telefone - 19 9999-9999");
		System.out.println("Ou nosso e-mail: ");
		System.out.println("motosmotors@motos.com.br");
		System.out.println("Opção 1 voltar");
		System.out.println("Opção 2 Encerrar.");
		System.out.print("Opção desejada: ");

		int escolha2 = sc.nextInt();

		switch (escolha2) {
		case 1:
			chamarMenu();

			break;

		case 2:
			terminar();

			break;

		default:
			System.out.println("Escolha uma opção válida!");
			telefone();

		}

	}

	public void terminar() {
		System.out.println("OBRIGADO POR USAR O APP.");

	}

	public void comprar() {
		System.out.println();
		System.out.println("Hoje trabalhamos com as marcas a seguir: ");
		System.out.println("Opção 1 - Para Honda");
		System.out.println("Opção 2 - Para Yamaha");
		System.out.println("Opção 3 - Para Harley Davidson");
		System.out.println("Opção 4 - Para Suzuki");
		System.out.println("Opção 5 - Voltar << ");
		System.out.print("Opção desejada: ");
		int menu = sc.nextInt();

		switch (menu) {
		case 1:
			opcoesHonda();

			break;

		case 2:
			opcoesYamaha();

			break;

		case 3:
			opcoesHarleyDavidson();

			break;

		case 4:
			opcoesSuzuki();

			break;

		case 5:
			chamarMenu();

			break;

		default:
			System.out.println("Escolha uma opção válida!");
			chamarMenu();

		}

	}

	public void opcoesHonda() {
		Veiculo moto1 = new Veiculo("Honda ", "CG 160 Start  ", 2022, 15360.00);
		Veiculo moto2 = new Veiculo("Honda ", "CB 250 Twister  ", 2022, 21670.00);
		Veiculo moto3 = new Veiculo("Honda ", "Cb 500  ", 2022, 46640.00);
		System.out.println();
		System.out.println("Estes são os modelos disponíveis: ");
		System.out.println("Opção 1 - " + moto1);
		System.out.println("Opção 2 - " + moto2);
		System.out.println("Opção 3 - " + moto3);

	}

	public void opcoesYamaha() {

	}

	public void opcoesHarleyDavidson() {

	}

	public void opcoesSuzuki() {

	}

	public void efetuarCompra() {

	}

}
