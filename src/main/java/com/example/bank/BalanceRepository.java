package com.example.bank;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class BalanceRepository {

    //  хранилище (обычно апи бд)
    private final Map<Long, BigDecimal> storage = new HashMap<>(Map.of(1L, BigDecimal.TEN));


    public BigDecimal getBalanceForId(Long accountId) {
        return storage.get(accountId);
    }
}
