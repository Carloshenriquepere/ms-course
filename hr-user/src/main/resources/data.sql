INSERT INTO  tb_user (name, email, password) VALUES ('Nina Brown', 'nina@gmail.com','$2a$10$5fjKybUF6sL0mGXlslUV1e/6SLa3BMJRt60cp8vrfcf9YIkTS.JHm');
INSERT INTO  tb_user (name, email, password) VALUES ('Leia Red', 'leia@gmail.com','$2a$10$5fjKybUF6sL0mGXlslUV1e/6SLa3BMJRt60cp8vrfcf9YIkTS.JHm');

INSERT INTO tb_role (role_name) VALUES ('ROLE_OPERADOR');
INSERT INTO tb_role (role_name) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1,1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2,1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2,2);