INSERT INTO tb_curso(nome, descricao) VALUES ('ads', 'aprende a desenvolver');
INSERT INTO tb_curso(nome, descricao) VALUES ('gestão', 'aprende a gerenciar');
INSERT INTO tb_curso(nome, descricao) VALUES ('adm', 'aprende a administrar');
INSERT INTO tb_curso(nome, descricao) VALUES ('segurança do trampo', 'aprende a segurar');

INSERT INTO tb_aluno(nome,datanasc,numerocelular,email, matricula, sexo, idcurso) VALUES ('RONALDO','25/05/1997','81999717049','rdsbojac@gmail.com','71088760430','M',2);
INSERT INTO tb_aluno(nome,datanasc,numerocelular,email, matricula, sexo, idcurso) VALUES ('GABRIELA','17/08/1999','81986761215','gabi@gmail.com','70773516450','F',1);

INSERT INTO tb_professor(nome,matricula,sexo,idcurso) VALUES ('Bruno','123456789','M',1)
INSERT INTO tb_professor(nome,matricula,sexo,idcurso) VALUES ('Rodrigo','987654321','M',1)
INSERT INTO tb_professor(nome,matricula,sexo,idcurso) VALUES ('Rafaela','0000002556','M',2)

INSERT INTO tb_disciplina(idcurso,nome,codhorario,periodo) VALUES (1,'IP',1,1);
INSERT INTO tb_disciplina(idcurso,nome,codhorario,periodo) VALUES (1,'MATEMATICA',2,1);
INSERT INTO tb_disciplina(idcurso,nome,codhorario,periodo) VALUES (1,'REDES 1',3,3);
INSERT INTO tb_disciplina(idcurso,nome,codhorario,periodo) VALUES (1,'ALGORITMO',4,4);

INSERT INTO tb_disciplina(idcurso,nome,codhorario,periodo) VALUES (1,'ESTATISTICA',1,1);
INSERT INTO tb_disciplina(idcurso,nome,codhorario,periodo) VALUES (1,'POO',2,2);
INSERT INTO tb_disciplina(idcurso,nome,codhorario,periodo) VALUES (1,'REDES 2',3,4);
INSERT INTO tb_disciplina(idcurso,nome,codhorario,periodo) VALUES (1,'I.A',4,3);

INSERT INTO tb_disciplina(idcurso,nome,codhorario,periodo) VALUES (2,'gestao empresarial',1,2);
INSERT INTO tb_disciplina(idcurso,nome,codhorario,periodo) VALUES (2,'gestao ambiental',2,2);
INSERT INTO tb_disciplina(idcurso,nome,codhorario,periodo) VALUES (3,'administracao',3,3);
INSERT INTO tb_disciplina(idcurso,nome,codhorario,periodo) VALUES (4,'introdução a segurança',4,3);

INSERT INTO tb_admin(nome) VALUES ('admin');
INSERT INTO tb_secretaria(nome) VALUES ('Neuza');



