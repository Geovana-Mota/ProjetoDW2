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

        <nav class="navbar navbar-expand-lg navbar-dark bg-primary fixed-top" id="sideNav">
            <a class="navbar-brand js-scroll-trigger" href="#page-top">
                <span class="d-block d-lg-none">DABIC</span>
                <span class="d-none d-lg-block">
                    <img class="img-fluid img-profile rounded-circle mx-auto mb-2" src="img/profile.jpeg" alt="">
                </span>
            </a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link js-scroll-trigger" href="#about"> Início </a>
                    </li>
                    <li>
                        <a class="nav-link js-scroll-trigger" href="${pageContext.request.contextPath}/Paginas/aluno.jsp" target="frame">Cadastro de Alunos</a>
                    </li>
                    <li>
                        <a class="nav-link js-scroll-trigger" href="${pageContext.request.contextPath}/Paginas/professor.jsp" target="frame"> Cadastro de Professor </a>
                    </li>
                    <li>
                        <a class="nav-link js-scroll-trigger" href="${pageContext.request.contextPath}/Paginas/laboratorio.jsp" target="frame"> Cadastro de Laboratório </a>
                    </li>
                    <li>
                        <a class="nav-link js-scroll-trigger" href="${pageContext.request.contextPath}/Paginas/alunoLista.jsp" target="frame"> Lista de Alunos </a>
                    </li>
                    <li>
                        <a class="nav-link js-scroll-trigger" href="${pageContext.request.contextPath}/Paginas/professorLista.jsp" target="frame"> Lista de Professores </a>
                    </li>
                    <li>
                        <a class="nav-link js-scroll-trigger" href="${pageContext.request.contextPath}/Paginas/laboratorioLista.jsp" target="frame"> Lista dos Laboratório </a>
                    </li>
                </ul>
            </div>
        </nav>

        <div class="container-fluid p-0" id="page-top">

            <section class="resume-section p-3 p-lg-5 d-flex d-column" id="about">
                <div class="my-auto">
                    <h1 class="mb-0">Departamento de Acadêmico de
                        <span class="text-primary">Biodiversidade e Conservação da Natureza</span>
                    </h1>
                    <div class="subheading mb-5">VIA ROSALINA MARIA DOS SANTOS, 1233 CEP 87301-899, CAMPO MOURÃO - PR, BRASIL · +55 (44) 3518-1400 ·
                        <a href="mailto:dabic-cm@utfpr.edu.br">dabic-cm@utfpr.edu.br</a>
                    </div>
                    <p class="mb-5"> "A responsabilidade social e a preservação ambiental significa um compromisso com a vida." - João Bosco da Silva </p>
                    <ul class="list-inline list-social-icons mb-0">
                        <li class="list-inline-item">
                            <a href="#">
                                <span class="fa-stack fa-lg">
                                    <i class="fa fa-circle fa-stack-2x"></i>
                                    <i class="fa fa-facebook fa-stack-1x fa-inverse"></i>
                                </span>
                            </a>
                        </li>
                        <li class="list-inline-item">
                            <a href="#">
                                <span class="fa-stack fa-lg">
                                    <i class="fa fa-circle fa-stack-2x"></i>
                                    <i class="fa fa-twitter fa-stack-1x fa-inverse"></i>
                                </span>
                            </a>
                        </li>
                        <li class="list-inline-item">
                            <a href="#">
                                <span class="fa-stack fa-lg">
                                    <i class="fa fa-circle fa-stack-2x"></i>
                                    <i class="fa fa-linkedin fa-stack-1x fa-inverse"></i>
                                </span>
                            </a>
                        </li>
                        <li class="list-inline-item">
                            <a href="#">
                                <span class="fa-stack fa-lg">
                                    <i class="fa fa-circle fa-stack-2x"></i>
                                    <i class="fa fa-github fa-stack-1x fa-inverse"></i>
                                </span>
                            </a>
                        </li>
                    </ul>
                </div>
            </section>
            <iframe name="frame" width="1060" height="620" class="resume-section p-3 p-lg-5 d-flex d-column" />
        </div>
    </div>


    <!-- Bootstrap core JavaScript -->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

    <!-- Custom scripts for this template -->
    <script src="js/resume.min.js"></script>

</body>

</html>