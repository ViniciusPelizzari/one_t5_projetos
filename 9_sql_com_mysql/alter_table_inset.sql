CREATE TABLE tbexecutivos(
cpf_executivo VARCHAR(11), 
nome_executivo VARCHAR(50), 
cargo_executivo VARCHAR(30), 
data_admissao_executivo DATE, 
matricula_executivo VARCHAR(10)
);

SELECT * FROM tbexecutivos;

ALTER TABLE tbexecutivos ADD PRIMARY KEY (cpf_executivo);

INSERT INTO tbexecutivos (
cpf_executivo,
nome_executivo,
cargo_executivo,
data_admissao_executivo,
matricula_executivo
) VALUES (
'01234567890', 'Vinícius Pelizzari da Silva', 'Presidente', 
'2003-10-24', '0033');

INSERT INTO tbexecutivos (
cpf_executivo,
nome_executivo,
cargo_executivo,
data_admissao_executivo,
matricula_executivo
) VALUES (
'02548067493', 'Benício Bevilaqua Pelizzari da Silva', 'Presidente-Mor', 
'2023-06-20', '0032');

INSERT INTO tbexecutivos (
cpf_executivo,
nome_executivo,
cargo_executivo,
data_admissao_executivo,
matricula_executivo
) VALUES (
'52834968093', 'Kamila Dias Bevilaqua Pelizzari da Silva', 'Vice-Presidente', 
'2022-05-18', '0034');