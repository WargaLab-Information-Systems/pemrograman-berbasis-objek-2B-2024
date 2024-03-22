-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 14 Nov 2023 pada 19.52
-- Versi server: 10.4.27-MariaDB
-- Versi PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bank`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `account`
--

CREATE TABLE `account` (
  `Acc` int(11) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `DOB` varchar(20) NOT NULL,
  `Pin` int(11) NOT NULL,
  `Acc_Type` varchar(20) NOT NULL,
  `Nationality` varchar(20) NOT NULL,
  `Caste` varchar(20) NOT NULL,
  `MICR_no` int(11) NOT NULL,
  `Gender` varchar(20) NOT NULL,
  `Mob` int(11) NOT NULL,
  `Address` varchar(20) NOT NULL,
  `SecQ` varchar(20) NOT NULL,
  `SecA` varchar(20) NOT NULL,
  `Balance` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `account`
--

INSERT INTO `account` (`Acc`, `Name`, `DOB`, `Pin`, `Acc_Type`, `Nationality`, `Caste`, `MICR_no`, `Gender`, `Mob`, `Address`, `SecQ`, `SecA`, `Balance`) VALUES
(1310, 'rakha', '1 Nov 2023', 2408, 'Saving', 'Islam', 'hh', 454, 'Male', 11, 'lmg', 'sopo kon', 'aku', 9000),
(3731, 'arya', '1 Nov 2023', 184, 'Saving', 'Islam', 'sdj', 71, 'Male', 812, 'sdj', 'arya anake sopo', 'bapak', 90000000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `balances`
--

CREATE TABLE `balances` (
  `Name` varchar(20) NOT NULL,
  `Acc` int(11) NOT NULL,
  `MICR_no` int(11) NOT NULL,
  `Balance` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `balances`
--

INSERT INTO `balances` (`Name`, `Acc`, `MICR_no`, `Balance`) VALUES
('rakha', 1310, 454, 10010000),
('arya', 3731, 71, 70000000);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`Acc`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
