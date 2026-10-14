-- 用户管理练习

CREATE USER  'cxk06602'@'localhost' IDENTIFIED BY '123';

CREATE DATABASE testbd CHARACTER SET utf8;

USE testbd;

CREATE TABLE news(
    id INT AUTO_INCREMENT PRIMARY KEY,
    time DATETIME NULL DEFAULT CURRENT_TIMESTAMP,
    title VARCHAR(64),
    content TEXT,
    sender VARCHAR(16)
);

DROP TABLE news;

#赋予查看和添加new的权限
GRANT SELECT, INSERT on news TO 'cxk06602'@'localhost';

INSERT INTO news(title, content, sender) VALUES('什么？计算机竟然仍然是普通人逆袭的最佳道路？', '根据数据调查......', 'Hullsente');

INSERT INTO news(title, content, sender) VALUES( '暴雷！房子必须现在买掉?', '根据最近的财经报道显示......', 'cxk06602');

INSERT INTO news(title, content, sender) VALUES( '什么？OPEN AI的模型竟然吊打ICPC所有参赛者？', '最近的一次实验测试发现.....', '数据分析师');

ALTER TABLE news
    ADD PRIMARY KEY id_primary_key (id);

UPDATE news SET sender = '计算机的艺术' WHERE id = 1;

UPDATE news SET sender = '经济学人' WHERE id = 2;

ALTER USER 'cxk06602'@'localhost' IDENTIFIED BY '123';

SET PASSWORD FOR 'cxk06602'@'localhost' = password('111');

REVOKE SELECT, INSERT ON news FROM 'cxk06602'@'localhost';

DROP USER 'cxk06602'@'localhost';
