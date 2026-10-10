CREATE TABLE `user` (
    id INT,
    `name` VARCHAR(255),
    `password` VARCHAR(255)
)CHARACTER SET utf8 COLLATE utf8mb3_bin;

CREATE TABLE `people`(
    birthday DATE,
    job_time DATETIME,
    login_time TIMESTAMP
);
INSERT INTO people VALUES ('2009-2-14','2020-12-1 9:34:12','2000-1-1 23:06:25');
SELECT * FROM people;