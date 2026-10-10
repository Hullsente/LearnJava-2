#演示数据库的操作
#创建一个名称为hsp_db01的数据库

#使用指令创建数据库
CREATE DATABASE need_drop;
#删除数据库指令
DROP DATABASE need_drop;

#使用了utf-8字符集
DROP DATABASE need_drop_02;
CREATE DATABASE need_drop_02 CHARACTER SET utf8 COLLATE utf8_bin;
CREATE DATABASE need_drop_03 CHARACTER SET utf8 COLLATE utf8_general_ci;

SELECT * FROM need_drop_03.t1 WhERE NAME = 'tom'