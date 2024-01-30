REM pizza.bat
REM D. Singletary
REM 1/26/24
REM connects to psql to execute db commands via a script

@echo off
SET PGPASSWORD=postgres
@echo on
C:\"Program Files"\PostgreSQL\16\bin\psql -U postgres -a -f "pizza_create.sql"
C:\"Program Files"\PostgreSQL\16\bin\psql -U postgres -d "PizzaRestaurant" -a -f "pizza.sql"
C:\"Program Files"\PostgreSQL\16\bin\psql -U postgres -a -f "pizza_drop.sql"