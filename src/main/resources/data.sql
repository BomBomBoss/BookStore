insert into Person (username, password, user_role) values ( 'admin', 'admin', 'ROLE_ADMIN');
insert into Person (username, password, user_role) values ( 'user', 'user', 'ROLE_USER');

insert into Book (title, author, genre, created_at) values ('title1', 'author1', 'classic', current_timestamp());
insert into Book (title, author, genre, created_at) values ('title2', 'author2', 'detective',current_timestamp());
insert into Book (title, author, genre, created_at) values ('title3', 'author3', 'fantasy',current_timestamp());
insert into Book (title, author, genre, created_at) values ('title4', 'author4', 'autobiography',current_timestamp());
insert into Book (title, author, genre, created_at) values ('title5', 'author5', 'romance',current_timestamp());