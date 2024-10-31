# MyContacts - Android Application

## Description
Develop an Android application that demonstrates understanding of basic Android development using Kotlin, Jetpack Compose, Material Design 3, and MVVM architecture.

### Features:
1. **Main Activity:**
   - Displays a logo and an image button.
   - When the user clicks on the image button, navigate to the second activity.

2. **Second Activity:**
   - Allows users to add a new contact with fields for name, phone number, and email.
   - Uses either checkboxes or radio buttons to select the contact type (e.g., Friend, Family, Work). Use checkboxes if your first name starts with A-N, otherwise use radio buttons.
   - Displays a Snackbar with the entered contact details upon clicking the "Add Contact" button.
   - Displays a list of added contacts using a LazyColumn.

## Requirements:
1. **Main Activity (UI and Event Handling):**
   - Use Jetpack Compose for the UI components.
   - Implement navigation to the second activity.

2. **Second Activity (UI, Event Handling, MVVM Architecture):**
   - Use Jetpack Compose for UI components.
   - Implement form fields for entering contact details.
   - Implement checkboxes or radio buttons for contact type selection.
   - Display the entered contact details in a Snackbar.
   - Use ViewModel for managing UI-related data.
   - Use LazyColumn to display the list of added contacts.
