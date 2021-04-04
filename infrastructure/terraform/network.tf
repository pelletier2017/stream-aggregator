resource "aws_vpc" "main-vpc" {
  cidr_block = var.vpc_cidr
  tags = {
    Name = "main-vpc"
  }
}

resource "aws_subnet" "priv-subnet" {
  vpc_id            = aws_vpc.main-vpc.id
  cidr_block        = var.priv_subnet_cidr
  availability_zone = var.availability_zone

  tags = {
    Name = "priv-subnet"
  }
}

resource "aws_subnet" "public-subnet" {
  vpc_id                  = aws_vpc.main-vpc.id
  cidr_block              = var.pub_subnet_cidr
  availability_zone       = var.availability_zone
  map_public_ip_on_launch = true

  tags = {
    Name = "priv-subnet"
  }
}
