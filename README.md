# NASA App

NASA App is a demo application for Juno Android Developer Recruitment developed and designed using [Nasa's Astronomy Picture of the Day](https://apod.nasa.gov/apod/).

## Download [APK](https://github.com/nitish9t7/NASA-App/raw/359723095795a490888f38cb566930a144d97d42/app/build/outputs/apk/debug/app-debug.apk)

### API Base URL
    https://api.nasa.gov/
### Routes
    planetary/apod

### Queries
	1st Hit (When App Launches): 
	        api_key = DEMO_KEY
	2nd Hit (When User Select the date):
	        api_key = DEMO_KEY & date = YYYY-MM-DD
### DEMO TEST
    For Video Check, Select Date - 2020-06-16
    
    For Image Check, Select Date - 2020-06-25
    
    
## Tech
- Written in [Kotlin](https://kotlinlang.org/)
- Video Playing With [PierfrancescoSoffritti/android-youtube-player](https://github.com/PierfrancescoSoffritti/android-youtube-player)
- Styled with [Material Components for Android](https://github.com/material-components/material-components-android)
- Networking with [OkHttp](https://square.github.io/okhttp/) + [Retrofit](https://square.github.io/retrofit/)
- Image loading with [Glide](https://bumptech.github.io/glide/)
- Local database persistence with [Room](https://developer.android.com/topic/libraries/architecture/room)
- Dependency Injection with [Hilt](https://dagger.dev/hilt/)
- Leak Detection with [LeakCanary](https://square.github.io/leakcanary/)

## Build
- Android Studio
