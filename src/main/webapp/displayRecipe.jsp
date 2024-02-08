<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="java.util.List" %>
<%@ page import="org.hibernate.SessionFactory" %>
<%@ page import="org.hibernate.Session" %>
<%@ page import="project.recipe" %>
<%@ page import="helper.FactoryProvider" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Display Recipe</title>
    <style>
        h1{
            text-align: center;
        }
        tr,td{
            border: 2px solid;
        }
        table{
            text-align: center;
            margin-left: 30%;
            width: 50%;
            border: 2px solid;
        }
        a{
            margin-left: 50%;
        }
    </style>
</head>
<body>
    <h1><u>RECIPE'S LIST</u></h1>
    <table>
        <tr>
            <td><b>Recipe's ID</b></td>
            <td><b>Recipe's Name</b></td>
            <td><b>Recipe's Ingredient</b></td>
            <td><b>Recipe's Difficulty Level</b></td>
        </tr>
         <% 
   
            Session session2 = FactoryProvider.getFactory().openSession();
            
            try {
                session2.beginTransaction();
                List<recipe> rsRecipes = session2.createQuery("from recipe").getResultList();
                
                for (recipe recipe_var : rsRecipes) {
        %>
                <tr>
                    <td><%= recipe_var.getRecipeId() %></td>
                    <td><%= recipe_var.getRecipeName() %></td>
                    <td><%= recipe_var.getIngredients() %></td>
                    <td><%= recipe_var.getDifficultylevel() %></td>
                </tr>
        <%
                }
                session2.getTransaction().commit();
            } finally {
            	session2.close();
            }
        %>
        
    </table>
    <a href="index.jsp">HOME</a>
</body>
</html>