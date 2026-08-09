-- Regex (Regular Expression) is a pattern used to search or match text.
-- Use the (?-i:) inline regex modifier to force case-sensitive matching only where needed.
SELECT *
FROM Users
WHERE mail REGEXP  '^[a-zA-Z][a-zA-Z0-9_.-]*@(?-i:leetcode[.]com)$';