-- V1__create_users_table.sql
-- Criação da tabela de usuários
-- Autor: Felipe (Tech Lead)
-- Data: Abril 2026

CREATE TABLE users (
    id                    BINARY(16)   NOT NULL,
    nome                  VARCHAR(150) NOT NULL,
    email                 VARCHAR(200) NOT NULL,
    login                 VARCHAR(30)  NOT NULL,
    senha                 VARCHAR(255) NOT NULL,
    role                  VARCHAR(30)  NOT NULL,
    data_ultima_alteracao DATETIME     NOT NULL,

    -- Endereço (Embeddable)
    rua                   VARCHAR(255) NOT NULL,
    numero                VARCHAR(20)  NOT NULL,
    cidade                VARCHAR(100) NOT NULL,
    estado                CHAR(2)      NOT NULL,
    cep                   VARCHAR(9)   NOT NULL,
    complemento           VARCHAR(255),

    CONSTRAINT pk_users PRIMARY KEY (id),
    CONSTRAINT uk_users_email UNIQUE (email),
    CONSTRAINT uk_users_login UNIQUE (login)
);

CREATE INDEX idx_users_nome ON users (nome);

