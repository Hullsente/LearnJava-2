#6

-- 1 ~ 12
SELECT * FROM emp
WHERE deptno = 30;


SELECT ename, empno, deptno FROM emp
WHERE deptno = 30 AND
    job = 'CLERK';

SELECT * FROM emp
WHERE sal < IFNULL(comm, 0);

SELECT * FROM emp
WHERE 0.6 * sal < IFNULL(comm, 0);

SELECT * FROM emp
WHERE (deptno = 10 AND job = 'MANAGER') OR
    (deptno = 20 AND job = 'CLERK');

SELECT * FROM emp
    WHERE (
        (deptno = 10 AND job = 'MANAGER') OR
        (deptno = 20 AND job = 'CLERK')
        ) OR (
        job NOT IN('MANAGER', 'CLERK') AND
        sal >= 2000
        );

SELECT job FROM (
    SELECT job, COUNT(job) AS job_count FROM emp
        WHERE comm IS NOT NULL
        GROUP BY job
    ) AS temp_table
    WHERE job_count <= 1;

SELECT * FROM emp
    WHERE comm IS NULL OR
          comm <= 100;

SELECT * FROM emp
    WHERE DATE_SUB(LAST_DAY(hiredate), INTERVAL 2 DAY) = hiredate;

SELECT * FROM emp
    WHERE hiredate < DATE_SUB(NOW(), INTERVAL 12 YEAR);

SELECT CONCAT(LCASE(SUBSTRING(ename, 1, 1)), SUBSTRING(ename, 2)) FROM emp;

SELECT ename FROM emp
    WHERE LENGTH(ename) = 5;

-- 13 ~ 25

SELECT * FROM emp
    WHERE ename LIKE '%R%';

SELECT SUBSTRING(ename, 1,3) FROM emp;

SELECT REPLACE(ename, 'A', 'a') FROM emp;

SELECT ename, emp.hiredate FROM emp
    WHERE DATE_ADD(hiredate, INTERVAL 10 YEAR) < now();

SELECT * FROM emp
    ORDER BY ename;

SELECT ename, hiredate FROM emp
    ORDER BY hiredate;

SELECT ename, job, sal FROM emp
    ORDER BY job DESC, sal;

SELECT ename, YEAR(hiredate), MONTH(hiredate) FROM emp
    ORDER BY `MONTH(hiredate)`, `YEAR(hiredate)`;

SELECT FLOOR(sal / 30) FROM emp;

SELECT * FROM emp
    WHERE MONTH(hiredate) = 2;

SELECT DATEDIFF(NOW(), hiredate) FROM emp;

SELECT * FROM emp
    WHERE ename LIKE '%A%';

SELECT FLOOR(DATEDIFF(NOW(), hiredate) / 365) AS '年',
       FLOOR(DATEDIFF(NOW(), hiredate) % 365 / 30)  AS '月',
       FLOOR(DATEDIFF(NOW(), hiredate)  % 30) '日' FROM emp;