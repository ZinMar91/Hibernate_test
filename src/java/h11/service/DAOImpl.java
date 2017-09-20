package h11.service;

import h11.entity.H11_Mother;
import h11.entity.H11_Person;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class DAOImpl {

    Transaction tx = null;
    Session session = null;

    public boolean saveperson(H11_Person p) {
        try {
            session = HibernateUtil.getSession();
            tx = session.beginTransaction();
            //session.persist(p);
            session.save(p);
            tx.commit();
            return true;
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.getStackTrace();
            return false;
        } finally {
            session.close();
        }
    }

    public boolean savemother(H11_Mother m) {
        try {
            session = HibernateUtil.getSession();
            tx = session.beginTransaction();
            session.save(m);
            tx.commit();
            return true;
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.getStackTrace();
            return false;
        } finally {
            session.close();
        }
    }
    H11_Person per;

    public H11_Person retrieveperson(int id) {
        try {
            session = HibernateUtil.getSession();
            tx = session.beginTransaction();
            per = (H11_Person) session.get(H11_Person.class, id);
            tx.commit();
            return per;
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.getStackTrace();
            return null;
        } finally {
            session.close();
        }
    }
    H11_Mother mo;

    public H11_Mother retrievemother(int id) {
        try {
            session = HibernateUtil.getSession();
            tx = session.beginTransaction();
            mo = (H11_Mother) session.get(H11_Mother.class, id);
            tx.commit();
            return mo;
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.getStackTrace();
            return null;
        } finally {
            session.close();
        }
    }
}
