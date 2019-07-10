-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  mar. 09 juil. 2019 à 20:09
-- Version du serveur :  5.7.24
-- Version de PHP :  7.2.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `jpublankproject`
--

DELIMITER $$
--
-- Procédures
--
DROP PROCEDURE IF EXISTS `addWinner`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `addWinner` (IN `winner` VARCHAR(255), IN `timer` FLOAT(32))  NO SQL
INSERT INTO winner_by_game(Winner, TimerByGame)
VALUES (winner, timer)$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Structure de la table `winner_by_game`
--

DROP TABLE IF EXISTS `winner_by_game`;
CREATE TABLE IF NOT EXISTS `winner_by_game` (
  `Number_Game` int(11) NOT NULL AUTO_INCREMENT,
  `Winner` varchar(255) NOT NULL,
  `TimerByGame` float NOT NULL,
  PRIMARY KEY (`Number_Game`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `winner_by_game`
--

INSERT INTO `winner_by_game` (`Number_Game`, `Winner`, `TimerByGame`) VALUES
(1, 'Player_1', 2.2),
(2, 'Player_1', 7.6);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
