
CREATE TABLE `t1`(
    id int,
    `name` varchar(255),
    resume text
);

DROP TABLE t1;
INSERT INTO t1(name, id, resume) VALUES ('低碱酚红',1,'一个程序小白');
INSERT INTO t1(name, id, resume) VALUES ('图灵',2,'大佬！！！我不想选择这个派，宁愿选择冯诺依曼');

SELECT * FROM t1;

UPDATE t1 SET name = 'cxk06602' WHERE id = 1;
UPDATE t1 SET name = '低碱酚红' WHERE id = 1;

UPDATE t1 SET id = id + 1 WHERE id = 1;

DELETE FROM t1
    WHERE name = '图灵';