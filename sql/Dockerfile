FROM mcr.microsoft.com/mssql/server:2017-latest

COPY entrypoint.sh /
RUN chmod +x /entrypoint.sh

COPY *.sql /

ENTRYPOINT /bin/bash ./entrypoint.sh