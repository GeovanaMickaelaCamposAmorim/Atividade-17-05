package br.ifba.edu.principal;

import br.ifba.edu.lista.Lista;

public class Principal {

	public static void main(String[] args) {
		
	  Lista lista = new Lista();
	  
	  
	  lista.adicinaNoComeco("Geovana");
	  lista.adicinaNoComeco("Libilly");
	  lista.adicinaNoComeco("Jayne");
	  lista.adicinaNoComeco("Maria");
	  lista.adicinaNoComeco("Mayan");
	  lista.adicinaNoComeco("Elisangela");
	  lista.adicinaNoComeco("Givaldo");
	  
	  System.out.println(lista.toString());
	  
	  lista.adicionarFinal("Jo�o");
	  lista.adicionarFinal("Larissa");
	  lista.adicionarFinal("moon");
	  
	  System.out.println(lista.toString());
	  
	  lista.adicionarPosicao(50, "Celine");
	  System.out.println(lista.toString());
	  
	  lista.removerDoComeco();
	  System.out.println(lista.toString());
	  
	  lista.removerDoFim();
	  System.out.println(lista.toString());
	  
	  lista.removerPorPosicao(2);
	  System.out.println(lista.toString());
	  
	}
}
