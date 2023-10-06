/* Создайте представление, в которое попадает информация о пользователях (имя, фамилия, город и пол), которые не старше 20 лет. */
CREATE VIEW users_under_20 AS
SELECT u.firstname,
       u.lastname,
       u.email,
       u.city,
       u.gender
FROM users u
JOIN
    (SELECT id,
            firstname,
            lastname,
            email,
            city,
            gender
     FROM users
     WHERE age <= 20) u20 ON u.id = u20.id;

/* Найдите кол-во, отправленных сообщений каждым пользователем и выведите ранжированный список пользователей,
    указав имя и фамилию пользователя, количество отправленных сообщений и место в рейтинге
    (первое место у пользователя с максимальным количеством сообщений) . (используйте DENSE_RANK) */ WITH messages AS WITH messages AS
    (SELECT u.firstname,
            u.lastname,
            COUNT(*) AS messages
     FROM users u
     JOIN messages m ON u.id = m.user_id
     GROUP BY u.firstname,
              u.lastname)
SELECT m.firstname,
       m.lastname,
       m.messages,
       DENSE_RANK() OVER(
                         ORDER BY messages DESC) AS ranking
FROM messages m
JOIN messages_count mc ON m.messages = mc.messages /* Выберите все сообщения, отсортируйте сообщения по возрастанию даты отправления (created_at)
и найдите разницу дат отправления между соседними сообщениями, получившегося списка. (используйте LEAD или LAG)*/ 

WITH messages_with_dates AS
    (SELECT created_at,
            messages.*
     FROM messages
     JOIN users ON users.id = messages.user_id)
SELECT created_at - LEAD(created_at) OVER (
                                           ORDER BY created_at ASC) AS date_difference
FROM messages_with_dates;

