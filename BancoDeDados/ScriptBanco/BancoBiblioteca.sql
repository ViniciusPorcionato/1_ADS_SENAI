create database bibliotecatb;
use bibliotecatb;

CREATE TABLE livro(
	cod_livro int auto_increment primary key,
    nome varchar(30) not null,
    valor float,
    issn varchar(20) unique
);

CREATE TABLE autor(
	cod_autor int auto_increment primary key,
    nome varchar(60) not null,
    cpf varchar(20) not null,
    unique (nome,cpf)
);

#se esquecer a PK é só usar esse código:
ALTER TABLE autor ADD constraint pk_cod_autor PRIMARY KEY (cod_autor);

#modificar nome para nome_autor
ALTER TABLE autor CHANGE COLUMN nome nome_autor VARCHAR(50);

#adicionar endereço para o autor
ALTER TABLE autor ADD COLUMN endereco VARCHAR(100);

CREATE TABLE equipamentos(
	cod_equip int auto_increment primary key,
    nome_equip varchar(80) not null,
    valor double not null,
    descricao text,
    quantidade_disponivel int default 100
);

select * from autor;
select * from livro;
select * from equipamentos;

insert into autor(nome_autor, cpf, endereco)
values
    ("J.K. Rowling", "11122334455", "Edimburgo, Escócia"),
    ("George Orwell", "22334455667", "Londres, Inglaterra"),
    ("Agatha Christie", "33445566778", "Torquay, Inglaterra"),
    ("Haruki Murakami", "44556677889", "Tóquio, Japão"),
    ("Gabriel García Márquez", "55667788990", "Aracataca, Colômbia"),
    ("Jane Austen", "66778899001", "Steventon, Inglaterra"),
    ("J.R.R. Tolkien", "77889900112", "Bloemfontein, África do Sul"),
    ("Charles Dickens", "88990011223", "Portsmouth, Inglaterra"),
    ("Franz Kafka", "99001122334", "Praga, República Tcheca"),
    ("Virginia Woolf", "10011223345", "London, Inglaterra");

insert into livro(nome, valor, issn)
values
    ("Harry Potter e a Pedra Filosofal", 79.99, "978-0747532699"),
    ("1984", 49.99, "978-0451524935"),
    ("O Assassinato de Roger Ackroyd", 39.99, "978-0062073560"),
    ("Norwegian Wood", 59.99, "978-0375704024"),
    ("Cem Anos de Solidão", 89.99, "978-0060883287"),
    ("Orgulho e Preconceito", 59.99, "978-1503290563"),
    ("O Senhor dos Anéis - A Sociedade do Anel", 99.99, "978-0261103573"),
    ("Oliver Twist", 29.99, "978-0486450224"),
    ("A Metamorfose", 19.99, "978-0141185064"),
    ("Mrs. Dalloway", 29.99, "978-0156628709");
    
insert into equipamentos(nome_equip, valor, descricao)
values
	("Caneta Bic 4 cores", 12.99, "Caneta retro cores"),
	("Marca Texto Amarelo", 6.99, "Marca Texto Amarelo Bic"),
	("Bloco de anotações", 10.99, "Bloco de notas amarelo"),
	("Caderno Tilibra 1 96fl", 26.44, "Caderno Naruto uma matéria"),
	("Caderno Tilibra 2 96fl", 26.44, "Caderno Avengers uma matéria"),
	("Caderno Tilibra 3 96fl", 26.44, "Caderno One Piece uma matéria"),
	("Caderno Tilibra 4 96fl", 26.44, "Caderno Coringa uma matéria"),
	("Caderno Tilibra 5 96fl", 26.44, "Caderno Batman uma matéria"),
	("Caderno Tilibra 6 96fl", 26.44, "Caderno Itachi uma matéria");

create table livro_autor(
cod_liv_aut int not null auto_increment primary key,
cod_livro int not null,
cod_autor int not null,
sinopse text,
valor float,
foreign key(cod_livro) references livro(cod_livro),
foreign key(cod_autor) references autor(cod_autor)
);

insert into livro_autor(cod_livro, cod_autor, sinopse, valor)
values
    (1, 1, "Harry Potter, um garoto órfão de 11 anos, descobre que é um bruxo e vai para a escola de magia de Hogwarts. Lá, ele começa uma jornada cheia de mistérios e desafios.", 79.99),
    (2, 2, "1984 é um romance distópico que se passa em uma sociedade totalitária onde o governo, liderado pelo Partido, controla todos os aspectos da vida humana.", 49.99),
    (3, 3, "Em O Assassinato de Roger Ackroyd, Hercule Poirot, o famoso detetive, investiga o misterioso assassinato de Roger Ackroyd em uma pequena cidade inglesa.", 39.99),
    (4, 4, "Norwegian Wood segue a história de Toru Watanabe, um jovem estudante universitário no Japão dos anos 1960, que enfrenta o amor, a perda e o autodescobrimento.", 59.99),
    (5, 5, "Cem Anos de Solidão narra a história da família Buendía em Macondo, uma cidade fictícia na Colômbia, abordando temas como solidão, amor e destino.", 89.99),
    (6, 6, "Orgulho e Preconceito é a história de Elizabeth Bennet, uma mulher inteligente e independente que se apaixona por Mr. Darcy, um homem orgulhoso e misterioso.", 59.99),
    (7, 7, "O Senhor dos Anéis segue a jornada de Frodo Baggins, que deve destruir o Anel do Poder para evitar que ele caia nas mãos do Senhor das Trevas, Sauron.", 99.99),
    (8, 8, "Oliver Twist conta a história de um órfão que, depois de escapar de uma vida de miséria, se encontra em um mundo de criminosos e mistérios.", 29.99),
    (9, 9, "A Metamorfose é um conto surreal de Franz Kafka sobre Gregor Samsa, um homem que acorda transformado em um inseto gigante, enfrentando o isolamento e o desespero.", 19.99),
    (10, 10, "Mrs. Dalloway segue Clarissa Dalloway em um único dia de sua vida, abordando sua percepção do tempo, suas escolhas e as complexidades de sua psique.", 29.99);
    
insert into autor(nome_autor, cpf, endereco)
values
("Álvares de Azevedo", "01020304111", "Copacabana, RJ");

update autor set nome_autor = "Neil Gaiman" where cod_autor = 11;
delete from autor where nome_autor = "Álvares de Azevedo";
update autor set cod_autor = 12 where nome_autor = "Álvares de Azevedo";

alter table autor auto_increment = 12;
    
select * from livro_autor;
select * from autor;
select * from livro;
 
