select d.name as Department ,e.name as Employee ,salary as Salary
from Employee as e join Department as d 
on e.departmentId=d.id where (e.departmentId,e.salary) in (
    -- The subquery returns the pair (Engineering_id, 120000) — just one row, since MAX() gives one value per department. But in the outer query, the WHERE clause checks this tuple against every row in Employee, not just one.
    select departmentId,max(salary)
    from Employee group by departmentId
);