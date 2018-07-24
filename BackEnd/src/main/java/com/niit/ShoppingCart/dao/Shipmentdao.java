package com.niit.ShoppingCart.dao;

import com.niit.ShoppingCart.entity.Shipment;

public interface Shipmentdao
{
	public boolean add(Shipment shipment);
	public boolean delete(String shipmentid);
	public Shipment getShipmentById(String shid);
}
