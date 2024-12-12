package com.pach.market.domain.repository;

import com.pach.market.domain.Purchase;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface PurchaseRepository {
    List<Purchase> getAll();
    Optional<List<Purchase>> getByClient(String clientId);
    Optional<List<Purchase>> getState(String state);
    Optional<Purchase> getPurchase(int purchaseId);
    Purchase save(Purchase purchase);
    void delete(int purchaseId);
}
