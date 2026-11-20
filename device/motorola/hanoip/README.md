# HyperMoto device integration: Motorola hanoip

Target: Motorola Moto G60 (codename `hanoip`).

**Status: research scaffold only.** This directory is not a device tree and contains no product makefiles, BoardConfig, init scripts, sepolicy, kernel, or vendor blobs.

## Candidate upstream sources

- https://github.com/motorola-sm6150-devs/android_device_motorola_hanoip
- https://github.com/motorola-sm6150-devs/device_motorola_hanoip
- https://github.com/LineageOS/android_device_motorola_sm6150-common
- https://github.com/moto-common/android_device_motorola_targets

These links are leads for investigation, not approved dependencies. Audit the actual branches, commit history, license, manifest dependencies, kernel compatibility, and vendor extraction process before importing code.

## Required bring-up work

- Confirm exact device variant and codename.
- Select compatible device and common trees.
- Identify kernel source and toolchain requirements.
- Document vendor blob extraction and firmware baseline.
- Review init, fstab, partition metadata, AVB, encryption, and SELinux configuration against authoritative device sources.
- Build and test incrementally on a dedicated test device.

No generic partition editor or repartitioning procedure belongs in the first-boot assistant. Device storage layout must be respected, not guessed.
