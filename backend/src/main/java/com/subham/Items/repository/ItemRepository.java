package com.subham.Items.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.subham.Items.entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {
	public List<Item> findByName (String name);
}
