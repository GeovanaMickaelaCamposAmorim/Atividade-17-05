package Empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		int x = 0;

		try (Scanner i = new Scanner(System.in)) {
			ListaSimples lista = new ListaSimples();

			while (x < 10) {
				System.out.println(
						"Escolha uma op��o: 1-Adicionar no Inicio/ 2-adicionar no Fim/  3- adicionar por Posicao/ 4-Remover no Fim/ 5-Remover por Posicao/ 6-Remover no Inicio/ 7- Sair");
				x = i.nextInt();

				if (x == 1) {
					Funcionario fun = new Funcionario(); 
					
					System.out.println("Adicionar Informa��es");

					System.out.print("\nDigite o nome do funcion�rio: ");
					fun.setNome(i.next());
					System.out.print("Digite o RG do funcion�rio: ");
					fun.setRg(i.nextInt());
					System.out.print("Digite o CPF do funcion�rio: ");
					fun.setCpf(i.nextInt());
					System.out.print("Digite a idade do funcion�rio: ");
					fun.setIdade(i.nextInt());

					lista.adicionaNoInicio(fun);

					System.out.println(lista.toString());

				}

				if (x == 2) {

					Funcionario fun1 = new Funcionario(); 
					
					System.out.println("Adicionar Informa��es");

					System.out.print("\nDigite o nome do funcion�rio: ");
					fun1.setNome(i.next());
					System.out.print("Digite o RG do funcion�rio: ");
					fun1.setRg(i.nextInt());
					System.out.print("Digite o CPF do funcion�rio: ");
					fun1.setCpf(i.nextInt());
					System.out.print("Digite a idade do funcion�rio: ");
					fun1.setIdade(i.nextInt());

					lista.adicionaNoFim(fun1);

					System.out.println(lista.toString());

				}

				if (x == 3) {

					Funcionario fun2 = new Funcionario();  
					
					System.out.println("Adicionar Informa��es");

					System.out.println("Digite a Posi��o Desejada");
					int posicao = i.nextInt();

					System.out.print("\nDigite o nome do funcion�rio: ");
					fun2.setNome(i.next());
					System.out.print("Digite o RG do funcion�rio: ");
					fun2.setRg(i.nextInt());
					System.out.print("Digite o CPF do funcion�rio: ");
					fun2.setCpf(i.nextInt());
					System.out.print("Digite a idade do funcion�rio: ");
					fun2.setIdade(i.nextInt());

					lista.adicionaPorPosicao(posicao, fun2);

					System.out.println(lista.toString());
				}

				if (x == 4) {
					System.out.println("Posi��o removida no fim ");

					lista.removeDoFim();
					System.out.println(lista.toString());
				}

				if (x == 5) {

					System.out.println("Digite a Posi��o Desejada");
					int posicao = i.nextInt();

					lista.removePorPorsicao(posicao);
					System.out.println(lista.toString());
				}

				if (x == 6) {
					System.out.println("Posi��o removida no inicio");
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
