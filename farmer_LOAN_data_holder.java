package com.hayat.authentication;

public class farmer_LOAN_data_holder {

    String name,cnic,loan;

    public farmer_LOAN_data_holder(String name, String cnic, String loan) {
        this.name = name;
        this.cnic = cnic;
        this.loan = loan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getLoan() {
        return loan;
    }

    public void setLoan(String loan) {
        this.loan = loan;
    }
}
