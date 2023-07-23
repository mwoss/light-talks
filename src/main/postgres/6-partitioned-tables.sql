-- Starting from Postgres 10 we can natively shard/partition tables based on some partition key into multiple tables.
-- We can split some big tables into few smaller ones and distribute data onto multiple machines.

-- the parent table


CREATE TABLE invoices
(
    invoice_number int  NOT NULL,
    issued_on      date NOT NULL DEFAULT now()
) PARTITION BY RANGE (issued_on);

-- table for the month of May 2018
CREATE TABLE invoices_2018_05 PARTITION OF invoices
    FOR VALUES FROM ('2018-05-01') TO ('2018-06-01');

-- table for the month of June 2018
CREATE TABLE invoices_2018_06 PARTITION OF invoices
    FOR VALUES FROM ('2018-06-01') TO ('2018-07-01');
