# Write your MySQL query statement below
SELECT customer_id, COUNT(visit_id) AS count_no_trans
FROM Transactions AS t RIGHT JOIN Visits AS v
USING (visit_id)
WHERE transaction_id IS NULL
GROUP BY customer_id;