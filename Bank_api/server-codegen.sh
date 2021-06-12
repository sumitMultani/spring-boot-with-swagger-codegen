#!/bin/bash

set -x
set -e

C:\\Users\\sumit\\jdk1.8.0_261\\bin\\java -Xmx1024M -Dlogback.configurationFile=conf/logback.xml -cp "lib/swagger-codegen-cli-3.0.15.jar" io.swagger.codegen.v3.cli.SwaggerCodegen generate -i api/bank-api.yml -c server-codegen-config.json -o bank-api-web -l spring --library spring-boot