CREATE TABLE dropdown_data (
	id serial PRIMARY KEY,
	field_name VARCHAR,
	field_key VARCHAR,
	field_value VARCHAR,
	is_active VARCHAR
);

INSERT INTO dropdown_data (field_name, field_key, field_value, is_active) values
('bank', 'SCB', 'SCB', 'y'),
('bank', 'SBI', 'SBI', 'y'),
('bank', 'KMB', 'KMB', 'y'),
('bank', 'JPM', 'JPM', 'y'),
('bank', 'CITI', 'CITI', 'y'),

('branch', 'HYD', 'HYD', 'y'),
('branch', 'DEL', 'DEL', 'y'),
('branch', 'BLR', 'BLR', 'y'),
('branch', 'NY', 'NY', 'y'),
('branch', 'NJ', 'NJ', 'y'),
('branch', 'WG', 'WG', 'y'),

('inquiry_id', 'SCBIN11', 'SCBIN11', 'y'),
('inquiry_id', 'SBIIN12', 'SBIIN12', 'y'),
('inquiry_id', 'KMBIN13', 'KMBIN13', 'y'),
('inquiry_id', 'JPMUS11', 'JPMUS11', 'y'),
('inquiry_id', 'CITIUS33', 'CITIUS33', 'y'),

('assign_to', 'PIOFFICER1', 'PIOFFICER1', 'y'),
('assign_to', 'PIOFFICER2', 'PIOFFICER2', 'y'),
('assign_to', 'PIOFFICER3', 'PIOFFICER3', 'y'),

('status', 'Open', 'Open', 'y'),
('status', 'Closed', 'Closed', 'y'),

('investigation_type', 'TRACE', 'TRACE', 'y'),
('investigation_type', 'INVESTIGATE', 'INVESTIGATE', 'y'),

('priority', 'High', 'High', 'y'),
('priority', 'Low', 'Low', 'y'),
('priority', 'Medium', 'Medium', 'y'),

('eq_currency', 'INR', 'INR', 'y'),
('eq_currency', 'USD', 'USD', 'y'),

('currency', 'INR', 'INR', 'y'),
('currency', 'USD', 'USD', 'y'),

('default_currency', 'INR', 'INR', 'y'),
('default_currency', 'USD', 'USD', 'y'),

('instructed_currency', 'INR', 'INR', 'y'),
('instructed_currency', 'USD', 'USD', 'y'),

('receiving_inst_id', 'SCBIN11', 'SCBIN11', 'y'),
('receiving_inst_id', 'SBIIN12', 'SBIIN12', 'y'),
('receiving_inst_id', 'KMBIN13', 'KMBIN13', 'y'),
('receiving_inst_id', 'JPMUS11', 'JPMUS11', 'y'),
('receiving_inst_id', 'CITIUS33', 'CITIUS33', 'y'),

('receiving_inst_type', 'SWIFT', 'SWIFT', 'y'),
('receiving_inst_type', 'EMAIL', 'EMAIL', 'y'),

('sending_inst_address', 'SCBIN11', 'SCBIN11', 'y'),
('sending_inst_address', 'SBIIN12', 'SBIIN12', 'y'),
('sending_inst_address', 'KMBIN13', 'KMBIN13', 'y'),
('sending_inst_address', 'JPMUS11', 'JPMUS11', 'y'),
('sending_inst_address', 'CITIUS33', 'CITIUS33', 'y'),

('sending_inst_id', 'SCBIN11', 'SCBIN11', 'y'),
('sending_inst_id', 'SBIIN12', 'SBIIN12', 'y'),
('sending_inst_id', 'KMBIN13', 'KMBIN13', 'y'),
('sending_inst_id', 'JPMUS11', 'JPMUS11', 'y'),
('sending_inst_id', 'CITIUS33', 'CITIUS33', 'y'),

('sending_inst_type', 'SWIFT', 'SWIFT', 'y'),
('sending_inst_type', 'EMAIL', 'EMAIL', 'y')

;