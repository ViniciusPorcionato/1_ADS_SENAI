USE Imobiliaria;

INSERT INTO clientes (nome, cpf, telefone, email) VALUES
('João Silva', '123.456.789-01', '11912345678', 'joao.silva@email.com'),
('Maria Souza', '234.567.890-12', '11923456789', 'maria.souza@email.com'),
('Carlos Lima', '345.678.901-23', '11934567890', 'carlos.lima@email.com'),
('Ana Paula', '456.789.012-34', '11945678901', 'ana.paula@email.com'),
('Roberto Dias', '567.890.123-45', '11956789012', 'roberto.dias@email.com'),
('Juliana Alves', '678.901.234-56', '11967890123', 'juliana.alves@email.com'),
('Felipe Rocha', '789.012.345-67', '11978901234', 'felipe.rocha@email.com'),
('Luciana Mendes', '890.123.456-78', '11989012345', 'luciana.mendes@email.com'),
('André Costa', '901.234.567-89', '11990123456', 'andre.costa@email.com'),
('Beatriz Ramos', '012.345.678-90', '11901234567', 'beatriz.ramos@email.com');

INSERT INTO corretores (nome, creci, telefone, email) VALUES
('Paulo Henrique', 'SP12345', '11911112222', 'paulo.henrique@email.com'),
('Fernanda Lima', 'SP23456', '11922223333', 'fernanda.lima@email.com'),
('Marcos Vieira', 'SP34567', '11933334444', 'marcos.vieira@email.com'),
('Camila Teixeira', 'SP45678', '11944445555', 'camila.teixeira@email.com'),
('Renato Borges', 'SP56789', '11955556666', 'renato.borges@email.com'),
('Tatiane Pires', 'SP67890', '11966667777', 'tatiane.pires@email.com'),
('Eduardo Martins', 'SP78901', '11977778888', 'eduardo.martins@email.com'),
('Gabriela Rocha', 'SP89012', '11988889999', 'gabriela.rocha@email.com'),
('Ricardo Souza', 'SP90123', '11999990000', 'ricardo.souza@email.com'),
('Patrícia Silva', 'SP01234', '11900001111', 'patricia.silva@email.com');

INSERT INTO tipoImoveis (descricao) VALUES
('Apartamento'),
('Casa'),
('Kitnet'),
('Sobrado'),
('Cobertura'),
('Terreno'),
('Loft'),
('Duplex'),
('Chácara'),
('Studio');

INSERT INTO proprietarios (nome, cpf, telefone, email) VALUES
('Eduardo Almeida', '321.654.987-00', '11910101010', 'eduardo.almeida@email.com'),
('Sandra Regina', '432.765.098-11', '11920202020', 'sandra.regina@email.com'),
('Thiago Ferreira', '543.876.109-22', '11930303030', 'thiago.ferreira@email.com'),
('Mariana Lopes', '654.987.210-33', '11940404040', 'mariana.lopes@email.com'),
('Luiz Gustavo', '765.098.321-44', '11950505050', 'luiz.gustavo@email.com'),
('Cláudia Neves', '876.109.432-55', '11960606060', 'claudia.neves@email.com'),
('Rodrigo Mendes', '987.210.543-66', '11970707070', 'rodrigo.mendes@email.com'),
('Débora Faria', '098.321.654-77', '11980808080', 'debora.faria@email.com'),
('Vitor Amaral', '109.432.765-88', '11990909090', 'vitor.amaral@email.com'),
('Isabela Martins', '210.543.876-99', '11911112233', 'isabela.martins@email.com');

INSERT INTO imoveis (endereco, cidade, estado, cep, valor, area, quartos, banheiros, vagas, id_tipo, id_proprietario) VALUES
('Rua das Flores, 123', 'São Paulo', 'SP', '01001-000', 450000.00, 85.00, 2, 1, 1, 1, 1),
('Av. Brasil, 456', 'Campinas', 'SP', '13000-000', 600000.00, 120.00, 3, 2, 2, 2, 2),
('Rua A, 10', 'Santos', 'SP', '11000-000', 300000.00, 45.00, 1, 1, 0, 3, 3),
('Av. Paulista, 789', 'São Paulo', 'SP', '01311-000', 950000.00, 90.00, 2, 2, 1, 4, 4),
('Rua B, 20', 'Sorocaba', 'SP', '18000-000', 250000.00, 60.00, 2, 1, 1, 5, 5),
('Rua C, 30', 'Jundiaí', 'SP', '13200-000', 800000.00, 200.00, 4, 3, 3, 6, 6),
('Rua D, 40', 'São Paulo', 'SP', '04000-000', 1200000.00, 150.00, 3, 2, 2, 7, 7),
('Rua E, 50', 'Campinas', 'SP', '13050-000', 500000.00, 70.00, 2, 1, 1, 8, 8),
('Rua F, 60', 'São Paulo', 'SP', '05000-000', 320000.00, 55.00, 1, 1, 0, 9, 9),
('Rua G, 70', 'Santos', 'SP', '11020-000', 400000.00, 65.00, 2, 1, 1, 10, 10);

INSERT INTO locacao (data_inicio, data_fim, valor_mensal, id_imovel, id_locatario, id_corretor) VALUES
('2024-01-01', '2025-01-01', 2000.00, 1, 1, 1),
('2024-02-01', NULL, 2500.00, 2, 2, 2),
('2024-03-01', NULL, 1800.00, 3, 3, 3),
('2024-04-01', NULL, 3000.00, 4, 4, 4),
('2024-05-01', NULL, 1500.00, 5, 5, 5),
('2024-06-01', NULL, 3500.00, 6, 6, 6),
('2024-07-01', NULL, 4000.00, 7, 7, 7),
('2024-08-01', NULL, 2200.00, 8, 8, 8),
('2024-09-01', NULL, 1700.00, 9, 9, 9),
('2024-10-01', NULL, 2600.00, 10, 10, 10);

INSERT INTO venda (data_venda, valor_venda, id_imovel, id_comprador, id_corretor) VALUES
('2024-01-15', 450000.00, 1, 2, 1),
('2024-02-20', 600000.00, 2, 3, 2),
('2024-03-25', 300000.00, 3, 4, 3),
('2024-04-10', 950000.00, 4, 5, 4),
('2024-05-05', 250000.00, 5, 6, 5),
('2024-06-18', 800000.00, 6, 7, 6),
('2024-07-22', 1200000.00, 7, 8, 7),
('2024-08-30', 500000.00, 8, 9, 8),
('2024-09-15', 320000.00, 9, 10, 9),
('2024-10-05', 400000.00, 10, 1, 10);
