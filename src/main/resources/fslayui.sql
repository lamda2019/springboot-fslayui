/*
SQLyog Ultimate v11.33 (64 bit)
MySQL - 5.7.17 : Database - fslayui
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

/*Table structure for table `province` */

DROP TABLE IF EXISTS `province`;

CREATE TABLE `province` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8;

/*Data for the table `province` */

insert  into `province`(`id`,`name`) values (1,'北京'),(2,'安徽'),(3,'福建'),(4,'甘肃'),(5,'广东'),(6,'广西'),(7,'贵州'),(8,'海南'),(9,'河北'),(10,'河南'),(11,'黑龙江'),(12,'湖北'),(13,'湖南'),(14,'吉林'),(15,'江苏'),(16,'江西'),(17,'辽宁'),(18,'内蒙古'),(19,'宁夏'),(20,'青海'),(21,'山东'),(22,'山西'),(23,'陕西'),(24,'上海'),(25,'四川'),(26,'天津'),(27,'西藏'),(28,'新疆'),(29,'云南'),(30,'浙江'),(31,'重庆'),(32,'香港'),(33,'澳门'),(34,'台湾'),(35,'海外');

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

insert  into `t_user`(`ID`,`CITY`,`CREATEDTIME`,`DESCRIPTION`,`FILEPATH`,`TYPE`,`SEX`,`NAME`,`STATE`,`AREA1`,`AREA2`,`AREA3`) values (1,'5','2019-05-13','www','www','write','男','ww','1','2','3','4'),(2,'1','2019-05-13','5','6','read','男','7','2','3','5','6'),(3,'2','2019-05-13','4','7','write','女','7','2','3','5','6'),(4,'1','2019-05-13','3','8','write','女','7','2','3','5','6'),(5,'1','2019-05-13','4','9','write','女','7','2','3','4','6'),(6,'1','2019-05-13','2','90','write','女','7','2','3','4','6'),(7,'2','2019-05-13','1','0','write','女','7','1','3','22','6');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
