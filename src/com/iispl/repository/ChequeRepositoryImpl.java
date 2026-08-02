package com.iispl.repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.iispl.enums.ChequePriority;
import com.iispl.enums.ChequeStatus;
import com.iispl.model.Cheque;

public class ChequeRepositoryImpl implements ChequeRepository {

	List<Cheque> cheques = new ArrayList<Cheque>();
	
	@Override
	public List<Cheque> getAllCheques() {
		if(cheques.isEmpty()) {
cheques.add(new Cheque("CHQ001", "S Sharma", "SBI", new BigDecimal("215000"), LocalDate.of(2026,7,1), LocalDate.of(2026,7,2), ChequePriority.HIGH, ChequeStatus.ACCEPTED));
cheques.add(new Cheque("CHQ0020", "Aisha Khan", "HDFC", new BigDecimal("225000"), LocalDate.of(2026,7,3), LocalDate.of(2026,7,4), ChequePriority.NORMAL, ChequeStatus.RECEIVED));
cheques.add(new Cheque("CHQ003", "Rohit Kumar", "ICICI", new BigDecimal("5000"), LocalDate.of(2026,7,5), LocalDate.of(2026,7,6), ChequePriority.LOW, ChequeStatus.REJECTED));
cheques.add(new Cheque("CHQ004", "Sneha Reddy", "Axis Bank", new BigDecimal("475000"), LocalDate.of(2026,7,6), LocalDate.of(2026,7,7), ChequePriority.HIGH, ChequeStatus.SENT_FOR_CLEARING));
cheques.add(new Cheque("CHQ005", "Arjun Patel", "Canara Bank", new BigDecimal("12000"), LocalDate.of(2026,7,7), LocalDate.of(2026,7,8), ChequePriority.HIGH, ChequeStatus.ACCEPTED));
cheques.add(new Cheque("CHQ006", "Priya Nair", "Union Bank", new BigDecimal("9500"), LocalDate.of(2026,7,8), LocalDate.of(2026,7,9), ChequePriority.LOW, ChequeStatus.REJECTED));
cheques.add(new Cheque("CHQ007", "Karan Mehta", "Karnataka Bank", new BigDecimal("60000"), LocalDate.of(2026,7,9), LocalDate.of(2026,7,10), ChequePriority.HIGH, ChequeStatus.VALIDATED));
cheques.add(new Cheque("CHQ008", "Neha Singh", "Bank of Baroda", new BigDecimal("18000"), LocalDate.of(2026,7,10), LocalDate.of(2026,7,11), ChequePriority.NORMAL, ChequeStatus.VALIDATED));
cheques.add(new Cheque("CHQ009", "Vikas Gupta", "Indian Bank", new BigDecimal("23500"), LocalDate.of(2026,7,11), LocalDate.of(2026,7,12), ChequePriority.LOW, ChequeStatus.ACCEPTED));
cheques.add(new Cheque("CHQ010", "Anjali Verma", "Kotak Mahindra", new BigDecimal("45000"), LocalDate.of(2026,7,12), LocalDate.of(2026,7,13), ChequePriority.HIGH, ChequeStatus.RECEIVED));
cheques.add(new Cheque("CHQ011", "Deepak Joshi", "Yes Bank", new BigDecimal("21000"), LocalDate.of(2026,7,13), LocalDate.of(2026,7,14), ChequePriority.HIGH, ChequeStatus.SENT_FOR_CLEARING));
cheques.add(new Cheque("CHQ012", "Pooja Das", "IndusInd Bank", new BigDecimal("7000"), LocalDate.of(2026,7,14), LocalDate.of(2026,7,15), ChequePriority.LOW, ChequeStatus.REJECTED));
cheques.add(new Cheque("CHQ013", "Mohit Agarwal", "Federal Bank", new BigDecimal("99000"), LocalDate.of(2026,7,15), LocalDate.of(2026,7,16), ChequePriority.HIGH, ChequeStatus.SENT_FOR_CLEARING));
cheques.add(new Cheque("CHQ014", "Kavya Rao", "South Indian Bank", new BigDecimal("16000"), LocalDate.of(2026,7,16), LocalDate.of(2026,7,17), ChequePriority.LOW, ChequeStatus.RECEIVED));
cheques.add(new Cheque("CHQ015", "Nikhil Jain", "UCO Bank", new BigDecimal("28000"), LocalDate.of(2026,7,17), LocalDate.of(2026,7,18), ChequePriority.LOW, ChequeStatus.REJECTED));
		}
		
		return cheques;
	}
	

}
