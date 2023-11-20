CREATE TABLE employee (
  emp_name VARCHAR(25) DEFAULT NULL,
  emp_email VARCHAR(50) NOT NULL,
  emp_pass VARCHAR(25) DEFAULT NULL,
  emp_deg VARCHAR(25) DEFAULT NULL,
  PRIMARY KEY (emp_email)
);