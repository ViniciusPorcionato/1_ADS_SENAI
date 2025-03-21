use bibliotecatb;

select * from livro;
select * from autor;
select * from equipamentos;
select * from livro_autor;

select nome_autor, cpf  as "CPF" from autor; 

select nome_autor as "Nome", cod_autor as "Código" from autor where cod_autor = 5;
select nome_autor as "Nome", cpf as "CPF" from autor where cpf = 99001122334;
select nome_autor as "Nome", cpf as "CPF", cod_autor as "Código" from autor where cod_autor <= 5;

select nome from livro where nome like "A %";
select nome from livro where nome like "O %";
select nome_autor from autor where nome_autor like "A%";


-- Consulta tabela equipamentos que mostre os equipamentos mais baratos que 25 reais
select nome_equip as "Nome", valor as "Valor", descricao as "Descricao" from equipamentos where valor < 25;