<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>

<html>
	<head>
		<title>Página de Perfil</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link rel="stylesheet" href="assets/css/main.css" />
	</head>
	<body>
		<div class="page-wrap">

			<!-- Nav -->
				<nav id="nav">
					<ul>
						<li><a href="menu.html" title="Menu Inicial"><span class="icon fa-home"></span></a></li>
						<li><a href="galeria.html" title="Galeria"><span class="icon fa-camera-retro"></span></a></li>
						<li><a href="generic.html" title="Perfil" class="active"><span class="icon fa-file-text-o"></span></a></li>
					</ul>
				</nav>

			<!-- Main -->
				<section id="main">

					<!-- Header -->
						<header id="header">
							<div>Natan Siqueira dos Santos</div>
						</header>

					<!-- Section -->
						<section>
							<div class="inner">
								<header>
									<h1>Quem sou eu?</h1>
								</header>
                                
								<p> Meu nome é Natan, tenho 17 anos. Atualmente aluno do IFAM - CMC. Estudando para se tornar técnico em informática.<br><a type="button" href="Alterar.html">alterar informações</a></p>
                                <header>
                                    <h1>Memórias<h4></h4></h1><br></header>
                                <section class="columns double">
                                    <div class="column">
										<span class="image left special"><img src="images/fulls/09.jpg" alt="" /></span>
										<h3>O basket do primeiro Ano</h3>
										<p>
											A melhor parte desse dia foram as fotos 'memes' tiradas durante o jogo, e poder derrubar o Figueiredo 'sem querer' umas vinte vezes. Ah, o Libera ainda tava nesse dia!<br><br>
										</p>
                                        <center><p><a href="edit.html" class="button">Editar</a>||<a href="" class="button">Marcar</a></p></center>
									</div>
									<div class="column">
										<span class="image left special"><img src="" alt="" /></span>
										<h3>A aula de Geografia</h3>
										<p>
											Quem não lembra desse dia? Foi uma gritaria e tanto dentro de sala. Eu nunca estive tão errado em toda minha vida, acho que depois dessa eu nunca mais fiquei três dias seguido sem dormir. Eu dou toda razão pra professora ter me "convidado" a se retirar de sala, mas não acho justo ela não ter aceitado meu trabalho no dia da entrega por eu ter dormido durante a aula. Entretanto, sempre vale a pena pelo meme. 
										</p>
                                        <center><p><a href="editt.html" class="button">Editar</a>||<a href="" class="button">Marcar</a></p></center>
									</div>
                                    <div class="column">
										<span class="image left special"><img src="images/fulls/escrever.jpg" alt="" /></span>
										<h3>A alegria de escrever</h3>
										<p>
											Se tem uma coisa me deixa mais feliz do que fazer um jogo, essa coisa se chama escrever. E se tem algo em particular que faz valer a pena escrever é ver a reação de frustração da Lin quando você mostra pra ela que o único personagem o qual ela se interessou morreu que nem lixo. Bem, isso aconteceu no primeiro ano de qualquer forma, nesse tempo eu ainda falava bastante com o Dario e trocávamos algumas histórias malucas, talvez eu devesse me esforçar mais para concluir minhas histórias.<br>
										</p>
                                        <center><p><a href="edit1.html" class="button">Editar</a>||<a href="" class="button">Marcar</a></p></center>
									</div>
                                    <div align="middle" class="column">
                                        <middle><a align="center" type="button" href="createMemory.html">adicionar nova memória</a></middle>
								
                                    </div>
                                 
                                
								</section>
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