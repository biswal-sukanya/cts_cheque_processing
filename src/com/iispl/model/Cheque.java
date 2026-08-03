package com.iispl.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.iispl.enums.ChequePriority;
import com.iispl.enums.ChequeStatus;
import com.iispl.enums.ClearingZone;

public class Cheque implements Comparable<Cheque>{
	
	private String chequeNumber;
	private String drawerName;
	private String presentingBank;
	private ClearingZone clearingZone;
	private BigDecimal chequeAmount;
	private LocalDate chequeDate;
	private LocalDate presentedDate;
	private ChequePriority priority;
	private ChequeStatus status;
	
	public Cheque(String chequeNumber, String drawerName, String presentingBank, ClearingZone clearingZone,
			   BigDecimal chequeAmount,LocalDate chequeDate, LocalDate presentedDate, 
			   ChequePriority priority, ChequeStatus status) {
		
		this.chequeNumber = chequeNumber;
		this.drawerName = drawerName;
		this.presentingBank = presentingBank;
		this.clearingZone = clearingZone;
		this.chequeAmount = chequeAmount;
		this.chequeDate = chequeDate;
		this.presentedDate = presentedDate;
		this.priority = priority;
		this.status = status;
	}

	public ClearingZone getClearingZone() {
		 return this.clearingZone;
	}
	
	public void setClearingZone() {
		this.clearingZone = clearingZone;
	}
	
	public String getChequeNumber() {
		return chequeNumber;
	}

	public void setChequeNumber(String chequeNumber) {
		this.chequeNumber = chequeNumber;
	}

	public String getDrawerName() {
		return drawerName;
	}

	public void setDrawerName(String drawerName) {
		this.drawerName = drawerName;
	}

	public String getPresentingBank() {
		return presentingBank;
	}

	public void setPresentingBank(String presentingBank) {
		this.presentingBank = presentingBank;
	}

	public BigDecimal getChequeAmount() {
		return chequeAmount;
	}

	public void setChequeAmount(BigDecimal chequeAmount) {
		this.chequeAmount = chequeAmount;
	}

	public LocalDate getChequeDate() {
		return chequeDate;
	}

	public void setChequeDate(LocalDate chequeDate) {
		this.chequeDate = chequeDate;
	}

	public LocalDate getPresentedDate() {
		return presentedDate;
	}

	public void setPresentedDate(LocalDate presentedDate) {
		this.presentedDate = presentedDate;
	}

	public ChequePriority getPriority() {
		return priority;
	}

	public void setPriority(ChequePriority priority) {
		this.priority = priority;
	}

	public ChequeStatus getStatus() {
		return status;
	}

	public void setStatus(ChequeStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {

	    return String.format(
	            "%-10s %-20s %-20s %-15s %-12s %-15s %-15s %-15s %-15s",
	            chequeNumber,
	            drawerName,
	            presentingBank,
	            clearingZone,
	            chequeAmount,
	            chequeDate,
	            presentedDate,
	            priority,
	            status);
	}

	@Override
	public int compareTo(Cheque o) {
		
		return this.chequeNumber.compareTo(o.chequeNumber);
	}
}
