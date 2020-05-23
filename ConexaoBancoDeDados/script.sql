DROP TABLE fuctura.hospital;

--Primeiro devemos adicionar a nossa chave primária.
--criar a tabela adicionando o ID como atributo identificado
CREATE TABLE fuctura.hospital (
    id     INT,     --atributo identificador
    nome_fantasia   VARCHAR(100), --like
    cnpj            VARCHAR(100), --like
    data_abertura   DATE,
    razao_social    VARCHAR(200), --like
    capacidade      INT NOT NULL,
    CONSTRAINT hospital_pk PRIMARY KEY ( id ) -- adicionando ID como atributo identificado. 
);


--Segundo criamos a tabela de de controle de sequencia. 
--Esta tabelas nos fornecerá um conjunto de número em sequencia começando com 1. Ou seja: 1,2,3,4,...999999999
DROP SEQUENCE fuctura.hospital_seq; --_seq é só nomenclatura para ajudar na leitura.
CREATE SEQUENCE fuctura.hospital_seq START WITH 1; --informar que o primeiro elemento da tabela será 1. O incremento padrão é 1.


--Por último, criaremos uma trigger ou um gatilho que toda vez que nós chamamos o comando de insert.
--Este gatinho será invocado e irá pegar o próximo número sequência da nossa sequence.
CREATE OR REPLACE TRIGGER fuctura.hospital_bir BEFORE --_bir é só nomenclatura para ajudar na leitura.
    INSERT ON fuctura.hospital
    FOR EACH ROW
BEGIN
    SELECT
        fuctura.hospital_seq.NEXTVAL
    INTO :new.id --bater com o nome da chave primaria, utilizada no create. Neste caso é ID.
    FROM
        dual;
END;
/
