# Backend-DJI-Drone-App
Backend application of the Cloud API

## Needed

### Install Java
https://www.java.com/en/download/help/index_installing.html

### Install EMQX
https://www.emqx.io/docs/zh/v4.4/

### Install MySQL
https://dev.mysql.com/doc/refman/8.0/en/installing.html

### Install Redis
https://redis.io/docs/getting-started/

# Backend-DJI-Drone-App

## Vite
npm run server

IP in confic.ts eintragen
IP in application.yml eintragen

## EMQX
./bin/emqx start

## Redis
wsl -u root
sudo service redis-server start

## MYSQL
Workbench Startup/Shutdown
Start Server

# Exit
## Vite
strg + C

## EMQX
./bin/emqx stop

## Redis
exit

## MYSQL
Workbench Startup/Shutdown
Stop Server
