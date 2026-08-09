select 'Low Salary' as Category,
sum(case when income<20000 then 1 else 0 end) as accounts_count
from Accounts

UNION

select 'Average Salary' as Category,
sum(case when income  between 20000 and 50000 then 1 else 0 end) as accounts_count
from Accounts

UNION

select 'High Salary' as Category,
sum(case when income>50000 then 1 else 0 end) as accounts_count
from Accounts;
