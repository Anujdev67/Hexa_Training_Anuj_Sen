use hexaware;
create database SIDB;
use sidb;
CREATE TABLE Students (
    student_id int auto_increment PRIMARY KEY,
    first_name varchar(255) not null,
    last_name varchar(255) not null,
    date_of_birth date not null,
    email varchar(255) unique not null,
    phone_number varchar(20)
);
-- Creating course table for ass2
CREATE TABLE Courses(
course_id int auto_increment primary key,
course_name varchar(255) not null,
credits int not null,
teacher_id int,
foreign key (teacher_id) references Teacher(teacher_id)
);

CREATE TABLE Teacher (
    teacher_id int auto_increment primary key,
    first_name varchar(255) not null,
    last_name varchar(255) not null,
    email varchar(255) unique NOT NULL
);

