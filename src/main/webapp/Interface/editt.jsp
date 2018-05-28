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
              <div class="page-wrap">
				<nav id="nav">	
                    <ul>
						<li><a href="menu.html" title="Menu Inicial" ><span class="icon fa-home"></span></a></li>
						<li><a href="galeria.html" title="Galeria"><span class="icon fa-camera-retro"></span></a></li>
						<li><a href="generic.html" title="Perfil"class="active"><span class="icon fa-file-text-o"></span></a></li>
					</ul>
				</nav>
            
          <section id="edit">
                
              <div align="center"><h5 align="center"><span class="image left special"><img src="" height="260" width="" alt=""><a class="button" value="alterar">alterar imagem</a></span></h5></div>
                    <h4  align="left">
                        <form action="#" method="post">
                            <div class="field half">
                                <label for="nameM">Nome da memória</label>
								<input name="nameM" id="nameM" type="text" placeholder="A aula de Geografia">
                            </div>
                            <div class="field half first">
                                <label for="descriptionM">Descrição da Memória</label>
                                <textarea name="descriptionM" id="descriptionM" type="text" placeholder="Quem não lembra desse dia? Foi uma gritaria e tanto dentro de sala. 
								Eu nunca estive tão errado em toda minha vida, acho que depois dessa eu nunca mais fiquei três dias seguido sem dormir. Eu dou toda razão pra
								professora ter me 'convidado' a se retirar de sala, mas não acho justo ela não ter aceitado meu trabalho no dia da entrega por eu ter dormido 
								durante a aula. Entretanto, sempre vale a pena pelo meme. "></textarea>
                            </div>
                            <div class="field half first">
                                <label for="nameM">Marcar Pessoas<br><h6>(utilize @example, @example2)</h6></label>
								<input name="nameM" id="nameM" type="text" placeholder="@Natan Siqueira dos Santos">
                            </div>
                            <div>
                                      <fieldset>
                                                <legend>A visualização está disponivel...</legend>
                                                        <input type="checkbox" name="option1" value="markeds" checked/>Apenas para marcados <br />
                                                        <input type="checkbox" name="option2" value="me" />Apenas para mim<br />
                                                        <input type="checkbox" name="option3" value="all"/>para todos<br /><br/>
                                                        
                                        </fieldset>
                                        <fieldset>
                                                <legend>A memória pertence a...</legend>
                                                        <input type="checkbox" name="option4" value="people" />uma pessoa <br />
                                                        <input type="checkbox" name="option5" value="group" checked/>um grupo<br />
                                                        <input type="checkbox" name="option6" value="family" />uma família<br />
                                                        
                                        </fieldset>
                            </div>    
                                <div align="center">
                                    <p><br></p>
                                    <input type="submit" value="Atualizar"/>
                                </div>
                            </form>

                    </h4>

        </section>
        </div>
    </body>

</html>