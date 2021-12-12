package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Produto;

/**
 * Servlet  quando invocado vai criar um produto e vai colocar o produto na sessao.
 *  - session.setAttribute("p1", p);  estou colocando na sessao, o Produto p q  acabei de criar com o nome de "p1", usado para associar o produto a sessao
 	
 	No momento, que o metodo setAtribbute for executado : 
 	 - O conteiner irá invocar a inteface listener -> metodo valueBound
 	 - O metodo vai associar o valor do produto(p) ao valor que está associado na sessão(p1)
 */
@WebServlet("/TesteServlet")
public class TesteServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		Produto p = new Produto();
		session.setAttribute("p1", p); 
		String nomeProduto = p.getNome();
		System.out.println(nomeProduto);
	}
}
