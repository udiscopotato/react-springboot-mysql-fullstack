package com.subham.Items.service;

import java.util.List;

import com.subham.Items.entity.Item;

public interface ItemService {
	
	public Item addItem(Item item);
	List<Item> getAllItems();
	public List<Item> getItemByName(String name);
	public Item updateItem (Item item, int id);
}
