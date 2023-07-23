-- Do you know Postgres supports pub/sub notifications natively? It's like Kafka, but much worse :33
-- In most cases it's enough. Simple notification. Not persistable, not reliable, does not support retries, but it works xD

CREATE OR REPLACE FUNCTION public.get_work()
    RETURNS bigint
    LANGUAGE sql
AS
$$
SELECT CASE WHEN random() >= 0.2 THEN int8 '1' END
$$;

NOTIFY "getwork", '{"userid":XD123,"action":"back_to_the_office"}';
