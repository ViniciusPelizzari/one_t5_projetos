/*package org.example;

public class Aula17RelacionamentoTabelas {

use loja_virtual;

CREATE TABLE categorias_produtos_lv(
id_categoria INT AUTO_INCREMENT PRIMARY KEY,
nome_categoria VARCHAR(50) NOT NULL) engine = InnoDB;

select * from categorias_produtos_lv;

INSERT INTO categorias_produtos_lv (nome_categoria) VALUES ('Tecnologias');
INSERT INTO categorias_produtos_lv (nome_categoria) VALUES ('Ferramentas');
INSERT INTO categorias_produtos_lv (nome_categoria) VALUES ('Equipamentos');
INSERT INTO categorias_produtos_lv (nome_categoria) VALUES ('Linguagens');

ALTER TABLE produto_lv ADD FOREIGN KEY (categoria_id) REFERENCES categorias_produtos_lv (id_categoria);

UPDATE produto_lv SET categoria_id = 3 WHERE id = 4;
UPDATE produto_lv SET categoria_id = 3 WHERE id = 7;

}*/
