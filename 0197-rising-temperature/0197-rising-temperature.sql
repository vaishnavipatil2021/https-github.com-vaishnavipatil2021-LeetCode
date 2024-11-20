# Write your MySQL query statement below
select w2.id from weather w1 
inner join weather w2 
on w1.recordDate = date_add(w2.recordDate,interval-1 day)
and w2.temperature>w1.temperature;

#select w1.id 
#from weather w1, weather w2
#where datediff(w1.recordDate,w2.recordDate)=1 and w1.temperature > w2.temperature;