CREATE USER iim
  IDENTIFIED BY iim;

GRANT create session TO iim;
GRANT create table TO iim;
GRANT create view TO iim;
GRANT create any trigger TO iim;
GRANT create any procedure TO iim;
GRANT create sequence TO iim;
GRANT create synonym TO iim;

create table iim.Tbl_mst_login (Num_login_id number primary key,Num_student_id number,Num_staff_id number,Vch_user_name varchar2(100),Vch_password varchar2(100),Chr_active_status  char(1) default 'y', Dtt_join_date date, Num_modified_userid number, Dtt_modified_date date);

INSERT INTO Tbl_mst_login 
(Num_login_id,Vch_user_name,Vch_password)
VALUES
(2,'TEST1','TEST')

SELECT COUNT(Num_login_id) AS CNT FROM Tbl_mst_login WHERE Vch_user_name ='TEST' AND Vch_password ='TEST'

create table Tbl_mst_student (Num_student_id number primary key, vch_student_name varchar2(15), vch_father_name varchar2(15), dtt_dob date, num_dep_id number, vch_gender varchar2(10), vch_roll_no varchar2(15) ,vch_address varchar2(100), Chr_active_status char(1) default 'y', Dtt_join_date date);    

create table Tbl_mst_staff (Num_staff_id number primary key, vch_staff_name varchar2(15), vch_father_name varchar2(15), dtt_dob date, num_dep_id number, vch_gender vachar2(10), vch_address varchar2(100), Chr_active_status  char(1) default 'y', Dtt_join_date date);    

Alter table Tbl_mst_login add foreign key (Num_student_id) references Tbl_mst_student(Num_student_id);

Alter table Tbl_mst_staff add foreign key (Num_staff_id) references Tbl_mst_staff(Num_staff_id);



create table tbl_mst_question
(num_question_id number, num_question_Type_id number, vch_question varchar2(500),
vch_choice1 varchar2(100), vch_choice2 varchar2(100), vch_choice3 varchar2(100),
vch_choice4 varchar2(100), num_answer number, vch_strAnswer varchar2(500),
chr_active_status char(1), dtt_creation_date date, num_created_by number,
dtt_modified_date date, num_modified_by number);





