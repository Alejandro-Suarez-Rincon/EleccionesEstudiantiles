# Crear y usar base de datos
create database elecciones_uno;
use elecciones_uno;

#Crear Tabla Facultad
create table facultad(
	id_facultad tinyint not null primary key,
    nombre_facultad varchar(45) not null
);

#Crear Tabla Careera
create table carrera(
	id_carrera int not null primary key,
    nombre_facultad varchar(45) not null,
    id_facultad_carrera tinyint not null,
    foreign key (id_facultad_carrera) references facultad (id_facultad)
);

#Crear Tabla Departamento
create table departamento(
	id_departamento int not null primary key,
    nombre_departamento varchar(45) not null
);

#Crear Tabla Municipio
create table municipio(
	id_municipio int not null primary key,
    nombre_municipio varchar(45) not null,
    id_departamento_municipio int not null,
    foreign key (id_departamento_municipio) references departamento (id_departamento)
);

#Crear Tabla Estudiantes
create table estudiantes(
	numero_identificacion bigint not null primary key,
	nombre varchar(45) not null,
    apellido varchar(45)not null,
    correo varchar(60) not null,
    telefono bigint,
    sexo varchar(30),
    id_carrera_estudiante int not null,
    id_municipio_estudiante int not null,
    estado varchar(30),
    foreign key (id_municipio_estudiante) references municipio (id_municipio),
    foreign key (id_carrera_estudiante) references carrera (id_carrera)
);

#Crear Tabla Candidatos
create table candidatos(
	numero_candidato tinyint not null primary key,
    numero_identificacion bigint not null,
    fecha_inscripcion datetime,
    nombre varchar(60)
);

#Crear Tabla Votacion
create table votacion(
	id_votacion int auto_increment not null primary key,
    fecha_voto datetime not null,
    numero_identificacion_estudiante bigint not null, #Entrada encriptada
    numero_candidato_candidato tinyint not null,
    foreign key (numero_identificacion_estudiante) references estudiantes (numero_identificacion),
    foreign key (numero_candidato_candidato) references candidatos (numero_candidato)
);