DROP DATABASE exercise_lab_4;

CREATE DATABASE exercise_lab_4;
USE exercise_lab_4;

-- Creating Table1 and Table3
CREATE TABLE Table1 (
A VARCHAR(1) PRIMARY KEY,
B VARCHAR(1) NOT NULL
);
CREATE TABLE Table3 (
C VARCHAR(1),
D INT,
E VARCHAR(1) NOT NULL,
PRIMARY KEY (C, D)
);

-- Creating Table2 with foreign keys from Table1 and Table3
CREATE TABLE Table2 (
A VARCHAR(1),
C VARCHAR(1),
D INT,
PRIMARY KEY (A, C, D),
FOREIGN KEY (A) REFERENCES Table1(A)
	ON DELETE CASCADE,
FOREIGN KEY (C, D) REFERENCES Table3(C, D)
	ON DELETE CASCADE
);

-- Insert data into tables
INSERT INTO Table1 (A, B)
VALUES
('a', 'b');
INSERT INTO Table3 (C, D, E)
VALUES
('x', 1, 'w'),
('x', 2, 'z');
INSERT INTO Table2 (A, C, D)
VALUES
('a', 'x', 1),
('a', 'x', 2);

-- Creating Table2 with foreign keys from Table1 and Table3
SELECT t2.A, t2.C, t2.D, t1.B, t3.E
FROM Table2 t2
INNER JOIN Table1 t1
ON t2.A = t1.A
INNER JOIN Table3 t3
ON t2.C = t3.C AND t2.D = t3.D;

-- See the structure of the tables
DESCRIBE Table1;
DESCRIBE Table2;
DESCRIBE Table3;

-- See all data in the tables
SELECT * FROM Table1;
SELECT * FROM Table2;
SELECT * FROM Table3;