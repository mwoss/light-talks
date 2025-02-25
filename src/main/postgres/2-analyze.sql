-- This command displays the execution plan that the Postgres planner generates for the supplied statement.

-- EXPLAIN [ ( option [, ...] ) ] statement
-- https://www.postgresql.org/docs/current/sql-explain.html

-- USEFUL OPTIONS: ANALYZE, BUFFERS, SETTINGS, WAL

EXPLAIN ANALYSE SELECT *
FROM program p
LEFT JOIN recognition_subject rs ON p.id = rs.program_id
LEFT JOIN recognition_subject_details rsd ON rs.id = rsd.recognition_subject_id
WHERE rs.id = 'RE_6jeohVZw1vZ1yp3';

EXPLAIN (ANALYZE, BUFFERS, SETTINGS) SELECT ow.*
FROM vendor v
LEFT JOIN onboardingworkflowsforvendor owv ON owv.vendor_id = vv.id
LEFT JOIN onboardingworkflow ow ON ow.id = owv.workflow_id
WHERE v.id =  4;


