-- 初始化表 开始

DROP TABLE student, class, department;

CREATE TABLE department
(
    department_id INT PRIMARY KEY,
    dept_name     VARCHAR(16) UNIQUE
);

CREATE TABLE class
(
    class_id    INT PRIMARY KEY,
    subject     VARCHAR(16),
    dept_name   VARCHAR(16),
    enroll_time INT,
    num         INT,
    FOREIGN KEY (dept_name) REFERENCES department (dept_name)
);

CREATE TABLE student
(
    student_id INT PRIMARY KEY,
    name       VARCHAR(16) NOT NULL,
    age        INT,
    class_id   INT,
    FOREIGN KEY (class_id) REFERENCES class (class_id)
);

INSERT INTO department
VALUES (001, '数学'),
       (002, '计算机'),
       (003, '化学'),
       (004, '中文'),
       (005, '经济');

INSERT INTO class
VALUES (101, '软件', '计算机', 1995, 20),
       (102, '微电子', '计算机', 1996, 30),
       (111, '无机化学', '化学', 1995, 29),
       (112, '高分子化学', '化学', 1996, 25),
       (121, '统计数学', '数学', 1995, 20),
       (131, '现代语言', '中文', 1996, 20),
       (141, '国际贸易', '经济', 1997, 30),
       (142, '国际金融', '经济', 1996, 14);

INSERT INTO student
VALUES (8101, '张三', 18, 101),
       (8102, '钱四', 16, 121),
       (8103, '王玲', 17, 131),
       (8105, '李飞', 19, 102),
       (8109, '赵四', 18, 141),
       (8110, '李可', 20, 142),
       (8201, '张飞', 18, 111),
       (8302, '周瑜', 16, 112),
       (8203, '王亮', 17, 111),
       (8305, '董庆', 19, 102),
       (8409, '赵龙', 18, 101),
       (8510, '李丽', 20, 142);

-- 初始化表 结束

SELECT * FROM student
WHERE name LIKE '李%';

SELECT dept_name, COUNT(dept_name) count
FROM class
GROUP BY dept_name
HAVING count > 1;

SELECT department_id, department.dept_name, num FROM class, department
    WHERE num >= 30 AND
          class.dept_name = department.dept_name;

INSERT INTO department VALUES (006, '物理');

#下面的都是退学处理的

START TRANSACTION;

UPDATE class
SET num = num - 1
WHERE class.class_id = (SELECT *
                        FROM student
                        WHERE name = '张三');

DELETE
FROM student
WHERE name = '张三';

COMMIT;