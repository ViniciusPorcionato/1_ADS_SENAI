-- Criação do banco de dados
CREATE DATABASE EMPRESANOVA;
USE EMPRESANOVA;

-- Criação da tabela 'departamento'
CREATE TABLE departamento (
    cod_dpto INT AUTO_INCREMENT PRIMARY KEY, 
    nome_dpto VARCHAR(200),  
    descricao TEXT
);

-- Criação da tabela 'supervisor'
CREATE TABLE supervisor (
    cod_supervisor INT AUTO_INCREMENT PRIMARY KEY, 
    nome_supervisor VARCHAR(100), 
    cpf_supervisor VARCHAR(20), 
    cod_dpto INT, 
    celular VARCHAR(20) NOT NULL,  
    salario FLOAT,  
    descricao_cargo TEXT NOT NULL,  
    FOREIGN KEY(cod_dpto) REFERENCES departamento(cod_dpto)  
);

-- Criação da tabela 'funcionario'
CREATE TABLE funcionario (
    cod_funcionario INT AUTO_INCREMENT PRIMARY KEY,  
    nome VARCHAR(100) NOT NULL, 
    cpf VARCHAR(20) UNIQUE,  
    celular VARCHAR(20) NOT NULL,  
    cod_dpto INT,  
    cod_supervisor INT,  
    salario FLOAT,  
    FOREIGN KEY(cod_dpto) REFERENCES departamento(cod_dpto),  
    FOREIGN KEY(cod_supervisor) REFERENCES supervisor(cod_supervisor)  
);

-- Criação da tabela 'projeto'
CREATE TABLE projeto (
    cod_proj INT AUTO_INCREMENT PRIMARY KEY,  
    nome VARCHAR(50),  
    duracao INT  
);

-- Criação da tabela 'func_proj'
CREATE TABLE func_proj (
    cod_func_proj INT AUTO_INCREMENT PRIMARY KEY,  
    cod_proj INT,  
    cod_funcionario INT,  
    horas_trab INT,  
    FOREIGN KEY(cod_funcionario) REFERENCES funcionario(cod_funcionario),  
    FOREIGN KEY(cod_proj) REFERENCES projeto(cod_proj)  
);

-- Inserção de dados na tabela 'departamento'
INSERT INTO departamento (nome_dpto, descricao)
VALUES
("RH", "Recursos Humanos"),
("TI", "Tecnologia da Informação"),
("Marketing", "Divulgação"),
("Financeiro", "Financeiro da Empresa");

-- Inserção de dados na tabela 'supervisor'
INSERT INTO supervisor (nome_supervisor, cpf_supervisor, cod_dpto, celular, salario, descricao_cargo)
VALUES
("Miguel Silva Souza", "27537680754", 1, "11963258745", 2000.00, "Supervisor RH"),
("Vinicius Porcionato", "28964315937", 2, "11856329852", 3000.00, "Desenvolvedor de Software"),
("Pedro Augusto", "37915732864", 3, "11879632587", 4000.00, "Supervisor Marketing"),
("Marcio Ferreira", "83729438765", 4, "11369852147", 5000.00, "Supervisor Financeiro");

-- Inserção de dados na tabela 'funcionario'
INSERT INTO funcionario (nome, cpf, celular, cod_dpto, cod_supervisor, salario)
VALUES
("Carlos Eduardo", "12345678901", "11987654321", 1, 1, 2500.00),
("Juliana Alves", "23456789012", "11976543210", 2, 2, 3200.00),
("Fernanda Oliveira", "34567890123", "11965432109", 3, 3, 3500.00),
("André Silva", "45678901234", "11954321098", 4, 4, 4500.00),
("Lucas Santos", "56789012345", "11943210987", 1, 1, 2600.00),
("Mariana Costa", "67890123456", "11932109876", 2, 2, 3100.00),
("Roberta Lima", "78901234567", "11921098765", 3, 3, 3400.00),
("Eduardo Pereira", "89012345678", "11910987654", 4, 4, 4600.00);

-- Inserção de dados na tabela 'projeto'
INSERT INTO projeto (nome, duracao)
VALUES
("Desenvolvimento de sites", 45),
("Aplicação de Cadastro - BackEnd", 35),
("Consultoria de Suporte", 4),
("Criação de API", 60);

-- Inserção dos dados na tabela 'func_proj'
INSERT INTO func_proj (cod_proj, cod_funcionario, horas_trab)
VALUES
(1, 1, 20),  
(2, 1, 40),  
(3, 3, 10);  

-- Inner Join
SELECT f.nome, p.nome, fp.horas_trab
FROM funcionario f
INNER JOIN func_proj AS fp
INNER JOIN projeto AS p
ON fp.cod_funcionario = f.cod_funcionario AND fp.cod_proj = p.cod_proj;

-- Inner Join
SELECT f.nome, s.cod_supervisor, d.cod_dpto
FROM funcionario f
INNER JOIN supervisor s
INNER JOIN departamento d
ON d.cod_dpto = s.cod_dpto;

-- Left Join
SELECT f.nome, s.cod_supervisor
FROM funcionario f, departamento d
LEFT JOIN supervisor s
ON d.cod_dpto = s.cod_dpto;

-- Criar View
CREATE VIEW busca_funcionario AS
SELECT nome, cpf, celular
FROM funcionario
WHERE cod_funcionario < 3;

SELECT * FROM busca_funcionario;

-- DELIMITER
DELIMITER $$
CREATE PROCEDURE Nome(cod int)
BEGIN
SELECT * FROM funcionario WHERE cod_funcionario = cod;
END $$
DELIMITER ;

CALL Nome(1);

DELIMITER $$
CREATE PROCEDURE insere
(n varchar(40), c varchar(15), cel varchar(20), cod_d int, cod_s int, sal float)
BEGIN
	INSERT INTO funcionario(nome, cpf, celular, cod_dpto, cod_supervisor, salario )
    VALUES (n, c, cel, cod_d, cod_s, sal);
END $$
DELIMITER ;

CALL insere("Crishna", "85236745894", "11987654321", 2, 3, 100003.55);

select * from funcionario;


#------------------------------------------------------------------------------------------------------------

SELECT @@secure_file_priv;

SELECT nome as "Nome"
INTO OUTFILE "c:\\nome_funcionario.txt"
FROM funcionario;

SELECT nome, cpf, celular
INTO OUTFILE "c:\\resultado_funcionario.txt"
FIELDS TERMINATED BY ','
OPTIONALLY ENCLOSED BY '"'
LINES TERMINATED BY "\n"
FROM funcionario;

SELECT cod_func, nome, salario
INTO OUTFILE "c:\\salarios.csv"
FIELDS TERMINATED BY ','
FROM funcionario WHERE salario > 1000;