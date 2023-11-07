-- https://www.hackerrank.com/challenges/weather-observation-station-12/problem

select distinct city
from station
where (left(city,1) not in ('a','e','i','o','u')
and
right(city,1) not in ('a','e','i','o','u'))
order by city
;
