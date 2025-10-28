package com.ssg.springwebmvc.sample;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

// 인터페이스를 사용한 느슨한 결합 -> 서비스 객체의 코드 변경 불필요
@Log4j2
// 이 어노테이션이 붙은 클래스는 스프링 빈으로 처리 + 이 클래스가 DAO/Repository 객체임을 명시
@Repository
@Qualifier("basic")
public class SampleDAOImpl implements SampleDAO {

}
