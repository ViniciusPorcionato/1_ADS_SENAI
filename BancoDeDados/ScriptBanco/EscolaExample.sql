create database escola;
use escola;

create table Professores(
cod_professor int auto_increment primary key,
nome VARCHAR(100) not null,
cpf varchar(20) not null unique,
rg varchar(10) not null unique,
formacao varchar(100) not null,
endereco varchar(100) not null 
);

create table Alunos(
cod_aluno int auto_increment primary key,
nomeAluno varchar(100) not null,
cpf varchar(20) not null unique,
rg varchar(10) not null unique,
telefone varchar(20) not null
);

create table Disciplinas(
cod_disc int auto_increment primary key,
nomeDisc varchar(100),
descricao text,
cod_professor int,
foreign key(cod_professor) references Professores(cod_professor)
);

create table Matriculas(
cod_matri int auto_increment primary key,
cod_professor int,
cod_aluno int,
cod_disc int,
foreign key(cod_professor) references Professores(cod_professor),
foreign key(cod_aluno) references Alunos(cod_aluno),
foreign key(cod_disc) references Disciplinas(cod_disc)
);

select * from Professores;
select * from Alunos;
select * from Disciplinas;
select * from Matriculas;

-- Inserir professores
INSERT INTO Professores (nome, cpf, rg, formacao, endereco)
VALUES 
('Carlos Pereira', '12345678901', 'MG123456', 'Mestre em Matemática', 'Rua das Flores, 123'),
('Ana Costa', '23456789012', 'MG234567', 'Doutora em Português', 'Avenida Brasil, 456'),
('Mariana Souza', '34567890123', 'MG345678', 'Especialista em Física', 'Rua das Palmeiras, 789'),
('Ricardo Oliveira', '45678901234', 'MG456789', 'Mestre em História', 'Rua São João, 101'),
('Fernanda Lima', '56789012345', 'MG567890', 'Doutora em Química', 'Rua das Acácias, 202');

-- Inserir alunos
INSERT INTO Alunos (nomeAluno, cpf, rg, telefone)
VALUES 
('João Silva', '12345678901', 'MG100001', '11987654321'),
('Maria Oliveira', '23456789012', 'MG100002', '11912345678'),
('Pedro Santos', '34567890123', 'MG100003', '11998765432'),
('Fernanda Alves', '45678901234', 'MG100004', '11987654321'),
('Luana Costa', '56789012345', 'MG100005', '11987654322');

-- Inserir disciplinas
INSERT INTO Disciplinas (nomeDisc, descricao, cod_professor)
VALUES 
('Matemática I', 'Fundamentos de Matemática', 1),
('Português I', 'Leitura e Redação', 2),
('Física Geral', 'Princípios básicos da Física', 3),
('História Antiga', 'Estudo das civilizações antigas', 4),
('Química Orgânica', 'Propriedades dos compostos orgânicos', 5);

-- Inserir matrículas
INSERT INTO Matriculas (cod_professor, cod_aluno, cod_disc)
VALUES 
(1, 1, 1),  -- João Silva se matricula em Matemática I
(2, 2, 2),  -- Maria Oliveira se matricula em Português I
(3, 3, 3),  -- Pedro Santos se matricula em Física Geral
(4, 4, 4),  -- Fernanda Alves se matricula em História Antiga
(5, 5, 5);  -- Luana Costa se matricula em Química Orgânica


update Professores set nome = "Vinicius" where cod_professor = 1;
delete from Matriculas where cod_matri = 5;
