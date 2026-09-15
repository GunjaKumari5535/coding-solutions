# Write your MySQL query statement below
select 
(select distinct emp.salary  SecondHighestSalary 
from Employee emp 
order by  salary desc limit 1,1) SecondHighestSalary;