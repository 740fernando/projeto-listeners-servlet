package listener;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/*
 *   ServletRequestListener - Possui 2 metodos
 *   
 *   Toda vez que a request for iniciada, o conteiner ir� chamar o objeto MyListener- invocando o m�todo requestInitizialized
 *   Toda vez que a request for destruida, o conteiner ir� chamar o objeto MyListener- invocando o m�todo requestInitizialized
 *   
 *   Parametro do m�todos � um objeto ServletRequestEvent -> 

 */
public class MyListener implements ServletRequestListener {

	@Override
	public void requestDestroyed(ServletRequestEvent e) {
		System.out.println("Request destruida");
	}

	@Override
	public void requestInitialized(ServletRequestEvent e) {
		
		ServletRequest request = e.getServletRequest();
		request.setAttribute("user","1234");
		System.out.println("Request inicializada!");
	}

}
