# Spring Boot : Application context test cache and AutoConfigure* annotations

See [Spring context cache when using @AutoConfigure* annotations "breaks" on each test package #9694](https://github.com/spring-projects/spring-boot/issues/9694)

It seems adding AutoConfigure makes Spring build a new application context for each test package while there's nothing new.

Run tests and see in stdout, the association application context identity codes used by each test.
