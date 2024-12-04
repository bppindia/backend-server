package com.bpp.controller;

import com.bpp.model.member.Member;
import com.bpp.model.response.ApiResponse;
import com.bpp.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/members") // Base URL for all member-related APIs
public class MemberController {

    @Autowired
    private MemberService memberService;

    /**
     * Add a new member
     *
     * @param member Member object
     * @return ResponseEntity with the saved Member
     */
//    @PostMapping
//    public ResponseEntity<Member> addMember(@RequestBody Member member) {
//        try {
//            Member savedMember = memberService.saveMember(member);
//            return new ResponseEntity<>(savedMember, HttpStatus.CREATED);
//        } catch (Exception e) {
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }


    @PostMapping
    public ResponseEntity<ApiResponse> addMember(@RequestBody Member member) {
        try {
            Member savedMember = memberService.saveMember(member);
            ApiResponse response = new ApiResponse("Data saved successfully");
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            ApiResponse errorResponse = new ApiResponse("Failed to save data");
            return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    /**
     * Get all members
     *
     * @return List of all members
     */
    @GetMapping
    public ResponseEntity<List<Member>> getAllMembers() {
        try {
            List<Member> members = memberService.findAllMembers();
            if (members.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT); // Return 204 if no members found
            }
            return new ResponseEntity<>(members, HttpStatus.OK); // Return 200 OK with the members list
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR); // Handle errors
        }
    }
}
