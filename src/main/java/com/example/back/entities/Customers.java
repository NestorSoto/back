package com.example.back.entities;


import javax.persistence.*;

@Entity
@Table(name="customers_byte")
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CustomerID")
    private Long CustomerId;
    @Column(name="CompanyName")
    private String CompanyName;
    @Column(name="ContatName")
    private String ContactName;
    @Column(name="ContactTitle")
    private String ContactTitle;
    @Column(name="Address")
    private String Address;
    @Column(name="City")
    private String City;
    @Column(name="Region")
    private String Region;
    @Column(name="PostalCode")
    private Integer PostalCode;
    @Column(name="Country")
    private String Country;
    @Column(name="Phone")
    private String Phone;
    @Column(name="Fax")
    private String Fax;

    public Customers() {
    }

    public Long getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Long customerId) {
        CustomerId = customerId;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getContactName() {
        return ContactName;
    }

    public void setContactName(String contactName) {
        ContactName = contactName;
    }

    public String getContactTitle() {
        return ContactTitle;
    }

    public void setContactTitle(String contactTitle) {
        ContactTitle = contactTitle;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public Integer getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(Integer postalCode) {
        PostalCode = postalCode;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String fax) {
        Fax = fax;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "CustomerId=" + CustomerId +
                ", CompanyName='" + CompanyName + '\'' +
                ", ContactName='" + ContactName + '\'' +
                ", ContactTitle='" + ContactTitle + '\'' +
                ", Address='" + Address + '\'' +
                ", City='" + City + '\'' +
                ", Region='" + Region + '\'' +
                ", PostalCode=" + PostalCode +
                ", Country='" + Country + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Fax='" + Fax + '\'' +
                '}';
    }
}

