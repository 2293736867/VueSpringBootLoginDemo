create database if not exists test;
use test;
drop table if exists user;
create table user(
    id int auto_increment primary key ,
    username varchar(30) default '',
    password varchar(30) default ''
);