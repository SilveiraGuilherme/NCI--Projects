DROP DATABASE IF EXISTS Gallery;

CREATE DATABASE Gallery;
USE Gallery;

-- Painter table
CREATE TABLE Painter (
    id INT PRIMARY KEY,
    p_name VARCHAR(50) NOT NULL,
    phone VARCHAR(15) NOT NULL
);

-- Gallery table
CREATE TABLE GalleryTable (
    id INT PRIMARY KEY,
    g_owner VARCHAR(50) NOT NULL,
    phone VARCHAR(15) NOT NULL,
    commission_rate DOUBLE NOT NULL,
    rate DOUBLE NOT NULL
);

-- Painting table
CREATE TABLE Painting (
    id INT PRIMARY KEY,
    title VARCHAR(50) NOT NULL,
    price DECIMAL(8,2) NOT NULL,
    gid INT,
    pid INT,
    FOREIGN KEY (gid) REFERENCES GalleryTable(id) ON DELETE CASCADE,
    FOREIGN KEY (pid) REFERENCES Painter(id) ON DELETE CASCADE
);

-- Inserting data into the Painter table
INSERT INTO Painter (id, p_name, phone) VALUES
(1, 'Crista Primo', '9945781732'),
(2, 'Linette Iacobucci', '2561675102'),
(3, 'Aila Beresford', '9256280046'),
(4, 'Gilli Vreede', '1881749139'),
(5, 'Olivette Mowbury', '8697250748'),
(6, 'Francisco Reichhardt', '4625642556'),
(7, 'Ursola Wooder', '1483721456'),
(8, 'Celene Sarginson', '7744874517'),
(9, 'Andris Broun', '2382636143'),
(10, 'Oberon Twaits', '5188727563'),
(11, 'Hebert Skittles', '4946037290'),
(12, 'Berky MacCallester', '5023263032'),
(13, 'Graehme Stirling', '9266106682'),
(14, 'Donaugh Trythall', '3283970371'),
(15, 'Leland Lowfill', '6448179670'),
(16, 'Guglielmo Toffoloni', '3972315265'),
(17, 'Krissy Borsi', '3978966001'),
(18, 'Burk Willoway', '9398722321'),
(19, 'Sim Heyns', '1419780131'),
(20, 'Lorene Yoakley', '4275080120'),
(21, 'Darell Worden', '3561270442'),
(22, 'Alvira Pullinger', '7021803596'),
(23, 'Park Whipp', '3021325630'),
(24, 'Kile Mitchelhill', '3893934902'),
(25, 'North Hallows', '9153033283'),
(26, 'Irene Badby', '2003942586'),
(27, 'Shalom Klishin', '2656851872'),
(28, 'Enrica Betancourt', '2131246758'),
(29, 'Bess Cartledge', '3933903533'),
(30, 'Baillie Rudall', '4101575236'),
(31, 'Thaxter Tift', '9883144095'),
(32, 'Abby Gunby', '1933401969'),
(33, 'Sianna Templeton', '7199030897'),
(34, 'Eustacia Grevatt', '3017911885'),
(35, 'Madelyn Tudgay', '9427567880'),
(36, 'Kendra Woodnutt', '6652862211'),
(37, 'Allard Osgarby', '7307911379'),
(38, 'Silvio Vispo', '8496837595'),
(39, 'Lolita Yakubowicz', '3168920910'),
(40, 'Crin Boneham', '1698627544'),
(41, 'Genni Danell', '9644273586'),
(42, 'Eadith Vittery', '7206881071'),
(43, 'Wally Sergent', '6758537529'),
(44, 'Stacee Tonsley', '5562271653'),
(45, 'Gauthier Tourle', '7416028252'),
(46, 'Jozef Mossbee', '5262678878'),
(47, 'Alidia Hearst', '7071279466'),
(48, 'Michail Mccaull', '7791998454'),
(49, 'Gwendolen Colloby', '4766286543'),
(50, 'Samantha McCumskay', '6553859372');

