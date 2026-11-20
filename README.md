# HyperMotoOS

**HyperMoto OS** is an experimental Android custom-ROM project focused on a polished, glass-inspired interface and a carefully maintained Android foundation.

> **Status: documentation scaffold / not bootable.** This repository does not yet contain a complete Android source tree, device configuration, recovery image, or flashable ROM.

## Goals

- AOSP-based Android foundation with a distinctive HyperMoto identity.
- Launcher with home screen, dock, app library, widgets, and original themed icons.
- Glass-inspired control center, notification shade, lock screen, and status-bar styling.
- HyperMoto Settings and first-boot setup experience.
- Privacy-first custom keyboard using Android's input-method APIs.
- Optional Google Mobile Services integration using properly licensed distribution packages.
- Initial device research for Motorola Moto G60 (**codename: `hanoip`**).

## Principles

1. Android security, accessibility, and app compatibility come first.
2. Create an original glass-inspired design; do not copy Apple's proprietary implementation or assets.
3. Use original Squirtle-inspired-but-independent artwork, not Pokémon character artwork without permission.
4. Record upstream sources, exact revisions, licenses, build environment, and test results.
5. Never describe an experimental image as safe or ready to install without device testing.

## Repository map

```text
HyperMotoOS/
├── docs/       # architecture, device research, roadmap
├── design/     # original visual design assets
├── packages/   # planned Android application modules
├── .gitignore
├── LICENSE
└── README.md
```

This is a project scaffold, not the Android platform source tree.

## Target device

The first research target is the Motorola Moto G60 (`hanoip`). Community device trees exist, but their branches, vendor blobs, kernel compatibility, and build status need an audit before choosing a base. See [Device Support](docs/DEVICE_SUPPORT.md).

## Google apps and services

Google Play services, Play Store, and Gmail are proprietary Google components. They are not part of AOSP and cannot simply be copied into this repository. Any future integration must follow applicable Google licensing, certification, and distribution requirements. Keep the base build separable from optional licensed packages.

## Disclaimer

HyperMotoOS is an independent community project and is not affiliated with Google, Motorola, Apple, or The Pokémon Company. Android is a trademark of Google LLC. Third-party names and marks belong to their respective owners.
