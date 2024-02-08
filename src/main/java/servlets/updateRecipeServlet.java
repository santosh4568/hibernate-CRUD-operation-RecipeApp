package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import helper.FactoryProvider;
import project.recipe;

/**
 * Servlet implementation class updateRecipeServlet
 */

@WebServlet("/updateRecipeServlet")
public class updateRecipeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateRecipeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int res_id = Integer.parseInt(request.getParameter("id"));
		String nameString = request.getParameter("naam");
		String ingredientString = request.getParameter("ingd");
		int difficulty = Integer.parseInt(request.getParameter("diff"));
		
		Session session = FactoryProvider.getFactory().openSession();

        try {
            // Begin a transaction
            session.beginTransaction();

            // Retrieve the employee with the given ID from the database
            recipe rsRecipe = session.get(recipe.class, res_id);

            // Update the employee's information
            if (rsRecipe != null) {
                rsRecipe.setDifficultylevel(difficulty);
                rsRecipe.setIngredients(ingredientString);
                rsRecipe.setRecipeName(nameString);

                // Save the updated employee to the database
                session.merge(rsRecipe);
            } else {
            	response.setContentType("text/html");
        		PrintWriter out = response.getWriter();
            	out.println("<h1 style='text-align:center;'>Recipe Not Found</h1>");
        		out.println("<h1 style='text-align:center;'><a href='displayRecipe.jsp'>View all Recipe</a></h1>");
            }

            // Commit the transaction
            session.getTransaction().commit();
        } finally {
            session.close();
        }

        // Redirect to a success page or a list of employees
        response.sendRedirect("displayRecipe.jsp");
	}

}