-- Inserting data into the GalleryTable
INSERT INTO GalleryTable (id, g_owner, phone, commission_rate, rate) VALUES
(1, 'Whitby Braferton', '1234567890', 1.4, 2.5),
(2, 'Heath Dunmore', '0987654321', 1.4, 4.9),
(3, 'Alberta Seabrook', '5544321980', 1.1, 2.4),
(4, 'Chariot Phelit', '1236547890', 4.7, 4.8),
(5, 'Martita Clapham', '8765432109', 3.0, 2.6),
(6, 'Emilee Yurov', '6543219870', 4.5, 1.7),
(7, 'Ladonna Giacobo', '3456789123', 1.1, 1.7),
(8, 'Sofia Jerrome', '9876543210', 1.5, 3.1),
(9, 'Lucas Auton', '2345678901', 1.4, 2.2),
(10, 'Bartholomeus Hixley', '5647382910', 1.9, 3.9),
(11, 'Gaynor Veasey', '6748392109', 2.2, 4.9),
(12, 'Tristam MacTrustram', '7348291930', 1.1, 4.1),
(13, 'Kiri Rollinshaw', '1284763940', 1.0, 3.5),
(14, 'Dom Kear', '9875612340', 2.2, 2.2),
(15, 'Greg Grinvalds', '4356729183', 3.7, 2.1),
(16, 'Chancey Hoonahan', '2348971560', 1.3, 1.4),
(17, 'Sigismondo Flemmich', '5432187690', 4.0, 4.9),
(18, 'Arlee Warman', '8765439870', 4.4, 5.0),
(19, 'Lynn McGaw', '2345619876', 1.4, 4.4),
(20, 'Kenyon Landa', '6473829101', 4.8, 3.2),
(21, 'Jocelyn Tousey', '8976543129', 3.2, 2.6),
(22, 'Putnem Wallace', '9382107654', 2.1, 1.7),
(23, 'Auria Varian', '7820934650', 4.8, 3.0),
(24, 'Perrine Henighan', '6283749201', 4.5, 1.6),
(25, 'Twyla Blumfield', '1728394650', 2.1, 1.3),
(26, 'Mikol Woolens', '7348290561', 2.5, 3.9),
(27, 'Hall Waldram', '9382108765', 3.9, 2.6),
(28, 'Gerda Praton', '9372610945', 3.4, 2.6),
(29, 'Warden Spinelli', '0987234561', 1.2, 1.7),
(30, 'Deva Shurey', '9172834651', 4.0, 1.2),
(31, 'Elysha Posselt', '6283749180', 2.7, 3.7),
(32, 'Dorothee Muehle', '1728394012', 1.9, 2.4),
(33, 'Harlen Atkin', '8172635401', 1.8, 1.9),
(34, 'Rosabel Heardman', '9081723456', 3.2, 1.7),
(35, 'Tova Sevitt', '9876541234', 4.0, 4.3),
(36, 'Sherm Duckels', '6789012345', 2.6, 2.1),
(37, 'Laird Peck', '1728394056', 4.0, 1.2),
(38, 'Ignace Unitt', '1728394675', 4.3, 1.3),
(39, 'Dallis McCrostie', '9382714650', 2.1, 4.9),
(40, 'Cherey Bonifant', '0982345619', 2.7, 1.5),
(41, 'Brigit Blackmuir', '2834650192', 4.9, 1.8),
(42, 'Neal Chandos', '2348975610', 3.8, 1.4),
(43, 'Ishmael Chalcraft', '9123748561', 3.1, 4.0),
(44, 'Oran Tamblyn', '6357281940', 2.8, 3.1),
(45, 'Shaine Tomasz', '1283049657', 4.7, 1.7),
(46, 'Dulcine Balchin', '7281045763', 4.0, 4.0),
(47, 'Tyson Colston', '9382710564', 3.1, 2.2),
(48, 'Danette Lippitt', '1728390461', 4.3, 2.8),
(49, 'Conlee Rickmers', '9372108462', 2.2, 4.2),
(50, 'Dorine Roeber', '2839564102', 1.7, 3.6);

