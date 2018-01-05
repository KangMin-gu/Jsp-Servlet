CREATE TABLE board_cafe(
num NUMBER PRIMARY KEY,
writer VARCHAR2(100) NOT NULL,
title VARCHAR2(100) NOT NULL,
content CLOB,
viewCount NUMBER, 
regdate DATE
);

CREATE SEQUENCE board_cafe_seq;

Create Table board_cafe_comment(
num NUMBER PRIMARY KEY, --덧글의 글번호
writer VARCHAR2(100),
content VARCHAR2(500),
target_id VARCHAR2(100), --덧글의 대상이 되는 아이디 누구의 대상으로 wirter가 target에게 댓글(content)씀
ref_group NUMBER, --덧글 그룹 참조그룹 원글의글번호와 같은번호를넣을것(select macthing하기위해서..)
comment_group NUMBER, -- 덧글 내에서의 그룹 
regdate DATE
--본문의댓글은 자신의 num 와 comment_group 번호는 같다. 댓글의 댓글은 num과 comment_group가 다르다.
--이걸 생각하며 코딩할것. 
);