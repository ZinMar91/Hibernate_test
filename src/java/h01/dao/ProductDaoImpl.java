/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package h01.dao;

import h01.entity.Product;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author Admin
 */
public class ProductDaoImpl {
    private static Transaction transaction;
    private static Session session;
    
    public static String add(Product p) {
        System.out.println("In Dao Impl");
        session = HibernateUtil.getSession();
        transaction = session.beginTransaction();
        session.save(p);
        transaction.commit();
        return "success";
    }
    
    public static List<Product> viewAll() {
        session = HibernateUtil.getSession();
        transaction = session.beginTransaction();
        Query query = session.createQuery("FROM Product p");
        return query.list();
    }
}
