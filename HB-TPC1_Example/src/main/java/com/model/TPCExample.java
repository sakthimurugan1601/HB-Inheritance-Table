package com.model;
import org.hibernate.*;

public class TPCExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Transaction tr=null;
        try(Session ses=HBUTIL.getSessionFactory().openSession())
        {
        	tr=ses.beginTransaction();
        	Employee e1=new Employee("Siva");
        	RegEmployee e2=new RegEmployee("sales",5500,"Prasana");
        	Trainee e3=new Trainee("kugan",200,"6 months");
        	
        	ses.persist(e1);ses.persist(e2);ses.persist(e3);
        	tr.commit();
        	ses.close();
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
        
        
	}

}
