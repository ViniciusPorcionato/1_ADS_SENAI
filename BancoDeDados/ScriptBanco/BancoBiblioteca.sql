CREATE DATABASE bibliotecaTB;
use bibliotecaTB;

CREATE TABLE Livro (
cod_livro int auto_increment PRIMARY KEY,
nome VARCHAR(30) NOT NULL,
valor float,
issn varchar(20) unique
);

CREATE table Autor(
cod_autor int auto_increment primary key,
nome varchar(60) NOT NULL,
cpf varchar(20) NOT NULL,
unique(nome, cpf)
);

create table Equipamentos(
cod_equip int auto_increment primary key,
nome_equip varchar(80) not null,
valor float not null,
descricao text,
quantidade_disponivel int default 100
);

#se esquecer a PK é só usar esse código
ALTER table Autor add constraint pk_cod_autor primary key(cod_autor);

#Modificar nome para nome_autor
alter table Autor change column nome nome_autor varchar(50);

#Adicionar endereco em autor
alter table Autor add column endereco varchar(100);

