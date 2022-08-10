package br.edu.ifba.principal;

import br.edu.ifba.basica.Contato;
import br.edu.ifba.linked.Ligada;

public class Principal {
	
	public static void main(String[] args) {

		Ligada lista = new Ligada();
		Contato c = new Contato("fulano", "123456");
		Contato c1 = new Contato("sicrano", "14586");
		Contato c2 = new Contato("beltrano", "23789");
		Contato c3 = new Contato("de tal", "23789");
		
		lista.adicionar(c);
		lista.imprimir();
		lista.adicionarNoInicio(c1);
		lista.imprimir();
		lista.adicionar(c2);
		lista.imprimir();
		lista.adicionarPorPosição(1, c3);
		lista.imprimir();
		lista.remover();
		lista.imprimir();
		lista.removerPorPosicao(1);
		lista.imprimir();
		
		

	}

}
