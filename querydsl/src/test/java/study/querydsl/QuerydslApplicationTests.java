package study.querydsl;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import study.querydsl.entity.Hello;
import study.querydsl.entity.QHello;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
class QuerydslApplicationTests {

	@Autowired // 스프링 최신 버전에서 사용
//	@PersistenceContext // 자바 표준스펙에서 사용, 스프링을 다른 프레임워크로 바꾸면 사용
	EntityManager em;

	@Test
	void contextLoads() {
		Hello hello = new Hello();
		em.persist(hello); // hello 저장

		JPAQueryFactory query = new JPAQueryFactory(em); // 쿼리dsl 사용하기 위한 JPAQueryFactory
		QHello qHello = new QHello("hi");

		Hello result = query
				.selectFrom(qHello) // 쿼리관련될때는 Q타입 엔티티 넣어야함
				.fetchOne();

		assertThat(result).isEqualTo(hello);
		assertThat(Objects.requireNonNull(result).getId()).isEqualTo(hello.getId());
	}

}
