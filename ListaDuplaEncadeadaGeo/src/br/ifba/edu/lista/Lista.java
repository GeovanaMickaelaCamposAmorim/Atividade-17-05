package br.ifba.edu.lista;

import javax.swing.JOptionPane;

import br.ifba.edu.basica.Celula;


public class Lista {

	private Celula cabeca;
	private Celula cauda;

	private int totalElementos = 0;

	
	public void adicionaNoComeco(Object obj) {

		Celula nova = new Celula(obj);
		
		if (totalElementos == 0) {
			this.cabeca = nova;
			this.cauda = nova;
			this.totalElementos++;
		}
		
		else {
			nova.setProxima(this.cabeca);
			this.cabeca.setAnterior(nova);
			this.cabeca = nova;
			this.totalElementos++;
		}
		

	}

	public void adicionaNoFinal(Object obj) {

		if (this.totalElementos == 0) {
			this.adicionaNoComeco(obj);
		} 
		
		else {

			Celula nova = new Celula(obj);
			this.cauda.setProxima(nova);
			nova.setAnterior(cauda);
			this.cauda = nova;
			this.totalElementos++;

		}
	}

	public String toString() {

		if (this.totalElementos == 0) {

			return "[]";
		}

		StringBuilder listaencadeada = new StringBuilder("[");
		Celula atual = this.cabeca;

		for (int i = 0; i < this.totalElementos - 1; i++) {

			listaencadeada.append(atual.getObjeto());
			listaencadeada.append(",");
			atual = atual.getProxima();
		}

		listaencadeada.append(atual.getObjeto());
		listaencadeada.append("]");

		return listaencadeada.toString();

	}

	public Boolean verificarPos(int pos) {

		return pos >= 0 && pos < this.totalElementos;
 
	}


	public void adicionaPorPosicao(int pos, Object obj) {

		if (pos == 0) {

			this.adicionaNoComeco(obj);

		} else if (pos == this.totalElementos) {

			this.adicionaNoFinal(obj);

		} else if (!this.verificarPos(pos)) {

			JOptionPane.showMessageDialog(null, "Posisao Invalida", null, JOptionPane.ERROR_MESSAGE);
			throw new IllegalArgumentException("A posisao digitada é invalida");

		} else {

			Celula aux = this.cabeca;

			for (int i = 0; i < pos - 1; i++) {

				aux = aux.getProxima();
			}

			Celula nova = new Celula(obj);
			nova.setAnterior(aux);
			nova.setProxima(aux.getProxima());
			aux.getProxima().setAnterior(nova);
			aux.setProxima(nova);
			this.totalElementos++;

		}
	}


	public void removeDoComeco() {

		Celula aux = this.cabeca;
		this.cabeca = this.cabeca.getProxima();

		aux.setProxima(null);
		this.cabeca.setAnterior(null);
		totalElementos--;

	}

	
	public void removeDoFim() {

		this.cauda = cauda.getAnterior();
		this.cauda.setProxima(null);
		
		totalElementos--;

	}

	public void removePos(int pos) {

		if (pos == 0) {

			this.removeDoComeco();

		} else if (pos == this.totalElementos) {

			this.removeDoFim();
			

		} else if (!this.verificarPos(pos)) {

		System.out.println("A posisao digitada e invalida");

		} else {
 
			Celula aux = this.cabeca;

			for (int i = 0; i < pos - 1; i++) {

				aux = aux.getProxima();

			}
			
			aux.getProxima().getProxima().setAnterior(aux);
			aux.setProxima(aux.getProxima().getProxima());
			
			
			this.totalElementos--;

		}

	}

}
