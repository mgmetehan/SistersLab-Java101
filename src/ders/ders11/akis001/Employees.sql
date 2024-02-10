-- docker-compose up -d


-- CREATE DATABASE SistersLabDB;

-- Tablo olusturma
/*CREATE TABLE Employees
(
    EmployeeID SERIAL PRIMARY KEY,
    FirstName  VARCHAR(50),
    LastName   VARCHAR(50),
    Department VARCHAR(50),
    Salary     NUMERIC(10, 2),
    HireDate   DATE
);*/

-- Alter islemi
/*ALTER TABLE employees
    add Gender char(1);
ALTER TABLE employees
    DROP COLUMN Gender;

ALTER TABLE employees
    add Gender char(1);*/

-- Insert islemi
/*INSERT INTO Employees (FirstName, LastName, Department, Salary, HireDate, Gender)
VALUES ('John', 'Doe', 'HR', 5000.00, '2022-01-10', 'M');

INSERT INTO Employees (FirstName, LastName, Department, Salary, HireDate, Gender)
VALUES ('Jane', 'Smith', 'IT', 6000.00, '2021-12-15', 'F'),
       ('Michael', 'Johnson', 'Finance', 5500.00, '2022-02-01', 'M'),
       ('Emily', 'Brown', 'HR', 4800.00, '2022-01-20', 'F');*/

-- Select islemi
/*SELECT *
FROM Employees;

SELECT firstname, department
FROM Employees;

SELECT *
FROM Employees
WHERE Department = 'HR';

SELECT *
FROM Employees
WHERE Salary > 5500.00;

SELECT *
FROM Employees
WHERE Salary >= 5000.00
  and Gender = 'M';*/

-- Delete Islemi
/*DELETE
FROM Employees
WHERE EmployeeID = 4;

DELETE
FROM Employees
WHERE Department = 'HR';
Select *
from employees;
*/

-- Truncate Islemi
-- TRUNCATE TABLE Employees;

-- Update Islemi
/*UPDATE Employees
SET Gender = 'F';

UPDATE Employees
SET Gender = 'M'
WHERE EmployeeID = 10
   or EmployeeID = 12;

UPDATE Employees
SET Salary = Salary * 1.1
WHERE Department = 'HR';

INSERT INTO Employees (FirstName, LastName, Salary, HireDate, Gender)
VALUES ('Metehan', 'Gultekin', 5200.00, '2024-01-10', 'F');

UPDATE Employees
set Department = 'DEV'
WHERE FirstName = 'Metehan';

UPDATE Employees
set Salary = (5000 + 6000 + 4250) / 3
WHERE FirstName = 'Metehan'*/

-- Count Islemi
/*SELECT COUNT(*) AS Total_Employees
FROM Employees;

SELECT COUNT(*) AS CountNewEmployees
FROM Employees
WHERE HireDate >= '2024-01-01';

SELECT COUNT(*) AS CountAbove5000
FROM Employees
WHERE Salary > 5000.00;*/

-- Sum Islemi
-- SELECT SUM(Salary) FROM Employees;

-- Avg Islemi
-- SELECT AVG(Salary) FROM Employees;

-- Max Islemi
-- SELECT MAX(Salary) FROM Employees;

-- Min Islemi
-- SELECT MIN(Salary) FROM Employees;

-- Group By
/*-- Departman bazinda calisan sayisi
SELECT Department, COUNT(*) AS EmployeeCount
FROM Employees
GROUP BY Department;

-- Departman bazinda ortalama maas
SELECT Department, AVG(Salary) AS AvgSalary
FROM Employees
GROUP BY Department;

SELECT Gender,Count(*) AS Gender
FROM Employees
GROUP BY Gender;*/

-- Having Islemi
/*HAVING ifadesi, GROUP BY ifadesi ile kullanilir ve gruplanmis veriler uzerinde filtreleme yapmamizi saglar.
WHERE ifadesi tekil satirlari filtrelerken, HAVING ifadesi gruplanmis satirlari filtreler.
Ozellikle gruplama islemi yapilan sorgularda, toplu islemleri filtrelemek icin kullanilir.

Ornek olarak, departman bazinda ortalama maasi 5400'den fazla olan departmanlari bulalim:*/

/*SELECT Department, AVG(Salary) AS AvgSalary
FROM Employees
GROUP BY Department
HAVING AVG(Salary) > 5400.00;
-- VS
SELECT Department, AVG(Salary) AS AvgSalary
FROM Employees
WHERE Salary > 5400.00
GROUP BY Department;*/

/*Bu sorgu, departman bazinda ortalama maasi 5400'den fazla olan departmanlari bulur.
  Ilk olarak veriler departmana gore gruplanir (GROUP BY Department),
  sonra gruplar arasinda ortalama maas 5400'den fazla olanlari filtreler (HAVING AVG(Salary) > 5400.00).*/


