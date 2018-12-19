-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema carsandenginesdb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `carsandenginesdb` ;

-- -----------------------------------------------------
-- Schema carsandenginesdb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `carsandenginesdb` DEFAULT CHARACTER SET utf8 ;
USE `carsandenginesdb` ;

-- -----------------------------------------------------
-- Table `car`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `car` ;

CREATE TABLE IF NOT EXISTS `car` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `model` VARCHAR(45) NULL,
  `make` VARCHAR(45) NULL,
  `year` VARCHAR(45) NULL,
  `trim` VARCHAR(45) NULL,
  `doors` VARCHAR(45) NULL,
  `engine` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SET SQL_MODE = '';
DROP USER IF EXISTS carwrangler@localhost;
SET SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
CREATE USER 'carwrangler'@'localhost' IDENTIFIED BY 'toyota';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'carwrangler'@'localhost';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `car`
-- -----------------------------------------------------
START TRANSACTION;
USE `carsandenginesdb`;
INSERT INTO `car` (`id`, `model`, `make`, `year`, `trim`, `doors`, `engine`) VALUES (1, 'Corolla', 'Toyota', '2005', 'XRS', '4', '2ZZ-GE');
INSERT INTO `car` (`id`, `model`, `make`, `year`, `trim`, `doors`, `engine`) VALUES (2, 'MR2', 'Toyota', '1986', NULL, '2', NULL);
INSERT INTO `car` (`id`, `model`, `make`, `year`, `trim`, `doors`, `engine`) VALUES (3, 'S2000', 'Honda', '2008', NULL, '2', NULL);
INSERT INTO `car` (`id`, `model`, `make`, `year`, `trim`, `doors`, `engine`) VALUES (4, 'Celica', 'Toyota', '1985', 'GTS', NULL, NULL);

COMMIT;

