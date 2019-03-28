CREATE TABLE album (
    id     BIGINT(20)   PRIMARY KEY NOT NULL AUTO_INCREMENT,
    artist VARCHAR(255) ,
    rating INT(11)      NOT NULL,
    title  VARCHAR(1023),
    year   INT(11)      NOT NULL
);
