package model;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class Produto implements HttpSessionBindingListener {

	private String nome;
	
	public String getNome() {
		return nome;
	}

	@Override
	public void valueBound(HttpSessionBindingEvent e) { 
		
		this.nome = e.getName();
	
	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent e) {
		
		this.nome = null;
	}
	
}
/*
 * // Toda vez que colocar o  produto na sessao, o conteiner -> vai verificar se a classe que foi colocado na sessao implementa a
 *  interface HttpSEssionBindingListener, caso positivo, o conteiner vai chamar o valueBound ou valueUNbound, passando como parametro o 
 *  HttpSessionEvent.
 */
