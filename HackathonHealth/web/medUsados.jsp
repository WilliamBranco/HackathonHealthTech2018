<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Medicamentos Usados</title>
        <link href="css/main.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="css/bootstrap.min.css">
    </head>
    <body>
        <div class="container">
        
            <jsp:useBean id="medicamento" class="org.modelos.Medicamento" scope="request"/>
            
            <h1>Medicamentos Usados</h1>
            
            <form action="CadastrarMedicamento" method="post">

                <select class="form-control" id="sexo">
                    <c:forEach var="medicamento" items="${medicamentos}">
                    <option>${medicamento.nome}</option>
                </select>
                
                <div class="form-group">
                    <button type="submit" class="btn btn-primary">Inserir</button>
                </div>
               
                <h3>Lista de Medicamentos Usados </h3>

                <table class="table table-striped">
                    <tr>
                        <th>Nome</th>
                        <th>Classe</th>
                        <th>Principio Ativo</th>
                        <th>Descricao</th>

                    <tr>
                       <c:forEach var="medicamento" items="${medicamentos}">
                    <tr>
                        <td>${medicamento.nome} </td>
                        <td>${medicamento.classe} </td>
                        <td>${medicamento.principioativo} </td>
                        <td>${medicamento.descricao} </td>
                    </tr>
                </c:forEach>
                </table>
                
                <div class="form-group">
                    <button type="submit" class="btn btn-primary">Proseguir</button>
                </div>
            </form>
        </div>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>
