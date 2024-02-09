DROP DATABASE IF EXISTS lpii_cl1_Gonzales_Medina;

CREATE DATABASE lpii_cl1_Gonzales_Medina;

USE lpii_cl1_Gonzales_Medina;

CREATE TABLE tb_subject (
	idsubject int auto_increment primary key,
    subject varchar(45) not null,
	credits varchar(45) not null
);

INSERT INTO tb_subject VALUES (null, 'Lenguaje de Programación II', '5');
INSERT INTO tb_subject VALUES (null, 'POO II', '5');
INSERT INTO tb_subject VALUES (null, 'Desarrollo de Habiliades Profesionales', '2');

SELECT * FROM tb_subject;
