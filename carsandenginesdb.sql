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
-- Table `engine`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `engine` ;

CREATE TABLE IF NOT EXISTS `engine` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `cylinders` INT NULL,
  `displacement` VARCHAR(45) NULL,
  `configuration` VARCHAR(45) NULL,
  `name` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


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
  `weight` INT NULL,
  `horsepower` INT NULL,
  `torque` INT NULL,
  `0to60` VARCHAR(45) NULL,
  `engine_id` INT NULL,
  `engine` VARCHAR(45) NULL COMMENT 'Placement\n',
  PRIMARY KEY (`id`),
  INDEX `fk_car_engine_idx` (`engine_id` ASC),
  CONSTRAINT `fk_car_engine`
    FOREIGN KEY (`engine_id`)
    REFERENCES `engine` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SET SQL_MODE = '';
DROP USER IF EXISTS carwrangler@localhost;
SET SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
CREATE USER 'carwrangler'@'localhost' IDENTIFIED BY 'toyota';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'carwrangler'@'localhost';
SET SQL_MODE = '';
DROP USER IF EXISTS caradmin@localhost;
SET SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
CREATE USER 'caradmin'@'localhost' IDENTIFIED BY 'accesscode5301';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'caradmin'@'localhost';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `car`
-- -----------------------------------------------------
START TRANSACTION;
USE `carsandenginesdb`;
INSERT INTO `car` (`id`, `model`, `make`, `year`, `trim`, `doors`, `weight`, `horsepower`, `torque`, `0to60`, `engine_id`, `engine`) VALUES (1, 'Corolla', 'Toyota', '2005', 'XRS', '4', 2670, 170, 130, '7.0', NULL, NULL);
INSERT INTO `car` (`id`, `model`, `make`, `year`, `trim`, `doors`, `weight`, `horsepower`, `torque`, `0to60`, `engine_id`, `engine`) VALUES (2, 'MR2', 'Toyota', '1986', 'Base', '2', 2282, 112, 97, '8.3', NULL, NULL);
INSERT INTO `car` (`id`, `model`, `make`, `year`, `trim`, `doors`, `weight`, `horsepower`, `torque`, `0to60`, `engine_id`, `engine`) VALUES (3, 'S2000', 'Honda', '2008', 'Base', '2', 2809, 237, 162, '5.7', NULL, NULL);
INSERT INTO `car` (`id`, `model`, `make`, `year`, `trim`, `doors`, `weight`, `horsepower`, `torque`, `0to60`, `engine_id`, `engine`) VALUES (4, 'Celica', 'Toyota', '1985', 'GTS', '2', 2705, 105, 136, '11.6', NULL, NULL);

COMMIT;

