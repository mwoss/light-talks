-- Bonus!
-- Do you know COUNT(*) is one of the most resource consuming operation that we can do on relational database?
-- It may kill your database if you operate on huge dataset.
-- So does big values use different tech to for example count how many likes this popular video/photo has?

CREATE TABLE random_table
(
    col1 text,
    col2 text,
    col3 text,
    col4 text
);

INSERT INTO random_table (col1, col2, col3, col4)
SELECT LEFT(md5(i:: text), 10),
       md5(random():: text),
       md5(random():: text),
       LEFT(md5(random():: text), 4)
FROM generate_series(1, 185813511) s(i);

-- Database sis on fire, it's burning like B1 server in Provo basement.
SELECT COUNT(*)
FROM random_table;

-- Bam, we got approximation in matter of milliseconds.
EXPLAIN SELECT * FROM random_table
