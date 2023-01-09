-- 코드를 입력하세요
SELECT O.ANIMAL_ID, O.NAME
FROM ANIMAL_INS I RIGHT JOIN ANIMAL_OUTS O
ON I.ANIMAL_ID = O.ANIMAL_ID
WHERE O.ANIMAL_ID NOT IN (SELECT I.ANIMAL_ID 
                          FROM ANIMAL_INS I JOIN ANIMAL_OUTS O 
                          ON I.ANIMAL_ID = O.ANIMAL_ID)
ORDER BY  O.ANIMAL_ID;