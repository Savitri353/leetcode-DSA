CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
      select max(e1.salary) from Employee e1
      where N = (select count(distinct e2.salary) from Employee e2 where e2.salary>=e1.salary)
  );
END