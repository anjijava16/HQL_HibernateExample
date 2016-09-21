package com.iwinner.hibernate.annotations;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class  TestClient
{
	public static void main(String[] args) throws Exception
	{
		
		
		// First Step 1:: BootStartp Class invoke framework
		Configuration conf=new Configuration();
		// Setting the config  file
		 conf=conf.configure("/mycfg-mysql.xml");
		 //conf.configure("/mycfg-mysql.xml");
		 
		 // High level Object
		 SessionFactory sessionFactory=conf.buildSessionFactory();
		 // SesssionFactoryImpl
		 
		 Session session=sessionFactory.openSession();
		 
         EmployeeDTO eBean=new EmployeeDTO();
       
       
         eBean.setId(143);
         eBean.setEmpName("KKK");
         eBean.setEmpAdd("HYDE");
         Transaction tx=null;
         try{
         // Trasaction Object is created
         
          tx=session.beginTransaction();  
         System.out.println(tx.getClass());
         
         
         session.save(eBean);
         
         // it will be commited database
         
         
        tx.commit();
         }catch(Exception e){
        	tx.rollback();
     
        	//tx.setTimeout(arg0);
         }
        session.close();
         sessionFactory.close();
		 
		 /*
/// get HB Session obj connected to mysql DB s/w
		Configuration mysqlcfg=new Configuration();
		mysqlcfg=mysqlcfg.configure("/mycfg-mysql.xml");
		SessionFactory mysqlfactory=mysqlcfg.buildSessionFactory();
		Session mysqlses=mysqlfactory.openSession();

		// write HB persistance logic interacting with multiple DB s/w
		    // select a record from oracle DB s/w
			EmpBean eb=(EmpBean)orases.get(EmpBean.class,new Integer(1010));
			//insert the record into mysql DB s/w
			Transaction  tx=mysqlses.beginTransaction();
			     mysqlses.save(eb);
		    tx.commit();

			//close sesion objs
			orases.close();
			mysqlses.close();
			//close sessionfactory objs
			orafactory.close();
			mysqlfactory.close();
*/	}//main
}//class
