DROP TABLE IF EXISTS MEMBER;

CREATE TABLE MEMBER
(
    SEQ                 BIGINT NOT NULL AUTO_INCREMENT,
    MEMBER_LEVEL        VARCHAR(25),
    MEMBER_ID           VARCHAR(50),
    NAME                VARCHAR(50),
    AGE                 INTEGER,
    CREATED_AT          DATETIME,
    UPDATED_AT          DATETIME,
    PRIMARY KEY (SEQ),
    UNIQUE (`MEMBER_ID`)
);
