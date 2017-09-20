package h01.dao;

import h01.entity.Customer;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;


public class CustomerDAOImpl {	
	Transaction tx=null;
	Session session=null;
	
	public boolean save(Customer customer){
		          System.out.println("In CustomerDaoImpl >>>>> " + customer.toString());
		session=HibernateUtil.getSession();
		tx=session.getTransaction();
		tx.begin();
		session.persist(customer);
		tx.commit();
		return true;		
	}
	
 public Customer search(int cno){
	 session=HibernateUtil.getSession();
		tx=session.getTransaction();
		tx.begin();
		Customer c=(Customer)session.get(Customer.class, cno);
		tx.commit();
		return c;
	}
	
}
