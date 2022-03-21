package com.company.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "todos")
public class Todo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String userName;

	@Size(min = 10, message = "Enter at least 10 Characters...")
	private String panCard;
    private String IFSCcode;
	public String getIFSCcode() {
		return IFSCcode;
	}
	public void setIFSCcode(String iFSCcode) {
		IFSCcode = iFSCcode;
	}
	private Date targetDate;
	private  String accountType;
	private String accountNumber;
	private String sendMoney;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPanCard() {
		return panCard;
	}
	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}
	public Date getTargetDate() {
		return targetDate;
	}
	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getSendMoney() {
		return sendMoney;
	}
	public void setSendMoney(String sendMoney) {
		this.sendMoney = sendMoney;
	}
	public Todo(long id, String userName, @Size(min = 10, message = "Enter at least 10 Characters...") String panCard,
	String IFSCcode,Date targetDate, String accountType, String accountNumber, String sendMoney) {
		super();
		this.id = id;
		this.userName = userName;
		this.panCard = panCard;
		this.targetDate = targetDate;
		this.accountType = accountType;
		this.accountNumber = accountNumber;
		this.sendMoney = sendMoney;
		this.IFSCcode=IFSCcode;
	}
	public Todo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Todo(String name, String panCard2, String iFSCcode2, Date targetDate2, String accountType2,
			String accountNumber2, String sendMoney2, boolean isDone) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Todo [id=" + id + ", userName=" + userName + ", panCard=" + panCard + ", IFSCcode=" + IFSCcode
				+ ", targetDate=" + targetDate + ", accountType=" + accountType + ", accountNumber=" + accountNumber
				+ ", sendMoney=" + sendMoney + "]";
	}
	
	

	
	

}