# Bus Reservation System

The Bus Reservation System is a Java-based application for booking bus tickets. It allows passengers to book seats on available buses and manages the booking details. This project is implemented using Java and MySQL for database management.


## Table of Contents

- [Features](#features)
- [Prerequisites](#prerequisites)
- [Setup](#setup)
- [Usage](#usage)
- [Database Schema](#database-schema)
- [Contributing](#contributing)

## Features

- Display a list of available buses.
- Allow passengers to book seats on a bus.
- Check seat availability for a particular bus on a given date.
- Store booking information in a MySQL database.
- Provide a user-friendly command-line interface.

## Prerequisites

Before running this project, make sure you have the following prerequisites installed:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html)
- [MySQL Database Server](https://dev.mysql.com/downloads/mysql/)
- [MySQL Connector/J (JDBC Driver)](https://dev.mysql.com/downloads/connector/j/)

## Setup

1. Clone this repository to your local machine:

   ```bash
   git clone https://github.com/Suhaib-Aamer/Bus-ReservationSystem

2. Import the project into your favorite Java IDE.

3. Configure your MySQL database connection by editing the DBConnection class with your database URL, username, and password.

4. Create a MySQL database named BusReservation.

5. Create the necessary tables in the database using the provided SQL schema.

6. Build and run the BusAdmin class to start the application.

## Usage
- Run the application by executing the BusAdmin class.

- Follow the on-screen instructions to book bus tickets.

- You can view available buses and their details.

- Book seats on a bus by providing passenger information and selecting the desired date.

## Database Schema
The project uses a MySQL database with the following schema:

- bus table: Stores information about buses, including bus number, AC status, and capacity.
- booking table: Stores booking details, including passenger name, bus number, and travel date.

## Contributing
- Contributions to this project are welcome. Please feel free to open issues, submit pull requests, or suggest new features and improvements. Together, we can make this project even better!
