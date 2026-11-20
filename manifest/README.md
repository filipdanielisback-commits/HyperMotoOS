# HyperMoto ROM manifest

This repository is intended to become the **local manifest and device-integration layer** for a real Android ROM.

AOSP itself is a very large multi-repository source tree and is not copied into this GitHub repository. A build machine obtains the selected upstream Android projects with Google's `repo` tool, then applies the pinned HyperMoto local manifest and device-specific repositories.

## Current status

**Not buildable yet.** No upstream Android manifest revision or hanoip device/kernel/vendor revisions have been approved and pinned. Do not run a ROM build or flash anything based on this scaffold.

## Planned files

- `default.xml` — pinned upstream project manifest plus HyperMoto local projects (to be added after source audit).
- `README.md` — this document.

## Manifest policy

- Pin immutable commit revisions for all device-specific repositories.
- Select one Android base only after checking its security support and device-tree compatibility.
- Do not use floating branches for release builds.
- Keep proprietary firmware and Google packages out of this public repository.
- Preserve every upstream project's license and NOTICE requirements.
- Record exact build instructions and checksums for each tested output.

## Next gate

Audit the candidate Moto G60 device tree, common tree, kernel, vendor blobs, and required firmware. Then select a compatible Android base and create a reproducible manifest.
