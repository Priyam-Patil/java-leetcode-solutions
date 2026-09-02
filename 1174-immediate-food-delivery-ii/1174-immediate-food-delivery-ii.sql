select round(sum(case when min_order_date=min_pref_date then 1 else 0 end)*100/count(customer_id),2) as immediate_percentage
from
(select delivery_id , customer_id ,min(order_date) as min_order_date ,min(customer_pref_delivery_date) as min_pref_date
from Delivery
group by customer_id)as der
