-- This command displays the execution plan that the Postgres planner generates for the supplied statement.

-- EXPLAIN [ ( option [, ...] ) ] statement
-- https://www.postgresql.org/docs/current/sql-explain.html

EXPLAIN ANALYSE SELECT *
FROM program p
LEFT JOIN recognition_subject rs ON p.id = rs.program_id
LEFT JOIN recognition_subject_details rsd ON rs.id = rsd.recognition_subject_id
WHERE rs.id = 'RE_6jeohVZw1vZ1yp3';
