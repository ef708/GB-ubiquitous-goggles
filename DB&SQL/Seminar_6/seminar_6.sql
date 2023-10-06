/* 1) Создайте таблицу users_old, аналогичную таблице users. 
Создайте процедуру, с помощью которой можно переместить любого (одного) пользователя из таблицы users в таблицу users_old. 
(использование транзакции с выбором commit или rollback – обязательно). */

CREATE TABLE users_old AS SELECT * FROM users WHERE 1=2;

CREATE PROCEDURE move_user(IN p_user_id INT)
BEGIN
DECLARE EXIT HANDLER FOR SQLEXCEPTION ROLLBACK;
START TRANSACTION;
INSERT INTO users_old (id, firstname, lastname, email)
SELECT id, firstname, lastname, email FROM users WHERE id = p_user_id;
DELETE FROM users WHERE id = p_user_id;
COMMIT;
END;


/* 2) Создайте хранимую функцию hello(), которая будет возвращать приветствие, в зависимости от текущего времени суток. 
С 6:00 до 12:00 функция должна возвращать фразу "Доброе утро", с 12:00 до 18:00 функция должна возвращать фразу "Добрый день", 
с 18:00 до 00:00 — "Добрый вечер", с 00:00 до 6:00 — "Доброй ночи". */

CREATE FUNCTION hello() RETURNS VARCHAR;
BEGIN
DECLARE greeting VARCHAR(20);
DECLARE cur_time TIME;
SET cur_time = CURRENT_TIME();
SET greeting = CASE
WHEN cur_time BETWEEN '06:00:00' AND '12:00:00' THEN 'Доброе утро'
WHEN cur_time BETWEEN '12:00:00' AND '18:00:00' THEN 'Добрый день'
WHEN cur_time BETWEEN '18:00:00' AND '00:00:00' THEN 'Добрый вечер'
WHEN cur_time BETWEEN '00:00:00' AND '23:59:59' OR cur_time BETWEEN '00:00:00' AND '05:59:59' THEN 'Добрый вечер'
ELSE 'Доброй ночи'
END;
RETURN greeting;
END;
