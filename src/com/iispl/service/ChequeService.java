package com.iispl.service;

import java.util.List;

import com.iispl.model.Cheque;

public interface ChequeService {
//  sortByChequeAmountAscending
	List<Cheque> sortByChequeAmountAscending();
//  sortByChequeAmountDescending
	List<Cheque> sortByChequeAmountDescending();
}
