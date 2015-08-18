 create table country(id int NOT NULL AUTO_INCREMENT, name varchar(30), PRIMARY KEY(id));
 
 create table area(id int NOT NULL AUTO_INCREMENT, pin_code varchar(10), place varchar(40), PRIMARY KEY(id));
 
 insert into area values(1,'101',"fatehgarh");
 insert into area values(2,'101',"batala");
 insert into area values(2,'101',"gurdaspur");