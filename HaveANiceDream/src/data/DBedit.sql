select * from member;

ALTER TABLE member RENAME COLUMN USER_CHK_BLACK TO USER_TYPE;
ALTER TABLE member MODIFY(USER_TYPE VARCHAR2(20));

ALTER TABLE blame MODIFY(ATTACHED_FILE VARCHAR2(100));
ALTER TABLE blame MODIFY(BLAME_TYPE VARCHAR2(100));

select * from BLAME;

CREATE TABLE block
(
    user_id         VARCHAR2(20)    NOT NULL, 
    block_reason    VARCHAR2(20)    NULL, 
    block_date      DATE            NULL   
);