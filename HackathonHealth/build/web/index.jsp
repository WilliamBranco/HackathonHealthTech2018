<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
   <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Início</title>
        <link rel="stylesheet" href="css/bootstrap.min.css">
    </head>
    <body>
        <div class="container">

            <h1>Seus Dados: </h1>

            <form action="Cadastrar" method="post" class="form-login">
                <div class="form-group">
                    <label for="nome">Nome</label>
                    <input class="form-control" id="nome" name="nome" type="text"></input>
                </div>
                <div class="form-group">
                    <label for="idade">Idade</label>
                    <input class="form-control" id="idade" name="idade" type="number"></input>
                </div>
                <div class="form-group">
                    <label for="sexo">Sexo</label>
                    <select class="form-control" id="sexo">
                        <option> Masculino </option>
                        <option> Feminino </option>
                    </select>    
                </div>    
                <div class="form-group">
                    <button type="submit" class="btn btn-primary">Seguinte</button>
                </div>
            </form>
        </div>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>
