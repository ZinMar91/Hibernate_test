package h10.service;

import h10.entity.Author;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class DBOImpl {

    Transaction tx = null;
    Session session = null;

    public boolean Save(Author author) {
        try {
            session = HibernateUtil.getSession();
            tx = session.beginTransaction();
            session.save(author);

            tx.commit();
            return true;
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            return false;
        } finally {
            //session.close();
        }

    }

    public Author searchdata(Integer id) {
        try {
            session = HibernateUtil.getSession();
            tx = session.beginTransaction();
            Author a = (Author) session.get(Author.class, id);

            tx.commit();
            return a;
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            return null;
        } finally {
            //session.close();
        }

    }

    public boolean deleteauthor(int itno) {
        try {
            session = HibernateUtil.getSession();
            System.out.println("got session obj........");
            tx = session.beginTransaction();
            Author cu = (Author) session.get(Author.class, itno);
            session.clear();
            if (cu != null) {
                session.delete(cu);
                tx.commit();
            }
            System.out.println("Customer information retrieved");
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

}
