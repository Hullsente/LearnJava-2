package com.cxk06602.bugcrusher.jdbc_.basicdao.test;

import com.cxk06602.bugcrusher.jdbc_.basicdao.dao.ActorDAO;
import com.cxk06602.bugcrusher.jdbc_.basicdao.dao.GoodsDAO;
import com.cxk06602.bugcrusher.jdbc_.basicdao.javabean.Actor;
import com.cxk06602.bugcrusher.jdbc_.basicdao.javabean.Goods;

import java.util.List;

public class DAOTest {
    static void main() {
        GoodsDAO goodsDAO = new GoodsDAO();
        List<Goods> list = goodsDAO.queryAll("SELECT * FROM shop_db.goods", Goods.class);
        System.out.println(list);
        Goods goods = goodsDAO.queryRow("SELECT * FROM shop_db.goods", Goods.class);
        System.out.println(goods);
        Object object1 = goodsDAO.queryObject("SELECT goods_name FROM shop_db.goods WHERE goods_id = 1");
        System.out.println(object1);

        System.out.println("---actor相关测试---");

        ActorDAO actorDAO = new ActorDAO();
        List<Actor> actors = actorDAO.queryAll("SELECT * FROM db01.actor", Actor.class);
        for (Actor actor : actors) {
            System.out.println(actor);
        }

        System.out.println();

        System.out.println(actorDAO.queryRow("SELECT * FROM db01.actor WHERE id = ?", Actor.class, 1));

        System.out.println();

        Object object = actorDAO.queryObject("SELECT name FROM db01.actor WHERE id = ?", 2);
        System.out.println(object);

        int update = actorDAO.update("UPDATE db01.actor SET name = '小华' WHERE id = ?", 5);
        System.out.println(update);
    }
}
