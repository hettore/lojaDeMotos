package entities;

import java.util.Scanner;

public class Loja {
	Scanner sc = new Scanner(System.in);

	public void chamarMenu() {
		System.out.println("------------------------------------------");
		System.out.println("      Bem vindo(a) a MotosMotors! ");
		System.out.println("------------------------------------------");
		System.out.println("Escolha uma opção do menu para continuar: ");
		System.out.println("Opção 1 - Simular uma compra.");
		System.out.println("Opção 2 - Mais informações.");
		System.out.println("Opção 3 - Encerrar.");
		System.out.println("------------------------------------------");
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
		System.out.println("Por favor, para mais informações entre em contato: ");
		System.out.println("          Pelo telefone: (19) 9999-9999");
		System.out.println("     Ou nosso e-mail: motosmotors@motos.com.br ");
		System.out.println("Simulando uma compra com a gente você garante");
		System.out.println("    o melhor preço do mercado!");
		System.out.println("Opção 1 Voltar");
		System.out.println("Opção 2 Encerrar");
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
		System.out.println("------------------------------------------");
		System.out.println("Hoje trabalhamos somente com a marca Honda.");
		System.out.println();
		System.out.println("Opção 1 - Veículos Honda");
		System.out.println();
		System.out.println("Opção 2 - Voltar << ");
		System.out.println("------------------------------------------");
		System.out.print("Opção desejada: ");
		int menu = sc.nextInt();

		switch (menu) {
		case 1:
			opcoesHonda();

			break;

		case 2:
			chamarMenu();

			break;

		default:
			System.out.println("Escolha uma opção válida!");
			chamarMenu();

		}

	}

	Veiculo moto1 = new Veiculo("Honda ", "CG 160 Start ", 2022, 15360.00);
	Veiculo moto2 = new Veiculo("Honda ", "CB 250 Twister ", 2022, 21670.00);
	Veiculo moto3 = new Veiculo("Honda ", "CB 500 ", 2022, 46640.00);

	Veiculo motoComSeguro = new Veiculo("moto ", "moto ", 2022, 0, 125.00, 0, 144.86, 212.60);

	int escolhaHonda;

