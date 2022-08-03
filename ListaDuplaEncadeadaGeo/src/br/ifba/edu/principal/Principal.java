package br.ifba.edu.principal;



import br.ifba.edu.lista.Lista;

public class Principal {

	public static void main(String[] args) {

		Lista lista = new Lista();


		lista.adicionaNoComeco("Igor");
		lista.adicionaNoComeco("Geo");
		lista.adicionaNoComeco("Fulano");
		lista.adicionaNoComeco("Sicrano");
		lista.adicionaNoComeco("Beltrano");
		lista.adicionaNoComeco("tal");
		lista.adicionaNoComeco("Libilly");
		
		System.out.println(lista.toString());


		lista.adicionaNoFinal("Geovana");
		lista.adicionaNoFinal("Amorim");
		System.out.println(lista.toString());
		

		lista.adicionaPorPosicao(2, "teste");
		System.out.println(lista.toString());

		lista.removeDoComeco();
		System.out.println(lista.toString());

		lista.removeDoFim();
		System.out.println(lista.toString());

		lista.removePos(1);
		System.out.println(lista.toString());

	}
}
