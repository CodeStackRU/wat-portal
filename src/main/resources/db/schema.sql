use WAT;

drop table if exists WAT_CONTACT;
create table WAT_CONTACT (
        ID int not null auto_increment
    ,   LAST_NAME varchar(100) not null
    ,   FIRST_NAME varchar(60) not null
    ,   MIDDLE_NAME varchar(100) 
    ,   BIRTH_DATE date not null
    ,   DESCRIPTION varchar(2000)
    ,   PHOTO blob
    ,   VERSION int not null default 0
    ,   unique I_CONTACT_NAME_UQ (FIRST_NAME, LAST_NAME)
    ,   primary key (ID)
);

