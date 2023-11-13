-- -------------------------
-- Cambios en elecciones
-- -------------------------

use elecciones_uno;

-- -------------------------
-- Crear tabla `proceso_electoral`
-- -------------------------
create table `proceso_electoral`(
	`id_proceso` int not null, 
    `descripcion` varchar(100),
    `fecha_eleccion` datetime,
    `fecha_creacion` datetime,
    `fecha_finalizacion` datetime,
    primary key (`id_proceso`)
);

-- -------------------------
-- Crear tabla `Reportes`
-- -------------------------
create table `reportes`(
	`id_porceso_electoral` INT NOT NULL,
    `id_votacion` INT NOT NULL,
    PRIMARY KEY (`id_porceso_electoral`, `id_votacion`),
    FOREIGN KEY (`id_porceso_electoral`) REFERENCES `proceso_electoral` (`id_proceso`),
    FOREIGN KEY (`id_votacion`) REFERENCES `votacion` (`id_votacion`)
);


-- -------------------------
-- Cambios en `Candidatos`
-- -------------------------
Alter table `candidatos`
	ADD column `id_proceso_electoral` int not null,
    add foreign key (`numero_identificacion`) references `estudiantes` (`numero_identificacion`),
    add foreign key (`id_proceso_electoral`) references `proceso_electoral` (`id_proceso`);
    
Alter table `candidatos`
	drop column `nombre`;

-- -------------------------
-- Cambios en `estudiantes` por `usuario`
-- -------------------------
alter table `estudiantes`
	add column `rol` varchar(30);

rename table `estudiantes` to `usuario`;
-- -------------------------
-- Cambios en `facultad`
-- -------------------------
Alter table `facultad`
	ADD column `estado` varchar(30);
-- -------------------------
-- Cambios en `carrera`
-- -------------------------
alter table `carrera`
	add column `estado` varchar(30);



SHOW COLUMNS FROM votacion WHERE Extra = 'auto_increment';