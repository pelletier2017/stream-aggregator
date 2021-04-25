web_app_ec2_type = "t2.micro"
web_app_ami      = "ami-0577b787189839998" # amazon linux

database_ec2_type = "t2.medium" # sql server requires 2GB RAM
database_ami      = "ami-0577b787189839998" # amazon linux

vpc_cidr         = "10.0.0.0/16"
priv_subnet_cidr = "10.0.2.0/24"
pub_subnet_cidr  = "10.0.1.0/24"

//web_app_priv_ip = "10.0.1.50"

aws_region        = "us-west-1"
availability_zone = "us-west-1a"
