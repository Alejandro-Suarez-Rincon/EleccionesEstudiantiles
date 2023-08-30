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

#Crear Tabla Estudiantes
create table estudiantes(
	numero_identificacion bigint not null primary key,
    semestre tinyint not null,
    id_carrera_estudiante int not null,
    foreign key (id_carrera_estudiante) references carrera (id_carrera)
);

#Crear Tabla Candidatos
create table candidatos(
	numero_candidato tinyint not null primary key,
    numero_identificacion bigint not null,
    fecha_inscripcion datetime
);

#Crear Tabla Votacion
create table votacion(
	id_votacion int auto_increment not null primary key,
    fecha_voto datetime not null,
    numero_identificacion_estudiante bigint not null, #Entrada encriptada
    numero_candidato_candidato tinyint not null,
    foreign key (numero_identificacion_estudiante) references estudiante (numero_identificacion),
    foreign key (numero_candidato_candidato) references candidato (numero_candidato)
);