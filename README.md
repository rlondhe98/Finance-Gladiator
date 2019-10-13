create table UserDetails(userId number primary key, userName varchar2(30), userPass varchar2(10), email varchar2(20), contact number, address varchar2(20), SavingsAccNumber number, IfscCode number);


create table ActiveUserCard(cardId number primary key, userId number, cardStatus varchar2(10), cardValidity date, cardBalance number, cardType varchar2(20)); 


create table Bank(IfscCode number primary key, bankName varchar2(20), bankRegion varchar2(20), bankAddress varchar2(30));

drop table bank

create table product(productId number primary key, productName varchar2(20), productCost number, imageLink varchar(50));

create table card(cardType varchar2(10) primary key, cardLimit number);

create table EmiPayment(userId number, orderId number, emiAmount number, dateOfPayment date);

create table cart(cartId number primary key, userId number, productId number, quantity number);

create table orders(userId number, cartId number, dateOfPurchase date, paymentStatus varchar2(20), emiTenure number, emiAmount number);

select * from UserDetails
select * from product
select * from cartdetails
rename cart to cartDetails;

insert into UserDetails values(102,'Yash', 'pass3', 'abc@xyz.com', 93943423, 'mahape', 224343, 43434);
insert into UserDetails values(103,'Riya', 'pass4', 'abc@xyz.com', 93943423, 'mahape', 224343, 43434);
insert into UserDetails values(104,'Saurabh', 'pass5', 'abc@xyz.com', 93943423, 'mahape', 224343, 43434);

insert into product values(104,'pants', 1200, 'link');
insert into product values(105,'shirt', 1600, 'link');
insert into product values(106,'tshirt', 800, 'link');
insert into product values(107,'jeans', 2200, 'link');
insert into product values(108,'chinos', 2600, 'link');
insert into product values(109,'tops', 1200, 'link');
insert into product values(110,'leather jacket', 5000, 'link');
insert into product values(111,'iphone x', 72000, 'link');
insert into product values(112,'one plus 7', 38000, 'link');
insert into product values(113,'one plus 7t', 42000, 'link');
insert into product values(114,'one plus 7t pro', 52000, 'link');

insert into cartdetails values(3,100,108,1);
insert into cartdetails values(4,103,102,1);
insert into cartdetails values(5,102,101,1);
insert into cartdetails values(6,101,106,1);
insert into cartdetails values(7,104,112,1);
insert into cartdetails values(8,103,113,1);
insert into cartdetails values(9,101,107,1);
insert into cartdetails values(10,100,105,1);

select * from cartdetails where userid = 100
select productName, productCost from product where productId = 101;

