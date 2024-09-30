SELECT * FROM sidb.courses;
use sidb;
SELECT AVG(student_count) AS avg_students_per_course
FROM (
    SELECT COUNT(e.student_id) AS student_count
    FROM enrollments e
    GROUP BY e.course_id
) AS subquery;

SELECT s.first_name, s.last_name
FROM Students s
JOIN Payments p ON s.student_id = p.student_id
WHERE p.amount = (SELECT MAX(amount) FROM Payments); -- Sakshi Jain

SELECT course_name
FROM Courses
WHERE course_id = (
    SELECT course_id
    FROM Enrollments
    GROUP BY course_id
    ORDER BY COUNT(student_id) DESC
    LIMIT 1
);

SELECT t.first_name, t.last_name, SUM(p.amount) AS total_payments
FROM Teacher t
JOIN Courses c ON t.teacher_id = c.teacher_id
JOIN Enrollments e ON c.course_id = e.course_id
JOIN Payments p ON e.student_id = p.student_id
GROUP BY t.teacher_id;

SELECT s.first_name, s.last_name
FROM Students s
WHERE NOT EXISTS (
    SELECT c.course_id
    FROM Courses c
    WHERE NOT EXISTS (
        SELECT e.course_id
        FROM Enrollments e
        WHERE e.student_id = s.student_id
        AND e.course_id = c.course_id
    )
);
use sidb;
SELECT avg(timestampdiff(year, date_of_birth, curdate())) AS average_age
FROM Students;
-- students who have done more than one payment
SELECT s.first_name, s.last_name
FROM Students s
JOIN Payments p ON s.student_id = p.student_id
GROUP BY s.student_id
HAVING COUNT(p.payment_id) > 1;  -- no students





