# HyperMoto Launcher prototype

This is the first Android application module in HyperMotoOS.

- Package: `org.hypermoto.launcher`
- Version: `0.1.0-prototype`
- Minimum SDK: 26
- Compile/target SDK: 35
- Language: Kotlin
- UI: native Android Views (no external runtime dependencies)

The activity registers as a HOME candidate so Android can offer it as a launcher. Its app tiles and dock are currently visual placeholders. It does not yet enumerate or launch installed apps, replace SystemUI, implement an app library, or provide system-level control-center access.

Build verification has not yet been run. Use a local Android SDK and JDK 17 to validate the Gradle project before installing this prototype.
