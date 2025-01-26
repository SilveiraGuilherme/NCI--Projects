USE DreamHome;

CREATE USER 'Margarita'@'localhost' IDENTIFIED BY '1234';

GRANT ALL PRIVILEGES ON * . * TO 'Margarita'@'localhost' WITH GRANT OPTION;

FLUSH PRIVILEGES; 

SELECT Fname FROM Staff
WHERE Fname = 'Margarita';