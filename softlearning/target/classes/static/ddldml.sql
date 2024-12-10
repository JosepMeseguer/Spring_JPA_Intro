create database softlearningtest;

create table softlearningtest.clients (
        code int not null,
        name VARCHAR(45), 
        address VARCHAR(45), 
        phone VARCHAR(45), 
        creditcard VARCHAR(45), 
        ident VARCHAR(45) unique, 
        birthday timestamp, 
        password VARCHAR(45),
        since timestamp,
        premium boolean, 
        primary key (code)
);

insert into clients values (1001, "Alex Garcia", "carrer kalea 1", "611111111","11112222333344445555","33101123-F", "2000-07-01","1234","2022-02-01", false), 
                           (1002, "Victor Ruiz", "carrer kalea 3", "622222222","22223333444455556666","38101123-X", "2003-01-21","4321","2024-03-21", false),
                           (1003, "Joan Martinez", "carrer kalea 5", "633333333","33334444555566667777","23101123-B", "2001-11-27","3214","2023-11-01", false);
select * from clients;

create table softlearningtest.books (
        ident int not null,
        tittle VARCHAR(45), 
        writer VARCHAR(45), 
        type VARCHAR(45), 
        description VARCHAR(45), 
        price double, 
        isbn VARCHAR(45) unique, 
        edition integer,
        release_date timestamp, 
        heigth double, 
        width double, 
        depth double, 
        weigth double, 
        fragile boolean, 
        available boolean,
        primary key (ident)
);

insert into books values (121,"PHP basics","Marcombo","Programmers",null,22.50,"isbnproves1",3,"2022-06-30",20.0,12.0,1.5,250.0,false,true),
                        (131,"Java basics","Princeton","Programmers",null, 29.99,"isbnproves2",1,"2023-04-26",21.0,14.0,2.5,450.0,true,true),
                        (141,"Java EE","Oracle","Programmers",null,52.00,"isbnproves3",2,"2024-01-30",22.5,14.0,3.0,500.0,true,false);
select * from books;