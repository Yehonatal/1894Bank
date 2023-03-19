# 1894Bank
JavaFx Banking Project

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