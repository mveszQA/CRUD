DROP TABLE `meal`;

CREATE TABLE meal(
	id BIGINT PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(255),
	type VARCHAR(255),
	day VARCHAR(255)
);