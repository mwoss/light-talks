-- In some specific cases you want to have control how data is stored physically on the machine.
-- Probably when you want to leverage disk performance capabilities of sequential reads.
-- We can sort data directly on the disk using CLUSTER command.

CLUSTER program USING program_pkey

-- This will create a temporary table (including all existing indexes and this new one). but it may be worth it in some cases.
