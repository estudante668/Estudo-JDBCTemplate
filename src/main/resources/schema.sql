CREATE TABLE IF NOT EXISTS Camisa(

   id INTEGER AUTO_INCREMENT,
   modelo varchar(255) NOT NULL,
   marca varchar(255) NOT NULL,
   preco varchar(255) NOT NULL,
   primary key(id)
);

INSERT INTO Camisa (modelo, marca, preco)
VALUES ('Topper', 'Lesut', '345,78');