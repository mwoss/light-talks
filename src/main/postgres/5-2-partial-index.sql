-- We can also create index on just some subset of data, to minimize overhead and memory usage.

SELECT *
FROM certificate_entry
WHERE position_x > 20 AND position_y > 50;

CREATE INDEX partial_index ON certificate_entry(position_x) WHERE position_y > 0;

----------------------------

SELECT *
FROM ten99_policy_quote
WHERE gl_net_rate > 0 AND wc_net_rate > 500;

CREATE INDEX partial_index ON ten99_policy_quote(wc_net_rate) WHERE wc_net_rate > 500;


