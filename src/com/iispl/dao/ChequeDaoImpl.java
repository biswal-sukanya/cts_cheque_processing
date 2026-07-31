package com.iispl.dao;

import java.util.List;

import com.iispl.model.Cheque;
import com.iispl.repository.ChequeRepository;
import com.iispl.repository.ChequeRepositoryImpl;

public class ChequeDaoImpl implements ChequeDao{

	static ChequeRepository chequeRepository = new ChequeRepositoryImpl();

	
	//added by Shair-Yaar-Khan
	@Override
	public List<Cheque> sortByPriorityAndStatus() {
		
		List<Cheque> chequeList = chequeRepository.chequeRecords();
		
		chequeList.sort((c1,c2)->{
			
			int priorityCompare = c1.getPriority().compareTo(c2.getPriority());
			
			if(priorityCompare !=0) {
				return priorityCompare;
			}
			return c1.getStatus().compareTo(c2.getStatus());
		});
			
		return chequeList;
	}	
}
