package h09.service;

import h09.entity.H09_LineItem;
import h09.entity.H09_Order;
import javax.persistence.*;

import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class DBOperation {

    Transaction tx = null;
    Session session = null;

    public boolean insertOrder(H09_Order od) {

        try {
            session = HibernateUtil.getSession();
            System.out.println("got session obj........");
            tx = session.beginTransaction();
            session.save(od);
            tx.commit();
            System.out.println("Order information added");
            return true;
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
            }
            ex.printStackTrace();
            return false;
        } finally {
            session.close();
        }
    }

    public H09_Order retrieveOrder(int oid) {
        H09_Order od = null;

        try {
            session = HibernateUtil.getSession();
            System.out.println("got session obj........");
            tx = session.beginTransaction();
            od = (H09_Order) session.get(H09_Order.class, oid);
            tx.commit();

            return od;
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
            }
            ex.printStackTrace();
            return od;
        } finally {
            session.close();
        }

    }

    public boolean insertItem(H09_LineItem it) {

        try {
            session = HibernateUtil.getSession();
            System.out.println("got session obj........");
            tx = session.beginTransaction();
            session.save(it);
            tx.commit();
            return true;
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
            }
            ex.printStackTrace();
            return false;
        } finally {
            session.close();
        }
    }

    public H09_LineItem retrieveItem(int id) {
        H09_LineItem it = null;

        try {
            session = HibernateUtil.getSession();
            System.out.println("got session obj........");
            tx = session.beginTransaction();
            it = (H09_LineItem) session.get(H09_LineItem.class, id);
            tx.commit();
            return it;
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
            }
            ex.printStackTrace();
            return it;
        } finally {
            session.close();
        }

    }
}
