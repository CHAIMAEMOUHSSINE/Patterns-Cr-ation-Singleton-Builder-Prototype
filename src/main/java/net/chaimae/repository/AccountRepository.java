package net.chaimae.repository;

import net.chaimae.model.BankAccount;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public interface AccountRepository {
    BankAccount save(BankAccount bankaccount);
    List<BankAccount> findAll();
    Optional<BankAccount> findById(long id);
    List<BankAccount> searchAccounts(Predicate<BankAccount> predicate);
    BankAccount update(long id, BankAccount bankaccount);
    void deleteById(long id);


}
