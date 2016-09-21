package com.iwinner.ez.ass.repor.main;

import java.util.List;

import org.apache.log4j.Logger;

import com.iwinner.ez.ass.repor.dao.ReportDaoIF;
import com.iwinner.ez.ass.repor.dao.ReportDaoImpl;
import com.iwinner.ez.ass.repor.files.FileReaderOperation;

public class StartOperation {

	
	public static Logger LOGGER=Logger.getLogger(StartOperation.class);
	
	public static Object startOperation() {
		LOGGER.info("############### Enter into the startOperation operation method ##########");
		
		List<String> listOfInputRecords=FileReaderOperation.fileRead();
		
		ReportDaoIF reportDaoIF=new ReportDaoImpl();
		
		//reportDaoIF.saveDetailsByList(listOfInputRecords);
		reportDaoIF.insertOperation(listOfInputRecords);
		
		LOGGER.info("############### Exit into the startOperation operation method ##########");
		return "";
	}

	public static void main(String[] args) {
		startOperation();
	}
}
