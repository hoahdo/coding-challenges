-- https://www.hackerrank.com/challenges/revising-aggregations-sum/problem

SELECT SUM(city.population)
FROM city
WHERE city.district = 'California'
;
