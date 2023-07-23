-- Your index has become corrupted? It was incorrectly build due to some concurrency race conditions?
-- It's bloated and contains many empty and really empty pages due to million of modification that happened on it?
-- REINDEX for the help. Recreate index using single command.

REINDEX INDEX some_index;
