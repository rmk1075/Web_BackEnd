create schema backEnd;

use backEnd;

create table role (
 role_id int primary key,
 descrtiption varchar(20)
);

create table guestbook (
 id bigint(20) unsigned not null auto_increment,
 name varchar(255) not null,
 content text,
 regdate datetime,
 primary key (id)
);

create table log (
 id bigint(20) unsigned not null auto_increment,
 ip varchar(255) not null,
 method varchar(10) not null,
 regdate datetime,
 primary key (id)
);

select * from guestbook;
select * from log;

show tables from backEnd;

select * from role;

SELECT role_id, description FROM role order by role_id;

SELECT role_id, description FROM role order by role_id;

insert into role(role_id, description) values(2, 'abcd');
insert into role(role_id, description) values(3, 'abcd');
insert into role(role_id, description) values(4, 'abcd');