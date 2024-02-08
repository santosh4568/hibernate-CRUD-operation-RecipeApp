package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import helper.FactoryProvider;
import project.recipe;


@WebServlet("/createRecipeServlet")
public class createRecipeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public createRecipeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int res_id = Integer.parseInt(request.getParameter("id"));
		String nameString = request.getParameter("naam");
		String ingreString = request.getParameter("ingd");
		int difficulty = Integer.parseInt(request.getParameter("diff"));
		recipe rsRecipe = new recipe();
		rsRecipe.setRecipeId(res_id);
		rsRecipe.setRecipeName(nameString);
		rsRecipe.setIngredients(ingreString);
		rsRecipe.setDifficultylevel(difficulty);
		
		Session session = FactoryProvider.getFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.persist(rsRecipe);
		tx.commit();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1 style='text-align:center; color : green ;'>Recipe is added successfully</h1>");
		out.println("<h1 style='text-align:center;'><a href='displayRecipe.jsp'>View all Recipe</a></h1>");
	}

}
