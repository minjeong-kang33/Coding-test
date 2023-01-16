-- 코드를 입력하세요
SELECT P.PRODUCT_ID, P.PRODUCT_NAME, SUM(P.PRICE*O.AMOUNT) AS TOTAL_SALES
FROM FOOD_PRODUCT P LEFT JOIN FOOD_ORDER O
ON P.PRODUCT_ID = O.PRODUCT_ID
WHERE PRODUCE_DATE LIKE '2022-05%'
GROUP BY P.PRODUCT_ID, P.PRODUCT_NAME
ORDER BY TOTAL_SALES DESC, PRODUCT_ID;