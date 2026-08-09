
(select u.name as results
from Users as u
inner JOIN MovieRating as m
on u.user_id=m.user_id
group by u.user_id
order by count(*) desc ,u.name
limit 1)

UNION ALL
-- union all combines the results  of two or more select queries without removing duplicate record(when movie name and user name is same) 

(select m.title as results
from Movies as m
inner join movieRating as mr
on m.movie_id=mr.movie_id
where extract(year_month from mr.created_at) =202002
group by m.movie_id
order by avg(mr.rating) desc,m.title
limit 1);
