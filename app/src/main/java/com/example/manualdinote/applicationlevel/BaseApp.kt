package com.example.manualdinote.applicationlevel

import android.app.Application

// what is application level class ? - It is the base class for maintaining global application state.In detail it is the base class for those who need to maintain global application state. You can use it to initialize libraries,
// what is global application state ? = It is the state that is shared across the entire application, such as configuration settings, resources, or services that need to be accessed by multiple components of the app.
class BaseApp: Application() {
    // first you introduce it into the android manifest file
    var car = Car(
        engine = Engine(),
        wheel = Wheel()
    )
}