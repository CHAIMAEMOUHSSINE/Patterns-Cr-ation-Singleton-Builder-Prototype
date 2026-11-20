package net.chaimae.repository;

import net.chaimae.model.BankAccount;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AccountRepositoryImpl implements AccountRepository {
    private Map<Long, BankAccount> bankAccountMap=new HashMap<>();
    private long accountsCount=0;
    @Override
    public BankAccount save(BankAccount bankaccount) {
        Long accountId=++accountsCount;
        bankaccount.setAccountId(accountId);
        bankAccountMap.put(accountId,bankaccount);
        return bankaccount;
    }

    @Override
    public List<BankAccount> findAll() {
        return bankAccountMap.values().stream().toList();
    }

    @Override
    public Optional<BankAccount> findById(long id) {
    BankAccount account=bankAccountMap.get(id);
    if (account==null)
        return Optional.empty();
    else
        return Optional.of(account);
    }

    @Override
    public List<BankAccount> searchAccounts(Predicate<BankAccount> predicate) {
        return List.of();
    }

    @Override
    public BankAccount update(long id, BankAccount bankaccount) {
        return null;
    }

    @Override
    public void deleteById(long id) {

    }
}
