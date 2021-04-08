insert into course(id,name) values ( 10001, 'Test in 20 secs');
insert into course(id,name) values ( 10002, 'Test in 2 secs');
insert into course(id,name) values ( 10003, 'Test in 2 secs');
insert into course(id,name) values ( 10004, 'Test in 2 secs');
insert into course(id,name) values ( 10005, 'Test in 2 secs');
insert into course(id,name) values ( 10006, 'Test in 2 secs');

insert into passport(id,number) values ( 40001, '1222123');
insert into passport(id,number) values ( 40002, '12313');
insert into passport(id,number) values ( 40003, '1313');
insert into passport(id,number) values ( 40004, '213');
insert into passport(id,number) values ( 40005, '12313');
insert into passport(id,number) values ( 40006, '1231332');

insert into student (id,name,passport_id) values ( 20001, 'arpan', 40001);
insert into student(id,name, passport_id) values ( 20002, 'darpan',40002);
insert into student(id,name, passport_id) values ( 20003, 'test1',40003);
insert into student(id,name, passport_id) values ( 20004, '2',40004);
insert into student(id,name, passport_id) values ( 20005, '3', 40005);
insert into student(id,name, passport_id) values ( 20006, '4', 40006);



insert into review(id,rating, description, course_id) values ( 50001, 'a', 'good',10001);
insert into review(id,rating, description, course_id) values ( 50002, 'b', 'Good',10001);
insert into review(id,rating, description, course_id) values ( 50003, 'c', 'bad',10002);
insert into review(id,rating, description, course_id) values ( 50004, 'd', 'very bad',10001);
 