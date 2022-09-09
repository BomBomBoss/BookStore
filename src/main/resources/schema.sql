drop table if exists Person;

create table Person(
    id int primary key auto_increment,
    username varchar(100) not null,
    password varchar(100) not null,
    user_role varchar(100) not null
);

drop table if exists Book;

create table Book(
                       id int primary key auto_increment,
                       title varchar(100) not null,
                       author varchar(100) not null,
                       genre varchar(100) not null,
                       created_at timestamp not null
)