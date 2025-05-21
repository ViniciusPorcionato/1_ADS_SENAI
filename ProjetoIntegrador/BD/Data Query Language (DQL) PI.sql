USE Imobiliaria;

-- Selecionat todos os clientes
SELECT * FROM clientes;

-- Selecionat todos os corretores
SELECT * FROM corretores;

-- Selecionat todos os proprietarios
SELECT * FROM proprietarios;

-- Selecionat todos os tipo de imoveis
SELECT * FROM tipoImoveis;

-- Selecionat todos os imoveis
SELECT * FROM imoveis;

-- Selecionat todos os imoveis para locação
SELECT * FROM locacao;

-- Selecionat todos os imoveis para venda
SELECT * FROM venda;

-- Clientes que alugaram imóveis
SELECT 
    c.nome AS nome_cliente,
    i.endereco,
    l.data_inicio,
    l.data_fim
FROM locacao l
INNER JOIN clientes c ON l.id_locatario = c.id_cliente
INNER JOIN imoveis i ON l.id_imovel = i.id_imovel;

-- Clientes que compraram imóveis
SELECT 
    c.nome AS nome_cliente,
    i.endereco,
    v.valor_venda,
    v.data_venda
FROM venda v
INNER JOIN clientes c ON v.id_comprador = c.id_cliente
INNER JOIN imoveis i ON v.id_imovel = i.id_imovel;

-- Imóveis com tipo e nome do proprietário
SELECT 
    i.endereco,
    ti.descricao AS tipo_imovel,
    p.nome AS nome_proprietario
FROM imoveis i
INNER JOIN tipoImoveis ti ON i.id_tipo = ti.id_tipo
INNER JOIN proprietarios p ON i.id_proprietario = p.id_proprietario;

-- Corretores envolvidos em vendas
SELECT 
    co.nome AS nome_corretor,
    c.nome AS nome_cliente,
    i.endereco,
    v.valor_venda,
    v.data_venda
FROM venda v
INNER JOIN corretores co ON v.id_corretor = co.id_corretor
INNER JOIN clientes c ON v.id_comprador = c.id_cliente
INNER JOIN imoveis i ON v.id_imovel = i.id_imovel;

-- Quantidade de imóveis disponíveis por tipo
SELECT ti.descricao AS tipo_imovel, COUNT(*) AS quantidade
FROM imoveis i
INNER JOIN tipoImoveis ti ON i.id_tipo = ti.id_tipo
GROUP BY ti.descricao;

