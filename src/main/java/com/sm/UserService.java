package com.sm;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private StockExchangeService stockExchangeService;

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    private ObjectFactory<StockExchangeService> stockExchangeServiceObjectFactory;

    public String getStockExchangeData() {
        // return stockExchangeService.getCurrentData();
        // return applicationContext.getBean(StockExchangeService.class).getCurrentData();
        // return stockExchangeServiceObjectFactory.getObject().getCurrentData();
        return getStockExchangeService().getCurrentData();
    }
    @Lookup
    public StockExchangeService getStockExchangeService() {
        return null;
    }

}
