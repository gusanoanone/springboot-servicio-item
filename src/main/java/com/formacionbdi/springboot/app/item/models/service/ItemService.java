package com.formacionbdi.springboot.app.item.models.service;

import java.util.List;

import com.formacionbdi.springboot.app.item.models.Item;

public interface ItemService {
	
	// Metodos para listar todos los item
	public List<Item> findAll();
	//Buscar por ID
	public Item findById(Long id, Integer cantidad);

}
