package com.ssg.springwebmvc.member.repository;

import com.ssg.springwebmvc.member.domain.MemberVO;

import java.util.List;
import java.util.Optional;

public interface MemberDAO {

    int insert(MemberVO vo) throws Exception;
    List<MemberVO> findAll() throws Exception;
    Optional<MemberVO> findById(String mid) throws Exception;
    boolean update(MemberVO vo) throws Exception;
    boolean delete(String mid) throws Exception;
}
