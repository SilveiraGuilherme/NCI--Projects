SELECT CountryCode, Language, Percentage
FROM countrylanguage
WHERE CountryCode = 'USA'
ORDER BY Percentage DESC;

SELECT CountryCode, Language, isOfficial, Percentage
FROM countrylanguage
WHERE isOfficial = 'T'
ORDER BY Language;

SELECT CountryCode, Language, Percentage
FROM countrylanguage
WHERE Percentage = '100' AND Language = 'English';

SELECT Code, Name
FROM country
WHERE Code = 'BMU';

SELECT Continent, Name
FROM country
WHERE Continent = 'Antarctica';

SELECT Continent, Region, LifeExpectancy, Name
FROM country
WHERE LifeExpectancy >= 78
ORDER BY Continent, Region ASC, LifeExpectancy DESC;

SELECT Name, IndepYear
FROM country
WHERE IndepYear <= 0;

SELECT Name, LocalName
FROM country
WHERE LocalName = Name;

SELECT Name
FROM country
WHERE Name LIKE '%Republic%';

SELECT Name, GovernmentForm
FROM country
WHERE GovernmentForm LIKE '%Monarchy%';

SELECT Name, Continent
FROM country
WHERE Continent <> 'Africa';

SELECT Name, Continent
FROM country
WHERE Continent = 'Europe' OR Continent = 'Oceania' OR Continent = 'Antarctica'
ORDER BY Continent;

SELECT Name, GNP
FROM country
WHERE GNP >= 10000 AND GNP <= 50000
ORDER BY GNP;

SELECT Name
FROM country
WHERE Name LIKE 'A%' OR Name LIKE 'B%'
ORDER BY Name;

AlTER TABLE country
ADD COLUMN PopulationDensity INT;

UPDATE country
SET PopulationDensity = Population / SurfaceArea;

SELECT Name, Population, SurfaceArea, PopulationDensity
FROM country
ORDER BY PopulationDensity DESC;

SELECT Code, Name
FROM country;

SELECT CountryCode, Language, isOfficial
FROM countrylanguage;

SELECT country.Name, countrylanguage.Language, countrylanguage.IsOfficial
FROM country
INNER JOIN countrylanguage
ON country.Code = countrylanguage.CountryCode
WHERE IsOfficial = 'T' AND Language = 'German'
ORDER BY Name;

SELECT country.Name, count(country.Name) AS PopulatedCities
FROM country
INNER JOIN city
ON country.Code = city.CountryCode
WHERE city.Population >= 5000000
GROUP BY country.Name
HAVING count(country.Name) >= 2;


