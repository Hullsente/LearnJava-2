-- 仅仅用于临时使用指令操作
CREATE TABLE table03
(
    id       INT,
    name     VARCHAR(16),
    password VARCHAR(128)
);

DROP TABLE table03;

SELECT * FROM table03;

SELECT COUNT(*) FROM table03;

UPDATE db01.actor SET name = '天才' WHERE name = '小华';