package com.example.member.controller;

import com.example.member.model.Member;
import com.example.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
public class MemberController {

    private final MemberRepository memberRepository;

    // 회원정보 추가
    @PostMapping("members")
    public String addMember(@RequestBody Member member) {
        log.info("member: {}", member);
        memberRepository.save(member);
        return "ok";
    }

    // 회원정보 전체 조회
    @GetMapping("members")
    public List<Member> findMembers() {
        log.info("findMembers");
        return memberRepository.findAll();
    }

}
