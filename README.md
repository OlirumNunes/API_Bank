# API Bank

<p align="center">
    <img src="https://github.com/OlirumNunes/API_Bank/assets/150186772/2030b571-b342-4aa8-9683-61270c5f26d4" width="200px">
</p>

[![GitHub license](https://img.shields.io/github/license/Naereen/StrapDown.js.svg)](https://github.com/Naereen/StrapDown.js/blob/master/LICENSE)

_Read this in other languages:_
[_Português_](https://github.com/OlirumNunes/API_Bank/blob/main/LEIA-ME.md)

This project is the creation of an API simulating banking operations. Built using Spring Boot, it performs all CRUD
operations. In addition to storing all transactions in a bank, it creates a history of transactions when a deposit,
withdrawal or transfer is made between registered accounts.

## Project Structure

The project is organized into the following packages:

- `controller`: Controller for managing accounts.
- `dto`: Responsible for encapsulating and transferring data between different parts of an application, facilitating
  communication and maintaining a clear separation of concerns.
- `entity`: Represent a business object or concept within the application domain, encapsulating its attributes and
  behaviour, often mapped to a database table, and providing methods for data manipulation and interaction.
- `exception`: Represent exceptional conditions or errors that occur during the execution of a program, providing
  information about the error and facilitating error handling and propagation through the application.
- `mapper`: Maps an AccountDto object to an Account object.
- `repository`: Provide an abstraction layer for accessing and managing data storage.
- `service`: Encapsulate business logic and orchestrate the execution of various operations within the application.

## Main Classes and Interfaces

1. `BankingAppApplication`: Main class to bootstrap the Banking Application.
2. `AccountRepository`: This interface extends JpaRepository to provide basic CRUD operations for Account entities.
3. `TransactionRepository`: This interface extends JpaRepository to provide basic CRUD operations for Transaction
   entities.

## Getting Started

To get started with the project, follow these steps:

1. Clone the repository to your machine.
2. Open the project in your favorite Java IDE.
3. Compile the project using the provided build script or your IDE's build tools.
4. Run the main class to start.
5. Along with the files, there is a json named 'api_bank.postman_collection.json' that can be used to perform operations
   on the DB, just export it in Postman.

ps1.: The application class will automatically create the DB and the columns, you just need to configure your bank with
the correct link, user and password.

ps2.: Remember to change the username and password according to your needs.
<p align="center">
    <img src="https://github.com/OlirumNunes/Back_menuProject/assets/150186772/4ce8947b-c49f-475e-a44c-c9699c259d73" width="250px">
    <img src="https://github.com/OlirumNunes/Back_menuProject/assets/150186772/cc4afa90-db75-40ca-add5-2adf62ad2377">
</p>

## Contributing

Contributions to the project are welcome! If you'd like to contribute, please follow these guidelines:

1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Make your changes and test them thoroughly.
4. Commit your changes and push them to your branch.
5. Submit a pull request with a detailed description of your changes.

## License

This project is licensed under the MIT License. See the `LICENSE` file for more information.
