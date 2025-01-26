DROP DATABASE IF EXISTS Premiership;

CREATE DATABASE Premiership;

USE Premiership;

CREATE TABLE Premiership(
Team varchar(15) NOT NULL PRIMARY KEY,
Played integer NOT NULL,
Points integer NOT NULL);

SELECT * FROM Premiership;

ALTER TABLE Premiership
ADD Goal_Diff integer;

INSERT INTO Premiership
VALUES ('Arsenal', '23', '55', '29'),
('Man UTD', '23', '53', '26'),
('Chelsea', '23', '49', '24');

UPDATE Premiership
SET Points = Points + 6
WHERE Team = 'Man UTD';

DELETE FROM Premiership
WHERE Team = 'Chelsea';

SELECT * FROM Premiership
ORDER BY Points DESC;