package conf.models;

import java.util.Arrays;
import java.util.List;

import javax.faces.context.FacesContext;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import com.models.HibernateUtil;


import conf.entities.Employe;




public class EmployeModel {
	
	
	 private static Transaction transObj;
	    private static Session sessionObj = HibernateUtil.getSessionFactory().openSession();
	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	@SuppressWarnings({ "rawtypes" })
	public List<Employe> findAllEmp() {
		System.out.println("eempmodel1");
		List<Employe> employees = null;
		
		Session session = null;
		Transaction transaction = null;
		System.out.println("eempmodel2");
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			@SuppressWarnings("unchecked")
			org.hibernate.query.Query<Employe> query = session.createQuery("from Employe");
			employees = query.list();
			transaction.commit();
			//System.out.println("6666666666"+employees.get(employees.size()-1).getMenuItems().toArray()[0]);
	
		
		} catch (Exception e) {
			employees = null;
			if (transaction != null) {
				transaction.rollback();
			}
		} finally {
			session.close();
		}
		
		System.out.println("eempmodel3  returnnnnnnnn ");
//		for(Employe e : employees) {
//			
//			//System.out.println("for boocle "+e.getMenuItems());
//			//System.out.println("for boocle "+e.getFavNumber2Value());
//		
//		}
		return employees;
	}
	
	
	 
	 // Method To Add New Student Details In Database
	   public void addStudentInDb(Employe employeObj) {        
	        try {
	            transObj = sessionObj.beginTransaction();
	            sessionObj.save(employeObj);
	            System.out.println("Student Record With Id: " + employeObj.getId() + " Is Successfully Created In Database");
	 
	            // XHTML Response Text
	            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("createdStudentId",  employeObj.getId());                        
	        } catch (Exception exceptionObj) {
	        	//System.out.println("catch method employe model"+ employeObj.getMenuItems());
	            exceptionObj.printStackTrace();
	        } finally {
	            transObj.commit();
	        	//System.out.println("finaly method employe model"+employeObj.getMenuItems());
	        }
	    }


}
