# ☕ BensCoffeeStoreProject

## 🔎 Overview
This Web site represents a multi layers web site serving costumers(viewing products) and managers (adding, deleting ,previewing and updating products) harnessing the power of Nuxt – js framework, REST api and java beckend for project service.

## 📋 Project Structure and Database Handling:
The Back End side of the project (Java Springboot) is built in a way that allows several kinds of databases to be implemented to the site,
implementing all basic database methods (Post,Get,Put,Delete) using Java SpringBoot controller that verifies, manipulates and uses that methods so that the products could be shown and used inside the Front End side of the projects which is the nuxt js application 

## 🔧 Running the site 
1. Download the project from the repository.
2. Open the project's folder via Visual Studio (Recommended) or other Java/npm supported IDE.
3. make sure you have npm, vue, nuxt packages installed on the IDE.
4. Run the Main method on the file “BenCoffeeStoreApplication.java”.
(BensCoffeeStoreProject/src/main/java/com/example/demo/BenCoffeeStoreApplication.java)

5. Open terminal on the Client folder and run the command - npm run dev.

## 🎥 Demo
### Front End
1.Running java Springboot application

<img width="717" alt="image" src="https://user-images.githubusercontent.com/87472603/205634080-046b4ae2-364e-4408-a08d-9aa7a1591e8c.png">

2.Running Nuxt application using npm run dev and clicking (ctrl+leftclick) on the local host link

<img width="345" alt="image" src="https://user-images.githubusercontent.com/87472603/205634418-4f0627a4-3c82-47e1-aff4-0f8eef822aa6.png">

3.Home Page

<img width="947" alt="image" src="https://user-images.githubusercontent.com/87472603/205634725-6bc59f91-9709-4b06-b469-5bfe4095224b.png">

4.Coffee Machines page (accesed via navigation bar)

<img width="959" alt="image" src="https://user-images.githubusercontent.com/87472603/205634912-144d1adf-9862-4a9f-a1a8-022ace10aeed.png">

5.Management page including product manipulation pages

<img width="958" alt="image" src="https://user-images.githubusercontent.com/87472603/205635004-9743db04-7ad9-446a-8476-e89f19b72597.png">

6.New product page - consists of a bootstrap form, submit and reset buttons and a exemplary json format product object

<img width="945" alt="image" src="https://user-images.githubusercontent.com/87472603/205635940-6e64dfd1-ffa4-4be2-8518-bea7034b3193.png">

7.successful adding - successful message prompt

![image](https://user-images.githubusercontent.com/87472603/205636652-eb3f4d29-24e2-499a-ad49-327703c3010d.png)


8.The product List - Sorted by category using java Comparator class

<img width="958" alt="image" src="https://user-images.githubusercontent.com/87472603/205637561-94c7c8f6-b094-46e9-96fe-6120311e79b1.png">

9.Deleting item 10 with upper button

<img width="958" alt="image" src="https://user-images.githubusercontent.com/87472603/205637285-7850684e-a70d-407a-b933-cf78cce9eb10.png">

<img width="959" alt="image" src="https://user-images.githubusercontent.com/87472603/205637621-513579e6-f083-4a45-bc11-0dfb8fcb4bd1.png">

### Back End

The Back End consists of the following 

1.IProduct - interface for products

2.Product.java - Object class for defining the object Product and its methods

3.Products.java - represents a list of products and its methods

4.ProductComparetor.java - A specific comparetor for comparing by category

5.ProductController.java - connects between the service and the DB

6.ProductService.java - connects between the current representation of product and the DB

7.BenCoffeeStoreApplication.java - Main file, runs the application


The back end implements REST dynamic service which allows easy transformation between **data bases** and between **other types of products**

### 📚 Database
At first the Database was deleted everytime we restarted the service but using a file to save the Database state from service to service fixed this issue so the Database could be consistent

1-succesful "Post" Method

<img width="771" alt="image" src="https://user-images.githubusercontent.com/87472603/206207537-16b25b3b-3801-4206-896a-fbf15053423c.png">

2. succesful "Get" method (all and single item)

<img width="770" alt="image" src="https://user-images.githubusercontent.com/87472603/206207732-508e3244-fcf1-496d-9649-af71e34309f5.png">
<img width="750" alt="image" src="https://user-images.githubusercontent.com/87472603/206208661-b10bc9ca-ff02-4a26-8c7d-ca04d993b03a.png">

3. succesful "Put" method on item 1

<img width="744" alt="image" src="https://user-images.githubusercontent.com/87472603/206209613-485ae3d2-e4d4-42e0-9337-6d016b06bb72.png">
<img width="795" alt="image" src="https://user-images.githubusercontent.com/87472603/206209709-e7d52130-8d09-4c61-b503-16231ccf29e8.png">

4.succesful "Delete" method

![image](https://user-images.githubusercontent.com/87472603/206207939-01b43001-71ea-432d-85e1-80add7645eb2.png)

5. trying to delete item 100 again is unsuccesful 

<img width="772" alt="image" src="https://user-images.githubusercontent.com/87472603/206208135-28fb9043-5643-4b9a-a1f5-c45e6a3a4dab.png">
