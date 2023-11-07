-- https://www.hackerrank.com/challenges/earnings-of-employees/problem

select max(months*salary), count(*)
from employee
where (months*salary) = (select max(months*salary) from employee)
;
