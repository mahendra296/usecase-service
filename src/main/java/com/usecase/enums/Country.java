package com.usecase.enums;

import java.util.Arrays;

public enum Country {

    botswana("+267", "bw", 8 + 3),
    nigeria("+234", "ng", 10 + 3),
    namibia("+264", "na", 9 + 3),
    ghana("+233", "gh", 10 + 3),
    uganda("+256", "ug", 9 + 3),
    mozambique("+258", "mz", 10 + 3),
    lesotho("+266", "ls", 8 + 3),
    eswatini("+268", "sz", 8 + 3),
    kenya("+254", "ke", 9 + 3),
    rwanda("+250", "rw", 10 + 3),
    tanzania("+255", "tz", 10 + 3);

    public final String phoneCode;
    public final String twoLetterISO;
    public final int phoneLength;

    Country(String phoneCode, String twoLetterISO, int phoneLength) {
        this.phoneCode = phoneCode;
        this.twoLetterISO = twoLetterISO;
        this.phoneLength = phoneLength;
    }

    public Country fromPhoneCode(String phoneCode){
        return Arrays.stream(values()).filter(it -> it.phoneCode.equals(phoneCode)).findFirst().get();
    }
}
