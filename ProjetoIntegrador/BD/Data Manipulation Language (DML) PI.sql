USE Imobiliaria;

INSERT INTO clientes (nome, cpf, telefone, email, data_nascimento, genero) VALUES
('Ana Paula Souza', '123.456.789-00', '(11) 91234-5678', 'ana.souza@email.com', '1990-05-14', 'Feminino'),
('Carlos Eduardo Lima', '987.654.321-00', '(11) 99876-5432', 'carlos.lima@email.com', '1985-08-22', 'Masculino'),
('Juliana Mendes', '456.789.123-00', '(11) 92345-6789', 'juliana.mendes@email.com', '1992-12-10', 'Feminino'),
('Bruno Rocha', '789.123.456-00', '(11) 93456-7890', 'bruno.rocha@email.com', '1988-03-15', 'Masculino'),
('Mariana Ferreira', '321.654.987-00', '(11) 94567-8901', 'mariana.ferreira@email.com', '1995-06-25', 'Feminino'),
('Lucas Martins', '654.321.987-00', '(11) 95678-9012', 'lucas.martins@email.com', '1991-09-30', 'Masculino'),
('Fernanda Dias', '159.753.486-00', '(11) 96789-0123', 'fernanda.dias@email.com', '1993-11-05', 'Feminino'),
('Rodrigo Alves', '753.159.486-00', '(11) 97890-1234', 'rodrigo.alves@email.com', '1987-02-18', 'Masculino'),
('Patrícia Gomes', '852.456.963-00', '(11) 98901-2345', 'patricia.gomes@email.com', '1996-04-12', 'Feminino'),
('Thiago Santana', '963.852.741-00', '(11) 99012-3456', 'thiago.santana@email.com', '1990-01-01', 'Masculino');

INSERT INTO corretores (nome, creci, telefone, email, data_admissao, especialidade) VALUES
('João Oliveira', 'SP123456', '(11) 91111-2222', 'joao.oliveira@imob.com', '2020-01-15', 'Venda'),
('Renata Lima', 'SP654321', '(11) 92222-3333', 'renata.lima@imob.com', '2019-03-20', 'Locação'),
('Felipe Silva', 'SP789456', '(11) 93333-4444', 'felipe.silva@imob.com', '2021-07-10', 'Ambos'),
('Luciana Mendes', 'SP321987', '(11) 94444-5555', 'luciana.mendes@imob.com', '2018-10-25', 'Venda'),
('Gabriel Costa', 'SP147258', '(11) 95555-6666', 'gabriel.costa@imob.com', '2020-05-05', 'Locação'),
('Isabela Moreira', 'SP369258', '(11) 96666-7777', 'isabela.moreira@imob.com', '2022-01-02', 'Venda'),
('Roberto Souza', 'SP963852', '(11) 97777-8888', 'roberto.souza@imob.com', '2017-11-11', 'Locação'),
('Camila Ribeiro', 'SP258369', '(11) 98888-9999', 'camila.ribeiro@imob.com', '2021-09-18', 'Ambos'),
('Daniel Freitas', 'SP852741', '(11) 99999-0000', 'daniel.freitas@imob.com', '2023-02-20', 'Venda'),
('Elaine Martins', 'SP741852', '(11) 90000-1111', 'elaine.martins@imob.com', '2016-06-06', 'Locação');

INSERT INTO tipoImoveis (descricao) VALUES
('Apartamento'),
('Casa'),
('Cobertura'),
('Kitnet'),
('Loft'),
('Sobrado'),
('Studio'),
('Terreno'),
('Chácara'),
('Galpão');

