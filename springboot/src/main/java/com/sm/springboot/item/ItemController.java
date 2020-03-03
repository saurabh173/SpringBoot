package com.sm.springboot.item;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@RequestMapping(value = "/items", method = RequestMethod.GET)
	public List<Item> getItemsUnderMgr(@RequestParam(value = "mgr", required = false) String itemManager,
									   @RequestParam(value = "svd", required = false) String itemSVD ) {
		
		if (itemManager != null) {
			return itemService.getItemsUnderMgr(itemManager);
		} else if (itemSVD != null) {
			return itemService.getItemsUnderSVD(itemSVD);
		} else {
			return itemService.getAllItems();
		}
	}
	
	@RequestMapping(value = "/items/{itemId}", method = RequestMethod.GET)
	public Optional<Item> getItemById(@PathVariable String itemId) {
		return itemService.getItem(itemId);
	}	

	
	@RequestMapping(value = "/items", method = RequestMethod.POST)
	public void addItem(@RequestBody Item itm) {
		itemService.addItem(itm);
	}
	
	@RequestMapping(value = "/items/{itemId}", method = RequestMethod.PUT)
	public void updateItem(@RequestBody Item itm, @PathVariable String itemId) {
		itemService.updateItem(itm);
	}
	
	@RequestMapping(value = "/items/{itemId}", method = RequestMethod.DELETE)
	public void deleteItem(@PathVariable String itemId) {
		itemService.deleteItem(itemId);
	}
	
	
}
