# Motorola Moto G60 device support

## Target identity

- Device: Motorola Moto G60
- Codename: `hanoip`
- Device family: Moto G40 Fusion / Moto G60
- HyperMoto status: **research only; no build configured**

## Candidate upstream references

These are research references, not vendored code:

- AOSP-oriented device tree candidate: https://github.com/bhawesh2002/android_device_motorola_hanoip
- Older device tree: https://github.com/motorola-sm6150-devs/android_device_motorola_hanoip
- Related device tree: https://github.com/motorola-sm6150-devs/device_motorola_hanoip
- Common device configuration: https://github.com/LineageOS/android_device_motorola_sm6150-common
- Moto-common target status: https://github.com/moto-common/android_device_motorola_targets

The AOSP-oriented candidate contains AOSP-specific product files, but its compatibility with a current AOSP release has not been established. Other available trees include older LineageOS-era branches. A Moto-common target listing marks hanoip as dropped, so we must not assume an old tree builds against a newer Android base.

## Audit required before platform work

1. Confirm the exact handset variant and codename.
2. Inspect device-tree dependencies and selected branch history.
3. Identify matching common tree, kernel source, vendor tree, firmware baseline, and proprietary-file requirements.
4. Check licenses, activity, and compatibility for every source.
5. Pin selected commit hashes in a local manifest.
6. Establish a reproducible build environment and run source/build validation before any device testing.

## Data protection

- Do not repartition the phone as part of setup.
- Do not test experimental builds on a primary-use phone.
- Back up important data before any future bootloader or ROM experiments; bootloader operations can erase user data.
- Do not publish installation instructions until a device-specific recovery path and tested images exist.
- Never label an untested image stable or safe to install.

## Conclusion

The Moto G60 is a plausible research target because community device trees exist. The available references do not establish that HyperMoto currently builds or boots on it.
