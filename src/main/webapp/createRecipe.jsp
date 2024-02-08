<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Create Recipe</title>
    <style>
        h1{
            text-align: center;
        }
        #btn{
            background-color: green;
            width: auto;
        }
        form{
            text-align: center;
        }
        input{
            margin: 5px;
            height: 25px;
            width: 300px;
        }
    </style>
</head>
<body>
    <h1><u>Recipe's Details</u></h1>
    <form action="createRecipeServlet" method="post">
    <input type="number" name="id" placeholder="Enter RecipeID"><br>
    <input type="text" name="naam" placeholder="Enter Recipe Name"><br>
    <input type="text" name="ingd" placeholder="Enter Recipe Ingredients"><br>
    <input type="number" name="diff" placeholder="Rate Difficulty Level"><br>
    <input type="submit" value="Create Recipe" id="btn">
    </form>
</body>
</html>