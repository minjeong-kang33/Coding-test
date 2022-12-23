-- 코드를 입력하세요
SELECT hour(datetime) HOUR, count(*) COUNT
FROM animal_outs
WHERE date_format(DATETIME,'%T') between '09:00' and '19:59'
GROUP BY HOUR
ORDER BY HOUR;