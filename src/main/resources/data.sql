/* create table person
(
	id integer not null,
	name varchar(255) not null,
	location varchar(255),
	birth_date timestamp,
	primary key(id)
	
); */

insert into person(id,name,location,birth_date) 
values(10001,'Nisarg','Hyderabad',sysdate());

insert into person(id,name,location,birth_date) 
values(10002,'Nisarg2','Banglore',sysdate());

insert into person(id,name,location,birth_date) 
values(10003,'Nisarg3','Mephasis',sysdate());