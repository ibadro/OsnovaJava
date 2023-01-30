-- 1. SQL. Есть книги, у которых есть id, название, список авторов. Есть авторы, у которых есть id, ФИО и книги, которые они написали.
--  Спроектировать реляционную модель данных и сделать к ней запрос - вывести все книги автора Иванова.

CREATE TABLE books(
                      book_id integer NOT NULL auto_increment primary key,
                      book_name varchar(32) NOT NULL);

CREATE TABLE authors(
                       autor_id integer NOT NULL auto_increment primary key,
                       autor_name varchar(32) NOT NULL);

CREATE TABLE book_autor(
                           book_id integer NOT NULL ,
                           autor_id integer  NOT NULL,
                           PRIMARY KEY (book_id , autor_id ),
                           FOREIGN KEY (book_id) REFERENCES books(book_id)
                               ON DELETE CASCADE
                               ON UPDATE CASCADE,
                           FOREIGN KEY (autor_id) REFERENCES authors(autor_id)
                               ON DELETE CASCADE
                               ON UPDATE CASCADE);

Insert into books (book_name) values ('book1'), ('book2'), ('book3'), ('book4');
Insert into authors (autor_name) values ('autor1'), ('autor2'), ('autor3');
Insert into book_autor (book_id, autor_id) values (1,1), (1,2), (1,3), (2,2);

SELECT * FROM books
                  INNER JOIN book_autor ON books.book_id = book_autor.book_id
                  INNER JOIN authors ON authors.autor_id = book_autor.autor_id