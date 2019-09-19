/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80013
 Source Host           : localhost:3306
 Source Schema         : iwps

 Target Server Type    : MySQL
 Target Server Version : 80013
 File Encoding         : 65001

 Date: 19/09/2019 12:09:50
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for administrators
-- ----------------------------
DROP TABLE IF EXISTS `administrators`;
CREATE TABLE `administrators`  (
  `administratorId` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `administratorAccount` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `avatar` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `detail` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `swimmingPoolId` int(20) NOT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`administratorId`) USING BTREE,
  UNIQUE INDEX `administratorAccount`(`administratorAccount`) USING BTREE,
  INDEX `ad_sp`(`swimmingPoolId`) USING BTREE,
  CONSTRAINT `ad_sp` FOREIGN KEY (`swimmingPoolId`) REFERENCES `swimmingpool` (`swimmingpoolid`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of administrators
-- ----------------------------
INSERT INTO `administrators` VALUES (1, 'test', 'nuc', 'null', '测试', 1, '123456');

-- ----------------------------
-- Table structure for lifeguard
-- ----------------------------
DROP TABLE IF EXISTS `lifeguard`;
CREATE TABLE `lifeguard`  (
  `lifeguardId` int(11) NOT NULL AUTO_INCREMENT,
  `lifeguardAccount` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `avatar` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `detail` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `swimmingPoolId` int(11) NOT NULL,
  `phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`lifeguardId`) USING BTREE,
  UNIQUE INDEX `lifeguardAccount`(`lifeguardAccount`) USING BTREE,
  INDEX `lg_sp`(`swimmingPoolId`) USING BTREE,
  CONSTRAINT `lg_sp` FOREIGN KEY (`swimmingPoolId`) REFERENCES `swimmingpool` (`swimmingpoolid`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of lifeguard
-- ----------------------------
INSERT INTO `lifeguard` VALUES (1, '1号', '猜猜', '123456', 'null', '测试', 1, '111111');
INSERT INTO `lifeguard` VALUES (2, 'q', 'q', 'q', 'ssss', 'q', 1, NULL);

-- ----------------------------
-- Table structure for natatorium
-- ----------------------------
DROP TABLE IF EXISTS `natatorium`;
CREATE TABLE `natatorium`  (
  `natatoriumId` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `waterLevel` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `swimmingPoolId` int(11) NOT NULL,
  `detail` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`natatoriumId`) USING BTREE,
  INDEX `na_sp`(`swimmingPoolId`) USING BTREE,
  INDEX `natatoriumId`(`natatoriumId`) USING BTREE,
  INDEX `natatoriumId_2`(`natatoriumId`) USING BTREE,
  CONSTRAINT `na_sp` FOREIGN KEY (`swimmingPoolId`) REFERENCES `swimmingpool` (`swimmingpoolid`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of natatorium
-- ----------------------------
INSERT INTO `natatorium` VALUES (1, '1', '1', 1, '测试');
INSERT INTO `natatorium` VALUES (2, '2', '2', 1, '测试2');

-- ----------------------------
-- Table structure for natatoriumhistory
-- ----------------------------
DROP TABLE IF EXISTS `natatoriumhistory`;
CREATE TABLE `natatoriumhistory`  (
  `natatoriumDataId` int(11) NOT NULL AUTO_INCREMENT,
  `natatoriumId` int(11) NOT NULL,
  `sensorId` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `airHumidity` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `waterTemperature` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `numberOfPools` int(11) NULL DEFAULT NULL,
  `time` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`natatoriumDataId`) USING BTREE,
  INDEX `nh-na`(`natatoriumId`) USING BTREE,
  INDEX `sensorId`(`sensorId`) USING BTREE,
  CONSTRAINT `nh-na` FOREIGN KEY (`natatoriumId`) REFERENCES `natatorium` (`natatoriumid`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for superadministrator
-- ----------------------------
DROP TABLE IF EXISTS `superadministrator`;
CREATE TABLE `superadministrator`  (
  `superAdministratorId` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `superAdministratorAccount` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `avatar` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `detail` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`superAdministratorId`) USING BTREE,
  UNIQUE INDEX `superAdministratorAccount`(`superAdministratorAccount`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of superadministrator
-- ----------------------------
INSERT INTO `superadministrator` VALUES (1, '超级管理员', 'rootsp', '123456', 'null', '测试用');

-- ----------------------------
-- Table structure for swimmingpool
-- ----------------------------
DROP TABLE IF EXISTS `swimmingpool`;
CREATE TABLE `swimmingpool`  (
  `swimmingPoolId` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `detail` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`swimmingPoolId`) USING BTREE,
  INDEX `swimmingPoolId`(`swimmingPoolId`) USING BTREE,
  INDEX `swimmingPoolId_2`(`swimmingPoolId`) USING BTREE,
  INDEX `swimmingPoolId_3`(`swimmingPoolId`) USING BTREE,
  INDEX `swimmingPoolId_4`(`swimmingPoolId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of swimmingpool
-- ----------------------------
INSERT INTO `swimmingpool` VALUES (1, '中北游泳馆', '校内游泳馆', '中北大学', '10010001');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `userAccount` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `avatar` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `swimmingGrade` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `sex` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `detail` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `RFIDInfo` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`userId`) USING BTREE,
  UNIQUE INDEX `userAccount`(`userAccount`) USING BTREE,
  INDEX `userId`(`userId`) USING BTREE,
  INDEX `userId_2`(`userId`) USING BTREE,
  INDEX `userId_3`(`userId`) USING BTREE,
  INDEX `userId_4`(`userId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'root', '1', '123456', 'null', '1', '1@qq.com', '18248136766', '女', '测试', '111');
INSERT INTO `user` VALUES (2, '2eee', '22', '12', 'null', '2', '2@qq.com', '111111', '女', '测试', '123');
INSERT INTO `user` VALUES (3, 'q', 'qq', 'qq', 'ssss', 'q', NULL, NULL, 'qq', NULL, NULL);

-- ----------------------------
-- Table structure for userhistory
-- ----------------------------
DROP TABLE IF EXISTS `userhistory`;
CREATE TABLE `userhistory`  (
  `userDataId` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(11) NOT NULL,
  `sensorId` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `waterPressure` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `time` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `natatoriumSensorId` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `RFIDInfo` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`userDataId`) USING BTREE,
  INDEX `uh-u`(`userId`) USING BTREE,
  INDEX `uh-n`(`natatoriumSensorId`) USING BTREE,
  CONSTRAINT `uh-u` FOREIGN KEY (`userId`) REFERENCES `user` (`userid`) ON DELETE CASCADE ON UPDATE RESTRICT,
  CONSTRAINT `uh-n` FOREIGN KEY (`natatoriumSensorId`) REFERENCES `natatoriumhistory` (`sensorid`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
