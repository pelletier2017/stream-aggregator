variable "web_app_ami" {
  description = "ami to use for web app ec2 instance"
  type        = string
}

variable "web_app_ec2_type" {
  description = "size of web app AWS ec2 instance"
  type        = string
}

variable "database_ami" {
  description = "ami to use for database ec2 instance"
  type        = string
}

variable "database_ec2_type" {
  description = "size of AWS ec2 instance"
  type        = string
}

variable "vpc_cidr" {
  description = "cidr block for the VPC"
  type        = string
}

variable "priv_subnet_cidr" {
  description = "cidr block for the private subnet"
  type        = string
}

variable "pub_subnet_cidr" {
  description = "cidr block for the public subnet"
  type        = string
}

variable "aws_region" {
  description = "region to deploy application onto"
  type        = string
}

variable "availability_zone" {
  description = "single availability zone to deploy application onto"
  type        = string
}