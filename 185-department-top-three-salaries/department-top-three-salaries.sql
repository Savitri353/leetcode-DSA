# Write your MySQL query statement below
select d1.name as Department, e1.name as Employee, e1.Salary  as Salary from Employee e1 left join department d1
on e1.departmentId = d1.id
where (select count(distinct e2.salary) from Employee e2
        where e1.departmentId = e2.departmentId and e2.salary>=e1.salary) <=3;