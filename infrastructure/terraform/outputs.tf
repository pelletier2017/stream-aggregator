output "web_app_public_ip" {
  value = aws_instance.web-app-ec2.public_ip
}
