create database memoriasSoltas;

use memoriasSoltas;


CREATE TABLE memoria (
	publico BOOLEAN NOT NULL,
	dataDoFato VARCHAR(10),
    nome varchar(50) not null,
	codigo INT auto_increment not NULL,
	descricao VARCHAR(50) NOT NULL,
	PRIMARY KEY(codigo)
);

CREATE TABLE grupo (
	descricao VARCHAR(50) NOT NULL,
	dataCriacao date,
	nome VARCHAR(50) NOT NULL,
	publico BOOLEAN NOT NULL,
	codigo INT auto_increment primary KEY
);


CREATE TABLE usuario (
	nome varchar(50) not null,
	email VARCHAR(30) NOT NULL,
	dataNasc VARCHAR(10),
	senha VARCHAR(50) NOT NULL,
	nacionalidade VARCHAR(50),
	PRIMARY KEY (email)
    );


CREATE TABLE UsuariomantemMemoria (
	email VARCHAR(30) NOT NULL,
	codigo INT NOT NULL,
	foreign key(codigo) references memoria (codigo),
    foreign key(email) references usuario(email)
);
CREATE TABLE UsuariomantemGrupo (
	email VARCHAR(30) NOT NULL,
	codigo INT NOT NULL,
	foreign key(codigo) references grupo(codigo),
    foreign key(email) references usuario(email)
);

CREATE TABLE memoriaPertenceGrupo (
	codigoGrupo INT NOT NULL,
    codigoMemoria int not null,
	FOREIGN KEY(codigoGrupo) REFERENCES grupo (codigo),
	FOREIGN KEY(codigoMemoria) REFERENCES memoria (codigo)
);

CREATE TABLE usuarioPertenceGrupo (
	dataEntrada VARCHAR(10) NOT NULL,
	email VARCHAR(30) NOT NULL,
	codigo INT NOT NULL,
	FOREIGN KEY(email) REFERENCES usuario (email),
	FOREIGN KEY(codigo) REFERENCES grupo (codigo)
);

CREATE TABLE pessoaComentaMemoria (
	codigo INT NOT NULL,
	nome varchar(50) not null,
    comentario varchar(50) not null,
	FOREIGN KEY(codigo) REFERENCES memoria (codigo)
);

CREATE TABLE pessoaComentaGrupo (
	codigo INT NOT NULL,
	nome varchar(50) not null,
    comentario varchar(50) not null,
	FOREIGN KEY(codigo) REFERENCES grupo (codigo)
);

create table documentosPertenceUsuario(
	documento BLOB,
    emailUsuario varchar(30) not null,
    foreign key(emailUsuario) references usuario(email)
);

create table documentosPertenceGrupo(
	documento BLOB,
    codigoGrupo varchar(30) not null,
    foreign key(codigoGrupo) references grupo(codigo)
);

select * from usuario;

insert into usuario values("Luiz Francisco","luizfrancisco2000@gmail.com",null,"123456789","brasileiro");

insert into memoria values(true,null,"Minha memoria",1,"Eae minha memoria");

insert into grupo values("Meu grupo",null,"Meu Grupo",true,1);