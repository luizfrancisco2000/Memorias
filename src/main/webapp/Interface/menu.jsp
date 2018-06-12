<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>

<html>
    <head>
        <title> Memórias Soltas </title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel="stylesheet" href="assets/css/main.css" />
    </head>
    <body>
        <%@page import="javax.servlet.http.*"%>
        <%
            HttpSession sessao = request.getSession();
            if (sessao.getAttribute("usuario_logado") == null) {
                sessao.setAttribute("usuario_logado", "false");
                if (!request.getRequestURI().contains("negocios.jsp")
                        && !request.getRequestURI().contains("index.jsp")
                        && !request.getRequestURI().contains("login.jsp")
                        && !request.getRequestURI().contains("usuario.jsp")) {
                    response.sendRedirect("menu.jsp");
                }
            }
        %>
        <div class="page-wrap">

            <!-- Nav -->
            <nav id="nav">
                <ul>
                    <li><a href="menu.jsp" title="Menu Inicial" class="active"><span class="icon fa-home"></span></a></li>
                    <li><a href="galeria.jsp" title="Galeria"><span class="icon fa-camera-retro"></span></a></li>
                    <li><a href="generic.jsp" title="Perfil"><span class="icon fa-file-text-o"></span></a></li>
                </ul>
            </nav>

            <!-- Main -->
            <section id="main">
                <!-- Banner -->
                <section id="banner">
                    <div class="inner">
                        <h1>Seja bem-vindo ao Memórias Soltas</h1>
                        <p> O lugar onde todas suas memórias estarão registradas e protegidas do tempo.</p>
                        <ul class="actions">
                            <li><a href="#galleries" class="button">Próxima Sessão</a></li>
                            <li><a href="#login" class="button" id="buttonLogin">Entrar</a></li>
                            <li><a href="cadastro.jsp" class="button">Cadastrar-se</a></li>
                        </ul>
                    </div>
                </section>

                <!-- Galeria -->
                <section id="galleries">

                    <!-- Fotos -->
                    <div class="gallery">
                        <header class="special">
                            <h2>Postagens Recentes</h2>
                        </header>
                        <div class="content">
                            <div class="media">
                                <a href="images/fulls/09.jpg"><img src="images/fulls/09.jpg" alt="" title="O basquete do primeiro Ano"/></a>
                            </div>

                            <div class="media">
                                <a href="images/fulls/escrever.jpg" ><img src="images/fulls/escrever.jpg" alt="" title="A alegria de escrever" /></a>
                            </div>
                            <div class="media">
                                <a href="images/fulls/01.jpg"><img src="images/fulls/01.jpg" alt="" title="Flores do funeral da Linda."/></a>
                            </div>

                        </div>
                        <footer>
                            <a href="galeria.html" class="button big">Ver Mais</a>
                        </footer>
                    </div>
                </section>

                <!-- Nos Contate -->
                <section id="contact">
                    <!-- Social -->
                    <div class="social column">
                        <h3>Sobre nós</h3>
                        <p>Desenvolvedores de aplicações web. Atualmente estudantes do Instituto Federal de Educação,Ciência e tecnologia do Amazonas, o IFAM.</p>
                        <p>Memórias soltas é um site onde você pode registrar todas suas memórias para que elas não sejam perdidas no tempo, o objetivo do projeto é criar um lugar seguro onde as pessoas possam compartilhar suas memórias com grupos internos, ao público, ou apenas guardá-las para si.
                        </p>
                        <h3>Siga nossas redes sociais</h3>
                        <ul class="icons">
                            <li><a href="#" class="icon fa-twitter"><span class="label">Twitter</span></a></li>
                            <li><a href="#" class="icon fa-facebook"><span class="label">Facebook</span></a></li>
                            <li><a href="#" class="icon fa-instagram"><span class="label">Instagram</span></a></li>
                        </ul>
                    </div>

                    <!-- Form -->
                    <div class="column">
                        <h3>Alguma dúvida ou Reclamação?<br>Entre em contato conosco.</h3>
                        <form action="#" method="post">
                            <div class="field half first">
                                <label for="name">Nome</label>
                                <input name="name" id="name" type="text" placeholder="Name">
                            </div>
                            <div class="field half">
                                <label for="email">Email</label>
                                <input name="email" id="email" type="email" placeholder="Email">
                            </div>
                            <div class="field">
                                <label for="message">Mensagem</label>
                                <textarea name="message" id="message" rows="6" placeholder="Message"></textarea>
                            </div>
                            <ul class="actions">
                                <li><input value="Enviar Mensagem" class="button" type="submit"></li>
                            </ul>
                        </form>
                    </div>
                </section>
                <section align="center"id="login">
                    <h3><br><br><br>Efetuar Login</h3>

                    <form action="#" method="post">
                        <div class="field half first">
                            <label for="emailEfet">Email</label>
                            <input name="emailEfet" id="emailEfet" type="email" placeholder="email.exemplo@gmail.com">
                        </div>
                        <div class="field half first">
                            <label for="senhaEfet">Senha</label>
                            <input name="senhaEfet" id="senhaEfet" type="password" placeholder="********">
                        </div>
                        <ul class="actions">
                            <li><a href="generic.html"><input value="Logar" id="buttonLogin" class="button" type="submit"></a></li>
                        </ul>

                    </form>
                </section>
            </section>
        </div>
        
    <!-- Scripts -->
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/js/jquery.poptrox.min.js"></script>
    <script src="assets/js/jquery.scrolly.min.js"></script>
    <script src="assets/js/skel.min.js"></script>
    <script src="assets/js/util.js"></script>
    <script src="assets/js/main.js"></script>

</body>
</html>