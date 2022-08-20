package com.sm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ScopeController {
    @Autowired
    private UserService userService;

    @GetMapping("/scope")
    public List<String> getStockExchange() throws InterruptedException {
        String response1 = userService.getStockExchangeData();
        Thread.sleep(1000);
        String response2 = userService.getStockExchangeData();
        return Arrays.asList(response1, response2);
    }

}