-- Inserting data into the Painting table
INSERT INTO Painting (id, title, price, gid, pid) VALUES
(1, 'Blue Steel', 3210.96, 1, 1),
(2, 'Crimson Sky', 46898.27, 2, 2),
(3, 'Sunset Dreams', 759.99, 3, 3),
(4, 'Twilight Bliss', 5490.50, 4, 4),
(5, 'Ocean Serenity', 9999.99, 5, 5),
(6, 'Golden Horizon', 1200.00, 6, 6),
(7, 'Starlit Night', 7850.75, 7, 7),
(8, 'Urban Jungle', 2321.95, 8, 8),
(9, 'Autumn Symphony', 1572.30, 9, 9),
(10, 'Floral Fantasy', 8999.99, 10, 10),
(11, 'Moonlit Path', 512.75, 11, 11),
(12, 'Mystic Forest', 7025.95, 12, 12),
(13, 'Fire and Ice', 4400.00, 13, 13),
(14, 'Desert Mirage', 6201.25, 14, 14),
(15, 'Lavender Field', 9350.85, 15, 15),
(16, 'Stormy Seas', 4850.60, 16, 16),
(17, 'Summer Breeze', 1700.45, 17, 17),
(18, 'Winter Wonderland', 11500.00, 18, 18),
(19, 'Radiant Bloom', 6400.30, 19, 19),
(20, 'Misty Mountains', 8100.40, 20, 20),
(21, 'Frozen Echoes', 5400.80, 21, 21),
(22, 'Golden Leaves', 3950.50, 22, 22),
(23, 'Autumn Whisper', 6650.20, 23, 23),
(24, 'Spring Blossom', 7430.10, 24, 24),
(25, 'Dawn of Time', 1560.00, 25, 25),
(26, 'Evening Glow', 4350.80, 26, 26),
(27, 'Midnight Sun', 8799.99, 27, 27),
(28, 'Eternal Wave', 5210.90, 28, 28),
(29, 'Whispering Woods', 4730.65, 29, 29),
(30, 'Lunar Serenity', 7925.95, 30, 30),
(31, 'Frosted Peak', 5420.85, 31, 31),
(32, 'Mountain Majesty', 8125.70, 32, 32),
(33, 'Golden Skies', 6725.45, 33, 33),
(34, 'Emerald Waters', 6150.20, 34, 34),
(35, 'Crystalline Dreams', 5240.90, 35, 35),
(36, 'Silver Sands', 4380.55, 36, 36),
(37, 'Morning Dew', 3499.99, 37, 37),
(38, 'Nocturnal Glow', 2700.25, 38, 38),
(39, 'Whirling Dervish', 8800.90, 39, 39),
(40, 'Serpent Spiral', 6715.80, 40, 40),
(41, 'Shattered Echoes', 3300.60, 41, 41),
(42, 'Burning Embers', 4590.30, 42, 42),
(43, 'Shadow Realms', 7525.45, 43, 43),
(44, 'Twilight Bliss', 4835.70, 44, 44),
(45, 'Infinite Dawn', 3405.85, 45, 45),
(46, 'Radiant Reflections', 5150.95, 46, 46),
(47, 'Chasing Starlight', 7799.99, 47, 47),
(48, 'Galactic Voyage', 6230.20, 48, 48),
(49, 'Ethereal Elegance', 9410.40, 49, 49),
(50, 'Tempest Tide', 8500.00, 50, 50);

-- Queries
SELECT COUNT(*) FROM Painting;

SELECT DISTINCT id FROM Painting;
SELECT * FROM Painting WHERE price > 9000;
SELECT * FROM Painting WHERE price NOT BETWEEN 4000 AND 9000;
SELECT * FROM Painter;
SELECT * FROM Painting WHERE title LIKE '%un%';
SELECT * FROM Painting ORDER BY price ASC;
SELECT * FROM Painter WHERE id = 2;

DESCRIBE Painter;
DESCRIBE GalleryTable;
DESCRIBE Painting;
