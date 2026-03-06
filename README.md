# Librawherey

#### *- Software Design, Architecture and Implementation of a Spring Boot Application*.


Librawherey is a locating service that calculates nearby libraries based on a selected school in Skopje.

This project was developed as a collaborative homework assignment for the university subject Software Design and Analysis, while learning web development from scratch.

## Overview

The application allows users to:
- View a list of schools and universities in Skopje
- Display schools on map
- Select a school from list or map
- Display nearby libraries on a map

The system automatically:
- Determines nearby libraries based on geographic proximity
- Calculates the shortest distance between the selected institution and nearby libraries

## Data Source

Location data is sourced from OpenStreetMap using a pipe-and-filter data flow approach.

## Tech Stack
- Java
- Spring Boot
- Thymeleaf
- JavaScript
- OpenStreetMap
- CSV data storage
- JVM
