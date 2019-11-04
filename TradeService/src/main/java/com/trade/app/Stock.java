package com.trade.app;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stocks")
public class Stock {
	
	@Id
	int stockid;
	String name;
	int qty;
	double price;
	int brokerage;
	public int getStockid() {
		return stockid;
	}
	public void setStockid(int stockid) {
		this.stockid = stockid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getBrokerage() {
		return brokerage;
	}
	public void setBrokerage(int brokerage) {
		this.brokerage = brokerage;
	}
	@Override
	public String toString() {
		return "Stock [stockid=" + stockid + ", name=" + name + ", qty=" + qty + ", price=" + price + ", brokerage="
				+ brokerage + "]";
	}
	public Stock() {
		super();
		this.stockid = stockid;
		this.name = name;
		this.qty = qty;
		this.price = price;
		this.brokerage = brokerage;
	}
	
	

}
