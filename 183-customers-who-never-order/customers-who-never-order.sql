select c1.name Customers from Customers as c1 left join Orders o1 on c1.id = o1.customerId 
where o1.id is null;