drop table if exists Products_TB;

CREATE TABLE Products_TB (
    id   INTEGER NOT NULL AUTO_INCREMENT,
    category VARCHAR(400) NOT NULL,
    company VARCHAR(400) NOT NULL,
    product VARCHAR(400) NOT NULL,
    color VARCHAR(400) NOT NULL,
    price INTEGER NOT NULL,
	quantity INTEGER NOT NULL,
    addedDate DATE,
    PRIMARY KEY (id)
);
