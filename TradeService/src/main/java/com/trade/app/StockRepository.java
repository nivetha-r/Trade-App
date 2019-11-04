package com.trade.app;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface StockRepository extends CrudRepository<Stock, Integer> {

}
