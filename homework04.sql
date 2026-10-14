SELECT DISTINCT deptno FROM emp, (
    SELECT COUNT(*) FROM emp
        GROUP BY deptno
    ) AS `temp`
    WHERE `COUNT(*)` > 1;

SELECT emp.* FROM emp
    WHERE emp.sal > (
        SELECT sal FROM emp
        WHERE ename = 'SMITH'
    );

SELECT * FROM emp, emp op
    WHERE op.empno = emp.mgr AND
        op.hiredate > emp.hiredate;

SELECT dname, emp.* FROM emp
    RIGHT JOIN dept ON emp.deptno = dept.deptno;

SELECT ename, dname FROM emp ,dept
    WHERE job = 'CLERK' AND emp.deptno = dept.deptno;

SELECT job, MIN(sal) min_sal FROM emp, dept
    GROUP BY job
    HAVING min_sal > 1500;

SELECT ename, dname FROM emp, dept
    WHERE emp.deptno= dept.deptno AND
          dname = 'SALES';

SELECT * FROM emp
    WHERE sal > (
        SELECT AVG(sal) avg FROM emp
    );

#9 ~ 16

SELECT * FROM emp, emp temp
    WHERE temp.ename = 'SCOTT' AND
            emp.job = temp.job;

SELECT ename, sal FROM emp
    WHERE sal > (
        SELECT MAX(sal) FROM emp
            WHERE deptno = 30
    );

SELECT  emp.deptno, COUNT(ename), AVG(sal), FORMAT(AVG(DATEDIFF(NOW(), hiredate)) / 365,) FROM emp, dept
    WHERE emp.deptno = dept.deptno
    GROUP BY emp.deptno;

SELECT ename, dname, sal FROM emp, dept
    WHERE emp.deptno = dept.deptno;

SELECT dept.*, count FROM dept, (
        SELECT deptno, COUNT(ename) AS count FROM emp
            GROUP BY emp.deptno
    ) AS temp
    WHERE temp.deptno = dept.deptno;

SELECT deptno, MIN(sal) FROM emp
    GROUP BY deptno;

SELECT MIN(sal) FROM emp
    WHERE job = 'MANAGER';

SELECT 13 * (sal + IFNULL(comm, 0)) year_sal FROM emp
    GROUP BY year_sal;