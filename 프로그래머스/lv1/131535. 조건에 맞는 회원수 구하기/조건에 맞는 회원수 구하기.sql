-- 코드를 입력하세요
SELECT count(*) as USERS
FROM user_info
WHERE left(JOINED, 4) = '2021'
AND AGE between 20 and 29;