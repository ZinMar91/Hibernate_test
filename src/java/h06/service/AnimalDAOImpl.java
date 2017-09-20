package h06.service;
import h06.entity.AirAnimal;
import h06.entity.Animal;
import h06.entity.LandAnimal;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class AnimalDAOImpl{
	Transaction tx=null;
	Session session=null;
	public void saveAnimal(Animal a){
		try{
			session=HibernateUtil.getSession();
			tx=session.getTransaction();
			tx.begin();
			session.persist(a);
			tx.commit();
		}catch(Throwable ex){
			
			ex.printStackTrace();
			
		}finally{
			if(session!=null)session.close();
		}
	}

	public void saveLandAnimal(LandAnimal a){
		try{
			session=HibernateUtil.getSession();
			tx=session.getTransaction();
			tx.begin();
			session.persist(a);
			tx.commit();
		}catch(Throwable ex){
			
			ex.printStackTrace();
			
		}finally{
			if(session!=null)session.close();
		}
	}
	public void savetAirAnimal(AirAnimal a){
		try{
			session=HibernateUtil.getSession();
			tx=session.getTransaction();
			tx.begin();
			session.persist(a);
			tx.commit();
			
		}catch(Throwable ex){
			
			ex.printStackTrace();
			
		}finally{
			if(session!=null)session.close();
		}
	}
	
	public Animal retrieveAnimal(int n){
		
		try{
			session=HibernateUtil.getSession();
			tx=session.getTransaction();
			tx.begin();
			Animal a=(Animal)session.get(Animal.class, n);
			tx.commit();
			return a;
		}catch(Throwable ex){
			
			ex.printStackTrace();
			return null;
			
		}finally{
			if(session!=null)session.close();
		}
	}
	
public LandAnimal retrieveLandAnimal(int n){
		
		try{
			session=HibernateUtil.getSession();
			tx=session.getTransaction();
			tx.begin();
			LandAnimal a=(LandAnimal)session.get(LandAnimal.class, n);
			tx.commit();
			return a;
		}catch(Throwable ex){
			
			ex.printStackTrace();
			return null;
			
		}finally{
			if(session!=null)session.close();
		}
	}

public AirAnimal retrieveAirAnimal(int n){
	
	try{
		session=HibernateUtil.getSession();
		tx=session.getTransaction();
		tx.begin();
		AirAnimal a=(AirAnimal)session.get(AirAnimal.class, n);
		tx.commit();
		return a;
	}catch(Throwable ex){
		
		ex.printStackTrace();
		return null;
		
	}finally{
		if(session!=null)session.close();
	}
}
}

