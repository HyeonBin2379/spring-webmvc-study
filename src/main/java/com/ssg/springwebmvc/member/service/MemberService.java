package com.ssg.springwebmvc.member.service;

import com.ssg.springwebmvc.member.dto.MemberDTO;

import java.util.List;

public interface MemberService {

    void joinMember(MemberDTO memberDTO) throws Exception;
    List<MemberDTO> memberList() throws Exception;
    MemberDTO get(String userId) throws Exception;
    void edit(MemberDTO memberDTO) throws Exception;
    void remove(String userId) throws Exception;
}
