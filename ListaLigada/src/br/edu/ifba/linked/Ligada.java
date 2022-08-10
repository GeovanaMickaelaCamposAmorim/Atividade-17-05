package br.edu.ifba.linked;

import java.util.LinkedList;

import br.edu.ifba.basica.Contato;

public class Ligada {

	LinkedList<Contato> lista = new LinkedList();
	
	public void adicionarNoInicio (Contato c) {
		
		lista.addFirst(c);
		
	}
	
	public void adicionar (Contato c) {
		
		if(lista.isEmpty()) {
			this.adicionarNoInicio(c);
		}else {
			lista.addLast(c);
		}
	}
	
	public boolean verificarPosicao (int pos) {
		return pos >= 0 || pos < lista.size(); 
	}
	
	public void adicionarPorPosição (int pos, Contato c){
		
		if (!this.verificarPosicao(pos)) {
			System.out.println("Nada haver isso que tu escreveu");}
		
		else if(lista.isEmpty()) { 
			this.adicionarNoInicio(c);}
		
		else {lista.add(pos, c);}
	}
	
	public void remover() {
		if (lista.isEmpty()) {
			System.out.println("lista vazia!");
		}else{
			System.out.println("elemento removido" + lista.removeFirst());
		}
	}
		public void removerDoFim() {
				lista.removeLast();
			}
		
		public void removerPorPosicao(int pos) {
			
			if (!this.verificarPosicao(pos)) {
				System.out.println("Nada haver isso que tu escreveu");}
			 
			else{
				lista.remove(pos);
				}
		}
			public void imprimir () {
				System.out.println(lista.toString());
			}
	}