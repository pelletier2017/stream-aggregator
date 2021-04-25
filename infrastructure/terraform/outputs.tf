output "web_app_elastic_ip" {
  value = aws_eip.one.public_ip
}
