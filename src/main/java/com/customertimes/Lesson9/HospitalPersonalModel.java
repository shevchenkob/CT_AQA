package com.customertimes.Lesson9;

public class HospitalPersonalModel {

    public String department;
    private AccountantModel accountantModel;
    private AdministratorsModel administratorsModel;
    private PharmacistModel pharmacistModel;

    HospitalPersonalModel(String department, AccountantModel accountantModel, AdministratorsModel administratorsModel, PharmacistModel pharmacistModel){
        this.department = department;
        this.accountantModel = accountantModel;
        this.administratorsModel = administratorsModel;
        this.pharmacistModel = pharmacistModel;
    }

    public HospitalPersonalModel() {}


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public AccountantModel getAccountantModel() {
        return accountantModel;
    }

    public void setAccountantModel(AccountantModel accountantModel) {
        this.accountantModel = accountantModel;
    }

    public AdministratorsModel getAdministratorsModel() {
        return administratorsModel;
    }

    public void setAdministratorsModel(AdministratorsModel administratorsModel) {
        this.administratorsModel = administratorsModel;
    }

    public PharmacistModel getPharmacistModel() {
        return pharmacistModel;
    }

    public void setPharmacistModel(PharmacistModel pharmacistModel) {
        this.pharmacistModel = pharmacistModel;
    }




}
