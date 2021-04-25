resource "aws_instance" "web-app-ec2" {
  ami           = var.web_app_ami
  instance_type = var.web_app_ec2_type

  network_interface {
    device_index         = 0
    network_interface_id = aws_network_interface.web-server-nic.id
  }

  user_data = <<-EOF
                 #!/bin/bash
                 yum -y install httpd
                 service httpd start
                 sudo bash -c 'echo your very first web server > /var/www/html/index.html'
                 EOF

//  user_data = <<-EOF
//                 #!/bin/bash
//                 yum -y install git
//
//                 cd /opt && git clone https://github.com/pelletier2017/stream-aggregator.git && cd stream-aggregator
//
//                 chmod +x gradlew
//                 ./gradlew bootRun -x test
//
//                 EOF

  tags = {
    Name = "web app"
  }
}

resource "aws_instance" "database-ec2" {
  ami           = var.database_ami
  instance_type = var.database_ec2_type

  network_interface {
    device_index         = 0
    network_interface_id = aws_network_interface.database-server-nic.id
  }

  user_data = <<-EOF
                 #!/bin/bash
                 yum -y install git
                 amazon-linux-extras install docker

                 # make docker start now and also on reboot
                 service docker start
                 chkconfig docker on

                 usermod -a -G docker ec2-user

                 # install docker-compose
                 #sudo curl -L https://github.com/docker/compose/releases/download/1.22.0/docker-compose-$(uname -s)-$(uname -m) -o /usr/local/bin/docker-compose
                 sudo curl -L https://github.com/docker/compose/releases/latest/download/docker-compose-$(uname -s)-$(uname -m) -o /usr/local/bin/docker-compose
                 sudo chmod +x /usr/local/bin/docker-compose

                 cd /opt && git clone https://github.com/pelletier2017/stream-aggregator.git && cd stream-aggregator

                 /usr/local/bin/docker-compose up --build

                 EOF

  tags = {
    Name = "database"
  }
}
