CREATE DATABASE eschool;

USE eschool;

CREATE TABLE student
(
    student_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    student_name VARCHAR(20) NOT NULL,
    student_grade VARCHAR(20) NOT NULL
);

INSERT INTO student (student_name, student_grade) VALUES('Yerkebulan', '5th grade');
INSERT INTO student (student_name, student_grade) VALUES('Roman', '11th grade');
INSERT INTO student (student_name, student_grade) VALUES('Timur', '1st grade');
