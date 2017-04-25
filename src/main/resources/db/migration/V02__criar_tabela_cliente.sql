CREATE TABLE cliente (
    codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(80) NOT NULL,
    razao_social VARCHAR(80),
    tipo_pessoa VARCHAR(15) NOT NULL,
    cpf_cnpj VARCHAR(30) NOT NULL,
    inscricao_estadual VARCHAR(30),
    telefone_comercial VARCHAR(20),
    telefone_celular VARCHAR(20),
    email VARCHAR(50),
    logradouro VARCHAR(50),
    numero VARCHAR(15),
    complemento VARCHAR(20),
    cep VARCHAR(15),
    codigo_cidade BIGINT(20),
    FOREIGN KEY (codigo_cidade) REFERENCES cidade(codigo)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;