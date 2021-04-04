resource "aws_instance" "web-app-ec2" {
  ami           = var.web_app_ami
  instance_type = var.web_app_ec2_type
  subnet_id     = aws_subnet.public-subnet.id
  tags = {
    Name = "web app"
  }
}

resource "aws_instance" "database-ec2" {
  ami           = var.database_ami
  instance_type = var.database_ec2_type
  subnet_id     = aws_subnet.priv-subnet.id
  tags = {
    Name = "database"
  }
}
