ALTER TABLE tbvendedor ADD PRIMARY KEY (matricula_vendedor);

ALTER TABLE tbvendedor ADD COLUMN (data_admissao DATE);
ALTER TABLE tbvendedor ADD COLUMN (de_ferias VARCHAR(1));

UPDATE tbvendedor SET data_admissao = '2022-05-18' WHERE matricula_vendedor = '00234';
UPDATE tbvendedor SET de_ferias = 'S' WHERE matricula_vendedor = '00234';

UPDATE tbvendedor SET data_admissao = '2023-06-20' WHERE matricula_vendedor = '00235';
UPDATE tbvendedor SET de_ferias = 'S' WHERE matricula_vendedor = '00235';

UPDATE tbvendedor SET data_admissao = '2003-10-24' WHERE matricula_vendedor = '00233';
UPDATE tbvendedor SET de_ferias = 'N' WHERE matricula_vendedor = '00233';

SELECT * FROM tbvendedor;