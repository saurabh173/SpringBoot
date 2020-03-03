package com.sm.springboot.item;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;


@Service
public class ItemService {
	
	@Autowired
	private ItemRepository itemRepository;
	
	public List<Item> getAllItems() {
		List<Item> items = new ArrayList <> ();
		itemRepository.findAll()
		.forEach(items::add);
		return items;
	}
	
	
	public List<Item> getItemsUnderMgr(String MgrName) {
		List<Item> items = new ArrayList <> ();
		itemRepository.getItemsByItemManager(MgrName)
		.forEach(items::add);
		return items;
	}

	public List<Item> getItemsUnderSVD(String SVDName) {
		List<Item> items = new ArrayList <> ();
		itemRepository.getItemsByItemServiceDept(SVDName)
		.forEach(items::add);
		return items;
	}
	
	public Optional<Item> getItem(String itemId) {
		return itemRepository.findById(itemId);
	}
	
	public void addItem(Item itm) {
		itemRepository.save(itm);
	}
	
	public void updateItem (Item itm) {
		itemRepository.save(itm);
	}
	
	public void deleteItem (String itemId) {
		itemRepository.deleteById(itemId);
	}
}
