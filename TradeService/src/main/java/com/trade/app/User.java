package com.trade.app;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="buy")
public class User {
	
	@Id
	int buyid;
	String username;
	String stockname;
	int qty;
	double price;
	double totalprice;
	int brokerage;
	
	public int getBuyid() {
		return buyid;
	}
	public void setBuyid(int buyid) {
		this.buyid = buyid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getStockname() {
		return stockname;
	}
	public void setStockname(String stockname) {
		this.stockname = stockname;
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
	public double getTotalPrice() {
		return totalprice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalprice = totalprice;
	}
	public int getBrokerage() {
		return brokerage;
	}
	public void setBrokerage(int brokerage) {
		this.brokerage = brokerage;
	}
	@Override
	public String toString() {
		return "User [buyid=" + buyid + ", username=" + username + ", stockname=" + stockname + ", qty=" + qty
				+ ", price=" + price + ", totalPrice=" + totalprice + ", brokerage=" + brokerage + "]";
	}
	public User() {
		super();
		this.buyid = buyid;
		this.username = username;
		this.stockname = stockname;
		this.qty = qty;
		this.price = price;
		this.totalprice = totalprice;
		this.brokerage = brokerage;
	}
	
	
	
	
}
