/* 계정(사용자)

* 관리자 계정 : 데이터베이스의 생성과 관리를 담당하는 계정
                모든 권한과 책임을 가지는 계정
                EX) sys(최고관리자), system(sys에서 몇 개의 권한이 제외된 관리자)


* 사용자 계정 : 데이터베이스에 대하여 질의, 갱신, 보고서 작성 등의
                작업을 수행할 수 있는 계정으로
                업무에 필요한 최소한의 권한만을 가지는 것을 원칙으로 한다.
                ex) ksh계정, updown, workbook 등

*/

/* DCL(Data Control Language) : 계정에 DB, DB 객체에 대한 권한을 부여하고 회수하는 언어

- GRANT : 권한 부여
- REVOKE : 권한 회수

* 권한의 종류

1) 시스템 권한 : DB 접속, 객체 생성 권한

CRETAE SESSION   : 데이터베이스 접속 권한
CREATE TABLE     : 테이블 생성 권한
CREATE VIEW      : 뷰 생성 권한
CREATE SEQUENCE  : 시퀀스 생성 권한
CREATE PROCEDURE : 함수(프로시져) 생성 권한
CREATE USER      : 사용자(계정) 생성 권한
DROP USER        : 사용자(계정) 삭제 권한
DROP ANY TABLE   : 임의 테이블 삭제 권한

2) 객체 권한 : 특정 객체를 조작할 수 있는 권한

   권한 종류                  설정 객체
    SELECT              TABLE, VIEW, SEQUENCE
    INSERT              TABLE, VIEW
    UPDATE              TABLE, VIEW
    DELETE              TABLE, VIEW
    ALTER               TABLE, SEQUENCE
    REFERENCES          TABLE
    INDEX               TABLE
    EXECUTE             PROCEDURE

*/
-- 0. sql 구문 작성 형식을 예전(11g) 오라클 sql 형식을 사용하도록 변경
ALTER SESSION SET "_ORACLE_SCRIPT" = TRUE;

-- 1. [SYS 관리자 계정] 사용자 계정 생성
CREATE USER ksh_sample IDENTIFIED BY sample1234;
        /*사용자 계정 명*/           /*비밀번호*/

-- 2. 생성된 계정에 접속하기 위한 접속 방법을 추가(왼쪽 상단 초록 + 버튼)
--> ORA-01045 : CREATE SESSION 권한을 가지고 있지 않다


-- 3. [SYS 관리자 계정] 생성된 샘플 계정에 DB접속 권한 부여
GRANT CREATE SESSION TO ksh_sample;

-- 4. 재접속 --> 성공

-- 5. [sample 계정] 테이블 생성
CREATE TABLE TB_TEST(
    TEST_PK NUMBER PRIMARY KEY,
    TEST_CONTENT VARCHAR2(100)
);
-- ORA-01031: 권한이 불충분합니다
--> DB 접속 권한은 있으나 테이블 생성 권한이 없다.

-- 6. [SYS 관리자 계정] 테이블 생성 권한 부여 + 객체 생성 공간 할당
GRANT CREATE TABLE TO ksh_sample;

ALTER USER ksh_sample DEFAULT TABLESPACE SYSTEM QUOTA UNLIMITED ON SYSTEM;

-- 7. [sample 계정] 테이블 생성
CREATE TABLE TB_TEST(
    TEST_PK NUMBER PRIMARY KEY,
    TEST_CONTENT VARCHAR2(100)
);

SELECT * FROM TB_TEST;

--------------------------------------------------------------------------
-- ROLE : 권한의 묶음
--> 묶어둔 권한(ROLE)을 특정 계정에 부여 -> 해당 계정은 특정 권한을 가진 역할을 갖게 된다.

-- ROLE을 사용하면 한 번에 많은 권한을 부여하거나 회수할 수 있다.

-- 1) CONNECT : DB 접속 권한 (== CREATE SESSION)
--> 담고 있는 권한은 1개 이지만 의미적으로 쉽게 사용하기 위해 사용
-- [SYS 관리자 계정]
SELECT * FROM ROLE_SYS_PRIVS
WHERE ROLE = 'CONNECT';

-- 2) RESOURCE : DB 사용을 위한 기본 객체 생성 권한 묶음
-- [SYS 관리자 계정]
SELECT * FROM ROLE_SYS_PRIVS
WHERE ROLE = 'RESOURCE';

-- ROLE을 이용해서 샘플 계정에 다시 권한 부여
-- [SYS 관리자 계정]
GRANT CONNECT, RESOURCE TO ksh_sample;

--------------------------------------------------------------------------

-- 객체 권한
--> ksh_sample 계정에서 ksh 계정의 EMPLOYEE 테이블 조회

-- 1.[샘플 계정] ksh계정의 employee 테이블 조회
SELECT * FROM ksh.EMPLOYEE; --> EMPLOYEE 테이블(객체) 조회 권한 없음

-- 2.[이니셜 계정] 샘플 계정에 EMPLOYEE 테이블 조회 권한 부여
GRANT SELECT ON EMPLOYEE TO ksh_sample;

-- 3.[샘플 계정] 다시 EMPLOYEE 테이블 조회
SELECT * FROM ksh.EMPLOYEE;

-- 4 [이니셜 계정] 부여했던 SELECT 권한 회수
REVOKE SELECT ON EMPLOYEE FROM ksh_sample;

-- 5.[샘플 계정] 다시 EMPLOYEE 테이블 조회
SELECT * FROM ksh.EMPLOYEE;



