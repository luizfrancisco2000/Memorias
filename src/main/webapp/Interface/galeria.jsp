<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>

<html>
	<head>
		<title>Postagens de Memórias</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link rel="stylesheet" href="assets/css/main.css" />
	</head>
	<body>
		<div class="page-wrap">

			<!-- Nav -->
				<nav id="nav">
					<ul>
                        <li><a href="menu.html" title="Menu Inicial" ><span class="icon fa-home"></span></a></li>
						<li><a href="galeria.html" title="Galeria"class="active"><span class="icon fa-camera-retro"></span></a></li>
						<li><a href="generic.html" title="Perfil"><span class="icon fa-file-text-o"></span></a></li>
					</ul>
				</nav>

			<!-- Main -->
				<section id="main">

					<!-- Header -->
						<header id="header">
							<div>Clique nas figuras para abrir a história referente</div>
						</header>

					<!-- Gallery -->
						<section id="memory">

							<!-- Photo Galleries -->
								<div class="gallery">

									<!-- Filters -->
										<header>
                                            <h1>Memórias</h1>
                                            <h4>Procure por memórias específicas <input name="pesquisa" id="searching" type="search" placeholder="Procurar"></h4>
											 <ul class="tabs">
												<li><a href="#" data-tag="all" class="button active">Todos</a></li>
												<li><a href="#" data-tag="people" class="button">Pessoas</a></li>
												<li><a href="#" data-tag="groups" class="button">Grupos</a></li>
												<li><a href="#" data-tag="family" class="button">Famílias</a></li>
											 </ul>
										</header>

										<div class="content">
											<div class="media all people">
												<a href="images/fulls/01.jpg"><img src="images/fulls/01.jpg" alt="" title="Imagem inserida diretamente para teste" /></a>
											</div>
											<div class="media all groups">
												<a href="images/fulls/escrever.jpg"><img src="images/fulls/escrever.jpg" alt="" title="A alegria de escrever" /></a>
											</div>
											<div class="media all groups">
												<a href="images/fulls/09.jpg"><img src="images/fulls/09.jpg" alt="" title="O basket do primeiro Ano" /></a>
											
										</div>
								</div>
						</section>

					<!-- Contact -->
						<section id="contact">
							<!-- Social -->
								<div class="social column">
									
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