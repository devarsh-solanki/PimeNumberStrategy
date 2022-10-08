package com.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "PrimeGenerator")
public class Prime {
	
	@Id
	@Column(name = "Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "Username", length = 100)
	private String name;
	
	@Column(name = "PrimeExecutionSrategy", length = 50)
	private String primeSrategy;
	
	@Column(name = "Lower_Limit")
	private int lowerLimit;
	
	@Column(name = "Upper_Limit")
	private int upperLimit;
	
	@Lob
	private String list;
	
	private long executionTime;
	
	@Column(name = "Date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date time;
	
	public Prime(int id, String name, String primeSrategy, int lowerLimit, int upperLimit, String list,
			long executionTime, Date time) {
		super();
		this.id = id;
		this.name = name;
		this.primeSrategy = primeSrategy;
		this.lowerLimit = lowerLimit;
		this.upperLimit = upperLimit;
		this.list = list;
		this.executionTime = executionTime;
		this.time = time;
	}
	
	public Prime() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Prime [id : " + id + ", name : " + name + ", primeSrategy : " + primeSrategy + ", lowerLimit : " + lowerLimit
				+ ", upperLimit : " + upperLimit + ", list : " + list + ", executionTime : " + executionTime + ", time : "
				+ time + "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPrimeSrategy() {
		return primeSrategy;
	}
	public void setPrimeSrategy(String primeSrategy) {
		this.primeSrategy = primeSrategy;
	}
	
	public int getLowerLimit() {
		return lowerLimit;
	}
	public void setLowerLimit(int lowerLimit) {
		this.lowerLimit = lowerLimit;
	}
	
	public int getUpperLimit() {
		return upperLimit;
	}
	public void setUpperLimit(int upperLimit) {
		this.upperLimit = upperLimit;
	}
	
	public String getList() {
		return list;
	}
	public void setList(String list) {
		this.list = list;
	}
	
	public long getExecutionTime() {
		return executionTime;
	}
	public void setExecutionTime(long executionTime) {
		this.executionTime = executionTime;
	}
	
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}

}
