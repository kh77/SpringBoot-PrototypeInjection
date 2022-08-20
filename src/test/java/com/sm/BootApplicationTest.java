package com.sm;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootApplicationTest {

    @Autowired
    private ApplicationContext context;

	@Test
	public void singletonBeanScopeTest(){
		UserService userService1 = context.getBean("userService", UserService.class);
		UserService userService2 = context.getBean("userService", UserService.class);
		Assert.assertEquals(userService1.hashCode(), userService2.hashCode());
	}

	@Test
	public void protoTypeBeanScopeTest(){
		StockExchangeService stockExchangeService1 = context.getBean("stockExchangeService", StockExchangeService.class);
		StockExchangeService stockExchangeService2 = context.getBean("stockExchangeService", StockExchangeService.class);
		Assert.assertNotEquals(stockExchangeService1.hashCode(), stockExchangeService2.hashCode());
	}

}
