DROP DATABASE IF EXISTS autonobarber;
CREATE DATABASE autonobarber;

DROP USER IF EXISTS 'user'@'localhost';
create user 'user'@'localhost' identified by 'pass123';

grant select, insert, delete, update on autonobarber.* to 'user'@'localhost';

USE autonobarber;

CREATE TABLE barbeiro (
	nome VARCHAR(255),
    email VARCHAR(120) PRIMARY KEY,
    senha VARCHAR(100)
);

CREATE TABLE cliente (
	nome VARCHAR(255),
	telefone VARCHAR(14) PRIMARY KEY
);

CREATE TABLE servico (
	nome VARCHAR(255) NOT NULL PRIMARY KEY,
    duracao_minutos INT NOT NULL,
    preco DECIMAL(10,2) NOT NULL,
    barbeiro VARCHAR(120),
    FOREIGN KEY (barbeiro) REFERENCES barbeiro(email)
);

CREATE TABLE agendamento (
	dia DATE NOT NULL,
    horario TIME NOT NULL,
    status VARCHAR(20) NOT NULL,
    servico VARCHAR(255),
    cliente VARCHAR(14),
    barbeiro VARCHAR(120),
    PRIMARY KEY(dia, horario, barbeiro),
    FOREIGN KEY (servico) REFERENCES servico(nome),
    FOREIGN KEY (cliente) REFERENCES cliente(telefone),
    FOREIGN KEY (barbeiro) REFERENCES barbeiro(email)
);

CREATE TABLE horario_barbeiro (
	dia_semana INT NOT NULL,
    hora_inicio TIME NOT NULL,
    hora_fim TIME NOT NULL,
    barbeiro VARCHAR (120),
    PRIMARY KEY (barbeiro, dia_semana),
	FOREIGN KEY (barbeiro) REFERENCES barbeiro(email)
)