CREATE DATABASE `blue_ivysystem` /*!40100 DEFAULT CHARACTER SET utf8 */;

CREATE TABLE `administrador` (
  `cod_adm` int(11) NOT NULL,
  `Cargo` varchar(45) NOT NULL,
  PRIMARY KEY (`cod_adm`),
  CONSTRAINT `Cod.` FOREIGN KEY (`cod_adm`) REFERENCES `usuario` (`cod`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `cliente` (
  `cod_cliente` int(11) NOT NULL,
  `cartao_de_credito` int(11) NOT NULL,
  `endereco` varchar(100) NOT NULL,
  PRIMARY KEY (`cod_cliente`),
  KEY `cod_cliente_idx` (`cod_cliente`),
  CONSTRAINT `cod_cliente` FOREIGN KEY (`cod_cliente`) REFERENCES `usuario` (`cod`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `compra` (
  `cod_compra` int(11) NOT NULL AUTO_INCREMENT,
  `valor_unitario` double NOT NULL,
  `quantidade` int(11) NOT NULL,
  `cod_cliente` int(11) NOT NULL,
  PRIMARY KEY (`cod_compra`),
  KEY `cod_cliente_idx` (`cod_cliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `itens` (
  `cod_item` int(11) NOT NULL AUTO_INCREMENT,
  `cod_compra` int(11) NOT NULL,
  `cod_produto` int(11) NOT NULL,
  PRIMARY KEY (`cod_item`),
  KEY `cod_de_compra_idx` (`cod_compra`),
  KEY `cod_de_produto_idx` (`cod_produto`),
  CONSTRAINT `cod_compra` FOREIGN KEY (`cod_compra`) REFERENCES `compra` (`cod_compra`),
  CONSTRAINT `cod_produto` FOREIGN KEY (`cod_produto`) REFERENCES `produto` (`cod_prod`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `produto` (
  `cod_prod` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `tipo` varchar(45) NOT NULL,
  `marca` varchar(45) NOT NULL,
  `cod_adm` int(11) NOT NULL,
  PRIMARY KEY (`cod_prod`),
  KEY `cod_adm_idx` (`cod_adm`),
  CONSTRAINT `cod_adm` FOREIGN KEY (`cod_adm`) REFERENCES `administrador` (`cod_adm`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `usuario` (
  `cod` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `login` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `telefone` int(11) NOT NULL,
  `cpf` int(11) NOT NULL,
  `email` varchar(100) NOT NULL,
  PRIMARY KEY (`cod`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


