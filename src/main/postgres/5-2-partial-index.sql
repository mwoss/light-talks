-- We can also create index on just some subset of data, to minimize overhead and memory usage.

SELECT *
FROM certificate_entry
WHERE position_x > 20 AND position_y > 50;

CREATE INDEX partial_index ON certificate_entry(position_x) WHERE position_y > 0
