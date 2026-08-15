# Write your MySQL query statement below

select d.name as Department, e.name as Employee, e.salary as Salary from Employee e 
join Department d On d.id = e.departmentId
join (select departmentId, max(salary) as maxSalary from Employee group by departmentId) m
on e.departmentId = m.departmentId
and e.salary = m.maxSalary;