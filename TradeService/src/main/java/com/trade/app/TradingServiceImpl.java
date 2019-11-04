package com.trade.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class TradingServiceImpl implements TradingService{
	
	@Autowired
	UserRepository userrepo;
	
	@Autowired
	StockRepository stockrep;

	@Override
	public List<User> getUserList(String username) {
		return userrepo.findAllByUsername(username);
	}

	@Override
	public Iterable<Stock> getStockList() {
		return stockrep.findAll();
	}

	@Override
	public boolean buyStock(Stock stock, String username) {
		Stock nStock = new Stock();
		User user = new User();
		nStock = stockrep.findById(stock.getStockid()).get();
		if(nStock.getQty() != 0) {
			
			nStock.setQty(nStock.getQty() - 1);
			stockrep.save(nStock);
			user.setUsername(username);
			user.setBrokerage(nStock.getBrokerage());
			user.setStockname(nStock.getName());
			user.setPrice(nStock.getPrice());
			user.setQty(1);
			user.setTotalPrice(nStock.getPrice()+(nStock.getPrice()*nStock.getBrokerage()/100));
			userrepo.save(user);
			
			return true;
			
		} else {
			
			return false;
			
		}
	}

	

}
