package sample;

import com.ssg.springwebmvc.prof.LectureRoom;
import com.ssg.springwebmvc.sample.Restaurant;
import lombok.extern.log4j.Log4j2;
import com.ssg.springwebmvc.sample.SampleService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;
import java.sql.Connection;

@Log4j2
// JUnit 버전에서 spring-test를 이용하기 위한 설정 어노테이션
@ExtendWith(SpringExtension.class)
// 불러올 스프링 설정 정보를 지정
// spring.root-context.xml 파일의 스프링 빈을 현재 클래스에서 사용
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class SampleTests {

    // @Autowired: 이 어노테이션이 붙은 필드에 스프링 빈 객체를 주입
    // (root-context.xml에 설정된 component-scan 범위에서 스캔한 스프링 빈 중 필드 타입이 일치하는 것을 주입)
    @Autowired
    private SampleService sampleService;    // SampleService 멤버 변수 선언

    @Autowired
    private Restaurant restaurant;

    @Autowired
    private LectureRoom lectureRoom;

    @Autowired
    private DataSource dataSource;

    @Test
    @DisplayName("SampleService 빈 객체 생성 테스트")
    public void testSampleService() {
        log.info(sampleService);
        Assertions.assertNotNull(sampleService);
    }

    @Test
    public void guestTest() {
        log.info(restaurant);
        Assertions.assertNotNull(restaurant);
    }

    @Test
    public void studentTest() {
        log.info(lectureRoom);
        Assertions.assertNotNull(lectureRoom);
    }

    // 스프링은 필요한 객체를 빈으로 등록해두면, 스프링 컨테이너가 빈으로 등록된 객체의 생명주기를 알아서 관리(-> 제어의 역전)
    // 따라서 사용자는 객체를 사용하기 위해, 직접 객체를 생성할 필요가 없음
    @Test
    public void testDataSource() throws Exception {
        Connection connection = dataSource.getConnection();
        log.info(dataSource);
        Assertions.assertNotNull(connection);
        connection.close();
    }
}
