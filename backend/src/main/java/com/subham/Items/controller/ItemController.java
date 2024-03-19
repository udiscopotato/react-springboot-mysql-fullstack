package com.subham.Items.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.subham.Items.entity.Item;
import com.subham.Items.service.ItemServiceImp;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ItemController {

	@Autowired
	private ItemServiceImp service;
	
	@PostMapping("/items")
	public Item addItem(@RequestBody Item item){
		return service.addItem(item);
	}
	
	@GetMapping("/items")
	public List<Item> getAllItems(){
		return service.getAllItems();
	}
	
	@GetMapping("/items/{name}")
	public List<Item> getItemByName(@PathVariable("name") String name){
		return service.getItemByName(name);
	}
	
	@PutMapping("/items/{id}")
	public Item updateItem (@RequestBody Item item, @PathVariable int id) {
		return service.updateItem(item, id);
	}
	
}
