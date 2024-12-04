package com.bpp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class BharatiyaPopulartPartyApplication {

//	@Autowired
//	private MemberService memberService;

	public static void main(String[] args) {
		SpringApplication.run(BharatiyaPopulartPartyApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		Member member = new Member();
//		member.setUsername("john_doe");
//		member.setDateOfBirth(LocalDate.of(1990, 1, 1));
//		member.setPhone("1234567890");
//		member.setGender("Male");
//		member.setEmail("john.doe@example.com");
//		member.setFirstName("John");
//		member.setPassword("password123");
//
//		// Save member to the database
//		memberService.saveMember(member);
//
//		System.out.println("Member saved successfully");
//	}
}
