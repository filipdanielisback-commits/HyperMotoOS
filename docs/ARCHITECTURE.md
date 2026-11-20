# HyperMotoOS architecture

| Layer | Responsibility | Direction |
|---|---|---|
| Android platform | Framework, runtime, security, compatibility | Build directly from a pinned AOSP release |
| Device support | Board config, kernel, vendor interfaces, init, SELinux | Audit hanoip device and common trees for AOSP compatibility |
| System UI | Status bar, quick settings, notifications, lock screen | Prefer supported SystemUI overlays and limited platform changes |
| Launcher | Home screen, dock, app library, widgets | Separate Android system component; not the HyperMotoOS product itself |
| Theme | Wallpapers, icon resources, colors, glass-like surfaces | Original artwork and accessible resources |
| Setup | First-boot onboarding | Use supported Android setup APIs; no destructive generic partition editor |
| Keyboard | Text input and theme | Android InputMethodService with privacy-first behavior |
| Google integration | Play services, Play Store, Gmail | Optional, properly licensed packages; never commit proprietary APKs |

## AOSP integration principles

- Keep upstream AOSP changes isolated and documented.
- Prefer resource overlays and modular system components where possible.
- Pin exact upstream and device-source revisions in the manifest.
- Track security patches and compatibility changes across platform updates.
- Do not claim support for an AOSP release until the target device has built and passed documented tests.

## UI rules

- Use native Android APIs and accessibility semantics.
- Glass effects must degrade gracefully when blur or transparency is unavailable.
- Preserve text contrast, touch targets, TalkBack labels, and reduced-motion preferences.
- Use supported SystemUI configuration for battery percentage and status-bar styling where possible.
- The keyboard must not collect or transmit typed content. Any optional network feature requires explicit disclosure and consent.
- Do not call a mock screen a system feature.

## Build provenance

Every future build must record the AOSP manifest revision, device/common/kernel/vendor revisions, proprietary blob provenance, build requirements, known issues, and test results.

## Excluded from the first prototype

- Custom repartitioning or destructive disk operations.
- Unlicensed Google applications or proprietary vendor firmware.
- Claims of compatibility or release readiness without successful builds and device testing.
