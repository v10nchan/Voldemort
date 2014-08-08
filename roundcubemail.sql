-- phpMyAdmin SQL Dump
-- version 4.1.12
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Aug 08, 2014 at 06:31 PM
-- Server version: 5.6.16
-- PHP Version: 5.5.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `roundcubemail`
--

-- --------------------------------------------------------

--
-- Table structure for table `cache`
--

CREATE TABLE IF NOT EXISTS `cache` (
  `user_id` int(10) unsigned NOT NULL,
  `cache_key` varchar(128) CHARACTER SET ascii NOT NULL,
  `created` datetime NOT NULL DEFAULT '1000-01-01 00:00:00',
  `expires` datetime DEFAULT NULL,
  `data` longtext NOT NULL,
  `img` longtext NOT NULL,
  KEY `expires_index` (`expires`),
  KEY `user_cache_index` (`user_id`,`cache_key`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `cache_index`
--

CREATE TABLE IF NOT EXISTS `cache_index` (
  `user_id` int(10) unsigned NOT NULL,
  `mailbox` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `expires` datetime DEFAULT NULL,
  `valid` tinyint(1) NOT NULL DEFAULT '0',
  `data` longtext NOT NULL,
  PRIMARY KEY (`user_id`,`mailbox`),
  KEY `expires_index` (`expires`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `cache_messages`
--

CREATE TABLE IF NOT EXISTS `cache_messages` (
  `user_id` int(10) unsigned NOT NULL,
  `mailbox` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `uid` int(11) unsigned NOT NULL DEFAULT '0',
  `expires` datetime DEFAULT NULL,
  `data` longtext NOT NULL,
  `flags` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`user_id`,`mailbox`,`uid`),
  KEY `expires_index` (`expires`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `cache_shared`
--

CREATE TABLE IF NOT EXISTS `cache_shared` (
  `cache_key` varchar(255) CHARACTER SET ascii NOT NULL,
  `created` datetime NOT NULL DEFAULT '1000-01-01 00:00:00',
  `expires` datetime DEFAULT NULL,
  `data` longtext NOT NULL,
  KEY `expires_index` (`expires`),
  KEY `cache_key_index` (`cache_key`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `cache_thread`
--

CREATE TABLE IF NOT EXISTS `cache_thread` (
  `user_id` int(10) unsigned NOT NULL,
  `mailbox` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `expires` datetime DEFAULT NULL,
  `data` longtext NOT NULL,
  PRIMARY KEY (`user_id`,`mailbox`),
  KEY `expires_index` (`expires`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `contactgroupmembers`
--

CREATE TABLE IF NOT EXISTS `contactgroupmembers` (
  `contactgroup_id` int(10) unsigned NOT NULL,
  `contact_id` int(10) unsigned NOT NULL,
  `created` datetime NOT NULL DEFAULT '1000-01-01 00:00:00',
  PRIMARY KEY (`contactgroup_id`,`contact_id`),
  KEY `contactgroupmembers_contact_index` (`contact_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `contactgroups`
--

CREATE TABLE IF NOT EXISTS `contactgroups` (
  `contactgroup_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(10) unsigned NOT NULL,
  `changed` datetime NOT NULL DEFAULT '1000-01-01 00:00:00',
  `del` tinyint(1) NOT NULL DEFAULT '0',
  `name` varchar(128) NOT NULL DEFAULT '',
  PRIMARY KEY (`contactgroup_id`),
  KEY `contactgroups_user_index` (`user_id`,`del`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `contacts`
--

CREATE TABLE IF NOT EXISTS `contacts` (
  `contact_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `changed` datetime NOT NULL DEFAULT '1000-01-01 00:00:00',
  `del` tinyint(1) NOT NULL DEFAULT '0',
  `name` varchar(128) NOT NULL DEFAULT '',
  `email` text NOT NULL,
  `firstname` varchar(128) NOT NULL DEFAULT '',
  `surname` varchar(128) NOT NULL DEFAULT '',
  `vcard` longtext,
  `words` text,
  `user_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`contact_id`),
  KEY `user_contacts_index` (`user_id`,`del`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `contacts`
--

INSERT INTO `contacts` (`contact_id`, `changed`, `del`, `name`, `email`, `firstname`, `surname`, `vcard`, `words`, `user_id`) VALUES
(1, '2014-07-23 14:47:17', 0, 'Emailusertest1', 'emailusertest1@nexiaemr.com', '', '', 'BEGIN:VCARD\r\nVERSION:3.0\r\nFN:Emailusertest1\r\nEMAIL;TYPE=INTERNET:emailusertest1@nexiaemr.com\r\nEND:VCARD', ' emailusertest1@nexiamr.com emailusertest1', 5),
(2, '2014-07-23 14:47:20', 0, 'm l', 'cmoimartin@hotmail.com', '', '', 'BEGIN:VCARD\r\nVERSION:3.0\r\nFN:m l\r\nEMAIL;TYPE=INTERNET:cmoimartin@hotmail.com\r\nEND:VCARD', ' cmoimartin@hotmail.com m l', 5);

-- --------------------------------------------------------

--
-- Table structure for table `dictionary`
--

CREATE TABLE IF NOT EXISTS `dictionary` (
  `user_id` int(10) unsigned DEFAULT NULL,
  `language` varchar(5) NOT NULL,
  `data` longtext NOT NULL,
  UNIQUE KEY `uniqueness` (`user_id`,`language`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `identities`
--

CREATE TABLE IF NOT EXISTS `identities` (
  `identity_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(10) unsigned NOT NULL,
  `changed` datetime NOT NULL DEFAULT '1000-01-01 00:00:00',
  `del` tinyint(1) NOT NULL DEFAULT '0',
  `standard` tinyint(1) NOT NULL DEFAULT '0',
  `name` varchar(128) NOT NULL,
  `organization` varchar(128) NOT NULL DEFAULT '',
  `email` varchar(128) NOT NULL,
  `reply-to` varchar(128) NOT NULL DEFAULT '',
  `bcc` varchar(128) NOT NULL DEFAULT '',
  `signature` text,
  `html_signature` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`identity_id`),
  KEY `user_identities_index` (`user_id`,`del`),
  KEY `email_identities_index` (`email`,`del`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `identities`
--

INSERT INTO `identities` (`identity_id`, `user_id`, `changed`, `del`, `standard`, `name`, `organization`, `email`, `reply-to`, `bcc`, `signature`, `html_signature`) VALUES
(2, 2, '2014-07-04 20:31:18', 0, 1, '', '', 'chetutestrajesh@gmail.com', '', '', NULL, 0),
(3, 3, '2014-07-04 20:32:10', 0, 1, '', '', 'ajay.aspnet@gmail.com', '', '', NULL, 0),
(4, 4, '2014-07-04 20:40:51', 0, 1, '', '', 'satyabanm13@gmail.com', '', '', NULL, 0),
(5, 5, '2014-07-21 22:47:17', 0, 1, 'emailusertest1', '', 'emailusertest1@mail.nexiaemr.com', '', '', NULL, 0);

-- --------------------------------------------------------

--
-- Table structure for table `nexia_attach`
--

CREATE TABLE IF NOT EXISTS `nexia_attach` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `key_id` longtext NOT NULL,
  `attachment_name` longtext NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `nexia_attach`
--

INSERT INTO `nexia_attach` (`id`, `key_id`, `attachment_name`) VALUES
(1, '52770141753d8d8b71fb10_140730013703', '20140730013659_autoload_practics.php'),
(2, '8983926653db5d6a1f094_140801120356', '20140801120149_https___www.irctc.co.in_eticketing_printTicket.pdf');

-- --------------------------------------------------------

--
-- Table structure for table `nexia_email`
--

CREATE TABLE IF NOT EXISTS `nexia_email` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `accountid` double NOT NULL,
  `from_email` longtext NOT NULL,
  `to_email` longtext NOT NULL,
  `cc_email` longtext NOT NULL,
  `bcc_email` longtext NOT NULL,
  `subject_email` varchar(255) NOT NULL,
  `message` longtext NOT NULL,
  `attachment` varchar(255) NOT NULL,
  `pat_name` varchar(255) NOT NULL,
  `pat_id` varchar(255) NOT NULL,
  `datentime` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `nexia_email`
--

INSERT INTO `nexia_email` (`id`, `accountid`, `from_email`, `to_email`, `cc_email`, `bcc_email`, `subject_email`, `message`, `attachment`, `pat_name`, `pat_id`, `datentime`) VALUES
(1, 1004578, 'emailusertest1@mail.nexiaemr.com', 'edobler@pmgscc.com,preynolds@pmgscc.com,edobler@pmgscc.com,rvillaverde@pmgscc.com,', '', '', 'No Subject', 'r23r', '52770141753d8d8b71fb10_140730013703', 'RIO, CHARLES', '30809', '2014/07/30 01:37:03'),
(2, 1004578, 'emailusertest1@mail.nexiaemr.com', 'rajesh7448@yahoo.com', '', '', 'search', 'test', '8983926653db5d6a1f094_140801120356', 'JUSTIS, ALIDA', '18742', '2014/08/01 12:03:56');

-- --------------------------------------------------------

--
-- Table structure for table `searches`
--

CREATE TABLE IF NOT EXISTS `searches` (
  `search_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(10) unsigned NOT NULL,
  `type` int(3) NOT NULL DEFAULT '0',
  `name` varchar(128) NOT NULL,
  `data` text,
  PRIMARY KEY (`search_id`),
  UNIQUE KEY `uniqueness` (`user_id`,`type`,`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `session`
--

CREATE TABLE IF NOT EXISTS `session` (
  `sess_id` varchar(128) NOT NULL,
  `created` datetime NOT NULL DEFAULT '1000-01-01 00:00:00',
  `changed` datetime NOT NULL DEFAULT '1000-01-01 00:00:00',
  `ip` varchar(40) NOT NULL,
  `vars` mediumtext NOT NULL,
  PRIMARY KEY (`sess_id`),
  KEY `changed_index` (`changed`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `session`
--

INSERT INTO `session` (`sess_id`, `created`, `changed`, `ip`, `vars`) VALUES
('4307uui6ij73nc8duoo63tpfv5', '2014-08-07 22:22:51', '2014-08-07 22:22:51', '127.0.0.1', 'bGFuZ3VhZ2V8czo1OiJlbl9VUyI7c2tpbnxzOjU6ImxhcnJ5IjtpbWFwX25hbWVzcGFjZXxhOjQ6e3M6ODoicGVyc29uYWwiO2E6MTp7aTowO2E6Mjp7aTowO3M6MDoiIjtpOjE7czoxOiIuIjt9fXM6NToib3RoZXIiO047czo2OiJzaGFyZWQiO047czo2OiJwcmVmaXgiO3M6MDoiIjt9aW1hcF9kZWxpbWl0ZXJ8czoxOiIuIjt1c2VyX2lkfHM6MToiNSI7dXNlcm5hbWV8czoxNDoiZW1haWx1c2VydGVzdDEiO3N0b3JhZ2VfaG9zdHxzOjE3OiJtYWlsLm5leGlhZW1yLmNvbSI7c3RvcmFnZV9wb3J0fGk6OTkzO3N0b3JhZ2Vfc3NsfHM6Mzoic3NsIjtwYXNzd29yZHxzOjMyOiJzR0RvQXV3MWF6cjJPeG1XRXBSbW4ydGR5L29vYmpZNyI7bG9naW5fdGltZXxpOjE0MDc0MzAzNzE7dGltZXpvbmV8czoxMjoiQXNpYS9Lb2xrYXRhIjs='),
('73hv1g1i8t8aillcfncqr8v3v5', '2014-08-07 22:22:47', '2014-08-07 22:22:47', '127.0.0.1', 'bGFuZ3VhZ2V8czo1OiJlbl9VUyI7c2tpbnxzOjU6ImxhcnJ5IjtpbWFwX25hbWVzcGFjZXxhOjQ6e3M6ODoicGVyc29uYWwiO2E6MTp7aTowO2E6Mjp7aTowO3M6MDoiIjtpOjE7czoxOiIuIjt9fXM6NToib3RoZXIiO047czo2OiJzaGFyZWQiO047czo2OiJwcmVmaXgiO3M6MDoiIjt9aW1hcF9kZWxpbWl0ZXJ8czoxOiIuIjt1c2VyX2lkfHM6MToiNSI7dXNlcm5hbWV8czoxNDoiZW1haWx1c2VydGVzdDEiO3N0b3JhZ2VfaG9zdHxzOjE3OiJtYWlsLm5leGlhZW1yLmNvbSI7c3RvcmFnZV9wb3J0fGk6OTkzO3N0b3JhZ2Vfc3NsfHM6Mzoic3NsIjtwYXNzd29yZHxzOjMyOiJhN2hLL2ZYNWJ6RmVhT0JjNWVRNHQzUU40YUhZcFA2QyI7bG9naW5fdGltZXxpOjE0MDc0MzAzNjc7dGltZXpvbmV8czoxMjoiQXNpYS9Lb2xrYXRhIjs='),
('s283nh4mqc5td477v8iubr8885', '2014-08-07 22:22:45', '2014-08-07 22:22:45', '127.0.0.1', 'bGFuZ3VhZ2V8czo1OiJlbl9VUyI7c2tpbnxzOjU6ImxhcnJ5Ijt1c2VyX2lkfHM6MToiNSI7dXNlcm5hbWV8czoxNDoiZW1haWx1c2VydGVzdDEiO3N0b3JhZ2VfaG9zdHxzOjE3OiJtYWlsLm5leGlhZW1yLmNvbSI7c3RvcmFnZV9wb3J0fGk6OTkzO3N0b3JhZ2Vfc3NsfHM6Mzoic3NsIjtwYXNzd29yZHxzOjMyOiJrK1ZUdE5oL0hiMW1UREpESUN5cTNiSERCeUcrNnFEcyI7bG9naW5fdGltZXxpOjE0MDc0MzAzNjU7dGltZXpvbmV8czoxMjoiQXNpYS9Lb2xrYXRhIjs='),
('v91f3o98n8ib1le5dcor2dt8r7', '2014-08-08 14:57:57', '2014-08-08 21:42:49', '127.0.0.1', 'bGFuZ3VhZ2V8czo1OiJlbl9VUyI7c2tpbnxzOjU6ImxhcnJ5IjtpbWFwX25hbWVzcGFjZXxhOjQ6e3M6ODoicGVyc29uYWwiO2E6MTp7aTowO2E6Mjp7aTowO3M6MDoiIjtpOjE7czoxOiIuIjt9fXM6NToib3RoZXIiO047czo2OiJzaGFyZWQiO047czo2OiJwcmVmaXgiO3M6MDoiIjt9aW1hcF9kZWxpbWl0ZXJ8czoxOiIuIjt1c2VyX2lkfHM6MToiNSI7dXNlcm5hbWV8czoxNDoiZW1haWx1c2VydGVzdDEiO3N0b3JhZ2VfaG9zdHxzOjE3OiJtYWlsLm5leGlhZW1yLmNvbSI7c3RvcmFnZV9wb3J0fGk6OTkzO3N0b3JhZ2Vfc3NsfHM6Mzoic3NsIjtwYXNzd29yZHxzOjMyOiJXaC9rR1Q2ZWN2QUYyZFRyOWlmOXdUOWVPTlJaUlRwVyI7bG9naW5fdGltZXxpOjE0MDc0OTAwNzc7dGltZXpvbmV8czoxMjoiQXNpYS9Lb2xrYXRhIjt0YXNrfHM6NDoibWFpbCI7aW1hcF9ob3N0fHM6MTc6Im1haWwubmV4aWFlbXIuY29tIjttYm94fHM6NDoiU2VudCI7c29ydF9jb2x8czo3OiJzdWJqZWN0Ijtzb3J0X29yZGVyfHM6MzoiQVNDIjtTVE9SQUdFX1RIUkVBRHxhOjI6e2k6MDtzOjEwOiJSRUZFUkVOQ0VTIjtpOjE7czo0OiJSRUZTIjt9U1RPUkFHRV9RVU9UQXxiOjA7U1RPUkFHRV9MSVNULUVYVEVOREVEfGI6MTtsaXN0X2F0dHJpYnxhOjU6e3M6NDoibmFtZSI7czo4OiJtZXNzYWdlcyI7czoyOiJpZCI7czoxMToibWVzc2FnZWxpc3QiO3M6NToiY2xhc3MiO3M6NDg6InJlY29yZHMtdGFibGUgbWVzc2FnZWxpc3Qgc29ydGhlYWRlciBmaXhlZGhlYWRlciI7czoxNToib3B0aW9uc21lbnVpY29uIjtzOjQ6InRydWUiO3M6NzoiY29sdW1ucyI7YTo4OntpOjA7czo3OiJ0aHJlYWRzIjtpOjE7czo3OiJzdWJqZWN0IjtpOjI7czo2OiJzdGF0dXMiO2k6MztzOjY6ImZyb210byI7aTo0O3M6NDoiZGF0ZSI7aTo1O3M6NDoic2l6ZSI7aTo2O3M6NDoiZmxhZyI7aTo3O3M6MTA6ImF0dGFjaG1lbnQiO319c2tpbl9wYXRofHM6MTE6InNraW5zL2xhcnJ5Ijtmb2xkZXJzfGE6NDp7czo1OiJJTkJPWCI7YToyOntzOjM6ImNudCI7aToxO3M6NjoibWF4dWlkIjtpOjY7fXM6NDoiU2VudCI7YToyOntzOjM6ImNudCI7aTo3NjtzOjY6Im1heHVpZCI7aTo3Nzt9czo2OiJEcmFmdHMiO2E6Mjp7czozOiJjbnQiO2k6MDtzOjY6Im1heHVpZCI7aTowO31zOjU6IlRyYXNoIjthOjI6e3M6MzoiY250IjtpOjA7czo2OiJtYXh1aWQiO2k6MDt9fXVuc2Vlbl9jb3VudHxhOjk6e3M6NToiSU5CT1giO2k6MDtzOjY6IkRyYWZ0cyI7aTowO3M6NDoiU2VudCI7aTowO3M6NToiVHJhc2giO2k6MDtzOjEzOiJEZWxldGVkIEl0ZW1zIjtpOjA7czoxNjoiRGVsZXRlZCBNZXNzYWdlcyI7aTowO3M6MTE6Ikp1bmsgRS1tYWlsIjtpOjA7czoxMDoiU2VudCBJdGVtcyI7aTowO3M6MTM6IlNlbnQgTWVzc2FnZXMiO2k6Mjt9bGlzdF9tb2Rfc2VxfHM6MjoiMzciO3BhZ2V8aToxO1NUT1JBR0VfU09SVHxiOjE7Y29tcG9zZV9kYXRhXzE4NDQ5MTMyODc1M2U0YWI4Zjg0YWYxfGE6NDp7czoyOiJpZCI7czoyMzoiMTg0NDkxMzI4NzUzZTRhYjhmODRhZjEiO3M6NToicGFyYW0iO2E6MTp7czo5OiJzZW50X21ib3giO3M6NDoiU2VudCI7fXM6NzoibWFpbGJveCI7czo1OiJJTkJPWCI7czo0OiJtb2RlIjtOO31TVE9SQUdFX0FDTHxiOjA7YnJvd3Nlcl9jYXBzfGE6Mzp7czozOiJwZGYiO3M6MToiMSI7czo1OiJmbGFzaCI7czoxOiIxIjtzOjM6InRpZiI7czoxOiIwIjt9c2FmZV9tZXNzYWdlc3xhOjE6e3M6NzoiSU5CT1g6NiI7YjowO313cml0ZWFibGVfYWJvb2t8YjoxO2NvbXBvc2VfZGF0YV8xMzg5NjUzMTA3NTNlNGFiZjlkYmE5Y3xhOjc6e3M6MjoiaWQiO3M6MjM6IjEzODk2NTMxMDc1M2U0YWJmOWRiYTljIjtzOjU6InBhcmFtIjthOjM6e3M6OToicmVwbHlfdWlkIjtzOjE6IjYiO3M6NDoibWJveCI7czo1OiJJTkJPWCI7czo5OiJzZW50X21ib3giO3M6NDoiU2VudCI7fXM6NzoibWFpbGJveCI7czo1OiJJTkJPWCI7czo0OiJtb2RlIjtzOjU6InJlcGx5IjtzOjk6InJlcGx5X3VpZCI7czoxOiI2IjtzOjExOiJyZXBseV9tc2dpZCI7czo0NToiPDIwMTQwNzI4MTk1ODM0LjQzNkVEODBBMENAbWFpbC5uZXhpYWVtci5jb20+IjtzOjEwOiJyZWZlcmVuY2VzIjtzOjQ1OiI8MjAxNDA3MjgxOTU4MzQuNDM2RUQ4MEEwQ0BtYWlsLm5leGlhZW1yLmNvbT4iO31jb21wb3NlX2RhdGFfMTExNTI2NDE0NjUzZTRhYzAzMmEyMzJ8YTo0OntzOjI6ImlkIjtzOjIzOiIxMTE1MjY0MTQ2NTNlNGFjMDMyYTIzMiI7czo1OiJwYXJhbSI7YToyOntzOjQ6Im1ib3giO3M6NToiSU5CT1giO3M6OToic2VudF9tYm94IjtzOjQ6IlNlbnQiO31zOjc6Im1haWxib3giO3M6NToiSU5CT1giO3M6NDoibW9kZSI7Tjt9Y29tcG9zZV9kYXRhXzE4NDMxNTEyMDY1M2U0YWMyMTRmN2Y4fGE6NDp7czoyOiJpZCI7czoyMzoiMTg0MzE1MTIwNjUzZTRhYzIxNGY3ZjgiO3M6NToicGFyYW0iO2E6Mjp7czo0OiJtYm94IjtzOjQ6IlNlbnQiO3M6OToic2VudF9tYm94IjtzOjQ6IlNlbnQiO31zOjc6Im1haWxib3giO3M6NDoiU2VudCI7czo0OiJtb2RlIjtOO31jb21wb3NlX2RhdGFfMTA0ODU2MDc2NzUzZTRlM2FiOGI1NDF8YTo0OntzOjI6ImlkIjtzOjIzOiIxMDQ4NTYwNzY3NTNlNGUzYWI4YjU0MSI7czo1OiJwYXJhbSI7YToyOntzOjQ6Im1ib3giO3M6NToiSU5CT1giO3M6OToic2VudF9tYm94IjtzOjQ6IlNlbnQiO31zOjc6Im1haWxib3giO3M6NToiSU5CT1giO3M6NDoibW9kZSI7Tjt9');

-- --------------------------------------------------------

--
-- Table structure for table `system`
--

CREATE TABLE IF NOT EXISTS `system` (
  `name` varchar(64) NOT NULL,
  `value` mediumtext,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `system`
--

INSERT INTO `system` (`name`, `value`) VALUES
('roundcube-version', '2014042900');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `user_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(128) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `mail_host` varchar(128) NOT NULL,
  `created` datetime NOT NULL DEFAULT '1000-01-01 00:00:00',
  `last_login` datetime DEFAULT NULL,
  `language` varchar(5) DEFAULT NULL,
  `preferences` longtext,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `username` (`username`,`mail_host`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`user_id`, `username`, `mail_host`, `created`, `last_login`, `language`, `preferences`) VALUES
(2, 'chetutestrajesh@gmail.com', 'imap.gmail.com', '2014-07-04 20:31:18', '2014-07-22 20:26:36', 'en_US', 'a:3:{s:17:"collapsed_folders";s:0:"";s:12:"preview_pane";s:1:"0";s:11:"search_mods";a:4:{s:1:"*";a:2:{s:7:"subject";i:1;s:4:"from";i:1;}s:4:"Sent";a:2:{s:7:"subject";i:1;s:2:"to";i:1;}s:6:"Drafts";a:2:{s:7:"subject";i:1;s:2:"to";i:1;}s:16:"[Gmail]/All Mail";a:2:{s:7:"subject";i:1;s:4:"from";i:1;}}}'),
(3, 'ajay.aspnet@gmail.com', 'imap.gmail.com', '2014-07-04 20:32:10', '2014-07-04 20:32:10', 'en_US', NULL),
(4, 'satyabanm13@gmail.com', 'imap.gmail.com', '2014-07-04 20:40:51', '2014-07-05 17:49:23', 'en_US', NULL),
(5, 'emailusertest1', 'mail.nexiaemr.com', '2014-07-21 22:47:17', '2014-08-08 14:57:57', 'en_US', 'a:3:{s:16:"message_sort_col";s:7:"subject";s:18:"message_sort_order";s:3:"ASC";s:11:"search_mods";a:4:{s:1:"*";a:2:{s:7:"subject";i:1;s:4:"from";i:1;}s:4:"Sent";a:2:{s:7:"subject";i:1;s:2:"to";i:1;}s:6:"Drafts";a:2:{s:7:"subject";i:1;s:2:"to";i:1;}s:5:"INBOX";a:2:{s:7:"subject";i:1;s:4:"from";i:1;}}}');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `cache`
--
ALTER TABLE `cache`
  ADD CONSTRAINT `user_id_fk_cache` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `cache_index`
--
ALTER TABLE `cache_index`
  ADD CONSTRAINT `user_id_fk_cache_index` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `cache_messages`
--
ALTER TABLE `cache_messages`
  ADD CONSTRAINT `user_id_fk_cache_messages` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `cache_thread`
--
ALTER TABLE `cache_thread`
  ADD CONSTRAINT `user_id_fk_cache_thread` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `contactgroupmembers`
--
ALTER TABLE `contactgroupmembers`
  ADD CONSTRAINT `contactgroup_id_fk_contactgroups` FOREIGN KEY (`contactgroup_id`) REFERENCES `contactgroups` (`contactgroup_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `contact_id_fk_contacts` FOREIGN KEY (`contact_id`) REFERENCES `contacts` (`contact_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `contactgroups`
--
ALTER TABLE `contactgroups`
  ADD CONSTRAINT `user_id_fk_contactgroups` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `contacts`
--
ALTER TABLE `contacts`
  ADD CONSTRAINT `user_id_fk_contacts` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `dictionary`
--
ALTER TABLE `dictionary`
  ADD CONSTRAINT `user_id_fk_dictionary` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `identities`
--
ALTER TABLE `identities`
  ADD CONSTRAINT `user_id_fk_identities` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `searches`
--
ALTER TABLE `searches`
  ADD CONSTRAINT `user_id_fk_searches` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
