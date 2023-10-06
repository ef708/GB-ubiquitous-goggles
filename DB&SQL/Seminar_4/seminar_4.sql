/* Подсчитать общее количество лайков, которые получили пользователи младше 12 лет. */

SELECT 
	COUNT(*) AS 'likes_amount'
FROM likes 
WHERE media_id IN (
	SELECT id FROM media WHERE user_id IN (
		SELECT user_id FROM profiles WHERE (birthday + INTERVAL 12 YEAR) > NOW()
  )
)

/* Определить кто больше поставил лайков (всего): мужчины или женщины. */

SELECT
    CASE (gender)
         WHEN 'm' THEN 'мужчины'
         WHEN 'f' THEN 'женщины'
    END AS gender,
    COUNT(gender) AS 'кол-во'
FROM profiles
WHERE user_id IN (SELECT user_id FROM likes)
GROUP BY gender
ORDER BY 'кол-во' DESC LIMIT 1;

/* Вывести всех пользователей, которые не отправляли сообщения. */

SELECT * FROM users WHERE id IN (
	SELECT from_user_id
	FROM messages
	GROUP BY from_user_id
	HAVING COUNT(*) = 0)
