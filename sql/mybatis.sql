--=============================
-- 관리자(system) 계정
--=============================
create user C##MYBATIS identified by MYBATIS;
default tablespace users;

grant connect, resource, create synonym, UNLIMITED tablespace  to C##MYBATIS;

grant all on C##kh.employee to C##MYBATIS;
grant select on C##kh.department to C##MYBATIS;
grant select on C##kh.job to C##MYBATIS;

--=============================
-- mybatis 계정
--=============================
create table student(
    no number,
    name varchar2(100) not null,
    tel char(11) not null,
    reg_date date default sysdate,
    constraint pk_student_no primary key(no)
);

create sequence seq_student_no;

-- 동의어 생성
create synonym emp for C##kh.employee;
create synonym dept for C##kh.department;
create synonym job for C##kh.job;



