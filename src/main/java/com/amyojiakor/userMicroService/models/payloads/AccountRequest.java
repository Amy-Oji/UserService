package com.amyojiakor.userMicroService.models.payloads;


import com.amyojiakor.userMicroService.models.enums.AccountType;
import com.amyojiakor.userMicroService.models.enums.CurrencyCode;

public record AccountRequest (AccountType accountType, CurrencyCode currencyCode){
}
