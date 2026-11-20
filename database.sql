CREATE DATABASE StudentManagement;

USE StudentManagement;

CREATE TABLE students (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    course VARCHAR(100)
);

INSERT INTO students VALUES
(101, 'Chathurasri', 'CSE AIML'),
(102, 'Rahul', 'CSE');

SELECT * FROM students;
