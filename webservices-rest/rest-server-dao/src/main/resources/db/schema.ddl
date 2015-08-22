 drop database dbms;
 create database dbms;
 use dbms;
 
 
 create table country(
 id int NOT NULL AUTO_INCREMENT,
 name varchar(30), PRIMARY KEY(id)
 );
  	
 create table user_detail (
 id int(11) not null auto_increment primary key,
 dob datetime null
 );
 
 create table user (
 	id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
 	uname varchar(15),
 	fname varchar(20),
 	lname varchar(20),
 	password varchar(50),
 	user_detail_id int(11),
 	constraint foreign key (user_detail_id) references user_detail (id)
 	);
 
-- insert into user values(1,"vishal", "vishal", "mahajan")
 create table areacode(
 id int NOT NULL AUTO_INCREMENT,
 pin_code varchar(10),
 place varchar(40),
 PRIMARY KEY(id)
 );
 
 insert into areacode values(1,'101',"fatehgarh");
 insert into areacode values(2,'101',"batala");
 insert into areacode values(3,'101',"gurdaspur");
 
 insert into areacode values(4,'102',"Ajnala");
 insert into areacode values(5,'102',"Amritsar");
 insert into areacode values(6,'102',"Attari");
 insert into areacode values(7,'102',"Anarkali");
 insert into areacode values(8,'102',"Aliwal");
 insert into areacode values(9,'102',"Adarsh Nagar");

 insert into user_detail values(1,now());
 insert into user_detail values(2,now());
 insert into user values(1,'vishal','mahajan','asasasas','vishal',1);
 insert into user values(2,'vishal','mahajan','asasasas','vishal2',2);