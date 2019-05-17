create table employee(
	id int auto_increment,
	name varchar(15),
	age int,
	gender varchar(5),
	salary float(8,2),
	department varchar(50),
	primary key(id)
);
insert into employee(name,age,gender,salary,department)values("张三",18,"男",5000,"IT部门"),("李四",20,"男",6000,"市场部"),("小红",28,"女",10000,"人事部");
select *from employee;
delete from employee where name = "张三";
update employee set gender ="女" where name = "李四";
create table users(
	id int auto_increment,
	LoginPWD varchar(50),
	NickName varchar(50),
	sex varchar(5),
	StartId int,
	BloodTypeID int,
	primary key(id)
);
create table Star(
	id int auto_increment,
	Star varchar(50),
	primary key(id)
);
create table Blood(
	id int auto_increment,
	BloodType varchar(50),
	primary key(id)
);
select users.NickName,users.sex,Star.Star,Blood.BloodType
from users,Star,Blood
where users.StarTId = Star.id and users.BloodTypeID = Blood.id;

select users.NickName,users.sex,Blood.BloodType
from users,Blood
where users.BloodTypeID = Blood.id and users.BloodTypeID = 3;

select users.NickName,users.sex,Blood.BloodType,Star.Star
from users,Blood,Star
where users.BloodTypeID = Blood.id and users.StartId = Star.id 
and users.StartId = 1 and users.BloodTypeID = 1;

update users set NickName ="天外飞仙" where NickName = ".NET";
select *from users where LoginPWD $ "A"
SELECT * FROM users WHERE LoginPWD LIKE '%A%';




create table users2(
	id int auto_increment,
	name varchar(20),
	password varchar(50),
	point int,
	level int,
	primary key(id)
);
create table book(
	id int auto_increment,
	name varchar(50),
	count int,
	type varchar(50),
	author varchar(50),
	discount  int,
	hasLended int,	
	primary key(id)
);
create table bookinfo(
	id int auto_increment,
	bid int,
	inorout int,
	state int,
	lost int,
	primary key(id)
);
create table records(
	id int auto_increment,
	uid int,
	biid int,
	lendTime Date,
	returnTime Date,
	primary key(id)
);
select * from users2;
select * from users2 where id = 2;
select * from users2 where name = "admin";
select * from users2 order by point desc limit 3;
select * from users2 where level = 3;
delete from users2 where level<3 or level>3;
update users2 set password = 111 where name = "admin";
select * from book where count = 0;
select * 
from book,bookinfo,records
where book.id = bookinfo.bid
and records.biid = bookinfo.id;
and records.uid = users2.id;
select *
from users2,records
where records.uid = users2.id
and users2.id = 2;
 
 
select * from users2 where name = "小强"