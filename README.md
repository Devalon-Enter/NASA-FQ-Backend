**To run this application**
You need two things to do first in order to run the application on a local machine.
1. Get an api-key to use the open-source API's from NASA. This key can be generated for free. The key must be placed within an **application.properties** file that should be created inside the resource folder of this app. The value name should be: **token=<Your API-KEY>**
2. Create a **LocalConfig** File inside the nasaapp-package. Inside this config define a method restTemplate() with the bean annotation. The method should simply return a new RestTemplate(). 
