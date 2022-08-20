package com.sm;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Scope("prototype")
public class StockExchangeService {
    String time = LocalDateTime.now().toString();
    public String getCurrentData() {
        return time;
    }
}
