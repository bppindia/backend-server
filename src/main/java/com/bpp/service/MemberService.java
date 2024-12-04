package com.bpp.service;

import com.bpp.model.member.Member;
import com.bpp.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    /**
     * Save a new member
     *
     * @param member Member object
     * @return Saved Member
     */
    public Member saveMember(Member member) {
        return memberRepository.save(member);
    }

    /**
     * Update an existing member
     *
     * @param member Member object
     * @return Updated Member
     */
    public Member updateMember(Member member) {
        if (member.getId() == null || !memberRepository.existsById(member.getId())) {
            throw new IllegalArgumentException("Member ID is required for update and must exist.");
        }
        return memberRepository.save(member);
    }

    /**
     * Find a member by ID
     *
     * @param id Member ID
     * @return Optional<Member>
     */
    public Optional<Member> findMemberById(Long id) {
        return memberRepository.findById(id);
    }

    /**
     * Find a member by email
     *
     * @param email Member's email
     * @return Optional<Member>
     */
    public Optional<Member> findMemberByEmail(String email) {
        return memberRepository.findByEmail(email);
    }

    /**
     * Find a member by username
     *
     * @param username Member's username
     * @return Optional<Member>
     */
    public Optional<Member> findMemberByUsername(String username) {
        return memberRepository.findByUsername(username);
    }

    /**
     * Find a member by referral code
     *
     * @param referralCode Member's referral code
     * @return Optional<Member>
     */
    public Optional<Member> findMemberByReferralCode(String referralCode) {
        return memberRepository.findByReferralCode(referralCode);
    }

    /**
     * Retrieve all members
     *
     * @return List<Member>
     */
    public List<Member> findAllMembers() {
        return memberRepository.findAll();
    }

    /**
     * Delete a member by ID
     *
     * @param id Member ID
     */
    public void deleteMember(Long id) {
        if (!memberRepository.existsById(id)) {
            throw new IllegalArgumentException("Member with the given ID does not exist.");
        }
        memberRepository.deleteById(id);
    }
}


