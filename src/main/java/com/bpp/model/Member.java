//package com.bpp.model;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//
//@Entity
//public class Member {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String email;
//    private String phone;
//    private boolean isEmailVerified = false;
//    private boolean isPhoneVerified = false;
//
//    // Default constructor for JPA
//    public Member() {
//    }
//
//    // Parameterized constructor for easy object creation
//    public Member(String email, String phone, boolean isEmailVerified, boolean isPhoneVerified) {
//        this.email = email;
//        this.phone = phone;
//        this.isEmailVerified = isEmailVerified;
//        this.isPhoneVerified = isPhoneVerified;
//    }
//
//    // Getters and Setters
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    public boolean isEmailVerified() {
//        return isEmailVerified;
//    }
//
//    public void setEmailVerified(boolean emailVerified) {
//        isEmailVerified = emailVerified;
//    }
//
//    public boolean isPhoneVerified() {
//        return isPhoneVerified;
//    }
//
//    public void setPhoneVerified(boolean phoneVerified) {
//        isPhoneVerified = phoneVerified;
//    }
//
//    // toString method for debugging (exclude sensitive data in production)
//    @Override
//    public String toString() {
//        return "Member{" +
//                "id=" + id +
//                ", email='" + email + '\'' +
//                ", isEmailVerified=" + isEmailVerified +
//                ", isPhoneVerified=" + isPhoneVerified +
//                '}'; // Avoid printing phone number in toString for security reasons
//    }
//}
