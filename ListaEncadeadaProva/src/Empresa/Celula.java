package Empresa;

public class Celula {
	private Celula proxima;
	private Object objeto;

	public Celula() {

	}

	public Celula(Celula proxima, Object object) {
		super();
		this.proxima = proxima;
		this.objeto = object;
	}

	public Celula(Object objeto) {
		this.objeto = objeto;
	}

	public Celula getProxima() {
		return proxima;
	}

	public void setProxima(Celula proxima) {
		this.proxima = proxima;
	}

	public Object getObjeto() {
		return objeto;
	}

	public void setObjeto(Object objeto) {
		this.objeto = objeto;
	}

}
