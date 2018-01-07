-- auto Generated on 2017-12-20 02:13:45 
-- DROP TABLE IF EXISTS `user`; 
CREATE TABLE `user`(
    `user_id` VARCHAR (50) NOT NULL AUTO_INCREMENT COMMENT 'userId',
    `pwd` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'pwd',
    PRIMARY KEY (`user_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '`user`';
