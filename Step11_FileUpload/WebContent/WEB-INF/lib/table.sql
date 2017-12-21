create table board_data
(num number primary key,
writer varchar2(100) not null,
title varchar2(100) not null,
orgFileName varchar2(100) not null, 다른이름으로 저장한 원래 파일명
saveFileName varchar2(100) not null, 저장할때 다른 파일명 => 하나의 폴더에 저장하기때문에 같은이름은 덮어 쓰기 되므로 
filesieze number not null,								2개의 파일명으로 관리한다.
regdate date);

create sequence board_data_seq ; 