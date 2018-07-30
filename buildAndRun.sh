#!/bin/bash

mvn clean install
cd backend/BillReporter
mvn spring-boot:run