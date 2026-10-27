# Android Fab Passcode

A first Android app (CSCI3310): a numeric passcode unlock screen.

## What it does

- Tap the number buttons to build a passcode, shown on screen as you type.
- Tap Unlock to check it.
- **Correct code:** a hidden image is revealed, a "Bingo!" message appears,
  and the number buttons are disabled.
- **Wrong code:** an "Incorrect Passcode" message appears and the entry
  resets so you can try again.

## Run it

Open the project in Android Studio and run it on an emulator or a device
(a Gradle wrapper is included, so no separate Gradle install is needed).

## Structure

| Path | What it is |
| --- | --- |
| `app/src/main/java/edu/cuhk/csci3310/MainActivity.java` | The single activity: passcode entry, unlock check, image reveal |
| `app/src/main/AndroidManifest.xml` | Manifest (package `edu.cuhk.csci3310`, `MainActivity` as launcher) |
| `app/src/main/res` | Layouts and resources |
| `app/build.gradle`, `build.gradle` | Gradle build configuration |
