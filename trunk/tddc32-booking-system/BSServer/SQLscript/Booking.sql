CREATE  TABLE `remgu983`.`LaundryUsers` (
  `ID` INT NOT NULL AUTO_INCREMENT ,
  `UserName` VARCHAR(45) NOT NULL ,
  `PassWord` VARCHAR(45) NOT NULL ,
  PRIMARY KEY (`ID`) );
	
INSERT INTO remgu983.`LaundryUsers` (`UserName`, `PassWord`) VALUES ('Troll', 'test');
INSERT INTO remgu983.`LaundryUsers` (`UserName`, `PassWord`) VALUES ('Doc', 'test2');