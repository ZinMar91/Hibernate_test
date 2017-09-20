package h08.service;

import h08.entity.H08_Customer;
import h08.entity.H08_Phone;
import javax.persistence.*;

import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class CustomerDAOImpl {
    //private static EntityManager em=DAOUtil.getEntityManager();

    Session session = null;
    Transaction tx = null;

    public void Save(H08_Customer c) {

        try {
            session = HibernateUtil.getSession();
            System.out.println("got session obj........");
            tx = session.beginTransaction();

            session.persist(c);
            tx.commit();
            System.out.println("Person information added");

        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
            }
            ex.printStackTrace();

        } finally {
            session.close();
        }
    }

    public H08_Customer Retrieve(int cn) {
        try {

            session = HibernateUtil.getSession();
            System.out.println("got session obj........");
            tx = session.beginTransaction();
            H08_Customer pp = (H08_Customer) session.get(H08_Customer.class, cn);

            tx.commit();
            if (pp != null) {
                System.out.println("Entity Found");
                return pp;
            } else {
                System.out.println("Entity not found " + cn);
                return null;
            }
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
            return null;
        } finally {
            session.close();
        }
    }

    public void SavePhone(H08_Phone p) {

        try {
            session = HibernateUtil.getSession();
            System.out.println("got session obj........");
            tx = session.beginTransaction();
            session.persist(p);

            tx.commit();
            System.out.println("Person information added");

        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
            }
            ex.printStackTrace();

        } finally {
            session.close();
        }
    }

    public H08_Phone RetrievePhone(String pn) {
        try {

            session = HibernateUtil.getSession();
            System.out.println("got session obj........");
            tx = session.beginTransaction();
            H08_Phone pp = (H08_Phone) session.get(H08_Phone.class, pn);

            tx.commit();
            if (pp != null) {
                System.out.println("Entity Found");
                return pp;
            } else {
                System.out.println("Entity not found " + pn);
                return null;
            }
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
            return null;
        } finally {
            session.close();
        }
    }

}
