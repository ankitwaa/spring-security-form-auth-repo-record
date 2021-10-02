-- Postgres Query for Creating users table.

CREATE TABLE IF NOT EXISTS users (
id bigserial primary key,
username VARCHAR(45) NOT NULL,
password VARCHAR(45) NOT NULL,
account_not_expired INT,
account_not_locked INT,
credentials_not_locked INT,
enabled INT NOT NULL
);

CREATE TABLE IF NOT EXISTS authorities (
id bigserial primary key,
username VARCHAR(45) NOT NULL,
authority VARCHAR(45) NOT NULL
);

CREATE TABLE IF NOT EXISTS git_repo (
    id bigserial primary key,
    username VARCHAR(45) NOT NULL,
    subject VARCHAR(200) NOT NULL,
    topic VARCHAR(200) NOT NULL,
    description VARCHAR(400) NOT NULL,
    git_repo_url VARCHAR(500) not null
)