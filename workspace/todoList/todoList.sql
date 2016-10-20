-- phpMyAdmin SQL Dump
-- version 4.0.10.10
-- http://www.phpmyadmin.net
--
-- Хост: 127.0.0.1:3306
-- Время создания: Мар 09 2016 г., 19:20
-- Версия сервера: 5.5.45
-- Версия PHP: 5.3.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- База данных: `todoList`
--

-- --------------------------------------------------------

--
-- Структура таблицы `taskFiles`
--

CREATE TABLE IF NOT EXISTS `taskFiles` (
  `fileId` int(11) NOT NULL AUTO_INCREMENT,
  `taskId` int(11) NOT NULL,
  `fileName` varchar(64) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`fileId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Структура таблицы `tasks`
--

CREATE TABLE IF NOT EXISTS `tasks` (
  `taskId` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(11) NOT NULL,
  `taskDesc` text COLLATE utf8_unicode_ci NOT NULL,
  `taskDate` date NOT NULL,
  `taskStatId` int(11) NOT NULL,
  PRIMARY KEY (`taskId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Структура таблицы `taskStatuses`
--

CREATE TABLE IF NOT EXISTS `taskStatuses` (
  `taskStatId` int(11) NOT NULL AUTO_INCREMENT,
  `taskStatName` varchar(32) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`taskStatId`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=4 ;

--
-- Дамп данных таблицы `taskStatuses`
--

INSERT INTO `taskStatuses` (`taskStatId`, `taskStatName`) VALUES
(1, 'Active'),
(2, 'Fixed'),
(3, 'Moved to recycle bin');

-- --------------------------------------------------------

--
-- Структура таблицы `userRoles`
--

CREATE TABLE IF NOT EXISTS `userRoles` (
  `userRoleId` int(11) NOT NULL AUTO_INCREMENT,
  `userRoleName` varchar(32) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`userRoleId`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=3 ;

--
-- Дамп данных таблицы `userRoles`
--

INSERT INTO `userRoles` (`userRoleId`, `userRoleName`) VALUES
(1, 'Admin'),
(2, 'User');

-- --------------------------------------------------------

--
-- Структура таблицы `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `userRoleId` int(11) NOT NULL,
  `userLogin` varchar(32) COLLATE utf8_unicode_ci NOT NULL,
  `userPass` varchar(32) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=3 ;

--
-- Дамп данных таблицы `users`
--

INSERT INTO `users` (`userId`, `userRoleId`, `userLogin`, `userPass`) VALUES
(1, 1, 'sys', '111'),
(2, 2, 'boss', '000');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
