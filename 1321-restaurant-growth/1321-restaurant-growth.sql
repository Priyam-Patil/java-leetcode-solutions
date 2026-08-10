
select c.visited_on,

     (select sum(amount) 
from Customer 
where visited_on between date_sub(c.visited_on,interval 6 day) AND c.visited_on)as amount,

-- avg should bw over 7 days and not over the number of customer records
round(
    (select sum(amount) /7
from Customer
where visited_on between date_sub(c.visited_on,interval 6 day) AND c.visited_on),
2)as average_amount

from Customer c
where c.visited_on>=
(select date_add(min(visited_on),interval 6 day) from Customer )
group by c.visited_on