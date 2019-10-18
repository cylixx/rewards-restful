insert into customer(id, name) values (1000, 'Marco');
insert into customer(id, name) values (1001, 'Luis');
insert into customer(id, name) values (1002, 'Selene');

insert into my_transaction(id, description, total, save_date, customer_id) values (1001, 'Purchase 1', 100, '2019-10-17 10:20:10', 1000);
insert into my_transaction(id, description, total, save_date, customer_id) values (1002, 'Purchase 2', 50, '2019-10-01 10:20:10', 1000);
insert into my_transaction(id, description, total, save_date, customer_id) values (1003, 'Purchase 3', 120, '2019-10-10 10:20:10', 1000);
insert into my_transaction(id, description, total, save_date, customer_id) values (1004, 'Purchase 10', 175, '2019-10-07 10:20:10', 1000);
insert into my_transaction(id, description, total, save_date, customer_id) values (1005, 'Purchase 20', 65, '2019-10-05 10:20:10', 1000);
insert into my_transaction(id, description, total, save_date, customer_id) values (1006, 'Purchase 30', 210, '2019-10-03 10:20:10', 1000);

insert into my_transaction(id, description, total, save_date, customer_id) values (1007, 'Purchase 4', 75, '2019-10-14 10:20:10', 1001);
insert into my_transaction(id, description, total, save_date, customer_id) values (1008, 'Purchase 5', 200, '2019-10-17 10:20:10', 1002);