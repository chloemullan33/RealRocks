DROP DATABASE employees;

CREATE DATABASE employees;
USE employees;

-- employee table


CREATE TABLE department (
	dept_id INT						NOT NULL AUTO_INCREMENT,
	dept_name varchar(100)				NOT NULL,
    
    PRIMARY KEY (dept_id)
);

CREATE TABLE employee (
  employee_id INT      NOT NULL AUTO_INCREMENT,
  fname varChar(50)    NOT NULL,
  lname varChar(50)    NOT NULL,
  age INT              NOT NULL,
  address_id INT       ,
  nin varChar(20)      NOT NULL,
  bank_acc_info_id INT ,
  start_salary Decimal NOT NULL,
  dept_id INT 			,

  PRIMARY KEY(employee_id),
  
  FOREIGN KEY (dept_id) REFERENCES department(dept_id)

);

-- address table

CREATE TABLE address (
  address_id INT          NOT NULL AUTO_INCREMENT,
  employee_id INT         NOT NULL,
  firstline varChar(50)   NOT NULL,
  secondline varChar(50)          ,
  postcode varchar(20)    NOT NULL,
  town varChar(30)        NOT NULL,

  PRIMARY KEY(address_id),

  FOREIGN KEY (employee_id) REFERENCES employee(employee_id)
);

-- bank account info table

CREATE TABLE bankAccInfo (
  bank_acc_info_id INT       NOT NULL AUTO_INCREMENT,
  employee_id INT            NOT NULL,
  iban INT                   NOT NULL,
  bic  INT                   NOT NULL,

  PRIMARY KEY(bank_acc_info_id),

  FOREIGN KEY (employee_id) REFERENCES employee(employee_id)
);

INSERT INTO department(dept_name) VALUES('IT');
INSERT INTO department(dept_name) VALUES('HR');
INSERT INTO department(dept_name) VALUES('Sales');

INSERT INTO employee(fname, lname, age, address_id, nin, bank_acc_info_id, start_salary, dept_id) VALUES ('Richard', 'Taylor', '45', '1', '14253678B', '1', '10000', 1);
INSERT INTO employee(fname, lname, age, address_id, nin, bank_acc_info_id, start_salary, dept_id) VALUES ('Mary-Jane', 'McBride', '43', '2', '14253678P', '2', '20000', 2);
INSERT INTO employee(fname, lname, age, address_id, nin, bank_acc_info_id, start_salary, dept_id) VALUES ('Chloe', 'Mullan', '40', '3', '14253678C', '3', '30000', 3);
INSERT INTO employee(fname, lname, age, address_id, nin, bank_acc_info_id, start_salary, dept_id) VALUES ('Patrick', 'Tagart', '23', '4', '14253678A', '4', '40000', 1);

INSERT INTO bankAccInfo(employee_id, iban, bic) VALUES ('1', '3248585', '78787878');
INSERT INTO bankAccInfo(employee_id, iban, bic) VALUES ('2', '3248585', '78787878');
INSERT INTO bankAccInfo(employee_id, iban, bic) VALUES ('3', '3248585', '78787878');
INSERT INTO bankAccInfo(employee_id, iban, bic) VALUES ('4', '3248585', '78787878');

INSERT INTO address(employee_id, firstline, secondline, postcode, town) VALUES ('1', '34 Ballysally Road', '', 'BT294AG', 'Newtownards');
INSERT INTO address(employee_id, firstline, secondline, postcode, town) VALUES ('2', '22 Ballysally Road', '', 'BT294AG', 'Newtownards');
INSERT INTO address(employee_id, firstline, secondline, postcode, town) VALUES ('3', '55 Ballysally Road', '', 'BT294AG', 'Newtownards');
INSERT INTO address(employee_id, firstline, secondline, postcode, town) VALUES ('4', '17 Ballysally Road', '', 'BT294AG', 'Newtownards');

GRANT ALL PRIVILEGES ON employees.* TO 'root'@'%' IDENTIFIED BY 'unhackable' WITH GRANT OPTION;

DROP USER 'Human Resources'@'localhost';
CREATE USER 'Human Resources'@'localhost' IDENTIFIED BY 'unhackable';
GRANT SELECT ON employees.* TO 'Human Resources'@'%' IDENTIFIED BY 'unhackable';

CREATE PROCEDURE generateEmpPerDept()
SELECT CONCAT(employee.fname, ' ' , employee.lname),  department.dept_name FROM employee
JOIN department ON employee.dept_id = department.dept_id;

FLUSH PRIVILEGES;
