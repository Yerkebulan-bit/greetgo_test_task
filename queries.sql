CREATE DATABASE eschool;

USE eschool;

CREATE TABLE student
(
    student_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    student_name VARCHAR(20) NOT NULL,
    student_grade VARCHAR(20) NOT NULL
);