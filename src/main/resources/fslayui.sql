/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.7.19 : Database - fslayui
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`fslayui` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `fslayui`;

/*Table structure for table `t_user` */

DROP TABLE IF EXISTS `t_user`;

CREATE TABLE `t_user` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `CITY` varchar(50) DEFAULT NULL,
  `CREATEDTIME` varchar(50) DEFAULT NULL,
  `DESCRIPTION` varchar(50) DEFAULT NULL,
  `FILEPATH` varchar(50) DEFAULT NULL,
  `TYPE` varchar(50) DEFAULT NULL,
  `SEX` varchar(50) DEFAULT NULL,
  `NAME` varchar(50) DEFAULT NULL,
  `STATE` varchar(50) DEFAULT NULL,
  `AREA1` varchar(50) DEFAULT NULL,
  `AREA2` varchar(50) DEFAULT NULL,
  `AREA3` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `t_user` */

insert  into `t_user`(`ID`,`CITY`,`CREATEDTIME`,`DESCRIPTION`,`FILEPATH`,`TYPE`,`SEX`,`NAME`,`STATE`,`AREA1`,`AREA2`,`AREA3`) values (1,'nanjing','2019-05-13','www','www','www','ww','ww','ww','ww','ww','ww'),(2,'beijing','2019-05-13','5','6','7','6','7','2','3','5','56'),(3,'shnaghao','2019-05-13','4','7','9','6','7','2','3','5','6'),(4,'hanghzou','2019-05-13','3','8','-','6','7','2','3','5','6'),(5,'shenhzen','2019-05-13','4','9','-','6','7','2','3','45','6'),(6,'suhozu','2019-05-13','2','90','-','6','7','2','3','4','6'),(7,'choengqing','2019-05-13','1','0','6','6','7','22','3','34','6');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
