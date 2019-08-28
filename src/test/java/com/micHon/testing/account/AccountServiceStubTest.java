package com.micHon.testing.account;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.junit.jupiter.api.Assertions.*;

class AccountServiceStubTest {

    @Test
    void getAllActiveAccounts(){

        AccountRepository accountRepositoryStub = new AccountRepositoryStub();
        AccountService accountService = new AccountService(accountRepositoryStub);

        List<Account> accountList = accountService.getAllActiveAccounts();

        assertThat(accountList, hasSize(2));
    }

}