CREATE TABLE IF NOT EXISTS product (
    id bigserial NOT NULL,
    name varchar(255),
    uuid UUID,
    created_at    timestamp ,
    updated_at    timestamp ,
    PRIMARY KEY (id)
);