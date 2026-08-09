

select p.product_name,sum(o.unit) as unit
from Products as p
INNER JOIN
Orders as o
on p.product_id=o.product_id
where extract(year_month from o.order_date) =202002 
group by p.product_name
having sum(o.unit)>=100;