INSERT INTO proprietarios (nome, cpf, telefone, email, data_nascimento, genero) VALUES
('José da Silva', '111.222.333-44', '(11) 91123-4567', 'jose.silva@email.com', '1970-02-02', 'Masculino'),
('Maria Oliveira', '222.333.444-55', '(11) 92234-5678', 'maria.oliveira@email.com', '1980-03-03', 'Feminino'),
('Paulo Santos', '333.444.555-66', '(11) 93345-6789', 'paulo.santos@email.com', '1975-04-04', 'Masculino'),
('Carla Martins', '444.555.666-77', '(11) 94456-7890', 'carla.martins@email.com', '1985-05-05', 'Feminino'),
('Rafael Gomes', '555.666.777-88', '(11) 95567-8901', 'rafael.gomes@email.com', '1990-06-06', 'Masculino'),
('Letícia Ferreira', '666.777.888-99', '(11) 96678-9012', 'leticia.ferreira@email.com', '1992-07-07', 'Feminino'),
('André Almeida', '777.888.999-00', '(11) 97789-0123', 'andre.almeida@email.com', '1983-08-08', 'Masculino'),
('Beatriz Souza', '888.999.000-11', '(11) 98890-1234', 'beatriz.souza@email.com', '1978-09-09', 'Feminino'),
('Fábio Costa', '999.000.111-22', '(11) 99901-2345', 'fabio.costa@email.com', '1991-10-10', 'Masculino'),
('Viviane Rocha', '000.111.222-33', '(11) 90012-3456', 'viviane.rocha@email.com', '1986-11-11', 'Feminino');

INSERT INTO imoveis (endereco, cidade, estado, cep, valor, area, quartos, banheiros, vagas, id_tipo, id_proprietario) VALUES
('Rua A, 123', 'São Paulo', 'SP', '01001-000', 350000.00, 75.5, 2, 1, 1, 1, 1),
('Av. B, 456', 'Campinas', 'SP', '13010-000', 450000.00, 120.0, 3, 2, 2, 2, 2),
('Rua C, 789', 'São Paulo', 'SP', '01002-000', 800000.00, 180.0, 4, 3, 3, 3, 3),
('Rua D, 321', 'Sorocaba', 'SP', '18000-000', 250000.00, 45.0, 1, 1, 0, 4, 4),
('Rua E, 654', 'São Paulo', 'SP', '01003-000', 600000.00, 95.0, 3, 2, 2, 5, 5),
('Av. F, 987', 'Campinas', 'SP', '13020-000', 700000.00, 160.0, 4, 3, 2, 6, 6),
('Rua G, 147', 'São Paulo', 'SP', '01004-000', 180000.00, 35.0, 1, 1, 0, 7, 7),
('Rua H, 258', 'Jundiaí', 'SP', '13200-000', 300000.00, 80.0, 2, 2, 1, 8, 8),
('Rua I, 369', 'São Paulo', 'SP', '01005-000', 500000.00, 100.0, 3, 2, 1, 9, 9),
('Av. J, 159', 'Campinas', 'SP', '13030-000', 900000.00, 200.0, 5, 4, 4, 10, 10);

INSERT INTO locacao (data_inicio, data_fim, valor_mensal, id_imovel, id_locatario, id_corretor) VALUES
('2024-01-01', NULL, 1800.00, 1, 1, 1),
('2024-02-01', NULL, 2200.00, 2, 2, 2),
('2023-12-15', '2024-12-15', 1500.00, 3, 3, 3),
('2023-11-10', '2024-11-10', 2000.00, 4, 4, 4),
('2024-03-05', NULL, 1700.00, 5, 5, 5),
('2023-10-01', '2024-10-01', 1600.00, 1, 6, 6),
('2024-01-20', NULL, 1900.00, 2, 7, 7),
('2023-09-15', '2024-09-15', 1400.00, 3, 8, 8),
('2023-08-01', NULL, 2100.00, 4, 9, 9),
('2024-04-01', NULL, 2000.00, 5, 10, 10);

INSERT INTO venda (data_venda, valor_venda, id_imovel, id_comprador, id_corretor) VALUES
('2024-01-10', 700000.00, 6, 1, 1),
('2024-02-15', 750000.00, 7, 2, 2),
('2023-12-20', 800000.00, 8, 3, 3),
('2024-03-01', 900000.00, 9, 4, 4),
('2024-04-10', 950000.00, 10, 5, 5),
('2023-11-05', 710000.00, 6, 6, 6),
('2023-10-15', 730000.00, 7, 7, 7),
('2023-09-25', 790000.00, 8, 8, 8),
('2024-01-25', 880000.00, 9, 9, 9),
('2024-02-28', 920000.00, 10, 10, 10);
