package com.amyojiakor.userMicroService.models.payloads;


import com.amyojiakor.userMicroService.models.enums.AccountType;
import com.amyojiakor.userMicroService.models.enums.CurrencyCode;

public record AccountRequest (String accountName, AccountType accountType, CurrencyCode currencyCode){
}
