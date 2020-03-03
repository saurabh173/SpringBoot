package com.sm.springboot.item;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


public interface ItemRepository extends CrudRepository<Item , String> {
	public List<Item> getItemsByItemName(String itemNm);
	public List<Item> getItemsByItemManager(String itemMgr);
	public List<Item> getItemsByItemServiceDept(String itemSVD);
	
}
