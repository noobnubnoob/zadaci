CREATE DATABASE  IF NOT EXISTS `account_directory`;
USE `account_directory`;

--
-- Table structure for table `account`
--

DROP TABLE IF EXISTS `racun`;

CREATE TABLE `student` (
	`racun_id` int NOT NULL AUTO_INCREMENT,
	`iban` varchar(20),
	`tip_racuna` integer,
	`valuta` varchar(3),
	`klijent_id` integer,
	`datum_otvaranja` date,
	`datum_zatvaranja` date DEFAULT NULL,
  PRIMARY KEY (`racun_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

