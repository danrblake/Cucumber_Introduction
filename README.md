# Cucumber_Introduction

## Project Aim
This project was created in order to understand the basic usage and functionality of cucumber within a selenium project.
However this project did evolve into a template for creating web drivers for selenium projects with the use of a properties file
containing the driver paths that are stored locally and the implicit wait time that is required. Alongside this the project does also
aim to provide basic uses of cucumber alongside cukeJunitRunner in order to test specified scenarios using the BBC Website. 

## Prerequisites
In order to utilise the product within this project you will need to download and locally store drivers for any browsers you wish to use
within the testing using selenium. For example chrome driver, firefox(ghecko) etc. Once downloaded store the file paths into the selenium
properties file in order to dynamically create your web drivers for the specified browser. 

## How to use
Once you have added the pre requisites, you will need to create a SeleniumConfig instance and specify the browser you want to use. 
After this create an instance of BBC Site and pass through the driver (using the seleniumConfig.getDriver()). Once done specify the page
you wish to access and run methods within each page(see the code for available methods)

## Authors
Daniel Blake

#Version
1.0.0 - 14/11/2018
