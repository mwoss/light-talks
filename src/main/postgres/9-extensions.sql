-- Do you know Postgres supports extensions / plugins? Thanks to that Postgres can do a lot lot more things than you thought it can do.
-- There are thousands of extensions that may help with analyzing data flow, find performance issues, or even changing Postgres from simple relation db to time series db.

-- https://github.com/dhamaniasad/awesome-postgres
-- https://docs.aws.amazon.com/AmazonRDS/latest/PostgreSQLReleaseNotes/postgresql-extensions.html

---- EXAMPLES ----

-- How many taxis pick up rides within 400m of Times Square on New Years Day, grouped by 30 minute buckets.
-- Note: Times Square is at (lat, long) (40.7589,-73.9851)

SELECT time_bucket('30 minutes', pickup_datetime) AS thirty_min, COUNT(*) AS near_times_sq
FROM rides
WHERE ST_Distance(pickup_geom, ST_Transform(ST_SetSRID(ST_MakePoint(-73.9851,40.7589),4326),2163)) < 400
  AND pickup_datetime < '2016-01-01 14:00'
GROUP BY thirty_min ORDER BY thirty_min
LIMIT 5;

-- -[ RECORD 1 ]-+--------------------
-- thirty_min    | 2016-01-01 00:00:00
-- near_times_sq | 74
-- -[ RECORD 2 ]-+--------------------
-- thirty_min    | 2016-01-01 00:30:00
-- near_times_sq | 102
-- -[ RECORD 3 ]-+--------------------
-- thirty_min    | 2016-01-01 01:00:00
-- near_times_sq | 120
-- -[ RECORD 4 ]-+--------------------
-- thirty_min    | 2016-01-01 01:30:00
-- near_times_sq | 98
-- -[ RECORD 5 ]-+--------------------
-- thirty_min    | 2016-01-01 02:00:00
-- near_times_sq | 112


SELECT * FROM products WHERE products ==> 'sports box';

-- -[ RECORD 1 ]-----+------------------------------------------------------------------------------------
-- id                | 2
-- name              | Baseball
-- keywords          | {baseball,sports,round}
-- short_summary     | It's a baseball
-- long_description  | Throw it at a person with a big wooden stick and hope they don't hit it
-- price             | 1249
-- inventory_count   | 2
-- discontinued      | f
-- availability_date | 2015-08-21
-- -[ RECORD 2 ]-----+------------------------------------------------------------------------------------
-- id                | 4
-- name              | Box
-- keywords          | {wooden,box,"negative space",square}
-- short_summary     | Just an empty box made of wood
-- long_description  | A wooden container that will eventually rot away.  Put stuff it in (but not a cat).
-- price             | 17000
-- inventory_count   | 0
-- discontinued      | t
-- availability_date | 2015-07-01
