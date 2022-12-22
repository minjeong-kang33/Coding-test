-- 코드를 입력하세요
SELECT animal_id, name, if(sex_upon_intake like 'Neutered%' || sex_upon_intake like 'Spayed%', 'O', 'X') "중성화"
FROM ANIMAL_INS;