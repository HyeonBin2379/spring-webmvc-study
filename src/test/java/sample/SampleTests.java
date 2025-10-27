package sample;

import lombok.extern.log4j.Log4j2;
import com.ssg.springwebmvc.sample.SampleService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@Log4j2
// JUnit 버전에서 spring-test를 이용하기 위한 설정 어노테이션
@ExtendWith(SpringExtension.class)
// 불러올 스프링 설정 정보를 지정
// spring.root-context.xml 파일의 스프링 빈을 현재 클래스에서 사용
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class SampleTests {

    // @Autowired: 이 어노테이션이 붙은 필드에 스프링 빈 객체를 주입
    // (root-context.xml에 포함된 스프링 빈 중 필드 타입에 해당하는 것을 주입)
    @Autowired
    private SampleService sampleService;    // SampleService 멤버 변수 선언

    @Test
    @DisplayName("SampleService 빈 객체 생성 테스트")
    public void testSampleService() {
        log.info(sampleService);
        Assertions.assertNotNull(sampleService);
    }
}
