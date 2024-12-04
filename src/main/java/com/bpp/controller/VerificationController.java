//package com.bpp.controller;
//
//import com.bpp.service.EmailService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/v1/verification")
//public class VerificationController {
//
//    @Autowired
//    private EmailService emailService;
//
//
//
//    // Send OTP to Email
//    @PostMapping("/send-email-otp")
//    public ResponseEntity<String> sendEmailOtp(@RequestParam String email) {
//        String otp = generateOtp();
//        emailService.sendEmail(email, "Your OTP", "Your OTP is: " + otp);
//        // Save OTP temporarily, e.g., in a database or session
//        // You can also store it in Redis or a cache for session management
//        return ResponseEntity.ok("OTP sent to email!");
//    }
//
//    // Verify Email OTP
//    @PostMapping("/verify-email-otp")
//    public ResponseEntity<String> verifyEmailOtp(@RequestParam String email, @RequestParam String otp) {
//        // Compare the received OTP with the saved OTP (e.g., in the session or database)
//        // If OTP matches, mark the email as verified
//        // For simplicity, assuming OTP is correct
//        return ResponseEntity.ok("Email verified successfully!");
//    }
//
//
//
//    // Verify Phone OTP
//    @PostMapping("/verify-phone-otp")
//    public ResponseEntity<String> verifyPhoneOtp(@RequestParam String phone, @RequestParam String otp) {
//        // Compare the received OTP with the saved OTP (e.g., in the session or database)
//        // If OTP matches, mark the phone as verified
//        return ResponseEntity.ok("Phone verified successfully!");
//    }
//
//    // Generate OTP (Random 6-digit OTP)
//    private String generateOtp() {
//        return String.valueOf((int) (Math.random() * 900000) + 100000);
//    }
//}
