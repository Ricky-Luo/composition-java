-- -------------------------------------------------------------
-- TablePlus 5.1.2(472)
--
-- https://tableplus.com/
--
-- Database: composition_data
-- Generation Time: 2023-01-16 19:37:33.2750
-- -------------------------------------------------------------


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


DROP TABLE IF EXISTS `composition_topics`;
CREATE TABLE `composition_topics` (
  `composition_chinese_title` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin NOT NULL,
  `id` int NOT NULL,
  `composition_english_title` varchar(300) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL,
  `composition_graph_one` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL,
  `composition_graph_two` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL,
  `compostion_graph_three` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL,
  `composition_type_id` int DEFAULT NULL,
  `composition_type_name` varchar(30) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL,
  `lulu` varchar(30) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL,
  `task_detail` varchar(400) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL,
  `composition_graph_title_one` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL,
  `composition_graph_title_two` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin;

DROP TABLE IF EXISTS `composition_type`;
CREATE TABLE `composition_type` (
  `id` int NOT NULL,
  `name` varchar(30) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin;

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin NOT NULL,
  `password` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin NOT NULL,
  `salt` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin NOT NULL,
  `purse_balance` float(20,0) DEFAULT NULL,
  `coin_balance` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin;

DROP TABLE IF EXISTS `user_achievement`;
CREATE TABLE `user_achievement` (
  `id` int NOT NULL,
  `user_id` int NOT NULL,
  `achievement` linestring DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin;

DROP TABLE IF EXISTS `user_charge_history`;
CREATE TABLE `user_charge_history` (
  `id` int NOT NULL,
  `user_id` int NOT NULL,
  `charge_date` linestring NOT NULL,
  `charge_time` linestring NOT NULL,
  `charge_amount` float(10,0) NOT NULL,
  `charge_way` linestring DEFAULT NULL,
  `balance_before` float(10,0) NOT NULL,
  `balance_after` float(10,0) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin;

DROP TABLE IF EXISTS `user_composition_type`;
CREATE TABLE `user_composition_type` (
  `id` int NOT NULL,
  `user_id` int DEFAULT NULL,
  `composition_type_id` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

DROP TABLE IF EXISTS `user_compostion_history`;
CREATE TABLE `user_compostion_history` (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_id` int NOT NULL,
  `composition_id` int NOT NULL,
  `composition_content` varchar(500) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL,
  `score` float(3,0) DEFAULT NULL,
  `teacher_comment` varchar(500) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin;

INSERT INTO `composition_topics` (`composition_chinese_title`, `id`, `composition_english_title`, `composition_graph_one`, `composition_graph_two`, `compostion_graph_three`, `composition_type_id`, `composition_type_name`, `lulu`, `task_detail`, `composition_graph_title_one`, `composition_graph_title_two`) VALUES
('测试题目1', 1, 'test title 1th', 'http://localhost:8080/mimic1.png', 'http://localhost:8080/mimic2.png', NULL, 1, '雅思小作文', '啦啦', 'The graph below shows the demand for electricity in England during typical days in winter and summer. The pie chart shows how electricity is used in an average English home.\r\n\r\nSummarise the information by selecting and reporting the main features, and make comparisons where relevant.', NULL, NULL),
('测试题目2', 2, 'test title 2th', NULL, NULL, NULL, 2, '雅思大作文', '露露', NULL, NULL, NULL),
('什么样的教学方式最好？', 3, 'Which teaching approch is best?', 'http://localhost:8080/mimic1.png', 'http://localhost:8080/mimic2.png', NULL, 1, '雅思小作文', '啦啦', 'The graph below shows the demand for electricity in England during typical days in winter and summer. The pie chart shows how electricity is used in an average English home.\r\n\r\nSummarise the information by selecting and reporting the main features, and make comparisons where relevant.', NULL, NULL),
('什么样的教学方式最好？', 4, 'Which teaching approch is best?', 'http://localhost:8080/mimic1.png', 'http://localhost:8080/mimic2.png', NULL, 1, '雅思小作文', '啦啦', 'The graph below shows the demand for electricity in England during typical days in winter and summer. The pie chart shows how electricity is used in an average English home.\r\n\r\nSummarise the information by selecting and reporting the main features, and make comparisons where relevant.', NULL, NULL),
('什么样的教学方式最好？', 5, 'Which teaching approch is best?', 'http://localhost:8080/mimic1.png', 'http://localhost:8080/mimic2.png', NULL, 1, '雅思小作文', '啦啦', 'The graph below shows the demand for electricity in England during typical days in winter and summer. The pie chart shows how electricity is used in an average English home.<br/><br/>Summarise the information by selecting and reporting the main features, and make comparisons where relevant.\r\nThe graph below shows the demand for electricity in England during typical days in winter and summer.', 'Typical daily demand for electricity', 'What the electricity is used for:'),
('什么样的教学方式最好？', 6, 'Which teaching approch is best?', 'http://localhost:8080/mimic1.png', 'http://localhost:8080/mimic2.png', NULL, 1, '雅思小作文', '啦啦', 'The graph below shows the demand for electricity in England during typical days in winter and summer. The pie chart shows how electricity is used in an average English home.\r\n\r\nSummarise the information by selecting and reporting the main features, and make comparisons where relevant.', NULL, NULL),
('什么样的教学方式最好？', 7, 'Which teaching approch is best?', 'http://localhost:8080/mimic1.png', 'http://localhost:8080/mimic2.png', NULL, 1, '雅思小作文', '啦啦', 'The graph below shows the demand for electricity in England during typical days in winter and summer. The pie chart shows how electricity is used in an average English home.\r\n\r\nSummarise the information by selecting and reporting the main features, and make comparisons where relevant.', NULL, NULL),
('什么样的教学方式最好？', 8, 'Which teaching approch is best?', 'http://localhost:8080/mimic1.png', 'http://localhost:8080/mimic2.png', NULL, 2, '雅思大作文', '啦啦', NULL, NULL, NULL),
('什么样的教学方式最好？', 9, 'Which teaching approch is best?', 'http://localhost:8080/mimic1.png', 'http://localhost:8080/mimic2.png', NULL, 2, '雅思大作文', '啦啦', NULL, NULL, NULL),
('什么样的教学方式最好？', 10, 'Which teaching approch is best?', 'http://localhost:8080/mimic1.png', 'http://localhost:8080/mimic2.png', NULL, 2, '雅思大作文', '啦啦', NULL, NULL, NULL),
('什么样的教学方式最好？', 12, 'Which teaching approch is best?', 'http://localhost:8080/mimic1.png', 'http://localhost:8080/mimic2.png', NULL, 2, '雅思大作文', '啦啦', NULL, NULL, NULL),
('什么样的教学方式最好？', 13, 'Which teaching approch is best?', '/src/image1.jpg', '/src/image2.jpg', NULL, 3, '四级', '啦啦', NULL, NULL, NULL),
('什么样的教学方式最好？', 14, 'Which teaching approch is best?', '/src/image1.jpg', '/src/image2.jpg', NULL, 3, '四级', '啦啦', NULL, NULL, NULL),
('什么样的教学方式最好？', 15, 'Which teaching approch is best?', '/src/image1.jpg', '/src/image2.jpg', NULL, 3, '四级', '啦啦', NULL, NULL, NULL),
('什么样的教学方式最好？', 16, 'Which teaching approch is best?', '/src/image1.jpg', '/src/image2.jpg', NULL, 3, '四级', '啦啦', NULL, NULL, NULL),
('什么样的教学方式最好？', 17, 'Which teaching approch is best?', '/src/image1.jpg', '/src/image2.jpg', NULL, 3, '四级', '啦啦', NULL, NULL, NULL),
('什么样的教学方式最好？', 18, 'Which teaching approch is best?', '/src/image1.jpg', '/src/image2.jpg', NULL, 3, '四级', '啦啦', NULL, NULL, NULL),
('什么样的教学方式最好？', 19, 'Which teaching approch is best?', '/src/image1.jpg', '/src/image2.jpg', NULL, 3, '四级', '啦啦', NULL, NULL, NULL),
('什么样的教学方式最好？', 20, 'Which teaching approch is best?', '/src/image1.jpg', '/src/image2.jpg', NULL, 2, '雅思大作文', '啦啦', NULL, NULL, NULL),
('什么样的教学方式最好？', 21, 'Which teaching approch is best?', '/src/image1.jpg', '/src/image2.jpg', NULL, 2, '雅思大作文', '啦啦', NULL, NULL, NULL),
('什么样的教学方式最好？', 22, 'Which teaching approch is best?', '/src/image1.jpg', '/src/image2.jpg', NULL, 4, '六级', '啦啦', NULL, NULL, NULL),
('什么样的教学方式最好？', 23, 'Which teaching approch is best?', '/src/image1.jpg', '/src/image2.jpg', NULL, 4, '六级', '啦啦', NULL, NULL, NULL),
('什么样的教学方式最好？', 24, 'Which teaching approch is best?', '/src/image1.jpg', '/src/image2.jpg', NULL, 4, '六级', '啦啦', NULL, NULL, NULL),
('什么样的教学方式最好？', 25, 'Which teaching approch is best?', '/src/image1.jpg', '/src/image2.jpg', NULL, 4, '六级', '啦啦', NULL, NULL, NULL),
('什么样的教学方式最好？', 26, 'Which teaching approch is best?', '/src/image1.jpg', '/src/image2.jpg', NULL, 4, '六级', '啦啦', NULL, NULL, NULL),
('什么样的教学方式最好？', 27, 'Which teaching approch is best?', '/src/image1.jpg', '/src/image2.jpg', NULL, 4, '六级', '啦啦', NULL, NULL, NULL),
('什么样的教学方式最好？', 28, 'Which teaching approch is best?', '/src/image1.jpg', '/src/image2.jpg', NULL, 5, '高考作文', '啦啦', NULL, NULL, NULL),
('什么样的教学方式最好？', 29, 'Which teaching approch is best?', '/src/image1.jpg', '/src/image2.jpg', NULL, 5, '高考作文', '啦啦', NULL, NULL, NULL),
('什么样的教学方式最好？', 30, 'Which teaching approch is best?', '/src/image1.jpg', '/src/image2.jpg', NULL, 5, '高考作文', '啦啦', NULL, NULL, NULL),
('什么样的教学方式最好？', 31, 'Which teaching approch is best?', '/src/image1.jpg', '/src/image2.jpg', NULL, 5, '高考作文', '啦啦', NULL, NULL, NULL),
('什么样的教学方式最好？', 32, 'Which teaching approch is best?', '/src/image1.jpg', '/src/image2.jpg', NULL, 5, '高考作文', '啦啦', NULL, NULL, NULL),
('什么样的教学方式最好？', 33, 'Which teaching approch is best?', '/src/image1.jpg', '/src/image2.jpg', NULL, 5, '高考作文', '啦啦', NULL, NULL, NULL),
('什么样的教学方式最好？', 34, 'Which teaching approch is best?', '/src/image1.jpg', '/src/image2.jpg', NULL, 5, '高考作文', '啦啦', NULL, NULL, NULL),
('什么样的教学方式最好？', 35, 'Which teaching approch is best?', '/src/image1.jpg', '/src/image2.jpg', NULL, 6, '日常写作训练', '啦啦', NULL, NULL, NULL),
('什么样的教学方式最好？', 36, 'Which teaching approch is best?', '/src/image1.jpg', '/src/image2.jpg', NULL, 6, '日常写作训练', '啦啦', NULL, NULL, NULL),
('什么样的教学方式最好？', 37, 'Which teaching approch is best?', '/src/image1.jpg', '/src/image2.jpg', NULL, 6, '日常写作训练', '啦啦', NULL, NULL, NULL),
('什么样的教学方式最好？', 38, 'Which teaching approch is best?', '/src/image1.jpg', '/src/image2.jpg', NULL, 6, '日常写作训练', '啦啦', NULL, NULL, NULL),
('什么样的教学方式最好？', 39, 'Which teaching approch is best?', '/src/image1.jpg', '/src/image2.jpg', NULL, 6, '日常写作训练', '啦啦', NULL, NULL, NULL),
('什么样的教学方式最好？', 40, 'Which teaching approch is best?', '/src/image1.jpg', '/src/image2.jpg', NULL, 6, '日常写作训练', '啦啦', NULL, NULL, NULL),
('什么样的教学方式最好？', 41, 'Which teaching approch is best?', '/src/image1.jpg', '/src/image2.jpg', NULL, 6, '日常写作训练', '啦啦', NULL, NULL, NULL),
('什么样的教学方式最好？', 42, 'Which teaching approch is best?', '/src/image1.jpg', '/src/image2.jpg', NULL, 6, '日常写作训练', '啦啦', NULL, NULL, NULL),
('什么样的教学方式最好？', 43, 'Which teaching approch is best?', '/src/image1.jpg', '/src/image2.jpg', NULL, 3, '四级', '啦啦', NULL, NULL, NULL),
('什么样的教学方式最好？', 44, 'Which teaching approch is best?', '/src/image1.jpg', '/src/image2.jpg', NULL, 3, '四级', '啦啦', NULL, NULL, NULL),
('什么样的教学方式最好？', 45, 'Which teaching approch is best?', '/src/image1.jpg', '/src/image2.jpg', NULL, 3, '四级', '啦啦', NULL, NULL, NULL),
('什么样的教学方式最好？', 46, 'Which teaching approch is best?', '/src/image1.jpg', '/src/image2.jpg', NULL, 3, '四级', '啦啦', NULL, NULL, NULL),
('什么样的教学方式最好？', 47, 'Which teaching approch is best?', '/src/image1.jpg', '/src/image2.jpg', NULL, 2, '雅思大作文', '啦啦', NULL, NULL, NULL),
('1', 55, '3', '3', '3', '3', 3, '四级', '3', NULL, NULL, NULL);

INSERT INTO `composition_type` (`id`, `name`) VALUES
(1, '雅思小作文'),
(2, '雅思大作文'),
(3, '四级'),
(4, '六级'),
(5, '高考作文'),
(6, '日常写作训练');

INSERT INTO `user` (`id`, `user_name`, `password`, `salt`, `purse_balance`, `coin_balance`) VALUES
(1, 'luojuehuai', 'a39c6588de465a08f4cc94c8a229af03', 'e79c0da3-f699-448c-a888-abbe8b54f725', NULL, NULL),
(2, 'luojuehuai2', '41e461e506f6a55612dd1f3d8b23e92e', 'cf87d414-191c-4e03-b48d-9eaf2a0e937e', NULL, NULL),
(3, 'luojuehuai4', 'c1b26998b651f0419c2cf9e9abdd9474', 'd96eddee-1073-4596-8af8-40a8c10d1339', NULL, NULL);

INSERT INTO `user_composition_type` (`id`, `user_id`, `composition_type_id`) VALUES
(1, 1, 1);

INSERT INTO `user_compostion_history` (`id`, `user_id`, `composition_id`, `composition_content`, `score`, `teacher_comment`) VALUES
(19, 1, 6, '梦想着\n由国际\n', NULL, NULL),
(20, 1, 1, 'The red rain.', NULL, NULL),
(21, 1, 4, '', NULL, NULL);



/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;