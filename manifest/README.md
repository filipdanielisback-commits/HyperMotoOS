# HyperMoto AOSP manifest

This repository is intended to become the **local manifest and device-integration layer** for HyperMotoOS, a ROM built directly on AOSP.

AOSP is a very large multi-repository source tree and is not copied into this GitHub repository. A build machine obtains the selected upstream Android projects with Google's `repo` tool, then applies the pinned HyperMoto local manifest and device-specific repositories.

## Current status

**Not buildable yet.** No upstream AOSP manifest revision or hanoip device/kernel/vendor revisions have been approved and pinned. Do not run a ROM build or flash anything based on this scaffold.

## Planned files

- `default.xml` — pinned upstream AOSP projects plus HyperMoto local projects (to be added after source audit).
- `README.md` — this document.

## AOSP source selection

Use Google's official `android-latest-release` manifest as the starting point for a new AOSP checkout, then record the exact resolved revisions used by a reproducible build. Do not assume the newest AOSP release is compatible with the older Moto G60 device sources; platform and device compatibility must be demonstrated first.

Official instructions: https://source.android.com/docs/setup/download

## Manifest policy

- Pin immutable commit revisions for all device-specific repositories.
- Keep the platform base AOSP; do not silently switch to LineageOS or another ROM base.
- Do not use floating branches for release builds.
- Keep proprietary firmware and Google packages out of this public repository.
- Preserve every upstream project's license and NOTICE requirements.
- Record exact build instructions and checksums for each tested output.

## Next gate

Audit the candidate AOSP-compatible Moto G60 device tree, common tree, kernel, vendor blobs, and required firmware. Then select a compatible AOSP revision and create a reproducible manifest.
