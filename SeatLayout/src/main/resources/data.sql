-- user table insert
INSERT INTO user(user_id, user_nm, enabled) VALUES ('user1', '유저1', true);
INSERT INTO user(user_id, user_nm, enabled) VALUES ('user2', '유저2', true);
INSERT INTO user(user_id, user_nm, enabled) VALUES ('user3', '유저3', true);

-- item table insert
INSERT INTO item (item_nm, item_group, item_price, enabled) VALUES ('사과', 'I0001', '1000', true);
INSERT INTO item (item_nm, item_group, item_price, enabled) VALUES ('포도', 'I0001', '1500', true);
INSERT INTO item (item_nm, item_group, item_price, enabled) VALUES ('바나나', 'I0001', '2000', true);

INSERT INTO item (item_nm, item_group, item_price, enabled) VALUES ('의자', 'I0002', '10000', true);
INSERT INTO item (item_nm, item_group, item_price, enabled) VALUES ('책상', 'I0002', '25000', true);

INSERT INTO item (item_nm, item_group, item_price, enabled) VALUES ('주황색색지', 'I0003', '500', true);
INSERT INTO item (item_nm, item_group, item_price, enabled) VALUES ('빨강색색지', 'I0003', '500', true);