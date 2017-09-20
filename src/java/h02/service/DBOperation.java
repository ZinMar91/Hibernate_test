package h02.service;

import h02.entity.LineItem;
import h02.entity.Orders;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class DBOperation {

    Transaction tx = null;
    Session session = null;

    public boolean insertOrder(Orders od) {
        try {
            session = HibernateUtil.getSession();
            System.out.println("got session obj........");
            tx = session.beginTransaction();
            session.save(od);
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

    public Orders retrieveOrder(int oid) {
        Orders od = null;
        try {
            session = HibernateUtil.getSession();
            System.out.println("got session obj........");
            tx = session.beginTransaction();
            od = (Orders) session.get(Orders.class, oid);
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

    public boolean insertItem(LineItem it) {
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

    public LineItem retrieveItem(int id) {
        LineItem it = null;
        try {
            session = HibernateUtil.getSession();
            System.out.println("got session obj........");
            tx = session.beginTransaction();
            it = (LineItem) session.get(LineItem.class, id);
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
