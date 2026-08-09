select case 
-- odd id and must be < max(id)
when id%2=1 AND id<(select MAX(id) from Seat) 
then id+1

-- even id
when id%2=0
then id-1
else id
end as id,
student
from Seat
order by id ;
