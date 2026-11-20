# HyperMotoOS ROM roadmap

## Phase 0 — ROM foundation
- [x] Refocus repository on a real Android ROM (not a launcher)
- [x] Create manifest, device, system-extension, and vendor integration work areas
- [x] Document Moto G60 research leads and licensing boundaries
- [ ] Select maintained Android base and pin exact manifest revision
- [ ] Audit and pin hanoip device/common/kernel/vendor dependencies
- [ ] Establish reproducible build host and build instructions

## Phase 1 — Device bring-up
- [ ] Verify exact Moto G60 variant and codename
- [ ] Resolve device tree dependencies and firmware baseline
- [ ] Validate kernel source/toolchain compatibility
- [ ] Build unmodified base ROM first
- [ ] Test boot and core hardware functions on a dedicated test device
- [ ] Document recovery limitations and known issues

## Phase 2 — HyperMoto ROM identity
- [ ] Add HyperMoto product branding and boot animation
- [ ] Implement original framework resource overlays and theme
- [ ] Integrate HyperMoto SystemUI changes (status bar, battery display, quick settings)
- [ ] Integrate notification and lock-screen styling
- [ ] Implement system-level icon theme with original artwork
- [ ] Integrate HyperMoto Settings

## Phase 3 — First boot and system apps
- [ ] Integrate a ROM-level setup experience using Android setup APIs
- [ ] Add language, region, Wi-Fi, privacy, and restore/setup choices
- [ ] Keep partition layout handling device-specific and non-destructive
- [ ] Evaluate optional, properly licensed Google services distribution
- [ ] Add and test other system applications only where licensing permits

## Phase 4 — Validation
- [ ] Run build and static checks
- [ ] Validate permissions, SELinux, signing, encryption, and OTA assumptions
- [ ] Test camera, audio, radio, Wi-Fi, Bluetooth, GPS, sensors, and charging
- [ ] Test Android compatibility and security updates
- [ ] Publish build provenance, checksums, and known issues

## Release policy

The repository scaffold is not a ROM build. A device alpha requires a reproducible image that boots on the exact target and passes documented basic hardware tests. Stable requires sustained testing, security maintenance, and a tested recovery process.
