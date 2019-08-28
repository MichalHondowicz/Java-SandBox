package com.micHon.testing.account;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

class AccountServiceMockTest {

    @Test
    void getAllActiveAccounts() {

        List<Account> accounts = prepareAccountData();
        AccountRepository accountRepository = mock(AccountRepository.class);
        AccountService accountService = new AccountService(accountRepository);
        given(accountRepository.getAllAccounts()).willReturn(accounts);

        List<Account> accountList = accountService.getAllActiveAccounts();

        assertThat(accountList, hasSize(2));
    }

    private List<Account> prepareAccountData(){

        Address address1 = new Address("Spadek", "22");
        Address address2 = new Address("KOR", "12");
        Account account1 = new Account(address1);
        Account account2 = new Account(address2);
        Account account3 = new Account();
        return Arrays.asList(account1, account2, account3);
    }

    @Test
    void getNoActiveAccounts() {

        AccountRepository accountRepository = mock(AccountRepository.class);
        AccountService accountService = new AccountService(accountRepository);
        given(accountRepository.getAllAccounts()).willReturn(Collections.emptyList());

        List<Account> accountList = accountService.getAllActiveAccounts();

        assertThat(accountList, hasSize(0));
    }
}
