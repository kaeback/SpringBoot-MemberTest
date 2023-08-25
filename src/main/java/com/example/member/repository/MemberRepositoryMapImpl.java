package com.example.member.repository;

import com.example.member.model.Member;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class MemberRepositoryMapImpl implements MemberRepository {

    private static Map<Long, Member> members = new HashMap<>();
    private Long sequence = 0L;
    @Override
    public Member save(Member member) {
        member.setId(++sequence);
        members.put(sequence, member);
        return member;
    }

    @Override
    public List<Member> findAll() {
        return new ArrayList<>(members.values());
    }
}
