# BuildItBigger

**BuildItBigger** is an android app that has multiple flavors and uses multiple 
libraries and Google Could Endpoints to retrieve jokes. The app has four modules. 
A Java library that provides jokes, a Google Cloud Endpoints (GCE) project that 
serves those jokes, an Android Library containing an activity for displaying jokes, and an 
Android app that fetches jokes from the GCE module and passes them to the Android Library for display.

##Installation
This app is written for Android. Please run backend to retrive jokes.

##Contributions
Program written by Udacity. Troy Gugler added the following to the program:

* Added free and paid flavors to an app
* Configured a multi project build to compile the libraries I added to the app
* Used the Gradle App Engine plugin to deploy a backend
* Make the free app variant display interstitial ads between the main activity and the joke-displaying activity.
* Have the app display a loading indicator while the joke is being fetched from the server.

