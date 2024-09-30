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
    email varchar(255) unique not null
);
-- enrollments
CREATE TABLE Enrollments (
    enrollment_id int auto_increment primary key,
    student_id int,
    course_id int,
    enrollment_date date,
    foreign key (student_id) references Students(student_id),
    foreign key (course_id) references Courses(course_id)
);

CREATE TABLE Teachers (
    teacher_id int auto_increment primary key,
    first_name varchar(255),
    last_name varchar(255),
    email varchar(255) unique
);
CREATE TABLE Payments(
	payment_id int primary key auto_increment,
    student_id int,
    amount decimal(10,2),
    payment_date date,
    foreign key (student_id) references Students(student_id)
    );
    
    insert into students (first_name, last_name, date_of_birth, email, phone_number)
values 
('Anuj', 'Sen', '2000-05-15', 'anuj.sen@hotmail.com', '9876543210'),
('Manish', 'Kumar', '1999-04-20', 'manish.kumar@outlook.com', '9123456789'),
('Aman', 'Sharma', '1998-12-10', 'aman.sharma@outlook.com', '9129876543'),
('DJ', 'Pandey', '1997-03-30', 'dj.pandey@rediffmail.com', '8987654321'),
('Rahul', 'Verma', '2001-07-25', 'rahul.verma@hotmail.com', '9654321789'),
('Pooja', 'Singh', '1996-10-19', 'pooja.singh@outlook.com', '9787654321'),
('Rohit', 'Mishra', '1998-06-11', 'rohit.mishra@rediffmail.com', '9132456789'),
('Sakshi', 'Jain', '1997-08-08', 'sakshi.jain@outlook.com', '9219876543'),
('Neha', 'Chaudhary', '2000-11-23', 'neha.chaudhary@hotmail.com', '9678912345'),
('Deepak', 'Gupta', '1999-09-02', 'deepak.gupta@hotmail.com', '9876543210');

insert into courses (course_name, credits, teacher_id)
values
('Information Technology', 4, 1),
('Computer Science', 4, 2),
('Data Science', 3, 3),
('Artificial Intelligence', 3, 4),
('Cloud Computing', 3, 5),
('Machine Learning', 4, 6),
('Cyber Security', 4, 7),
('Software Engineering', 4, 8),
('Java Programming', 3, 1),
('Database Management', 3, 2);

INSERT INTO enrollments (student_id, course_id, enrollment_date)
VALUES 
(1, 9, '2024-01-10'), -- Anuj enrolled in Java Programming
(2, 1, '2024-02-15'), -- Manish enrolled in IT
(3, 2, '2024-03-01'), -- Aman enrolled in Computer Science
(4, 9, '2024-03-10'), -- DJ enrolled in Java Programming
(5, 3, '2024-04-05'), -- Rahul enrolled in Data Science
(6, 5, '2024-05-20'), -- Pooja enrolled in Cloud Computing
(7, 4, '2024-06-25'), -- Rohit enrolled in AI
(8, 6, '2024-07-14'), -- Sakshi enrolled in Machine Learning
(9, 7, '2024-08-01'), -- Neha enrolled in Cyber Security
(10, 8, '2024-09-05'); -- Deepak enrolled in Software Engineering


insert into teacher (first_name, last_name, email)
values
('RK', 'Sharma', 'rk.sharma@example.com'), -- teacher_id = 1
('Vikas', 'Rana', 'vikas.rana@example.com'), -- teacher_id = 2
('Anjali', 'Kapoor', 'anjali.kapoor@example.com'), -- teacher_id = 3
('Madhav', 'Patel', 'madhav.patel@example.com'), -- teacher_id = 4
('Nikita', 'Saxena', 'nikita.saxena@example.com'), -- teacher_id = 5
('Sandeep', 'Kumar', 'sandeep.kumar@example.com'), -- teacher_id = 6
('Neeraj', 'Gupta', 'neeraj.gupta@example.com'), -- teacher_id = 7
('Pankaj', 'Verma', 'pankaj.verma@example.com'); -- teacher_id = 8


insert into payments (student_id, amount, payment_date)
values 
(1, 0.00, '2024-01-15'),  -- Anuj payment for Java Programming
(2, 15000.00, '2024-02-20'), -- Manish payment for IT
(3, 20000.00, '2024-03-05'), -- Aman payment for Computer Science
(4, 0.00, '2024-03-15'),  -- DJ payment for Java Programming
(5, 18000.00, '2024-04-10'), -- Rahul payment for Data Science
(6, 17000.00, '2024-05-25'), -- Pooja payment for Cloud Computing
(7, 25000.00, '2024-06-30'), -- Rohit payment for AI
(8, 30000.00, '2024-07-20'), -- Sakshi payment for Machine Learning
(9, 22000.00, '2024-08-05'), -- Neha payment for Cyber Security
(10, 21000.00, '2024-09-10'); -- Deepak payment for Software Engineering

select * from courses;
insert into courses (course_name, credits, teacher_id)
values 
('IT', 3, 1), -- course_id = 1
('Computer Science', 4, 2), -- course_id = 2
('Data Science', 5, 3), -- course_id = 3
('AI', 3, 4), -- course_id = 4
('Cloud Computing', 4, 5), -- course_id = 5
('Machine Learning', 4, 6), -- course_id = 6
('Cyber Security', 3, 7), -- course_id = 7
('Software Engineering', 4, 8), -- course_id = 8
('Java Programming', 3, 9); -- course_id = 9

insert into courses (course_name, credits, teacher_id)
values 
('IT', 3, 1), -- course_id = 1, teacher_id = 1 (RK Sharma)
('Computer Science', 4, 2), -- course_id = 2, teacher_id = 2 (Vikas Rana)
('Data Science', 5, 3), -- course_id = 3, teacher_id = 3 (Anjali Kapoor)
('AI', 3, 4), -- course_id = 4, teacher_id = 4 (Madhav Patel)
('Cloud Computing', 4, 5), -- course_id = 5, teacher_id = 5 (Nikita Saxena)
('Machine Learning', 4, 6), -- course_id = 6, teacher_id = 6 (Sandeep Kumar)
('Cyber Security', 3, 7), -- course_id = 7, teacher_id = 7 (Neeraj Gupta)
('Software Engineering', 4, 8), -- course_id = 8, teacher_id = 8 (Pankaj Verma)
('Java Programming', 3, 1); -- course_id = 9, teacher_id = 1 (RK Sharma)















