select e1.name as Employee
from Employee as e1
JOIN Employee as e2
on e1.managerId=e2.id
AND e1.salary>e2.salary;
