create database WAT character set utf8 collate utf8_bin;
create user 'usr'@'localhost' identified by 'usr';
grant all privileges on WAT.* to 'usr'@'localhost' with grant option;
flush privileges;
