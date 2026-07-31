package com.iispl.service;

import java.util.List;

import com.iispl.model.Cheque;

public interface ChequeService {

	List<Cheque> sortByPriorityAndStatus();
	
}
