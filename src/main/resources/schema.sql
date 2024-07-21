create table course
(
    id bigint not null,
    name varchar(255) not null,
    author varchar(255) not null,
    primary key (id)
);

INSERT INTO COURSE (ID, NAME, AUTHOR) VALUES (1, 'Introduction to Programming', 'John Doe');
INSERT INTO COURSE (ID, NAME, AUTHOR) VALUES (2, 'Advanced Java', 'Jane Smith');
INSERT INTO COURSE (ID, NAME, AUTHOR) VALUES (3, 'Data Structures and Algorithms', 'Mike Johnson');
INSERT INTO COURSE (ID, NAME, AUTHOR) VALUES (4, 'Web Development with Angular', 'Emily Brown');
INSERT INTO COURSE (ID, NAME, AUTHOR) VALUES (5, 'Database Systems', 'Chris Green');
INSERT INTO COURSE (ID, NAME, AUTHOR) VALUES (6, 'Machine Learning Basics', 'Lisa White');
INSERT INTO COURSE (ID, NAME, AUTHOR) VALUES (7, 'Cloud Computing', 'David Black');
INSERT INTO COURSE (ID, NAME, AUTHOR) VALUES (8, 'Cybersecurity Fundamentals', 'Sarah Adams');
INSERT INTO COURSE (ID, NAME, AUTHOR) VALUES (9, 'Mobile App Development', 'Tom Baker');
INSERT INTO COURSE (ID, NAME, AUTHOR) VALUES (10, 'Software Engineering Principles', 'Anna Scott');