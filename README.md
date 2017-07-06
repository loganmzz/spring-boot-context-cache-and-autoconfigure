# Spring Boot : Application context test cache and AutoConfigure* annotations

It seems adding AutoConfigure makes Spring build a new application context for each test package while there's nothing new.

Run tests and see in stdout, the association application context identity codes used by each test.
