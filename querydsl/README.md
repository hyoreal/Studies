### **gradle 의존 관계 명령어**

```./greadlw dependencies --confiduration compileClasspath```

### Querydsl Library

- querydsl-apt : Querydsl 관련 코드 생성 기능 제공
- querydsl-jpa : querydsl 라이브러리

### **스프링 부트 라이브러리**

- spring-boot-starter-web
  - spring-boot-starter-tomcat : 톰캣(웹서버)
  - spring-webmvc : 스프링 웹 MVC
- spring-boot-starter-data-jpa
  - spring-boot-start-aop
  - spring-boot-start-jdbc
    - HikariCP 커넥션 풀 (부트 2.0. 기본)
  - hibernate + JPA : 하이버네이트 + JPA
  - spring-data-jpa : 스프링 데이터 JPA
- spring-boot-stater(공통) : 스프링 부트 + 스프링 코어 + 로깅
  - spring-boot
    - spring-core
  - spring-boot-starter-logginf
    - logback, slf4j

### 테스트 라이브러리

- spring-boot-starter-test
  - junit: 테스트 프레임워크, 스프링 부트 2.2부터 junit5( jupiter ) 사용
    - 과거 버전은 vintage
  - mockito: 목 라이브러리
  - assertj: 테스트 코드를 좀 더 편하게 작성하게 도와주는 라이브러리
    - https://joel-costigliola.github.io/assertj/index.html
  - spring-test: 스프링 통합 테스트 지원
- 핵심 라이브러리
  - 스프링 MVC
  - JPA, 하이버네이트
  - 스프링 데이터 JPA
  - Querydsl
- 기타 라이브러리
  - H2 데이터베이스 클라이언트
  - 커넥션 풀: 부트 기본은 HikariCP
  - 로깅 SLF4J & LogBack
  - 테스트