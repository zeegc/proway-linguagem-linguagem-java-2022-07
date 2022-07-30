create database lojaBd;

create table carros(

	id INT primary key auto_increment,
	modelo varchar(100),
	marca varchar(50),
	preco double

);



insert into carros(modelo, marca, preco) values
('Fusca 72', 'VW', '15000');

select id, modelo, marca, preco from carros;

