DROP TABLE IF EXISTS employee;

create table employee
(
    id   int      not null auto_increment,
    name char(30) not null,
    primary key (id)
);

INSERT INTO employee
VALUES (1, 'kyu');

INSERT INTO employee
VALUES (2, 'kim');
