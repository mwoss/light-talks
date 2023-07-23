-- To be more compliant with the SQL standard, Postgres (starting from version 10) introduced the syntax using generated as identity.
-- Underneath the implementation does not differ much from old, yet still perfectly working SERIAL type.

-- This new syntax allows is to prevent an accidental override of the value.

-- It's also easier to setup privileges as we don't have to care about granting USAGE privilege for underlying sequence.

CREATE TABLE t1
(
    id   serial PRIMARY key,
    name text
);
CREATE TABLE t2
(
    id   INTEGER PRIMARY key generated always AS IDENTITY,
    name text
);
-- OH :< The sequence was not advanced and it's out of the sync now.
INSERT INTO t1 (id, name) VALUES (1, 'lol');
INSERT INTO t1 (name) VALUES ('xd');
-- Immediate error. Now we cannot accidentally override sequence.
INSERT INTO t2 (id, name) VALUES (1, 'lol');

-- But if you need to override sequence, you still can do it, but now you will be aware of it.
INSERT INTO t2 (id, name) overriding SYSTEM VALUE VALUES (1, 'lol');
