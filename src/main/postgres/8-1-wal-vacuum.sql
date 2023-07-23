-- Do you know by default Postgres logs everything that happened on the database?
-- This feature is called write ahead log (WAL). Before anything happened directly in database it's logged so in case of crash Postgres may recover lost data.
-- It's useful, but it comes with the cost - memory and write speed.
-- It's usefully to know that such things exits and sometimes we have to clean that mess to tide up our database.

-- To clean up the garbage Postgres run auto vacuum operation, but it does not clean up all the mess.
-- From time to time we have to get hands dirty and use VACUMM command manually.

VACUUM (VERBOSE, ANALYZE) program;

-- VACUUM reclaims storage occupied by dead tuples.
-- By default, tuples that are deleted or obsoleted by an update are not physically removed from their table; they remain present until a VACUUM is done.
