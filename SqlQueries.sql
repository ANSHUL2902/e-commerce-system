 SELECT c.name, SUM(od.quantity) AS total_books
FROM Customers c
JOIN Orders o ON c.customer_id = o.customer_id
JOIN OrderDetails od ON o.order_id = od.order_id
WHERE o.order_date >= CURDATE() - INTERVAL 1 YEAR
GROUP BY c.customer_id
ORDER BY total_books DESC
LIMIT 5;


 SELECT b.author, SUM(b.price * od.quantity) AS total_revenue
FROM Books b
JOIN OrderDetails od ON b.book_id = od.book_id
JOIN Orders o ON od.order_id = o.order_id
GROUP BY b.author
ORDER BY total_revenue DESC;



SELECT b.title, SUM(od.quantity) AS total_ordered
FROM Books b
JOIN OrderDetails od ON b.book_id = od.book_id
GROUP BY b.book_id
HAVING total_ordered > 10;
