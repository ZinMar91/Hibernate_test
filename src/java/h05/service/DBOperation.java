package h05.service;

import h05.entity.UserTwo;
import javax.persistence.*;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class DBOperation {

    public boolean insertUser(UserTwo u) {
        Transaction tx = null;
        Session session = null;
        try {
            session = HibernateUtil.getSession();
            System.out.println("got session obj........");
            tx = session.beginTransaction();
            session.persist(u);
            tx.commit();
            System.out.println("User information added");
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

    public UserTwo retrieveUser(int uid) {
        UserTwo u = null;
        Transaction tx = null;
        Session session = null;
        try {
            session = HibernateUtil.getSession();
            System.out.println("got session obj........");
            tx = session.beginTransaction();
            u = (UserTwo) session.get(UserTwo.class, uid);
            tx.commit();
            return u;
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
            }
            ex.printStackTrace();
            return u;
        } finally {
            session.close();
        }

    }

}
