CREATE TABLE emp(
    id INT,
    name VARCHAR(32),
    sex CHAR(1),
    birthday DATE,
    entry_date DATETIME,
    job VARCHAR(32),
    salary DOUBLE,
    resume TEXT
);
DROP TABLE emp;

INSERT INTO `emp` VALUES(100,'小妖怪', '男', '2000-11-11', '2010-11-10 11:11:11', '巡山的', 3000, '大王叫我来巡山');

SELECT * FROM emp;

-- new lesson

ALTER TABLE emp
ADD image varchar(10000) NOT NULL DEFAULT '' AFTER resume;

ALTER TABLE emp
    MODIFY job varchar(60) NOT NULL DEFAULT '';

ALTER TABLE emp
    DROP sex;

RENAME TABLE emploee TO info;

ALTER TABLE info
    CHARACTER SET gbk;

ALTER TABLE emploee
    CHANGE `user_name` `name` varchar(32) NOT NULL DEFAULT '';
#差个最后一个
