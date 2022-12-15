package com.kartashov.apachepoi.spreadsheet.randomuser;

public enum UserHeaders {

    EMAIL("Email"),
    OPT_IN_DATE("Opt In Date"),
    OPTED_OUT("Opted Out"),
    OPT_IN_DETAILS("Opt In Details"),
    EMAIL_TYPE("Email Type"),
    OPTED_OUT_DATE("Opted Out Date"),
    OPT_OUT_DETAILS("Opt Out Details"),
    FIRST_NAME("First Name"),
    LAST_NAME("Last_Name");
//    LAST_MODIFIED_DATE("Last Modified Date");
    private String value;

    UserHeaders(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
