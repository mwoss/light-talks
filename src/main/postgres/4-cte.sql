-- Common table expression (CTE) is a temporary result set which you can reference within another SQL statement.
-- CTEs only exists during query execution. They can be used to simplify complex queries.

WITH idp_subjects AS (
    SELECT *
    FROM recognition_subject rs
    JOIN recognition_subject_details rsd ON rs.id = rsd.recognition_subject_id
    WHERE rsd.field_id LIKE '0%'
)
SELECT p.id, idp.id as subject_id, idp.external_id, idp.field_id
FROM program p
JOIN idp_subjects idp ON p.id = idp.program_id;
