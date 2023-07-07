--liquibase formatted sql
--changeset thomas:001-createTemplateTable

create table template (
  id serial PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  description TEXT,
  created_on TIMESTAMP NOT NULL,
  category VARCHAR(64) NOT NULL
)