package com.kartashov.apachepoi.spreadsheet.randomuser;

public record User(String email, String opt_in_date, String opted_out, String opt_in_details, String email_type, String opted_out_date, String opt_out_details,
                   String first_name, String last_name) {

    @Override
    public String toString() {
        return email + "," + opt_in_date + "," + opted_out + "," + opt_in_details + "," + email_type + "," + opted_out_date + "," + opt_out_details + "," + first_name + "," + last_name;
    }
}
