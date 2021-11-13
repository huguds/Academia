# Criar o banco de dados
CREATE DATABASE Academia;

# Utilizar o banco de dados
USE Academia;

# Criar a tabela
CREATE TABLE aluno(
	matricula INT(4) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nome VARCHAR(30) NOT NULL,
    data_nasc VARCHAR(10) NOT NULL,
    idade INT(2) NOT NULL,
    genero VARCHAR(10) NOT NULL,
    cpf VARCHAR(15) NOT NULL,
    objetivo VARCHAR(10) NOT NULL,
    peso FLOAT(5) NOT NULL,
    altura FLOAT(3) NOT NULL,
    cep VARCHAR(30) NOT NULL,
    cidade VARCHAR(15) NOT NULL,
    bairro VARCHAR(10) NOT NULL,
    uf INT(2) NOT NULL,
    endereco VARCHAR(30) NOT NULL,
    numero INT(4) NOT NULL,
    complemento VARCHAR(10) NOT NULL
);

# Verificar os dados da tabela
SELECT * FROM aluno;


# Alterar o valor de uma coluna da tabela
ALTER TABLE aluno CHANGE objetivo objetivo LONGTEXT;
ALTER TABLE aluno CHANGE peso peso VARCHAR(10);
ALTER TABLE aluno CHANGE altura altura VARCHAR(10);
ALTER TABLE aluno CHANGE bairro bairro VARCHAR(30);
ALTER TABLE aluno CHANGE uf uf VARCHAR(2);
ALTER TABLE aluno CHANGE endereco endereco VARCHAR(100);
ALTER TABLE aluno ADD exercicios LONGTEXT;
ALTER TABLE aluno CHANGE exercicios exercicios LONGTEXT;
ALTER TABLE aluno CHANGE peso peso FLOAT(5);

# Deletar da tabela aluno
DELETE FROM aluno
WHERE matricula = 1;