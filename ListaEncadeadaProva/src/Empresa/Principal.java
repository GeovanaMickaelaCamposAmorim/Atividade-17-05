package Empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		int x = 0;

		try (Scanner i = new Scanner(System.in)) {
			ListaSimples lista = new ListaSimples();

			while (x < 10) {
				System.out.println(
						"Escolha uma opção: 1-Adicionar no Inicio/ 2-adicionar no Fim/  3- adicionar por Posicao/ 4-Remover no Fim/ 5-Remover por Posicao/ 6-Remover no Inicio/ 7- Sair");
				x = i.nextInt();

				if (x == 1) {
					Funcionario fun = new Funcionario(); 
					
					System.out.println("Adicionar Informações");

					System.out.print("\nDigite o nome do funcionário: ");
					fun.setNome(i.next());
					System.out.print("Digite o RG do funcionário: ");
					fun.setRg(i.nextInt());
					System.out.print("Digite o CPF do funcionário: ");
					fun.setCpf(i.nextInt());
					System.out.print("Digite a idade do funcionário: ");
					fun.setIdade(i.nextInt());

					lista.adicionaNoInicio(fun);

					System.out.println(lista.toString());

				}

				if (x == 2) {

					Funcionario fun1 = new Funcionario(); 
					
					System.out.println("Adicionar Informações");

					System.out.print("\nDigite o nome do funcionário: ");
					fun1.setNome(i.next());
					System.out.print("Digite o RG do funcionário: ");
					fun1.setRg(i.nextInt());
					System.out.print("Digite o CPF do funcionário: ");
					fun1.setCpf(i.nextInt());
					System.out.print("Digite a idade do funcionário: ");
					fun1.setIdade(i.nextInt());

					lista.adicionaNoFim(fun1);

					System.out.println(lista.toString());

				}

				if (x == 3) {

					Funcionario fun2 = new Funcionario();  
					
					System.out.println("Adicionar Informações");

					System.out.println("Digite a Posição Desejada");
					int posicao = i.nextInt();

					System.out.print("\nDigite o nome do funcionário: ");
					fun2.setNome(i.next());
					System.out.print("Digite o RG do funcionário: ");
					fun2.setRg(i.nextInt());
					System.out.print("Digite o CPF do funcionário: ");
					fun2.setCpf(i.nextInt());
					System.out.print("Digite a idade do funcionário: ");
					fun2.setIdade(i.nextInt());

					lista.adicionaPorPosicao(posicao, fun2);

					System.out.println(lista.toString());
				}

				if (x == 4) {
					System.out.println("Posição removida no fim ");

					lista.removeDoFim();
					System.out.println(lista.toString());
				}

				if (x == 5) {

					System.out.println("Digite a Posição Desejada");
					int posicao = i.nextInt();

					lista.removePorPorsicao(posicao);
					System.out.println(lista.toString());
				}

				if (x == 6) {
					System.out.println("Posição removida no inicio");
					lista.removerDoInicio();
					System.out.println(lista.toString());
				}

				if (x == 7) {
					System.out.println("Tchauzinho");
				break;	
				}
			}
		}
	}
}
