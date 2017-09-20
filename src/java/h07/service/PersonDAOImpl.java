package h07.service;

import h07.entity.Customer;
import h07.entity.Person;
import org.hibernate.Transaction;
import org.hibernate.Session;
import util.HibernateUtil;

public class PersonDAOImpl {

    Session session = null;
    Transaction tx = null;

    public void savePerson(Person p, Customer c) {
        try {
            session = HibernateUtil.getSession();
            System.out.println("got session obj........");
            tx = session.beginTransaction();
            session.persist(p);
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

    public Person retrievePerson(int pid) {
        try {

            session = HibernateUtil.getSession();
            System.out.println("got session obj........");
            tx = session.beginTransaction();
            Person pp = (Person) session.get(Person.class, pid);

            tx.commit();
            if (pp != null) {
                System.out.println("Entity Found");
                return pp;
            } else {
                System.out.println("Entity not found " + pid);
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

    public Customer retrieveCustomer(int cid) {
        try {

            session = HibernateUtil.getSession();
            System.out.println("got session obj........");
            tx = session.beginTransaction();
            Customer pp = (Customer) session.get(Customer.class, cid);

            tx.commit();
            if (pp != null) {
                System.out.println("Entity Found");
                return pp;
            } else {
                System.out.println("Entity not found " + cid);
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
