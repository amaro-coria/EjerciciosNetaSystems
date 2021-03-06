/* ---------------------------------------------------- */
/*  Generated by Enterprise Architect Version 13.5 		*/
/*  Created On : 26-Sep-2018 8:10:27 AM 				*/
/*  DBMS       : PostgreSQL 						*/
/* ---------------------------------------------------- */

/* Drop Sequences for Autonumber Columns */

 

 

 

/* Drop Tables */

DROP TABLE IF EXISTS catalogo_general CASCADE
;

DROP TABLE IF EXISTS cliente CASCADE
;

DROP TABLE IF EXISTS identificacion_oficial CASCADE
;

DROP TABLE IF EXISTS identificaciones_cliente CASCADE
;

/* Create Tables */

CREATE TABLE catalogo_general
(
	id_catalogo serial NOT NULL,
	id_tipo_catalogo integer NULL,
	val_catalogo varchar(20) NOT NULL,
	desc_catalogo varchar(50) NULL,
	id_estatus integer NOT NULL,
	usr_crea varchar(20) NULL,
	fch_crea timestamp with time zone NULL,
	usr_modi varchar(20) NULL,
	fch_modi timestamp with time zone NULL
)
;

CREATE TABLE cliente
(
	id_cliente serial NOT NULL,
	nombre_cliente varchar(30) NOT NULL,
	apellido_pat_cliente varchar(30) NOT NULL,
	apellido_mat_cliente varchar(30) NULL,
	email_cliente varchar(50) NOT NULL,
	fnac_cliente date NOT NULL,
	cel_cliente varchar(20) NOT NULL,
	id_estatus integer NULL,
	usr_crea varchar(20) NULL,
	fch_crea timestamp with time zone NULL,
	usr_modi varchar(20) NULL,
	fch_modi timestamp with time zone NULL
)
;

CREATE TABLE identificacion_oficial
(
	id_identificacion serial NOT NULL,
	id_tipo_identificacion integer NOT NULL,
	val_identificacion varchar(2000) NULL,
	anverso_identificacion text NULL,
	reverso_identificacion text NULL,
	id_estatus integer NULL,
	usr_crea varchar(20) NULL,
	fch_crea timestamp with time zone NULL,
	usr_modi varchar(20) NULL,
	fch_modi timestamp with time zone NULL
)
;

CREATE TABLE identificaciones_cliente
(
	id_cliente integer NOT NULL,
	id_identificacion integer NOT NULL,
	obs varchar(50) NULL,
	id_estatus integer NULL,
	usr_crea varchar(20) NULL,
	fch_crea timestamp with time zone NULL,
	usr_modi varchar(20) NULL,
	fch_modi timestamp with time zone NULL
)
;

/* Create Primary Keys, Indexes, Uniques, Checks */

ALTER TABLE catalogo_general ADD CONSTRAINT PK_Table2
	PRIMARY KEY (id_catalogo)
;

ALTER TABLE cliente ADD CONSTRAINT PK_Table1
	PRIMARY KEY (id_cliente)
;

CREATE INDEX IXFK_cliente_catalogo_general ON cliente (id_estatus ASC)
;

ALTER TABLE identificacion_oficial ADD CONSTRAINT PK_Table2
	PRIMARY KEY (id_identificacion)
;

CREATE INDEX IXFK_identificacion_oficial_catalogo_general ON identificacion_oficial (id_estatus ASC)
;

ALTER TABLE identificaciones_cliente ADD CONSTRAINT PK_Table2
	PRIMARY KEY (id_cliente,id_identificacion)
;

CREATE INDEX IXFK_identificaciones_cliente_catalogo_general ON identificaciones_cliente (id_estatus ASC)
;

CREATE INDEX IXFK_identificaciones_cliente_cliente ON identificaciones_cliente (id_cliente ASC)
;

CREATE INDEX IXFK_identificaciones_cliente_identificacion_oficial ON identificaciones_cliente (id_identificacion ASC)
;

/* Create Foreign Key Constraints */

ALTER TABLE cliente ADD CONSTRAINT FK_cliente_catalogo_general
	FOREIGN KEY (id_estatus) REFERENCES catalogo_general (id_catalogo) ON DELETE No Action ON UPDATE No Action
;

ALTER TABLE identificacion_oficial ADD CONSTRAINT FK_identificacion_oficial_catalogo_general
	FOREIGN KEY (id_estatus) REFERENCES catalogo_general (id_catalogo) ON DELETE No Action ON UPDATE No Action
;

ALTER TABLE identificaciones_cliente ADD CONSTRAINT FK_identificaciones_cliente_catalogo_general
	FOREIGN KEY (id_estatus) REFERENCES catalogo_general (id_catalogo) ON DELETE No Action ON UPDATE No Action
;

ALTER TABLE identificaciones_cliente ADD CONSTRAINT FK_identificaciones_cliente_cliente
	FOREIGN KEY (id_cliente) REFERENCES cliente (id_cliente) ON DELETE No Action ON UPDATE No Action
;

ALTER TABLE identificaciones_cliente ADD CONSTRAINT FK_identificaciones_cliente_identificacion_oficial
	FOREIGN KEY (id_identificacion) REFERENCES identificacion_oficial (id_identificacion) ON DELETE No Action ON UPDATE No Action
;

/* Create Table Comments, Sequences for Autonumber Columns */

 

 

 
