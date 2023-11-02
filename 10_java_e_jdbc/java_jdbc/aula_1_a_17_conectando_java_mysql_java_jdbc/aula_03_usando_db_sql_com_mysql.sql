CREATE DATABASE loja_virtual;

USE loja_virtual;

CREATE TABLE produto_lv(
id INT AUTO_INCREMENT,
nome_produto_lv VARCHAR(50) NOT NULL,
descricao_produto_lv VARCHAR(255),
PRIMARY KEY (id))
Engine = InnoDB;

SELECT * FROM produto_lv;

INSERT INTO produto_lv (nome_produto_lv, descricao_produto_lv) VALUES ('Java', 'Linguagem de programação');
INSERT INTO produto_lv (nome_produto_lv, descricao_produto_lv) VALUES ('MySQL', 'Banco de dados relacional');
INSERT INTO produto_lv (nome_produto_lv, descricao_produto_lv) VALUES ('Spring', 'Framework');

truncate produto_lv;
