#****创建新的表(student)********
create table student(
                        id int not null default 1,
                        name varchar(20) not null default '',
                        chinese float not null default 0.0,
                        english float not null default 0.0,
                        math float not null default 0.0
);

insert into student(id,name,chinese,english,math) values(1,'蔡徐坤',89,78,90);
insert into student(id,name,chinese,english,math) values(2,'张飞',67,98,56);
insert into student(id,name,chinese,english,math) values(3,'宋江',87,78,77);
insert into student(id,name,chinese,english,math) values(4,'关羽',88,98,90);
insert into student(id,name,chinese,english,math) values(5,'赵云',82,84,67);
insert into student(id,name,chinese,english,math) values(6,'欧阳锋',55,85,45);
insert into student(id,name,chinese,english,math) values(7,'黄蓉',75,65,30);

SELECT * FROM student;

SELECT `name`,english FROM student;

SELECT DISTINCT * FROM student;

SELECT `name` AS '名字', (chinese + english + math + 10) AS '总分' FROM student;

SELECT * FROM student
    WHERE name = '赵云';

SELECT * FROM student
WHERE english > 90;

SELECT * FROM student
WHERE (chinese + english + math) > 200;

SELECT * FROM student
    WHERE math > 60 AND id > 4;

SELECT * FROM student
    WHERE english > chinese;

# '赵%' 中%的意思是要赵开头的字符
SELECT * FROM student
    WHERE (chinese + math + english) > 200 AND math < chinese AND `name` LIKE '赵%';

#exercise
SELECT * FROM student
    WHERE english > 80 AND english < 90;

SELECT * FROM student
    WHERE math = 89 OR math = 90 OR math = 91;

SELECT * FROM student
    WHERE name LIKE '李%';

SELECT * FROM student
    WHERE chinese BETWEEN 70 AND 80;

SELECT * FROM student
    WHERE (chinese + math + english) IN (189,190,191);

SELECT * FROM student
    WHERE name LIKE '李%' OR name LIKE '宋%';

SELECT * FROM student
    WHERE math > chinese + 30;

-- 多列子查询

SELECT math, english, chinese FROM student
    WHERE name = '宋江';

SELECT * FROM student
    WHERE (math, english, chinese) = (
        SELECT math, english, chinese FROM student
            WHERE name = '宋江'
        );