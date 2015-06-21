create sequence seq_user_num  increment by 1 start with 1 nocache nocycle;
create sequence seq_event_num  increment by 1 start with 1 nocache nocycle;
create sequence seq_product_num  increment by 1 start with 1 nocache nocycle;
create sequence seq_buy_num increment by 1 start with 1 nocache nocycle;
/*create sequence seq_cate_num  increment by 1 start with 1 nocache nocycle;
create sequence seq_product_num  increment by 1 start with 1 nocache nocycle;
create sequence seq_event_num  increment by 1 start with 1 nocache nocycle;
create sequence seq_wish_product_num increment by 1 start with 1 nocache nocycle;
create sequence seq_reco_product_num increment by 1 start with 1 nocache nocycle;
create sequence seq_buy_product_num increment by 1 start with 1 nocache nocycle;*/

drop sequence seq_user_num;
drop sequence seq_event_num;
drop table userDB;
drop table categoryDB;
drop table productDB;
drop table eventDB;
drop table wishlistDB;
drop table buylistDB;
drop table recolistDB;


create table userDB (
	user_num int not null PRIMARY KEY,
    
    user_name varchar(16) not null,
    user_pwd varchar(32) not null,
    user_email  varchar(64) not null,
	user_phone varchar(32) null,
	user_point varchar(16) null
);

create table categoryDB (
    cate_num int not null PRIMARY KEY,
    cate_name varchar(32) not null
);

create table productDB (
    product_num int not null PRIMARY KEY,
   	product_name varchar(32) not null,
    product_remain varchar(32) not null,
    product_cate_num int not null,
    FOREIGN KEY (product_cate_num) REFERENCES categoryDB(cate_num)
)

//eventText추가  int 형 변환 
create table eventDB (
    event_num int not null PRIMARY KEY,
   	event_name varchar(32) not null,
    event_start_date int null,
    event_end_date int null,
    event_text varchar(64) null
);

create table wishlistDB (
    wish_product_num int not null,
    wish_user_num int not null,
    wish_date varchar(64) not null,
    constraint pk_wishlistDB primary key (wish_product_num, wish_user_num),
    FOREIGN KEY (wish_product_num) REFERENCES productDB(product_num),
    FOREIGN KEY (wish_user_num) REFERENCES userDB(user_num)
);

create table recolistDB (
	reco_num int not null,
    reco_product_num int not null,
    reco_user_num int not null,
   	constraint pk_recolistDB primary key (reco_product_num, reco_user_num),
  	FOREIGN KEY (reco_product_num) REFERENCES productDB(product_num),
  	FOREIGN KEY (reco_user_num) REFERENCES userDB(user_num)
);

create table buylistDB (
	buy_num int not null,
    buy_product_num int not null,
    buy_user_num int not null,
    buy_date varchar(64) null,
   	constraint pk_buylistDB primary key (buy_product_num, buy_user_num),
    FOREIGN KEY (buy_product_num) REFERENCES productDB(product_num),
    FOREIGN KEY (buy_user_num) REFERENCES userDB(user_num)
);

ALTER TABLE userDB 
ADD user_id varchar(32)unique;

ALTER TABLE userDB
ADD user_birth varchar(32);

ALTER TABLE userDB
modify user_point default 0;

ALTER TABLE productDB
modify product_remain int;

ALTER TABLE productDB
ADD product_description varchar(100);

ALTER TABLE productDB
ADD product_event_num int;

ALTER TABLE productDB
ADD product_price varchar(32);

ALTER TABLE userDB
modify user_point int;

ALTER TABLE productDB
modify product_remain int;

drop table userDB;

create table buylistDB (
   buy_num int not null,
    buy_product_num int not null,
    buy_user_id varchar(32) not null,
    buy_date varchar(64) null,
      constraint pk_buylistDB primary key (buy_product_num, buy_user_id),
    FOREIGN KEY (buy_product_num) REFERENCES productDB(product_num),
    FOREIGN KEY (buy_user_id) REFERENCES userDB(user_id)
);

