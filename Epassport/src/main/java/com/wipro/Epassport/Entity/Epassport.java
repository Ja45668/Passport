package com.wipro.Epassport.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;
@Entity
public class Epassport {
    @Id
    @GeneratedValue
    private int id;
    private String firstName;
    private String lastName;
    private Date date_of_birth;
    private String place_of_birth;
    private String gender;
    private String state;
    private String district;
    private String marital_status;
    private long pan;
    private String employmentType;
    private String educationalQualification;
    private String fatherName;
    private String motherName;
    private int houseNo;
    private String streetName;
    @Column(nullable = false)
    private String city;
    private int pinCode;
    private long telephoneNumber;
    @Column(nullable = false)
    private String email;
    private String password;
    private String referenceName;
    private String address;
    private long referenceTelephoneNumber;

    public Epassport()
    {

    }

    public Epassport(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public Epassport(String firstName, String lastName, Date date_of_birth, String place_of_birth, String gender, String state, String district, String marital_status, long pan, String employmentType, String educationalQualification, String fatherName, String motherName, int houseNo, String streetName, String city, int pinCode, long telephoneNumber, String email, String password, String referenceName, String address, long referenceTelephoneNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.date_of_birth = date_of_birth;
        this.place_of_birth = place_of_birth;
        this.gender = gender;
        this.state = state;
        this.district = district;
        this.marital_status = marital_status;
        this.pan = pan;
        this.employmentType = employmentType;
        this.educationalQualification = educationalQualification;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.houseNo = houseNo;
        this.streetName = streetName;
        this.city = city;
        this.pinCode = pinCode;
        this.telephoneNumber = telephoneNumber;
        this.email = email;
        this.password = password;
        this.referenceName = referenceName;
        this.address = address;
        this.referenceTelephoneNumber = referenceTelephoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getPlace_of_birth() {
        return place_of_birth;
    }

    public void setPlace_of_birth(String place_of_birth) {
        this.place_of_birth = place_of_birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getMarital_status() {
        return marital_status;
    }

    public void setMarital_status(String marital_status) {
        this.marital_status = marital_status;
    }

    public long getPan() {
        return pan;
    }

    public void setPan(long pan) {
        this.pan = pan;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public String getEducationalQualification() {
        return educationalQualification;
    }

    public void setEducationalQualification(String educationalQualification) {
        this.educationalQualification = educationalQualification;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public long getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(long telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getReferenceName() {
        return referenceName;
    }

    public void setReferenceName(String referenceName) {
        this.referenceName = referenceName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getReferenceTelephoneNumber() {
        return referenceTelephoneNumber;
    }

    public void setReferenceTelephoneNumber(long referenceTelephoneNumber) {
        this.referenceTelephoneNumber = referenceTelephoneNumber;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
