SELECT cat_id, MAX(shop_price) FROM ecs_goods
    GROUP BY cat_id;

SELECT goods_id, ecs_goods.cat_id, goods_name, shop_price
    FROM (
        SELECT cat_id, MAX(shop_price) AS max
            FROM ecs_goods
            GROUP BY cat_id
        ) temp_table, ecs_goods
    WHERE temp_table.cat_id = ecs_goods.cat_id AND max = shop_price;