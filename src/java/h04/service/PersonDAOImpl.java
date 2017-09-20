package h04.service;
import h04.entity.Person;
import org.hibernate.Transaction;
import org.hibernate.Session;
import util.HibernateUtil;
public class PersonDAOImpl{
	Session session=null;
	Transaction tx=null;
	
	public void savePerson(Person p){
		try
		{
			session = HibernateUtil.getSession();
			System.out.println("got session obj........");
			tx=session.beginTransaction();
			session.persist(p);
			tx.commit();
			System.out.println("Person information added");		
			
		}
		catch(Exception ex)
		{
			if(tx!=null)
				tx.rollback();
			ex.printStackTrace();
			
			
		}
		finally
		{
			session.close();
		}
	}
public Person retrievePerson(int no){
	try	{	

		session = HibernateUtil.getSession();
		System.out.println("got session obj........");
		tx=session.beginTransaction();
		Person pp=(Person)session.get(Person.class,no);
		tx.commit();
		if(pp!=null) {
			System.out.println("Entity Found");
			return pp;}
		else {
			System.out.println("Entity not found "+no);
			return null;
		}
		}
		catch(Exception e){
			if(tx!=null)
				tx.rollback();
			e.printStackTrace();
			return null;
		}
		finally{
			session.close();
		}
}
}
