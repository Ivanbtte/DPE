Create database DPE;

create table Productos(
	codigo serial,
	nombre varchar(20),
	descripcion(50),
	precio(50),
	fecha_creacion date,
	fecha_actualizacion date,
	fecha_eliminacion date
);

create table usuarios(
	codigo serial,
	nombre_usuario varchar(20),
	contraseña varchar(20),
	nombre varchar(50),
	sexo varchar(20),
	edad integer
);
