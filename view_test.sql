-- 视图的测试学习

CREATE VIEW info_view AS
    SELECT empno, ename, dname, grade FROM emp, dept, salgrade
        WHERE emp.deptno = dept.deptno AND
              sal BETWEEN salgrade.losal AND salgrade.hisal;

DROP VIEW info_view;

SELECT * FROM info_view;