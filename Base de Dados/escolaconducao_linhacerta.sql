-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 06-Jul-2016 às 09:28
-- Versão do servidor: 10.1.13-MariaDB
-- PHP Version: 5.5.35

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `escolaconducao_linhacerta`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `administrador`
--

CREATE TABLE `administrador` (
  `Codigo_Administrador` varchar(200) NOT NULL,
  `Palavra_Chave` varchar(200) NOT NULL,
  `Email` varchar(200) NOT NULL,
  `Nome` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `administrador`
--

INSERT INTO `administrador` (`Codigo_Administrador`, `Palavra_Chave`, `Email`, `Nome`) VALUES
('COD01', '1234', 'administrador@escolalinhacerta.pt', 'Bruno Lopes');

-- --------------------------------------------------------

--
-- Estrutura da tabela `alunos`
--

CREATE TABLE `alunos` (
  `Numero_Aluno` int(11) NOT NULL,
  `Palavra_Chave` varchar(50) NOT NULL,
  `Nome` varchar(150) NOT NULL,
  `Morada` varchar(200) DEFAULT NULL,
  `Numero_Porta` int(5) NOT NULL,
  `Fracao` varchar(15) DEFAULT NULL,
  `Freguesia` varchar(100) DEFAULT NULL,
  `Nacionalidade` varchar(100) DEFAULT NULL,
  `Validade` date NOT NULL,
  `Data_Emissao` date DEFAULT NULL,
  `C_Postal` varchar(9) DEFAULT NULL,
  `Data_Nascimento` date DEFAULT NULL,
  `Numero_Cartao_Cidadao` varchar(20) NOT NULL,
  `NIF` int(11) DEFAULT NULL,
  `Contacto_Telefonico` int(11) DEFAULT NULL,
  `Contacto_Movel` int(11) NOT NULL,
  `Email` varchar(200) DEFAULT NULL,
  `Categoria` varchar(4) NOT NULL,
  `Data_Inscricao` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `alunos`
--

INSERT INTO `alunos` (`Numero_Aluno`, `Palavra_Chave`, `Nome`, `Morada`, `Numero_Porta`, `Fracao`, `Freguesia`, `Nacionalidade`, `Validade`, `Data_Emissao`, `C_Postal`, `Data_Nascimento`, `Numero_Cartao_Cidadao`, `NIF`, `Contacto_Telefonico`, `Contacto_Movel`, `Email`, `Categoria`, `Data_Inscricao`) VALUES
(1, '', 'João Mendanha', 'Rua Ferreira Borges', 52, 'R/C', 'Campo de Ourique ', 'Portuguesa', '1996-12-11', '1996-12-11', '1302-242', '1996-12-11', '32133232 0 ZZ4', 32131323, 210222000, 910222313, 'joaomendanha@escolalinharcerta.pt', 'B', '2002-05-22');

-- --------------------------------------------------------

--
-- Estrutura da tabela `aulas`
--

CREATE TABLE `aulas` (
  `Numero_Aula` int(11) NOT NULL,
  `Data` date NOT NULL,
  `Hora` int(3) NOT NULL,
  `Minuto` int(3) NOT NULL,
  `Docentes_Codigo_Docente` varchar(10) NOT NULL,
  `Alunos_Numero_Aluno` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `aulas`
--

INSERT INTO `aulas` (`Numero_Aula`, `Data`, `Hora`, `Minuto`, `Docentes_Codigo_Docente`, `Alunos_Numero_Aluno`) VALUES
(1, '2016-07-23', 17, 30, 'DOC01', 1),
(2, '2016-07-06', 11, 30, 'DOC01', 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `docentes`
--

CREATE TABLE `docentes` (
  `Codigo_Docente` varchar(10) NOT NULL,
  `Palavra_Chave` varchar(200) NOT NULL,
  `Nome` varchar(200) NOT NULL,
  `Morada` varchar(200) DEFAULT NULL,
  `Numero_Porta` int(11) DEFAULT NULL,
  `Fracao` varchar(20) DEFAULT NULL,
  `Data_Nascimento` date DEFAULT NULL,
  `NIF` int(11) DEFAULT NULL,
  `Contacto` int(11) DEFAULT NULL,
  `Email` varchar(200) DEFAULT NULL,
  `Cargo` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `docentes`
--

INSERT INTO `docentes` (`Codigo_Docente`, `Palavra_Chave`, `Nome`, `Morada`, `Numero_Porta`, `Fracao`, `Data_Nascimento`, `NIF`, `Contacto`, `Email`, `Cargo`) VALUES
('DOC01', '12345', 'Jose Fernando Silva', 'Rua do Miradouro', 21, 'R/C ESQ', '2014-01-13', 512355222, 910254555, 'josefernandosilva@escolalinharcerta.pt', 'Instrutor');

-- --------------------------------------------------------

--
-- Estrutura da tabela `veiculos`
--

CREATE TABLE `veiculos` (
  `Matricula` varchar(8) NOT NULL,
  `Marca` varchar(50) DEFAULT NULL,
  `Modelo` varchar(100) DEFAULT NULL,
  `Motorizacao` int(11) DEFAULT NULL,
  `Combustivel` varchar(20) DEFAULT NULL,
  `Numero_Quadro` varchar(50) NOT NULL,
  `Ano` int(11) NOT NULL,
  `Mes` varchar(10) NOT NULL,
  `Docentes_Codigo_Docente` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `veiculos`
--

INSERT INTO `veiculos` (`Matricula`, `Marca`, `Modelo`, `Motorizacao`, `Combustivel`, `Numero_Quadro`, `Ano`, `Mes`, `Docentes_Codigo_Docente`) VALUES
('20-20-BB', 'Mercedes', 'A180', 1500, 'Diesel', 'VXZ4815641DSA', 2015, '02', 'DOC01');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `administrador`
--
ALTER TABLE `administrador`
  ADD PRIMARY KEY (`Codigo_Administrador`);

--
-- Indexes for table `alunos`
--
ALTER TABLE `alunos`
  ADD PRIMARY KEY (`Numero_Aluno`);

--
-- Indexes for table `aulas`
--
ALTER TABLE `aulas`
  ADD PRIMARY KEY (`Numero_Aula`),
  ADD KEY `fk_Aulas_Docentes1_idx` (`Docentes_Codigo_Docente`),
  ADD KEY `fk_Aulas_Alunos1_idx` (`Alunos_Numero_Aluno`);

--
-- Indexes for table `docentes`
--
ALTER TABLE `docentes`
  ADD PRIMARY KEY (`Codigo_Docente`);

--
-- Indexes for table `veiculos`
--
ALTER TABLE `veiculos`
  ADD PRIMARY KEY (`Matricula`),
  ADD KEY `fk_Veiculos_Docentes1_idx` (`Docentes_Codigo_Docente`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `alunos`
--
ALTER TABLE `alunos`
  MODIFY `Numero_Aluno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `aulas`
--
ALTER TABLE `aulas`
  MODIFY `Numero_Aula` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `aulas`
--
ALTER TABLE `aulas`
  ADD CONSTRAINT `fk_Aulas_Alunos1` FOREIGN KEY (`Alunos_Numero_Aluno`) REFERENCES `alunos` (`Numero_Aluno`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Aulas_Docentes1` FOREIGN KEY (`Docentes_Codigo_Docente`) REFERENCES `docentes` (`Codigo_Docente`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `veiculos`
--
ALTER TABLE `veiculos`
  ADD CONSTRAINT `fk_Veiculos_Docentes1` FOREIGN KEY (`Docentes_Codigo_Docente`) REFERENCES `docentes` (`Codigo_Docente`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
