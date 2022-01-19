# Patentify 📱
## Android app for managing patent applications efficiently 

Patentify application is developed for the Intellectual Property cell of Cummins college. The IP cell handles the patent applications filed by the students and faculty and keeps track of the applications through all the stages from filing till grant of patent. 

The application automates the management of the patent applications and provides an easy way to add, update and view the records.It intends to save time by reducing the heavy manual work, which is otherwise involved in maintaining the application records. The application also intends to send timely notifications to the admin, reminding him/her to fill the required forms and to check application status during the patent filing process.

At present this work is done manually by the IP cell head, which involves a lot of paperwork and consumes enormous time. It is also prone to errors, data redundancy or time delay. The patent application manager app helps overcome all these issues.


![Patentify_presentation](https://user-images.githubusercontent.com/73184612/150106310-0af182e6-b05a-499f-846a-750789aefb1a.jpg)
![Patentify_presentation2](https://user-images.githubusercontent.com/73184612/150106696-461fc0dd-f262-4d5b-a61d-c7746eb22a31.jpg)



### Functionalities for Administrator 👨‍⚖️:
- Login
- Create Login for user
- Add new patent application
- Search and view the required application(s)
- Update application details
- Receive reminder notifications

### Functionalities for Users 👨‍👧‍👦:
- Login
- Search and view the required application(s)

## Module Wise Details:
### ✨ Welcome screen: 
A splash screen to describe the purpose of the application that stays on the screen for 3-4 seconds app and automatically displays the next page i.e. Login page

### ➡️ Login page: 
Allows the Admin or Users to login to the app by entering their credentials.
In case the user tries to login without filling either the username or password, the user is prompted not to leave any field blank. If the username and password combination is wrongly entered, an error message pops up on the screen.

### ℹ️ Menu page:
Displays the various options for the user/ admin such as “Add new application”, “Update an application”, ”Search records” and Logout. When one of the options buttons is pressed, the corresponding page opens.

### ✏️ Update Menu:
The page appears when the “Update Application” option is selected by the Admin. It displays all the patent application related forms arranged in a grid view. The form which is selected by the Admin is opened.

### 📝 Forms:
Forms are created by combining different widgets such as TextInput, TextView, Buttons, DatePicker, Switches,   RadioButton, Spinner, etc. Confirmation or error messages are shown using popups or toasts.
The information entered and submitted through these forms will be stored in the sqlite database.
There are 6 different forms that the Admin can fill to enter or update the information of a patent application.
Add new application details
2.   Provisional to Complete Filling
3.   Publication details
4.   FER details
5.   Hearing status
6.   Grant/ Reject status

### 👀 View Application:
This page allows the Admin/User to search and view an application by entering the patent application number. Searching  data by other attributes such as Applicant name, Inventor name, publication date, status, etc. and filters to show specific records will be future enhancement.

### 🔔 Reminder Notifications:
The Admin will receive timely notifications to remind them to fill certain forms before deadline or to check and update the status of particular applications.
*** 
## Technological features covered:

✅ Creating Android application using Java in Android Studio and running it on a virtual device </br>
✅ Using different layouts such as constraint layout, linear layout and relative layout </br>
✅ Using the material design library in android app </br>
✅ Using different widgets like spinner, Datepicker, inputbox, checkbox, toasts wherever required </br>
✅ Binding buttons to specific functions</br>
✅ Using Intents in android to create multi screen application</br>
⬜ Connecting android app with sqlite database and storing, fetching and modifying data from the database 


