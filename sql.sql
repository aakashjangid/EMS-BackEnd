/*
SQLyog Ultimate v10.00 Beta1
MySQL - 5.5.27 : Database - ems_db
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ems_db` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `ems_db`;

/*Table structure for table `parameters` */

DROP TABLE IF EXISTS `parameters`;

CREATE TABLE `parameters` (
  `parameterId` int(11) NOT NULL AUTO_INCREMENT,
  `label` varchar(255) NOT NULL,
  `acronym` varchar(20) DEFAULT NULL,
  `type` varchar(10) NOT NULL DEFAULT 'analog',
  `measuringUnit` varchar(20) NOT NULL,
  `highValue` varchar(10) DEFAULT NULL,
  `lowValue` varchar(10) DEFAULT NULL,
  `highFault` varchar(10) DEFAULT NULL,
  `lowFault` varchar(10) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `siteId` int(11) NOT NULL,
  PRIMARY KEY (`parameterId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `parameters` */

insert  into `parameters`(`parameterId`,`label`,`acronym`,`type`,`measuringUnit`,`highValue`,`lowValue`,`highFault`,`lowFault`,`address`,`siteId`) values (1,'Current','cu','digital','ampere','10','0','20','-10','Indore',1),(2,'Voltage','V','analog','volts','10','0','20','12','Indore',1),(3,'Current','Cu','analog','Ampere','10','0','12','2','Indore',2),(4,'Voltage','V','analog','Volts','10','0','12','2','Indore',2);

/*Table structure for table `sites` */

DROP TABLE IF EXISTS `sites`;

CREATE TABLE `sites` (
  `siteId` int(11) NOT NULL AUTO_INCREMENT,
  `siteName` varchar(255) NOT NULL,
  `postURL` varchar(255) DEFAULT NULL,
  `schemaURL` varchar(255) DEFAULT NULL,
  `deviceName` varchar(255) DEFAULT NULL,
  `deviceManuf` varchar(255) DEFAULT NULL,
  `deviceModel` varchar(255) DEFAULT NULL,
  `deviceAddress` varchar(255) DEFAULT NULL,
  `userId` int(10) NOT NULL,
  PRIMARY KEY (`siteId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `sites` */

insert  into `sites`(`siteId`,`siteName`,`postURL`,`schemaURL`,`deviceName`,`deviceManuf`,`deviceModel`,`deviceAddress`,`userId`) values (1,'Site 1','Dummy Post URL','Dummy Schema URL','Master','Yash','Yash123','Indore',1),(2,'Indore Site','Dummy Post URL','Dummy Schema URL','Master','Yash','Yash123','Indore',1);

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `orgName` varchar(255) NOT NULL,
  `contact` varchar(13) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `status` int(2) NOT NULL DEFAULT '0',
  `role` int(11) NOT NULL DEFAULT '0',
  `regDate` date NOT NULL,
  `regTime` time NOT NULL,
  `userImage` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `users` */

insert  into `users`(`id`,`name`,`orgName`,`contact`,`email`,`password`,`status`,`role`,`regDate`,`regTime`,`userImage`) values (1,'Akhilesh Chaurasia','Tech Mahindra','7533083299','akhilesh@gmail.com','123',0,0,'2018-11-03','23:22:36',NULL),(2,'Vijay Saini','Microtronik Systems','9810645737','vijaysaini@gmail.com','123',1,1,'2018-11-03','23:23:54',NULL),(3,'C & S','C & S','9718387460','mohit@microtronik.co.in','123',1,0,'2018-11-03','23:24:44',NULL),(4,'Grundfos Test Site','Microtronik Systems','9718387460','tkumar@grundfos.com','123',0,0,'2018-11-03','23:25:45',NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
