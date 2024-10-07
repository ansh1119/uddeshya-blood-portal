# Uddeshya Blood Portal

**Uddeshya Blood Portal** is an Android app that enables college students to sign in and input their blood group and other relevant data to assist a campus-based NGO in organizing and managing blood donations more efficiently.

## Features
- **Student Sign-In**: Students can securely sign in using their email or college credentials.
- **Blood Group Input**: Allows students to input and store their blood group and other important health information.
- **Firebase Integration**: Data is securely stored in Firebase Firestore, making it easily accessible for the NGO.
- **Donation Coordination**: The portal helps the NGO manage blood donation drives by maintaining an up-to-date list of potential donors.
- **Donation History**: Students can view their past donations and receive notifications for future donation opportunities.

## Tech Stack
### Frontend
- **Android (Jetpack Compose)**: The modern UI toolkit for building native Android apps, ensuring a smooth and intuitive user experience.
  
### Backend
- **Firebase Firestore**: Secure and scalable database for storing student data and blood donation information.
- **Firebase Authentication**: Allows for secure sign-in with email or social providers.
- **Firebase Cloud Messaging**: Used for sending notifications to users about upcoming donation drives.

## Installation & Setup

### Frontend (Android)
1. Clone the repository:
    ```bash
    git clone https://github.com/your-repo/uddeshya-blood-portal.git
    ```
2. Open the project in **Android Studio**.
3. Sync the project to download all required dependencies.
4. Configure Firebase by adding your `google-services.json` file to the `app` directory.
5. Build and run the app on your preferred device or emulator.


## Firebase Services
- **Firebase Firestore**: Stores student profiles, including blood group data and donation history.
- **Firebase Authentication**: Secures the sign-in process for students.

## Contribution
Contributions are welcome! Please follow the steps below:
1. Fork the repository.
2. Create a new branch (`git checkout -b feature-xyz`).
3. Make your changes and commit them (`git commit -m 'Add feature xyz'`).
4. Push to the branch (`git push origin feature-xyz`).
5. Open a Pull Request.

