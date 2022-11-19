DROP DATABASE IF EXISTS db_copa;
CREATE DATABASE IF NOT EXISTS db_copa;
USE db_copa;

CREATE TABLE IF NOT EXISTS tb_usuario(
	IDUsuario INT AUTO_INCREMENT PRIMARY KEY,
    Nome_Usuario VARCHAR(255) NOT NULL,
    CPF_Usuario VARCHAR(11) NOT NULL,
    Tipo_Usuario CHAR(1) NOT NULL
);

CREATE TABLE IF NOT EXISTS tb_time(
	ID_Time INT AUTO_INCREMENT PRIMARY KEY,
    Nome_Time VARCHAR(255) NOT NULL,
    Data_Fundacao DATE NOT NULL,
    Estadio VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS tb_jogador(
	ID_Jogador INT AUTO_INCREMENT PRIMARY KEY,
    Nome_Jogador VARCHAR(255) NOT NULL,
    Data_Nascimento DATE NOT NULL, 
    Posicao_Jogador VARCHAR(255) NOT NULL,
    ID_Time INT NOT NULL,
    CONSTRAINT Fk_ID_Time FOREIGN KEY(ID_Time) REFERENCES tb_time(ID_Time)
);

CREATE TABLE IF NOT EXISTS tb_grupo(
	ID_Grupo CHAR(1) PRIMARY KEY,
    ID_Time1 INT NOT NULL,
    ID_Time2 INT NOT NULL,
    ID_Time3 INT NOT NULL,
    ID_Time4 INT NOT NULL,
    CONSTRAINT Fk_ID_Time1 FOREIGN KEY(ID_Time1) REFERENCES tb_time(ID_Time),
    CONSTRAINT Fk_ID_Time2 FOREIGN KEY(ID_Time2) REFERENCES tb_time(ID_Time),
    CONSTRAINT Fk_ID_Time3 FOREIGN KEY(ID_Time3) REFERENCES tb_time(ID_Time),
    CONSTRAINT Fk_ID_Time4 FOREIGN KEY(ID_Time4) REFERENCES tb_time(ID_Time)
);