-- https://www.hackerrank.com/challenges/average-population-of-each-continent/problem

SELECT country.continent, floor(avg(city.population))
FROM country, city
where country.code = city.countrycode
group by country.continent
;
