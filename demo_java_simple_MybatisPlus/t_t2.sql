/*
 Navicat Premium Data Transfer

 Source Server         : 8.210.212.227-DEV
 Source Server Type    : MySQL
 Source Server Version : 50738
 Source Host           : 8.210.212.227:3306
 Source Schema         : ry-vue

 Target Server Type    : MySQL
 Target Server Version : 50738
 File Encoding         : 65001

 Date: 25/05/2022 23:57:13
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_t2
-- ----------------------------
DROP TABLE IF EXISTS `t_t2`;
CREATE TABLE `t_t2`  (
  `t2id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`t2id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 45 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_t2
-- ----------------------------
INSERT INTO `t_t2` VALUES (3, '1');
INSERT INTO `t_t2` VALUES (4, '2');
INSERT INTO `t_t2` VALUES (5, '3');
INSERT INTO `t_t2` VALUES (6, '4');
INSERT INTO `t_t2` VALUES (7, '5');
INSERT INTO `t_t2` VALUES (8, '6');
INSERT INTO `t_t2` VALUES (9, '7');
INSERT INTO `t_t2` VALUES (10, '8');
INSERT INTO `t_t2` VALUES (11, '9');
INSERT INTO `t_t2` VALUES (12, '10');
INSERT INTO `t_t2` VALUES (13, '11');
INSERT INTO `t_t2` VALUES (14, '12');
INSERT INTO `t_t2` VALUES (15, '13');
INSERT INTO `t_t2` VALUES (16, '14');
INSERT INTO `t_t2` VALUES (17, '15');
INSERT INTO `t_t2` VALUES (18, '16');
INSERT INTO `t_t2` VALUES (19, '17');
INSERT INTO `t_t2` VALUES (20, '18');
INSERT INTO `t_t2` VALUES (21, '19');
INSERT INTO `t_t2` VALUES (22, '20');
INSERT INTO `t_t2` VALUES (23, '21');
INSERT INTO `t_t2` VALUES (24, '22');
INSERT INTO `t_t2` VALUES (25, '23');
INSERT INTO `t_t2` VALUES (26, '24');
INSERT INTO `t_t2` VALUES (27, '25');
INSERT INTO `t_t2` VALUES (28, '26');
INSERT INTO `t_t2` VALUES (29, '27');
INSERT INTO `t_t2` VALUES (30, '28');
INSERT INTO `t_t2` VALUES (31, '29');
INSERT INTO `t_t2` VALUES (32, '30');
INSERT INTO `t_t2` VALUES (33, '31');
INSERT INTO `t_t2` VALUES (34, '32');
INSERT INTO `t_t2` VALUES (35, '33');
INSERT INTO `t_t2` VALUES (36, '34');
INSERT INTO `t_t2` VALUES (37, '35');
INSERT INTO `t_t2` VALUES (38, '36');
INSERT INTO `t_t2` VALUES (39, '37');
INSERT INTO `t_t2` VALUES (40, '38');
INSERT INTO `t_t2` VALUES (41, '39');
INSERT INTO `t_t2` VALUES (42, '40');
INSERT INTO `t_t2` VALUES (43, '41');
INSERT INTO `t_t2` VALUES (44, '42');

SET FOREIGN_KEY_CHECKS = 1;
