CREATE TABLE correspondence (
	id serial PRIMARY KEY,
	casebook VARCHAR,
	correspondence_type VARCHAR,
	inbound_outbound VARCHAR,
	message VARCHAR
);