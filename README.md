seungshins's book manager
=============================

기본 프로젝트 설정 
--------------------
1. 기본 MVC 프리셋
2. JPA 추가 (hibernate)
3. Spring Security

Maven 설정 (dependency 관련)
--------------------
* Spring F/W : 4.3.18.RELEASE
* Spring Security : 4.0.3.RELEASE
* hibernate : 5.2.9.Final

기본 설계
--------------------
* xml에 설정파일을 두지 않고 Common폴더에 설정
* Properties 파일에 설정을 둔다.
 * 확장을 고려하여 Kakao API외에 다른 오픈 API가 들어오도록 Prop으로 제어
* MVC Pattern
 * Controller : Parameter / Response 가공, Validation까지만 수행하고 로직은 Service에서 수행
 * Service : 로직 수행
 * VO : Entity
 * DAO : DB 처리

프로그램 설계
--------------------
* Common : 공통적으로 사용하는 상수, 유틸 제어, Auth 관련
* Search : 책 검색에 관한 Package
* History : 내역 관리
* bookmark : 즐겨찾기 관리 (추가/삭제 관련)
