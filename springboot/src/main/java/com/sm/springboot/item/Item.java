package com.sm.springboot.item;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {
	
	@Id
	private String itemId;
	
	private String itemShortCode;
	private String itemName;
	private String itemManager;
	private String itemServiceDept;
	
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemShortCode() {
		return itemShortCode;
	}
	public void setItemShortCode(String itemShortCode) {
		this.itemShortCode = itemShortCode;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemManager() {
		return itemManager;
	}
	public void setItemManager(String itemManager) {
		this.itemManager = itemManager;
	}
	public String getItemServiceDept() {
		return itemServiceDept;
	}
	public void setItemServiceDept(String itemServiceDept) {
		this.itemServiceDept = itemServiceDept;
	}
	
	
}
