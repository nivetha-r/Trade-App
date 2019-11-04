package com.trade.app;

import java.util.List;

import org.springframework.stereotype.Service;



public interface TradingService {
	
	List<User> getUserList(String username);
	Iterable<Stock> getStockList();
	boolean buyStock(Stock stock, String username);

}