	public void opcoesHonda() {

		System.out.println();
		System.out.println("Estes são os modelos 0Km disponíveis: ");
		System.out.println("Opção 1 - " + moto1);
		System.out.println("Opção 2 - " + moto2);
		System.out.println("Opção 3 - " + moto3);
		System.out.println("Opção 4 - Voltar << ");
		System.out.print("Opção desejada: ");

		escolhaHonda = sc.nextInt();

		switch (escolhaHonda) {
		case 1:
			System.out.println();
			System.out.println("Você esta escolhendo a moto: " + moto1);
			System.out.printf("E o valor a ser pago será: %.2f%n ", moto1.preco);

			seguro();

			System.out.println("vamos fazer a simulação com seguro S/N?");
			String comSeguro = sc.next();

			if (comSeguro.equals("s")) {

				System.out.println("Insira seu nome:  ");
				entities.Cliente.nome = sc.next();
				System.out.println();
				System.out.println("Insira seu e-mail: ");
				entities.Cliente.email = sc.next();

				System.out.println();
				System.out.println("Você recebera um extrato com todas as informações! ");
				System.out.println();
				System.out.println("---------------------A seguir----------------------");
				System.out.println();
				System.out.println("Comprador: " + Cliente.nome);
				System.out.println("E-mail: " + Cliente.email);
				System.out.printf(" Valor do veículo:     (+) R$ %.2f%n ", moto1.preco);
				System.out.printf("I.P.V.A:              (-) R$ %.2f%n ", (moto1.preco * 4 / 100));
				System.out.printf("Licenciamento:        (-) R$ %.2f%n ", motoComSeguro.licenciamento);
				System.out.printf("Documento:            (-) R$ %.2f%n ", motoComSeguro.documento);
				System.out.printf("SEGURO:               (+) R$ %.2f%n ", (moto1.preco * 1.5 / 100));
				System.out.println();
				System.out.println("-----------------------------------------------------");
				System.out.printf("Total a ser pago:             R$ %.2f%n ", (moto1.preco + (moto1.preco * 1.5 / 100)));
				agradecimento();

			} else if (comSeguro.equals("n")) {

				System.out.println("Insira seu nome: ");
				entities.Cliente.nome = sc.next();
				System.out.println();
				System.out.println("Insira seu e-mail: ");
				entities.Cliente.email = sc.next();

				System.out.println();
				System.out.println("Você recebera um extrato com todas as informações! ");
				System.out.println();
				System.out.println("---------------------A seguir----------------------");
				System.out.println();
				System.out.println(" Comprador: " + Cliente.nome);
				System.out.println(" E-mail: " + Cliente.email);
				System.out.printf(" Valor do veículo:     (+) R$ %.2f%n ", moto1.preco);
				System.out.printf("I.P.V.A:              (+) R$ %.2f%n ", (moto1.preco * 4 / 100));
				System.out.printf("Licenciamento:        (+) R$ %.2f%n ", motoComSeguro.licenciamento);
				System.out.printf("Documento:            (+) R$ %.2f%n ", motoComSeguro.documento);
				// System.out.printf("SEGURO: (+) R$ %.2f%n ", motoComSeguro.seguro);
				System.out.println();
				System.out.println("-----------------------------------------------------");
				System.out.printf("Total a ser pago:               R$ %.2f%n ", (moto1.preco + motoComSeguro.documento
						+ motoComSeguro.licenciamento + (moto1.preco * 4 / 100)));
				agradecimento();


			} else {
				System.out.println("por favor insira um valor válido");
			}

			break;

		case 2:
			System.out.println();
			System.out.println("Você esta escolhendo a moto: " + moto2);
			System.out.printf("E o valor a ser pago será: %.2f%n ", moto2.preco);

			seguro();

			System.out.println("vamos fazer a simulação com seguro S/N?");
			String comSeguro2 = sc.next();

			if (comSeguro2.equals("s")) {

				System.out.println("Insira seu nome: ");
				entities.Cliente.nome = sc.next();
				System.out.println();
				System.out.println("Insira seu e-mail: ");
				entities.Cliente.email = sc.next();

				System.out.println();
				System.out.println("Você recebera um extrato com todas as informações! ");
				System.out.println();
				System.out.println("---------------------A seguir----------------------");
				System.out.println();
				System.out.println("Comprador: " + Cliente.nome);
				System.out.println("E-mail: " + Cliente.email);
				System.out.printf(" Valor do veículo:     (+) R$ %.2f%n ", moto2.preco);
				System.out.printf("I.P.V.A:              (-) R$ %.2f%n ", (moto2.preco * 4 / 100));
				System.out.printf("Licenciamento:        (-) R$ %.2f%n ", motoComSeguro.licenciamento);
				System.out.printf("Documento:            (-) R$ %.2f%n ", motoComSeguro.documento);
				System.out.printf("SEGURO:               (+) R$ %.2f%n ", (moto2.preco * 1.5 / 100));
				System.out.println();
				System.out.println("-----------------------------------------------------");
				System.out.printf("Total a ser pago:             R$ %.2f%n ", ((moto2.preco * 1.5 / 100) + moto2.preco));
				agradecimento();


			} else if (comSeguro2.equals("n")) {

				System.out.println("Insira seu nome: ");
				entities.Cliente.nome = sc.next();
				System.out.println();
				System.out.println("Insira seu e-mail: ");
				entities.Cliente.email = sc.next();

				System.out.println();
				System.out.println("Você recebera um extrato com todas as informações! ");
				System.out.println();
				System.out.println("---------------------A seguir----------------------");
				System.out.println();
				System.out.println(" Comprador: " + Cliente.nome);
				System.out.println(" E-mail: " + Cliente.email);
				System.out.printf(" Valor do veículo:     (+) R$ %.2f%n ", moto2.preco);
				System.out.printf("I.P.V.A:              (+) R$ %.2f%n ", (moto2.preco * 4 / 100));
				System.out.printf("Licenciamento:        (+) R$ %.2f%n ", motoComSeguro.licenciamento);
				System.out.printf("Documento:            (+) R$ %.2f%n ", motoComSeguro.documento);
				// System.out.printf("SEGURO: (+) R$ %.2f%n ", motoComSeguro.seguro);
				System.out.println();
				System.out.println("-----------------------------------------------------");
				System.out.printf("Total a ser pago:               R$ %.2f%n ", (moto2.preco + motoComSeguro.documento
						+ motoComSeguro.licenciamento + (moto2.preco * 4 / 100)));
				agradecimento();


			} else {
				System.out.println("por falor insira um valor válido");
			}

			break;

		case 3:

			System.out.println();
			System.out.println("Você esta escolhendo a moto: " + moto3);
			System.out.printf("E o valor a ser pago será: %.2f%n ", moto3.preco);

			seguro();

			System.out.println("vamos fazer a simulação com seguro S/N?");
			String comSeguro3 = sc.next();

			if (comSeguro3.equals("s")) {

				System.out.println("Insira do seu nome: ");
				entities.Cliente.nome = sc.next();
				System.out.println();
				System.out.println("Insira seu e-mail: ");
				entities.Cliente.email = sc.next();

				System.out.println();
				System.out.println("Você recebera um extrato com todas as informações! ");
				System.out.println();
				System.out.println("---------------------A seguir----------------------");
				System.out.println();
				System.out.println("Comprador: " + Cliente.nome);
				System.out.println("E-mail: " + Cliente.email);
				System.out.printf(" Valor do veículo:     (+) R$ %.2f%n ", moto3.preco);
				System.out.printf("I.P.V.A:              (-) R$ %.2f%n ", (moto3.preco * 4 / 100));
				System.out.printf("Licenciamento:        (-) R$ %.2f%n ", motoComSeguro.licenciamento);
				System.out.printf("Documento:            (-) R$ %.2f%n ", motoComSeguro.documento);
				System.out.printf("SEGURO:               (+) R$ %.2f%n ", (moto3.preco * 1.5 / 100));
				System.out.println();
				System.out.println("-----------------------------------------------------");
				System.out.printf("Total a ser pago:             R$ %.2f%n ", ((moto3.preco * 1.5 / 100) + moto3.preco));
				agradecimento();

			} else if (comSeguro3.equals("n")) {

				System.out.println("Insira seu nome: ");
				entities.Cliente.nome = sc.next();
				System.out.println();
				System.out.println("Insira seu e-mail: ");
				entities.Cliente.email = sc.next();

				System.out.println();
				System.out.println("Você recebera um extrato com todas as informações! ");
				System.out.println();
				System.out.println("---------------------A seguir----------------------");
				System.out.println();
				System.out.println(" Comprador: " + Cliente.nome);
				System.out.println(" E-mail: " + Cliente.email);
				System.out.printf(" Valor do veículo:     (+) R$ %.2f%n ", moto3.preco);
				System.out.printf("I.P.V.A:              (+) R$ %.2f%n ", (moto3.preco * 4 / 100));
				System.out.printf("Licenciamento:        (+) R$ %.2f%n ", motoComSeguro.licenciamento);
				System.out.printf("Documento:            (+) R$ %.2f%n ", motoComSeguro.documento);
				// System.out.printf("SEGURO: (+) R$ %.2f%n ", motoComSeguro.seguro);
				System.out.println();
				System.out.println("-----------------------------------------------------");
				System.out.printf("Total a ser pago:               R$ %.2f%n ", (moto3.preco + motoComSeguro.documento
						+ motoComSeguro.licenciamento + (moto3.preco * 4 / 100)));
				agradecimento();

			} else {
				System.out.println("por favor insira um valor válido");

			}

			break;

		case 4:
			comprar();

			break;

		default:
			System.out.println("Escolha uma opção válida!");
			chamarMenu();

		}

	}

	public void seguro() {

		System.out.println("-------------------ATENÇÃO------------------");
		System.out.println("Hoje temos uma oferta especial!");
		System.out.println("Comprando o seguro para sua moto você");
		System.out.println("ganha IPVA, licenciamento e documento");
		System.out.println("             NA FAIXA!!!");
		System.out.println("É muito importante contratar um Seguro!");
		System.out.println("--------------------------------------------");
		System.out.println("Valor a ser pago: (taxa única anual)");
		System.out.println("Por apenas 1,5% do valor total do veículo." );
		System.out.println("--------------------------------------------");
		System.out.println("Descontos:");
		System.out.println("IPVA ");
		System.out.println("Licenciamento ");
		System.out.println("Documentação ");

	}
	
	public void agradecimento() {
		System.out.println();
		System.out.println("Parabéns pela escolha, a MotosMotors agradece a preferência.");
	}

}
