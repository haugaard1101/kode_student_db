CREATE DATABASE kea;
Use kea;
CREATE table student
(
    id     int NOT NULL AUTO_INCREMENT,
    name   varchar(50),
    email  VARCHAR(50),
    gender binary(1),
    PRIMARY KEY (id)
);
