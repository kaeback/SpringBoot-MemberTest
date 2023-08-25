package com.example.member.repository;

import com.example.member.model.Member;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface MemberRepository {
    Member save(Member member);
    List<Member> findAll();
}
