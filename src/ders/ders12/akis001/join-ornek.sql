CREATE TABLE employees
(
    employeeId   SERIAL PRIMARY KEY,
    employeeName varchar(20)
);

CREATE TABLE department
(
    departmentId   SERIAL PRIMARY KEY,
    departmentName varchar(20),
    employeeId     INT
);

INSERT INTO employees(employeeName)
VALUES ('Mete'),
       ('Mehmet'),
       ('Kader'),
       ('Didem'),
       ('Duygu');

SELECT *
FROM employees;

INSERT INTO department(departmentName, employeeid)
VALUES ('IT', 2),
       ('DEV', 3),
       ('HR', 1),
       ('DEV', 1),
       ('DEV', 5),
       ('DEV', 8);

SELECT *
FROM department;

SELECT employees.employeeName, department.departmentName
FROM employees
         INNER JOIN department on employees.employeeId = department.employeeId;

SELECT employees.employeeId, employees.employeeName, department.departmentName
FROM employees
         LEFT JOIN department on employees.employeeId = department.employeeId;

SELECT employees.employeeName, department.departmentName
FROM employees
         RIGHT JOIN department on employees.employeeId = department.employeeId;

SELECT employees.employeeId, employees.employeeName, department.departmentName
FROM employees
         FULL JOIN department on employees.employeeId = department.employeeId;
