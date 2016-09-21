package com.iwinner.ez.ass.repor.dao;

import java.io.File;
import java.io.FileWriter;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.iwinner.ez.ass.repor.dto.ReportDTO;
import com.iwinner.ez.ass.repor.utils.HibernateUtils;

public class ReportDaoImpl implements ReportDaoIF {

	
	public void saveDetailsByList(List<String> list) {
	
		Session session=HibernateUtils.getSessionFactory().openSession();
		
		try {
		File successFile = new File("E:/anji/SUCCESS_REPORT.csv");
		File failedFile = new File("E:/anji/Failed_REPORT.csv");
		FileWriter writer_fs = new FileWriter(failedFile);
		FileWriter writer_Scc = new FileWriter(successFile);
		for(String inputId:list){
			
			
			// select * from Report_TBL where reportId=10  // Single Record approach
			
			// select * fro Report_TBL // Bulk Records selection  HQL,Criteria,NativeSQL(Similar Like JDBC)
			
			
			ReportDTO reportDTO=(ReportDTO)session.get(ReportDTO.class, Integer.parseInt(inputId));
			
			if(reportDTO==null){

				
					// ERROR  FILE
					
					writer_fs.write(inputId);
					writer_fs.write("\n");
					writer_fs.flush();
				
			}else if(reportDTO!=null){
				
					// SUCCESS FILE
					
					writer_Scc.write(reportDTO.getId() + "|"
							+ reportDTO.getEmpName() + "|"
							+ reportDTO.getEmpDes() + "|"
							+ reportDTO.getEmpAdd() + "|"
							+ reportDTO.getEmpPhoneNumber() + "|"
							+ reportDTO.getEmpSal());
					writer_Scc.write("\n");
					writer_Scc.flush();
				
			}
		
			
		}
		} catch (Exception e) {

		}

  }
	
	/**
	 * It is insertOperation method for saving the list of cusotmer deatails.
	 * @author anjaiahspr
	 * @since 24th July,2016.
	 * @param list
	 */
	public  void insertOperation(List<String> list) {

		// Coding stands 
		
		// we should is it null or not
		
		
		if(list!=null){
			
			Session session=HibernateUtils.getSessionFactory().openSession();
			
			for(String res:list){
				
				ReportDTO reportDTO=(ReportDTO)session.get(ReportDTO.class, Integer.parseInt(res));
				
				if(reportDTO==null){
					// Inser that record into our database 
				      ReportDTO resDTO=new ReportDTO();
				      resDTO.setId(Integer.parseInt(res));
				      // Inser Update,delete ==================>>> Transaction is mandatory
				      Transaction tx=session.beginTransaction();
				      tx.begin();
				      session.save(resDTO);
				      tx.commit();
				}else{
					// SKIP here bcoz that values alredy there in database
				}
				
			}
		// List of Data
			
		}else{
			
			System.out.println("List of file data information is empty or zero");
		}
		
	}	
	
}
