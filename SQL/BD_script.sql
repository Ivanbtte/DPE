Create database DPE;

create table Productos(
	codigo serial primary key,
	nombre varchar(20),
	descripcion varchar(50),
	precio double precision,
	fecha_creacion date,
	fecha_actualizacion date,
	fecha_eliminacion date
);

create table usuarios(
	codigo serial primary key,
	nombre_usuario varchar(20),
	contraseña varchar(20),
	nombre varchar(50),
	sexo varchar(20),
	edad integer
);

