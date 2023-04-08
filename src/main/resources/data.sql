create schema if not exists diplom;

insert into users(login, password)
values ('aver@mail.ru', '1213');
insert into users(login, password)
values ('linnikov@yandex.ru', '100500');
insert into users(login, password)
values ('todo@yandex.ru', '$10000');

insert into user_entity_roles(user_entity_id, roles)
values (1, 'ROLE_ADMIN');
insert into user_entity_roles(user_entity_id, roles)
values (1, 'ROLE_WRITE');
insert into user_entity_roles(user_entity_id, roles)
values (2, 'ROLE_WRITE');
insert into user_entity_roles(user_entity_id, roles)
values (3, 'ROLE_READ');