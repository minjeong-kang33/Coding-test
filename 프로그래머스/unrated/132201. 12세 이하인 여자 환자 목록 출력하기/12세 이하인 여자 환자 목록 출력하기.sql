-- 코드를 입력하세요
SELECT PT_NAME, PT_NO, GEND_CD, AGE, IFNULL(TLNO, 'NONE') AS TLNO
from PATIENT
where GEND_CD='W' AND AGE<='12'
order by AGE desc , PT_NAME asc;