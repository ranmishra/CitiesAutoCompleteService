create table city(id number(3) PRIMARY KEY,name varchar2(200),country_code number(3),create_date  date default sysdate,last_modifiedDate date  default sysdate);

Insert into city values (1,'Carnicobar',1,sysdate,sysdate);
Insert into city values (2,'Portblair',1,sysdate,sysdate);
Insert into city values (3,'Port_Blair',1,sysdate,sysdate);
Insert into city values (4,'Rangat',1,sysdate,sysdate);
Insert into city values (5,'Balarampur',1,sysdate,sysdate);
Insert into city values (6,'Puncha',1,sysdate,sysdate);
Insert into city values (7,'Kashipur',1,sysdate,sysdate);
Insert into city values (8,'Nancowrie',1,sysdate,sysdate);
Insert into city values (9,'Hut Bay',1,sysdate,sysdate);

commit;


