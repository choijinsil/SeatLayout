-- user table insert
INSERT INTO user(account_id, user_nm, enabled) VALUES ('user1', '유저1', true);
INSERT INTO user(account_id, user_nm, enabled) VALUES ('user2', '유저2', true);
INSERT INTO user(account_id, user_nm, enabled) VALUES ('user3', '유저3', true);

-- item table insert
INSERT INTO item (item_nm, item_group, item_price, enabled) VALUES ('사과', 'I0001', '1000', true);
INSERT INTO item (item_nm, item_group, item_price, enabled) VALUES ('포도', 'I0001', '1500', true);
INSERT INTO item (item_nm, item_group, item_price, enabled) VALUES ('바나나', 'I0001', '2000', true);

INSERT INTO item (item_nm, item_group, item_price, enabled) VALUES ('의자', 'I0002', '10000', true);
INSERT INTO item (item_nm, item_group, item_price, enabled) VALUES ('책상', 'I0002', '25000', true);

INSERT INTO item (item_nm, item_group, item_price, enabled) VALUES ('주황색색지', 'I0003', '500', true);
INSERT INTO item (item_nm, item_group, item_price, enabled) VALUES ('빨강색색지', 'I0003', '500', true);

-- buy table insert
INSERT into buy (user_id,item_id) values(1,2);
INSERT into buy (user_id,item_id) values(1,3);
INSERT into buy (user_id,item_id) values(2,4);
INSERT into buy (user_id,item_id) values(3,4);
-- save table insert
INSERT into save (id,user_id,item_id,item_price) values(1,2,3,400);
INSERT into save (id,user_id,item_id,item_price) values(2,33,32,500);
INSERT into save (id,user_id,item_id,item_price) values(3,44,33,700);
INSERT into save (id,user_id,item_id,item_price) values(4,123,53,300);
-- member table insert
INSERT INTO member(passwoed,user_name,phone_num,create_date) VALUES ('1111', 'siri1','01087875536','181210');
INSERT INTO member(passwoed,user_name,phone_num,create_date) VALUES ('2222', 'siri2','1234567890','181201');
INSERT INTO member(passwoed,user_name,phone_num,create_date) VALUES ('3333', 'siri3','01087875536','181203');
INSERT INTO member(passwoed,user_name,phone_num,create_date) VALUES ('4444', 'siri4','01087875536','181206');

