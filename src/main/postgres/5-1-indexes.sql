-- B-Tree is the default index type in Postgres, but there are other types too.
-- Here's the entire built-in indexes: https://www.postgresql.org/docs/current/indexes-types.html

-- HASH INDEX
-- Similar to how map/dictionaries work.
-- They can only be compared with =, but they are extremely fast.
CREATE INDEX hash_index ON program USING HASH (id);

-- GIN INDEX (inverted index)
-- Useful for indexing complex data like arrays or JSONs. Support full text search queries.
CREATE INDEX gin_index ON vendor USING gin (custom_fields);

-- BRIN INDEX (block range)
-- Useful for linear values like dates. Using this index we can easily find items close to each other.
-- It stores min/max value of range.
CREATE INDEX brin_index ON document USING brin (created_at);

-- BLOOM INDEX
-- Helpful if we want to quickly validate if some specific data exists in database.
-- It uses bloom filter algo underneath so it's only an approximation, there's small change it will return false positive result.
CREATE INDEX bloom_index ON vendor USING bloom (id, email) WITH (length=80, col1=8, col2=8);




