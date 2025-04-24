CREATE DATABASE Imobiliaria;
USE Imobiliaria;

-- Tabela Cliente
CREATE TABLE Cliente (
    id_cliente INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    cpf VARCHAR(14) UNIQUE,
    telefone VARCHAR(20),
    email VARCHAR(100)
);

-- Tabela Corretor
CREATE TABLE Corretor (
    id_corretor INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    creci VARCHAR(20) UNIQUE,
    telefone VARCHAR(20),
    email VARCHAR(100)
);

-- Tabela TipoImovel
CREATE TABLE TipoImovel (
    id_tipo INT AUTO_INCREMENT PRIMARY KEY,
    descricao VARCHAR(50)
);

-- Tabela Imovel
CREATE TABLE Imovel (
    id_imovel INT AUTO_INCREMENT PRIMARY KEY,
    endereco VARCHAR(200),
    cidade VARCHAR(100),
    estado VARCHAR(2),
    cep VARCHAR(9),
    valor DECIMAL(10,2),
    area DECIMAL(10,2),
    quartos INT,
    banheiros INT,
    vagas INT,
    id_tipo INT,
    id_proprietario INT,
    FOREIGN KEY (id_tipo) REFERENCES TipoImovel(id_tipo),
    FOREIGN KEY (id_proprietario) REFERENCES Cliente(id_cliente)
);

-- Tabela Locacao
CREATE TABLE Locacao (
    id_locacao INT AUTO_INCREMENT PRIMARY KEY,
    data_inicio DATE,
    data_fim DATE,
    valor_mensal DECIMAL(10,2),
    id_imovel INT,
    id_locatario INT,
    id_corretor INT,
    FOREIGN KEY (id_imovel) REFERENCES Imovel(id_imovel),
    FOREIGN KEY (id_locatario) REFERENCES Cliente(id_cliente),
    FOREIGN KEY (id_corretor) REFERENCES Corretor(id_corretor)
);

-- Tabela Venda
CREATE TABLE Venda (
    id_venda INT AUTO_INCREMENT PRIMARY KEY,
    data_venda DATE,
    valor_venda DECIMAL(10,2),
    id_imovel INT,
    id_comprador INT,
    id_corretor INT,
    FOREIGN KEY (id_imovel) REFERENCES Imovel(id_imovel),
    FOREIGN KEY (id_comprador) REFERENCES Cliente(id_cliente),
    FOREIGN KEY (id_corretor) REFERENCES Corretor(id_corretor)
);
