package com.iwinner.ez.ass.repor.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.iwinner.ez.ass.repor.dto.ReportDTO;
import com.iwinner.ez.ass.repor.form.ReportForm;
import com.iwinner.ez.ass.repor.utils.AssignmentConstants;

public class FileReaderOperation {

	public static List<String> fileRead() {

		List<String> listOfFields=new ArrayList<String>();
		try{
		// File Getting

		File file = new File(AssignmentConstants.INPUT_FILE);

		// FileReader operation

		FileReader fReader = new FileReader(file);

		BufferedReader bufferedReader = new BufferedReader(fReader);

		String line = null;

		while ((line = bufferedReader.readLine()) != null) {
			// Store of entire flat File Information or CSV file information
			listOfFields.add(line);
		}
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
	
		return listOfFields;
	}
	public static List<ReportForm> fileReadUsingForm() {
		List<ReportForm> listOfFields=new ArrayList<ReportForm>();
		try{
		// File Getting
		File file = new File(AssignmentConstants.INPUT_FILE);
		// FileReader operation
		FileReader fReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fReader);
		String line = null;

		while ((line = bufferedReader.readLine()) != null) {
			// Store of entire flat File Information or CSV file information
			ReportForm reportForm=new ReportForm();
			//System.out.println(line);//10,5000,Trainner,HYD,Good Dev,605284747,anji
			String sp[]=line.split(",");
			reportForm.setId(sp[0]);
			reportForm.setEmpSal(sp[1]);
			reportForm.setEmpDesg(sp[2]);
			reportForm.setEmpLoc(sp[3]);
			reportForm.setEmpDesc(sp[4]);
			reportForm.setEmpPhone(sp[5]);
			reportForm.setEmpName(sp[6]);
			listOfFields.add(reportForm);
			
		}
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
	
		return listOfFields;
	}
	
	public static void main(String[] args) {
		fileRead();
		
		List<ReportForm> listForm=fileReadUsingForm();
		
		for(ReportForm res:listForm){
			
			
			System.out.println(res.toString()+"\n");
		}
		
	}

}
