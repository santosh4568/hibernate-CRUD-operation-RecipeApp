<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Resturant</title>
    <style>
    body{
    		background-image : url("images/index.jpg");
    }
        h1{
            text-align: center;
        }
        .oper{
            display: flex;
            justify-content:space-around;
        }
        a{
            font-size: larger;
            color:lightskyblue;
            background-color:black
        }
        a:hover{
            background-color:gold;
            color: green;
        }
        h1{
            animation: h_animinate 5s alternate-reverse 0s infinite;
        }
        @keyframes h_animinate{
            0%{
                color: red;
            }
            25%{
                color: blue;
            }
            75%{
                color: green;
            }
            100%{
                color: orangered;
            }
        }
    </style>
</head>
<body>
    <marquee behavior="alternate" direction="right"><h1>!!! <u>WELCOME</u> !!!</h1></marquee>
    <div class="oper">
        <a href="createRecipe.jsp"><b>Create Recipe</b></a>
        <a href="deleteRecipe.jsp"><b>Delete Recipe</b></a>
        <a href="updateRecipe.jsp"><b>Update Recipe</b></a>
        <a href="displayRecipe.jsp"><b>Show Recipe</b></a>
    </div>
</body>
</html>
