/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50710
Source Host           : localhost:3306
Source Database       : db_employeeinfo

Target Server Type    : MYSQL
Target Server Version : 50710
File Encoding         : 65001

Date: 2017-02-08 16:51:38
*/

CREATE DATABASE db_employeeinfo;
USE db_employeeinfo;
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tb_employer`
-- ----------------------------
DROP TABLE IF EXISTS `tb_employer`;
CREATE TABLE `tb_employer` (
  `name` varchar(30) NOT NULL,
  `sex` varchar(30) NOT NULL,
  `age` int(30) NOT NULL,
  `dept` varchar(30) NOT NULL,
  `phone` varchar(30) NOT NULL,
  `remark` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_employer
-- ----------------------------
INSERT INTO `tb_employer` VALUES ('张三', '男', '20', '后勤保障部', '13078931129', '员工');
INSERT INTO `tb_employer` VALUES ('王丽', '女', '28', '网站运营部', '13894658872', '主管');
