CREATE TABLE goods(
    goods_id INT PRIMARY KEY ,
    goods_name VARCHAR(64) NOT NULL DEFAULT '',
    unitprice FLOAT CHECK ( unitprice >= 1 AND unitprice <= 9999.99 ),
    category VARCHAR(64),
    provider VARCHAR(64)
);

CREATE TABLE customer(
    customer_id INT PRIMARY KEY ,
    name VARCHAR(16),
    address VARCHAR(64),
    email VARCHAR(32) unique,
    sex VARCHAR(1) CHECK (sex IN ( '男', '女' ))
);

CREATE TABLE purchase(
    order_id INT PRIMARY KEY ,
    customer_id INT,
    goods_id INT,
    nums INT,
    FOREIGN KEY (customer_id) REFERENCES customer(customer_id),
    FOREIGN KEY (goods_id) REFERENCES goods(goods_id)
);


