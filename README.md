# HyperMotoOS

**HyperMoto OS** is an experimental Android custom-ROM project. The goal is a real operating-system build based on AOSP or a compatible Android ROM foundation, with HyperMoto changes integrated into Android's framework, SystemUI, Settings, setup flow, and device configuration.

> **Status: early ROM scaffold — not buildable and not bootable.** This repository does not contain the Android platform source tree, a pinned upstream manifest, complete device tree, kernel, vendor blobs, or flashable images.

## Project direction

HyperMoto is **not a launcher project**. The repository is organized for ROM source integration:

- `manifest/` — pinned upstream and local Android source manifest.
- `device/motorola/hanoip/` — Motorola Moto G60 device integration work area.
- `system_ext/` — planned ROM-level SystemUI, Settings, setup, and framework integration.
- `vendor/hypermoto/` — original HyperMoto product configuration.
- `docs/` — architecture, device research, and roadmap.

AOSP is a large multi-repository source tree. It is obtained separately with Google's `repo` tool; this GitHub repository will hold HyperMoto's manifest and original integration changes.

## Target device

Initial research target: Motorola Moto G60, codename `hanoip`. Candidate community trees are listed in [device support](docs/DEVICE_SUPPORT.md). They must be audited and pinned before any build can be claimed.

## Planned ROM features

- Original glass-inspired Android SystemUI, including status bar, battery percentage, notifications, and control center/quick settings.
- HyperMoto Settings and first-boot setup experience.
- System-level icon/theme resources and original artwork.
- Optional Google Mobile Services integration only through appropriately licensed distribution.
- Device-specific support with documented kernel, firmware, and vendor requirements.

## Important boundaries

- No destructive repartitioning as part of setup. Respect the device's existing partition layout.
- Google Play services, Play Store, and Gmail are proprietary Google components; do not commit APKs or redistribute them without authorization.
- Use original artwork and properly licensed assets. Do not copy Apple's proprietary assets or Pokémon character artwork without permission.
- Never label a build safe, stable, or flashable until it has been reproducibly built and tested on the exact target device.

## Current status

See [Roadmap](docs/ROADMAP.md), [Architecture](docs/ARCHITECTURE.md), and [Moto G60 device research](docs/DEVICE_SUPPORT.md).

HyperMotoOS is independent and is not affiliated with Google, Motorola, Apple, or The Pokémon Company.
