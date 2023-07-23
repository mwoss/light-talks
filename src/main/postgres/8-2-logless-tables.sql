-- WAL is cool. It make Postgres reliable, something that is required in production services as we don't want to lose user data at any cost.
-- But in some rare cases we don't need that, and all we need is performance. So, could we turn WAL off?

-- Yes, we can :3 It can be turn it off completely or just for specific tables. We are losing reliability, but
-- performance benefits range from 10% to more than 90% (depending on disk, system, etc)

-- Usage cases when logless tables are useful:
-- * Large data sets that take a lot of time to import and are used rarely
-- * Dynamic data that you can afford losing, such as user sessions.
-- * Static data that you can afford losing and re-importing in the unlikely event of a server crash.



CREATE UNLOGGED TABLE "USD/BTC"
(
    dt timestamp without time zone NOT NULL,
    bid numeric NOT NULL,
    ask numeric NOT NULL,
    bid_vol numeric,
    ask_vol numeric,
    CONSTRAINT "EUR/USD_ticks_pkey" PRIMARY KEY (dt)
);

ALTER TABLE random_table SET UNLOGGED
