-- 本章作业

#2
DESC db01.dept;

DESC db01.emp;
#3
SELECT dname FROM dept;

SELECT ename, (sal + (IFNULL(comm, 0))) * 13 FROM emp;

#4
SELECT ename, sal FROM emp
    WHERE sal > 2850;

SELECT ename, sal FROM emp
    WHERE sal NOT BETWEEN 1500 AND 2850;

SELECT ename, deptno FROM emp
    WHERE empno = 7566;

SELECT ename, sal FROM emp
    WHERE deptno IN(10, 30) AND
            sal > 1500;

SELECT ename, deptno FROM emp
    WHERE mgr IS NULL;

#5
SELECT ename, empno, hiredate FROM emp
    WHERE hiredate BETWEEN '1991-2-1' AND '1991-5-1'
    ORDER BY hiredate;

SELECT ename, sal, comm FROM emp
    WHERE comm IS NOT NULL
    ORDER BY sal DESC;

