package com.bpp.model.member;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
import java.time.Period;
import java.util.UUID;

@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Phone number is required")
    @Pattern(regexp = "^[0-9]{10}$", message = "Phone number must be 10 digits")
    private String phone;

    @NotNull(message = "Email is required")
    @Email(message = "Invalid email format")
    @Column(unique = true)
    private String email;

    @NotNull(message = "First name is required")
    @NotEmpty(message = "First name cannot be empty")
    private String firstName;

    private String middleName;

    @NotNull(message = "Last name is required")
    @NotEmpty(message = "Last name cannot be empty")
    private String lastName;

    @NotNull(message = "Date of birth is required")
    private LocalDate dateOfBirth;

    @Transient
    private Integer age;

    @NotNull(message = "Gender is required")
    @NotEmpty(message = "Gender cannot be empty")
    private String gender;

    @Size(min = 10, max = 12, message = "Voter ID must be between 10 and 12 characters")
    @NotNull(message = "VoterId is required")
    private String voterId;

    @Size(min = 12, max = 12, message = "Aadhar card must be 12 digits")
    @NotNull(message = "AadharCard is required")
    private String aadharCard;

    @Column(unique = true)
    private String referralCode;

    private String addressLine1; // House/Flat No.
    private String addressLine2; // Area, Landmark
    private String cityOrVillage;
    private String taluka;
    private String district;
    private String state;

    @Pattern(regexp = "^[0-9]{6}$", message = "Pincode must be 6 digits")
    private String pincode;

    @NotNull(message = "Username is required")
    @NotEmpty(message = "Username cannot be empty")
    @Column(unique = true)
    private String username;

    @NotNull(message = "Password is required")
    @NotEmpty(message = "Password cannot be empty")
    @Size(min = 8, message = "Password must be at least 8 characters long")
    private String password; // Hash this in the service layer before saving

    @Pattern(regexp = "^[0-9]{4}$", message = "PIN must be 4 digits")
    private String pin;

    // Constructors
    public Member() {
        this.referralCode = generateReferralCode();
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAadharCard() {
        return aadharCard;
    }

    public void setAadharCard(String aadharCard) {
        this.aadharCard = aadharCard;
    }

    public Integer getAge() {
        if (dateOfBirth != null) {
            return Period.between(dateOfBirth, LocalDate.now()).getYears();
        }
        return null;
    }

    public String getReferralCode() {
        return referralCode;
    }

    public void setReferralCode(String referralCode) {
        this.referralCode = referralCode;
    }

    public String getVoterId() {
        return voterId;
    }


    public void setVoterId(String voterId) {
        this.voterId = voterId;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    private String generateReferralCode() {
        return UUID.randomUUID().toString().substring(0, 8).toUpperCase();
    }

    public String getCityOrVillage() {
        return cityOrVillage;
    }

    public void setCityOrVillage(String cityOrVillage) {
        this.cityOrVillage = cityOrVillage;
    }

    public String getTaluka() {
        return taluka;
    }

    public void setTaluka(String taluka) {
        this.taluka = taluka;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    // Full Constructor
    public Member(String phone, String email, String firstName, String middleName, String lastName,
                  LocalDate dateOfBirth, String gender, String voterId, String aadharCard, String addressLine1,
                  String addressLine2, String cityOrVillage, String taluka, String district, String state, String pincode,
                  String username, String password, String pin) {
        this.phone = phone;
        this.email = email;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.voterId = voterId;
        this.aadharCard = aadharCard;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.cityOrVillage = cityOrVillage;
        this.taluka = taluka;
        this.district = district;
        this.state = state;
        this.pincode = pincode;
        this.username = username;
        this.password = password; // Hash this in the service layer before saving
        this.pin = pin;
        this.referralCode = generateReferralCode();
    }
}
