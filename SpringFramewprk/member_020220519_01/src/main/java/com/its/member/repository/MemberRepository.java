package com.its.member.repository;

import com.its.member.dto.MemberDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepostiory {
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;
    public int save(MemberDTO memberDTO) {
        return sqlSessionTemplate.insert("member.save",memberDTO);
    }
}
