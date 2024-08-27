package com.eazybytes.accounts.functions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class AccountsFunctions {

    private static final Logger log = LoggerFactory.getLogger(AccountsFunctions.class);

    public Consumer<Long> updateCommunication () {

        return accountNumber -> {
          log.info("Updating communication status for the account number: "+accountNumber.toString());
        };
    }
}
