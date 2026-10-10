CREATE TABLE dept( /*部门表*/
                     deptno MEDIUMINT   UNSIGNED  NOT NULL  DEFAULT 0,
                     dname VARCHAR(20)  NOT NULL  DEFAULT '',
                     loc VARCHAR(13) NOT NULL DEFAULT ''
);

INSERT INTO dept VALUES(10, 'ACCOUNTING', 'NEW YORK'), (20, 'RESEARCH', 'DALLAS'), (30, 'SALES', 'CHICAGO'), (40, 'OPERATIONS', 'BOSTON');


#创建表EMP雇员
CREATE TABLE emp
(empno  MEDIUMINT UNSIGNED  NOT NULL  DEFAULT 0, /*编号*/
 ename VARCHAR(20) NOT NULL DEFAULT '', /*名字*/
 job VARCHAR(9) NOT NULL DEFAULT '',/*工作*/
 mgr MEDIUMINT UNSIGNED ,/*上级编号*/
 hiredate DATE NOT NULL,/*入职时间*/
 sal DECIMAL(7,2)  NOT NULL,/*薪水*/
 comm DECIMAL(7,2) ,/*红利*/
 deptno MEDIUMINT UNSIGNED NOT NULL DEFAULT 0 /*部门编号*/
);


INSERT INTO emp VALUES(7369, 'SMITH', 'CLERK', 7902, '1990-12-17', 800.00,NULL , 20),
                      (7499, 'ALLEN', 'SALESMAN', 7698, '1991-2-20', 1600.00, 300.00, 30),
                      (7521, 'WARD', 'SALESMAN', 7698, '1991-2-22', 1250.00, 500.00, 30),
                      (7566, 'JONES', 'MANAGER', 7839, '1991-4-2', 2975.00,NULL,20),
                      (7654, 'MARTIN', 'SALESMAN', 7698, '1991-9-28',1250.00,1400.00,30),
                      (7698, 'BLAKE','MANAGER', 7839,'1991-5-1', 2850.00,NULL,30),
                      (7782, 'CLARK','MANAGER', 7839, '1991-6-9',2450.00,NULL,10),
                      (7788, 'SCOTT','ANALYST',7566, '1997-4-19',3000.00,NULL,20),
                      (7839, 'KING','PRESIDENT',NULL,'1991-11-17',5000.00,NULL,10),
                      (7844, 'TURNER', 'SALESMAN',7698, '1991-9-8', 1500.00, NULL,30),
                      (7900, 'JAMES','CLERK',7698, '1991-12-3',950.00,NULL,30),
                      (7902, 'FORD', 'ANALYST',7566,'1991-12-3',3000.00, NULL,20),
                      (7930, 'Willian', 'ARCHIEVE',7566,'1991-12-3',3000.00, NULL,40),
                      (7934,'MILLER','CLERK',7782,'1992-1-23', 1300.00, NULL,10);

INSERT INTO emp VALUES(7930, 'WILLWIAN', 'SALESMAN',7566,'1991-12-3',3000.00, NULL,40);

DELETE FROM emp WHERE empno = 7930;

#工资级别表
CREATE TABLE salgrade
(
    grade MEDIUMINT UNSIGNED NOT NULL DEFAULT 0,
    losal DECIMAL(17,2)  NOT NULL,
    hisal DECIMAL(17,2)  NOT NULL
);

INSERT INTO salgrade VALUES (1,700,1200);
INSERT INTO salgrade VALUES (2,1201,1400);
INSERT INTO salgrade VALUES (3,1401,2000);
INSERT INTO salgrade VALUES (4,2001,3000);
INSERT INTO salgrade VALUES (5,3001,9999);

-- 练习开始

SELECT AVG(sal), MAX(sal), deptno FROM emp
    GROUP BY deptno;

SELECT AVG(sal), MIN(sal), deptno, job FROM emp
    GROUP BY deptno, job;

SELECT AVG(sal) AS `avg` FROM emp
    GROUP BY deptno HAVING `avg` < 2000;

SELECT CONCAT(LCASE(SUBSTRING(`ename`, 1, 1)),SUBSTRING(`ename`, 2, LENGTH(ename))) FROM emp;
SELECT CONCAT(LCASE(LEFT(`ename`, 1)),SUBSTRING(`ename`, 2, LENGTH(ename))) FROM emp;

SELECT DATEDIFF(NOW(), '2008-1-13') FROM DUAL;

SELECT DATEDIFF(DATE_ADD('2008-1-13', INTERVAL 80 YEAR), NOW()) FROM DUAL;

SELECT * FROM mysql.user;

SELECT * FROM emp
    ORDER BY empno DESC
    LIMIT 10, 5;

SELECT * FROM emp
ORDER BY empno DESC
LIMIT 20, 5;

SELECT ename, sal, dept.dname FROM emp, dept
    WHERE emp.deptno = dept.deptno
        ORDER BY dept.deptno DESC;

SELECT worker.`ename`, boss.`ename` FROM emp worker, emp boss
    WHERE worker.mgr = boss.empno;

SELECT `ename`, `job`, `sal`, `deptno` FROM emp
    WHERE job IN (
        SELECT DISTINCT job FROM emp
            WHERE deptno = 10
        ) AND deptno != 10;

SELECT deptno ,AVG(sal) FROM emp
    group by deptno;

SELECT emp.ename, emp.deptno, emp.sal
    FROM emp, (
        SELECT deptno ,AVG(sal) AS avg_sal FROM emp
            group by deptno
    ) avg_temp
    WHERE avg_temp.deptno = emp.deptno AND emp.sal > avg_sal