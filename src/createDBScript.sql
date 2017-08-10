DROP DATABASE employee;

CREATE DATABASE employee;
USE employee;

CREATE TABLE employee (
  employee_id INT      AUTO_INCREMENT,
  name varChar(50)     NOT NULL,
  age INT              NOT NULL,
  address_id INT       NOT NULL,
  nin varChar(20)      NOT NULL,
  bank_acc_info_id INT NOT NULL,


  PRIMARY KEY(employee_id)

);

CREATE TABLE address (
  addres_id INT           NOT NULL,
  firstline varChar(50)   NOT NULL,
  secondline varChar(50)          ,
  postcode varchar(20)    NOT NULL,
  town varChar(30)        NOT NULL,

  PRIMARY KEY(addres_id)


);

CREATE TABLE bankAccInfo (
  bank_acc_info_id INT       NOT NULL,
  iban INT                   NOT NULL,
  bic  INT                   NOT NULL,

  PRIMARY KEY(bank_acc_info_id)

);

GRANT ALL PRIVILEGES ON *.* TO 'root'@'%' IDENTIFIED BY 'unhackable' WITH GRANT OPTION;

DROP USER 'Human Resources'@'localhost';
CREATE USER 'Human Resources'@'localhost' IDENTIFIED BY 'unhackable';
GRANT SELECT ON employee.* TO 'Human Resources'@'%' IDENTIFIED BY 'unhackable';

FLUSH PRIVILEGES;
