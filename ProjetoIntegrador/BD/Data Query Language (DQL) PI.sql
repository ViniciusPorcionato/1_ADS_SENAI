-- Selecionar todos os clientes
SELECT * FROM clientes;

-- Selecionar todos os corretores
SELECT * FROM corretores;

-- Selecionar todos os imóveis
SELECT * FROM imoveis;

-- Selecionar todas as locações
SELECT * FROM locacao;

-- Selecionar todas as vendas
SELECT * FROM venda;

-- Mostrar locações com dados do cliente, imóvel e corretor
SELECT 
    locacao.id_locatario,
    clientes.nome AS nome_cliente,
    imoveis.endereco,
    corretores.nome AS nome_corretor,
    locacao.valor_mensal
FROM locacao
INNER JOIN clientes ON locacao.id_locatario = clientes.id
INNER JOIN imoveis ON locacao.id_imovel = imoveis.id
INNER JOIN corretores ON locacao.id_corretor = corretores.id;

-- Mostrar vendas com comprador, corretor e informações do imóvel
SELECT 
    venda.id,
    venda.data_venda,
    venda.valor_venda,
    clientes.nome AS comprador,
    corretores.nome AS corretor,
    imoveis.endereco
FROM venda
INNER JOIN clientes ON venda.id_comprador = clientes.id
INNER JOIN corretores ON venda.id_corretor = corretores.id
INNER JOIN imoveis ON venda.id_imovel = imoveis.id;

-- Mostrar todos os imóveis, mesmo os que não estão locados
SELECT 
    imoveis.id,
    imoveis.endereco,
    locacao.id_locatario,
    locacao.valor_mensal
FROM imoveis
LEFT JOIN locacao ON imoveis.id = locacao.id_imovel;

-- Mostrar todos os corretores, com suas locações (se houver)
SELECT 
    corretores.nome,
    locacao.id_imovel,
    locacao.valor_mensal
FROM locacao
RIGHT JOIN corretores ON locacao.id_corretor = corretores.id;

-- Total de imóveis por tipo
SELECT 
    tipoImoveis.descricao AS tipo,
    COUNT(*) AS quantidade
FROM imoveis
INNER JOIN tipoImoveis ON imoveis.id_tipo = tipoImoveis.id
GROUP BY tipoImoveis.descricao;

-- Imóveis com seus proprietários
SELECT 
    imoveis.endereco,
    proprietarios.nome AS proprietario
FROM imoveis
INNER JOIN proprietarios ON imoveis.id_proprietario = proprietarios.id;

-- Clientes que alugaram e também compraram imóveis
SELECT DISTINCT c.nome
FROM clientes c
INNER JOIN locacao l ON c.id = l.id_locatario
INNER JOIN venda v ON c.id = v.id_comprador;