-- Like Islemi
/*-- "Smith" soyadina sahip calisanlari bulalim:
SELECT *
FROM Employees
WHERE LastName LIKE 'Smith';

-- ismi "J" harfi ile baslayan calisanlari bulalim:
SELECT *
FROM Employees
WHERE FirstName LIKE 'J%';

-- Soyismi "n" ile bitenler:
SELECT *
FROM Employees
WHERE LastName LIKE '%n';

-- ismi "n" icermeyenler:
SELECT *
FROM Employees
WHERE FirstName NOT LIKE '%n%';

-- "ohn" iceren isimlere sahip calisanlari bulalim:
SELECT *
FROM Employees
WHERE FirstName LIKE '%ohn%';

-- Ismi "M" ile baslayan "n" ile biten
SELECT *
FROM Employees
WHERE FirstName LIKE 'M%n';

SELECT * FROM Employees WHERE FirstName LIKE 'M_t%';
SELECT * FROM Employees WHERE FirstName LIKE 'M_d%';*/

-- DISTINCT Islemi
/*SELECT DISTINCT FirstName
FROM Employees;

SELECT count(DISTINCT (Department)) AS DepartmentCount
FROM Employees;

INSERT INTO Employees (FirstName, LastName, Department, Salary, HireDate, Gender)
 VALUES ('Emily', 'Brown', 'HR', 4800.00, '2022-01-20', 'F');

SELECT FirstName
FROM Employees
WHERE Department = 'HR';

SELECT DISTINCT FirstName
FROM Employees
WHERE Department = 'HR';*/


-- Order By Islemi
/*SELECT * FROM Employees ORDER BY FirstName;
SELECT * FROM Employees;

SELECT * FROM Employees ORDER BY Salary DESC;

SELECT * FROM Employees ORDER BY EmployeeId ASC;
SELECT * FROM Employees ORDER BY EmployeeId DESC;*/


-- Limit Islemi
-- maasa gore en yuksek 5 calisani secelim:
-- SELECT * FROM Employees ORDER BY Salary DESC LIMIT 3;

-- Percent Islemi
/*SELECT *
FROM Employees
ORDER BY Salary DESC
LIMIT (SELECT COUNT(*) / 2 FROM Employees);*/


-- In Islemi
-- IN komutu, bir sorguda belirli bir liste veya alt sorgu tarafindan dondurulen
-- degerlerin bir kumesi icinde olup olmadigini kontrol etmek icin kullanilir.

/*SELECT *
FROM Employees
WHERE Department = 'HR'
   or Department = 'IT';

SELECT *
FROM Employees
WHERE Department IN ('HR', 'IT');*/

-- Between Islemi
/*SELECT *
FROM Employees
WHERE Salary BETWEEN 1000 AND 5000;

SELECT *
FROM Employees
WHERE HireDate BETWEEN '2022-01-01' AND '2022-03-30';
*/


-- Iliskisel Tablo


-- Union Islemi
/*SELECT FirstName, LastName FROM Employees WHERE Department = 'HR'
UNION
SELECT FirstName, LastName FROM Employees WHERE Department = 'IT';*/





--Ic Ice Sorgu Islemi
-- SELECT * FROM Employees WHERE Salary > (SELECT AVG(Salary) FROM Employees);

-- Aritmetik Islemler
/*SELECT 20 + 8 AS Toplam, 20 - 8 AS Fark, 20 * 8 AS Carpim, 20 / 8 AS Bolum;

UPDATE Employees SET Salary = 15000/3 WHERE firstname = 'John';

SELECT ABS(-80) AS Mutlak;
SELECT SQRT(225) AS Karekok;
SELECT POWER(15,2) AS Us_Alma;
*/

-- Upper and Lower
/*SELECT upper('SelamLAR');
SELECT lower('SelamLAR');

SELECT UPPER(FirstName),
       LOWER(LastName)
FROM Employees;*/

-- SubString
/*SELECT SUBSTRING('SelamLAR',1,4);

SELECT SUBSTRING(FirstName, 1, 3)
FROM Employees;*/

-- Left and Right
/*SELECT LEFT('SelamLAR',3);
SELECT RIGHT('SelamLAR',3);

SELECT LEFT(FirstName,2),
       RIGHT(LastName, 3)
FROM Employees;*/

-- Len
/*SELECT length('SelamLAR');

SELECT length(FirstName)
FROM Employees;

SELECT * FROM Employees WHERE length(lastname)=3;*/


-- Ltrim & Rtrim & Replace
/*SELECT LTRIM('           SelamLAR');
SELECT RTRIM('SelamLAR     ');
SELECT REPLACE('SelamLAR','LAR','');*/


-- Strpos(CharIndex) Reverse
/*SELECT REVERSE('SelamLAR');

SELECT REVERSE(LastName)
FROM Employees;


SELECT strpos('SelamLAR', 'l');

 */



SELECT UPPER(FirstName),
       LOWER(LastName),
       SUBSTRING(FirstName, 1, 3),
       LEFT(LastName, 3),
       RIGHT(LastName, 3),
       LENGTH(FirstName),
       LTRIM(FirstName),
       RTRIM(LastName),
       REPLACE(FirstName, 'J', 'K'),
       REVERSE(LastName)
FROM Employees;