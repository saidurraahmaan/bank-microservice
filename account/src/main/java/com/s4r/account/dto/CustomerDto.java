package com.s4r.account.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class CustomerDto {

//    @Schema(
//            description = "Name of the customer", example = "Eazy Bytes"
//    )
    @NotEmpty(message = "Name can not be a null or empty")
    @Size(min = 5, max = 30, message = "The length of the customer name should be between 5 and 30")
    private String name;

//    name@Schema(
//            description = "Email address of the customer", example = "tutor@eazybytes.com"
//    )
    @NotEmpty(message = "Email address can not be a null or empty")
    @Email(message = "Email address should be a valid value")
    private String email;

//    @Schema(
//            description = "Mobile Number of the customer", example = "9345432123"
//    )
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    private String mobileNumber;

//    @Schema(
//            description = "Account details of the Customer"
//    )
    private AccountsDto accountsDto;

    public CustomerDto() {
    }

    public CustomerDto(String name, String email, String mobileNumber, AccountsDto accountsDto) {
        this.name = name;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.accountsDto = accountsDto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public AccountsDto getAccountsDto() {
        return accountsDto;
    }

    public void setAccountsDto(AccountsDto accountsDto) {
        this.accountsDto = accountsDto;
    }

    @Override
    public String toString() {
        return "CustomerDto{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", accountsDto=" + accountsDto +
                '}';
    }
}