INSERT INTO authorities(username, authority) VALUES ('john', 'write');
INSERT INTO users(username, password, enabled) VALUES ('john', '12345', '1');
INSERT INTO authorities(username, authority) VALUES ('ankit', 'read');
INSERT INTO users(username, password, enabled) VALUES ('ankit', 'ankit', '1');

INSERT INTO git_repo(username, subject, topic, description, git_repo_url) values ('ankit', 'Spring', 'Spring Security', 'form authentication', 'asldfjkladf');
INSERT INTO git_repo(username, subject, topic, description, git_repo_url) values ('ankit', 'Spring', 'Spring Security', 'oath authentication', 'asldfjkladf');
INSERT INTO git_repo(username, subject, topic, description, git_repo_url) values ('ankit', 'Spring', 'Spring Security', 'basic auth authentication', 'asldfjkladf');
INSERT INTO git_repo(username, subject, topic, description, git_repo_url) values ('ankit', 'Spring', 'Spring Security', 'jdbc user details authentication', 'asldfjkladf');

commit;