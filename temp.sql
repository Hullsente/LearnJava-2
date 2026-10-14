-- 演示索引

-- 索引

CREATE TABLE `order`
(
    id INT PRIMARY KEY,
    goods_name VARCHAR(32),
    buyer_name VARCHAR(16),
    count INT
);

CREATE TABLE `order2`(
                        id INT,
                        goods_name VARCHAR(32),
                        buyer_name VARCHAR(16),
                        count INT,
                        PRIMARY KEY (id)
);

CREATE TABLE `order3`(
                         id INT,
                         goods_name VARCHAR(32),
                         buyer_name VARCHAR(16),
                         count INT
);
ALTER TABLE `order3` ADD PRIMARY KEY 'id_key' (id);

CREATE TABLE menu1 (
    id INT PRIMARY KEY,
    food_name VARCHAR(16),
    buyer_id INT UNIQUE,
    price DECIMAL(10,2)
);

CREATE TABLE menu2 (
   id INT PRIMARY KEY ,
   food_name VARCHAR(16),
   buyer_id INT,
   price DECIMAL(10,2),
   UNIQUE (buyer_id)
);

ALTER TABLE menu1 ADD UNIQUE 'food_unique' (food_name)

SHOW KEYS FROM menu1;

CREATE TABLE sportman(
    id INT,
    name VARCHAR(16),
    hobby VARCHAR(64),
    INDEX name_index (name)
);

ALTER TABLE sportman ADD PRIMARY KEY id_primary_key (id);

ALTER TABLE sportman ADD INDEX name_index (name);

CREATE INDEX name_index ON sportman(id);

SHOW INDEX FROM sportman;

-- 隔离级别

SELECT * FROM dog;

INSERT INTO dog VALUES (100, '小天才');

UPDATE dog SET id = -1 WHERE id = 100;

CREATE TABLE dog(
    id INT,
    name VARCHAR(64)
);

START TRANSACTION;


SELECT @@transaction_isolation;

SELECT @@global.transaction_isolation;

SET SESSION TRANSACTION ISOLATION LEVEL REPEATABLE READ ;

SAVEPOINT a;

SAVEPOINT b;

ROLLBACK TO b;

ROLLBACK TO a;

COMMIT;