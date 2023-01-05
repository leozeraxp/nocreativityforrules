CREATE DATABASE ncfr;

USE ncfr;

CREATE table users (
    id INT AUTO_INCREMENT UNIQUE NOT NULL,
    name varchar(30) NOT NULL,
    email varchar(100) UNIQUE NOT NULL
);