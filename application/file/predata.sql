CREATE DATABASE IF NOT EXISTS `hotel_db`;
-- ------------------------------------------------
USE `hotel_db`;
-- ------------------------------------------------
CREATE TABLE IF NOT EXISTS `address`
(
    `addressline` varchar(255) DEFAULT NULL,
    `city`        varchar(255) DEFAULT NULL,
    `country`     varchar(255) DEFAULT NULL,
    `state`       varchar(255) DEFAULT NULL,
    `zip`         varchar(255) DEFAULT NULL,
    `person_id`   int(11) NOT NULL,
    PRIMARY KEY (`person_id`)
);

CREATE TABLE IF NOT EXISTS `personal_info`
(
    `id`          int(11) NOT NULL AUTO_INCREMENT,
    `create_date` date         DEFAULT NULL,
    `first_name`  varchar(255) DEFAULT NULL,
    `last_name`   varchar(255) DEFAULT NULL,
    `mid_name`    varchar(255) DEFAULT NULL,
    `phone`       varchar(255) DEFAULT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `role`
(
    `id`   int(11) NOT NULL AUTO_INCREMENT,
    `role` varchar(255) DEFAULT NULL,
    PRIMARY KEY (`id`)
);
-- ------------------------------------------------
insert into `role` (`role`) values ('admin');
insert into `role` (`role`) values ('manager');
insert into `role` (`role`) values ('staff');
insert into `role` (`role`) values ('customer');
-- ------------------------------------------------

CREATE TABLE IF NOT EXISTS `account`
(
    `id`            int(11) NOT NULL AUTO_INCREMENT,
    `created_date`  date         DEFAULT NULL,
    `email_address` varchar(255) DEFAULT NULL,
    `password`      varchar(255) DEFAULT NULL,
    `reward`        int(11)      DEFAULT NULL,
    `user_name`     varchar(255) DEFAULT NULL,
    `info_id`       int(11)      DEFAULT NULL,
    PRIMARY KEY (`id`),
    KEY `FKg85whftqjyd6kilnwbej9f6yn` (`info_id`)
);
-- ------------------------------------------------

CREATE TABLE IF NOT EXISTS `account_roll`
(
    `account_id` int(11) NOT NULL,
    `roll_id`    int(11) NOT NULL,
    PRIMARY KEY (`account_id`, `roll_id`),
    KEY `FKq3c9y6yyqlw790l9kt0yg63qu` (`roll_id`)
);
-- ------------------------------------------------

-- ------------------------------------------------

CREATE TABLE IF NOT EXISTS `roomstatus`
(
    `id`         int(11) NOT NULL AUTO_INCREMENT,
    `roomstatus` varchar(255) DEFAULT NULL,
    PRIMARY KEY (`id`)
);
-- ------------------------------------------------
insert into `roomstatus` (`roomstatus`) values ('Available');
insert into `roomstatus` (`roomstatus`) values ('Hold');
insert into `roomstatus` (`roomstatus`) values ('Reserved');
insert into `roomstatus` (`roomstatus`) values ('Maintenance');
-- ------------------------------------------------
-- ------------------------------------------------
CREATE TABLE IF NOT EXISTS `roomtype`
(
    `id`       int(11) NOT NULL AUTO_INCREMENT,
    `roomtype` varchar(255) DEFAULT NULL,
    PRIMARY KEY (`id`)
);
-- ------------------------------------------------

insert into `roomtype` (`roomtype`) values ('Standard');
insert into `roomtype` (`roomtype`) values ('Suits');

-- ------------------------------------------------

CREATE TABLE IF NOT EXISTS `bedtype`
(
    `id`       int(11) NOT NULL AUTO_INCREMENT,
    `bed_type` varchar(255) DEFAULT NULL,
    PRIMARY KEY (`id`)
);

-- ------------------------------------------------
insert into `bedtype` (`bed_type`) values ('Standard');
insert into `bedtype` (`bed_type`) values ('Suits');

-- ------------------------------------------------
CREATE TABLE IF NOT EXISTS `room`
(
    `id`          int(11) NOT NULL AUTO_INCREMENT,
    `area`        double  DEFAULT NULL,
    `price`       double  DEFAULT NULL,
    `room_number` int(11) DEFAULT NULL,
    `bed_type`    int(11) DEFAULT NULL,
    `room_status` int(11) DEFAULT NULL,
    `room_type`   int(11) DEFAULT NULL,
    PRIMARY KEY (`id`),
    KEY `FKopoh737v0pesmlxjo8mv9jquc` (`bed_type`),
    KEY `FK14799oo6qgkw1f2o5rgwer530` (`room_status`),
    KEY `FK16h4y8oquyc349by2rgmg73lq` (`room_type`)
);
-- ------------------------------------------------

