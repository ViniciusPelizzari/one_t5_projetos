SELECT * FROM tbprodutos;

SELECT codigo_produtos FROM tbprodutos LIMIT 5;

SELECT codigo_produtos AS codigo, nome_produtos AS nome FROM tbprodutos;

SELECT codigo_produtos ='1004327' FROM tbprodutos;

SELECT * FROM tbprodutos WHERE embalagem_produtos ='PET';

SELECT * FROM tbclientes WHERE idade_clientes = 19;

SELECT * FROM tbclientes WHERE idade_clientes <= 19;

SELECT * FROM tbclientes WHERE idade_clientes > 19;

SELECT * FROM tbclientes WHERE idade_clientes <> 19;

SELECT * FROM tbclientes WHERE nome_clientes >= 'Emanueli Pelizzari da Silva';

SELECT * FROM tbclientes WHERE nome_clientes <> 'Emanueli Pelizzari da Silva';

SELECT * FROM tbprodutos WHERE preco_lista_produtos BETWEEN 5.03 AND 7.90;

SELECT * FROM tbclientes WHERE dn_clientes = '2003-10-24';

SELECT * FROM tbclientes WHERE dn_clientes >= '2003-10-24';

SELECT * FROM tbclientes WHERE YEAR(dn_clientes) >= 2005;

SELECT * FROM tbclientes WHERE MONTH(dn_clientes) < 10;