SELECT * FROM tbprodutos WHERE preco_lista_produtos >= 5 AND preco_lista_produtos <= 9 AND sabor_produtos = 'Uva';

SELECT * FROM tbprodutos WHERE sabor_produtos <> 'Manga' AND preco_lista_produtos >= 15 OR tamanho_produtos <= '500ml';