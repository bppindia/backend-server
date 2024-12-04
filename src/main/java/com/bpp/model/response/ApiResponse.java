package com.bpp.model.response;

import com.bpp.model.member.Member;

public class ApiResponse {

    private String message;
    private Member data;

    // Constructor for response with only message
    public ApiResponse(String message) {
        this.message = message;
    }

    // Constructor for response with both message and data
    public ApiResponse(String message, Member data) {
        this.message = message;
        this.data = data;
    }

    // Getter for message
    public String getMessage() {
        return message;
    }

    // Setter for message
    public void setMessage(String message) {
        this.message = message;
    }

    // Getter for data
    public Member getData() {
        return data;
    }

    // Setter for data
    public void setData(Member data) {
        this.data = data;
    }
}
