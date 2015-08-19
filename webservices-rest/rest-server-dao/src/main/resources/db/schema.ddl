 create database dbms;
 use dbms;
 
 
 create table country(id int NOT NULL AUTO_INCREMENT, name varchar(30), PRIMARY KEY(id));
 create table area(id int NOT NULL AUTO_INCREMENT, pin_code varchar(10), place varchar(40), PRIMARY KEY(id));
 
 insert into area values(1,'101',"fatehgarh");
 insert into area values(2,'101',"batala");
 insert into area values(3,'101',"gurdaspur");
 
 insert into area values(4,'102',"Ajnala");
 insert into area values(5,'102',"Amritsar");
 insert into area values(6,'102',"Attari");
 insert into area values(7,'102',"Anarkali");
 insert into area values(8,'102',"Aliwal");
 insert into area values(9,'102',"Adarsh Nagar");
