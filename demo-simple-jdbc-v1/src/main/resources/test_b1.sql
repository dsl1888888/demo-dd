/*
 Navicat Premium Data Transfer

 Source Server         : 127.0.0.1
 Source Server Type    : MySQL
 Source Server Version : 50729
 Source Host           : 127.0.0.1:3306
 Source Schema         : test_db

 Target Server Type    : MySQL
 Target Server Version : 50729
 File Encoding         : 65001

 Date: 08/06/2021 14:26:16
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for test_b1
-- ----------------------------
DROP TABLE IF EXISTS `test_b1`;
CREATE TABLE `test_b1`  (
  `num` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 35 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of test_b1
-- ----------------------------
INSERT INTO `test_b1` VALUES ('1', 1);
INSERT INTO `test_b1` VALUES ('2', 2);
INSERT INTO `test_b1` VALUES ('3', 3);
INSERT INTO `test_b1` VALUES ('4', 4);
INSERT INTO `test_b1` VALUES ('5', 5);
INSERT INTO `test_b1` VALUES ('6', 6);
INSERT INTO `test_b1` VALUES ('7', 7);
INSERT INTO `test_b1` VALUES ('8', 8);
INSERT INTO `test_b1` VALUES ('9', 9);
INSERT INTO `test_b1` VALUES ('10', 10);
INSERT INTO `test_b1` VALUES ('11', 11);
INSERT INTO `test_b1` VALUES ('12', 12);
INSERT INTO `test_b1` VALUES ('13', 13);
INSERT INTO `test_b1` VALUES ('14', 14);
INSERT INTO `test_b1` VALUES ('15', 15);
INSERT INTO `test_b1` VALUES ('16', 16);
INSERT INTO `test_b1` VALUES ('17', 17);
INSERT INTO `test_b1` VALUES ('18', 18);
INSERT INTO `test_b1` VALUES ('19', 19);
INSERT INTO `test_b1` VALUES ('20', 20);
INSERT INTO `test_b1` VALUES ('21', 21);
INSERT INTO `test_b1` VALUES ('22', 22);
INSERT INTO `test_b1` VALUES ('23', 23);
INSERT INTO `test_b1` VALUES ('24', 24);
INSERT INTO `test_b1` VALUES ('25', 25);
INSERT INTO `test_b1` VALUES ('26', 26);
INSERT INTO `test_b1` VALUES ('27', 27);
INSERT INTO `test_b1` VALUES ('28', 28);
INSERT INTO `test_b1` VALUES ('29', 29);
INSERT INTO `test_b1` VALUES ('30', 30);
INSERT INTO `test_b1` VALUES ('31', 31);
INSERT INTO `test_b1` VALUES ('32', 32);
INSERT INTO `test_b1` VALUES ('33', 33);
INSERT INTO `test_b1` VALUES ('34', 34);

SET FOREIGN_KEY_CHECKS = 1;
