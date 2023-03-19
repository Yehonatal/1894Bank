# 1894Bank
#### JavaFx Banking Project

This is a JavaFX banking project of me trying to learn Java and implement basic banking operations such as 
account creation, balance transfer, and transaction history. Following a bunch of tutorials to figure stuff
out it's probably not done right but is just a fun little project :) plan is to finish if 
in a couple of day's


### Features

- User authentication and account creation
- Account dashboard displaying current balance and transaction history
- Transfer funds to other accounts within the system
- View transaction history and filter by date range
- Password encryption for secure user authentication


#### Technologies Am learning along the way :)

- Java
- JavaFX 
- sqLight
- Scene Builder
- IntelliJ IDEA



#### CheckList
    - UI [On]
    - Dependecies [Done]
    - Backend 
        - Account Creation
        - Balance transfer
        - Authentication
        - other ...
    - Database [Done]
    - Connect backend with the UI
    - Deploy

### Note 

        1: -> Creating Project Structure 
                Main/Java/project package directory 
                    1: Create a App class 
                    [Package]
                        1: Controllers 
                            [Folder for each controller]
                                -> Class for each controller
                        2: Models (Data models)
                            -> Class for the model
                        3: Views (Central class the controls the UI)
                            -> Class for the view (Ex. ViewFactory)

                Main/resources/project package directory 
                    [Fxml files]
                        1: Folder for each Page 
                            -> file.fxml [link with the controller]
                    [Content files]
                        1: Images (for different content, logo, svg ... etc)
                    [Style files]
                        1: Style for each page  

        2: -> Dependencies 
                Adding the needed modules [pom.xml]


## License

This project is licensed under the MIT License - see the `LICENSE` file for details.