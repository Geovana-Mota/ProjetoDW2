<%-- 
    Document   : Home
    Created on : 18/05/2018, 11:06:13
    Author     : a1711989
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.98.0/css/materialize.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DABIC</title>

        <!-- Bootstrap core CSS -->
        <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom fonts for this template -->
        <link href="https://fonts.googleapis.com/css?family=Saira+Extra+Condensed:100,200,300,400,500,600,700,800,900" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i" rel="stylesheet">
        <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet">
        <link href="vendor/devicons/css/devicons.min.css" rel="stylesheet">
        <link href="vendor/simple-line-icons/css/simple-line-icons.css" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="css/resume.min.css" rel="stylesheet">

    </head>

    <body>
        <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Cadastro de Alunos</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Preencha dos campos abaixo
                        </div>
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-lg-6">
                                    <form role="form" action="${pageContext.request.contextPath}/alunoLista">
                                        <div class="form-group">
                                            <label>Digite o RA do(a) Aluno(a): </label>
                                            <input class="form-control" name="idAluno">
                                        </div>
                                        <div class="form-group">
                                            <label>Digite o nome do(a) Aluno(a): </label>
                                            <input class="form-control" name="nomeAluno" >
                                        </div>
                                        <div class="form-group">
<!--                                            <label>Digite a área de estudo do(a) Aluno(a): </label>
                                            <input class="form-control" name="area" >-->
                                            <label> Selecione a áreade estudo:</label>
                                            <p>
                                                <input type="checkbox" name="area"
                                                       value="Molecular" />Molecular <input type="checkbox" name="area"
                                                       value="Florestal" />Florestal <input type="checkbox" name="area"
                                                       value="Zoologia"checked="checked"/>Zoologia <input type="checkbox" name="area"
                                                       value="Herbário" />Herbário </p>
                                        </div>

                                        <button type="submit" class="btn btn-default" name="ok">Salvar</button>
                                        <button type="reset" class="btn btn-default" name="no">Apagar</button>
                                    </form>
                                </div>
                            </div>
                            <!-- /.col-lg-6 (nested) -->
                        </div>
                        <!-- /.row (nested) -->
                    </div>
                    <!-- /.panel-body -->
                </div>
                <!-- /.panel -->
            </div>
            <!-- /.col-lg-12 -->
        </div>
        <!-- /.row -->

        <!-- Bootstrap core JavaScript -->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

        <!-- Plugin JavaScript -->
        <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

        <!-- Custom scripts for this template -->
        <script src="js/resume.min.js"></script>

    </body>

</html>