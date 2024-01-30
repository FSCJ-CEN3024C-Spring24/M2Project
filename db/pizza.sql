-- database must be pre-configured and connected in postgreSQL
-- Create a table named 'pizza'
CREATE TABLE pizza (
    "pizzaId" SERIAL PRIMARY KEY,
    "flavor" VARCHAR(80) NOT NULL,
    "size" VARCHAR(40),
    "price" DECIMAL(5, 2) NOT NULL,
    "createdAt" TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    "updatedAt" TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Insert some initial data
INSERT INTO pizza ("flavor", "size", "price") VALUES ('Cheese', 'Medium', 10.99);
INSERT INTO pizza ("flavor", "size", "price") VALUES ('Pepperoni', 'Large', 12.99);
SELECT * FROM pizza;
