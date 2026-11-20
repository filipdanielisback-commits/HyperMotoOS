# HyperMotoOS roadmap

## Phase 0 — Project foundation
- [x] Repository documentation scaffold
- [x] Project principles and licensing boundaries
- [x] Moto G60 codename and candidate upstream references
- [ ] Choose Android base and pin manifest revision
- [ ] Audit device, common, kernel, and vendor dependencies

## Phase 1 — Design prototype
- [ ] Define colors, typography, spacing, motion, and shape tokens
- [ ] Create original Squirtle-inspired-but-independent mascot/icon artwork
- [ ] Prototype launcher, dock, and app library
- [ ] Prototype control center and notification concepts
- [ ] Define status-bar and battery presentation
- [ ] Design setup assistant screens

## Phase 2 — Android app prototypes
- [ ] HyperMoto Launcher
- [ ] HyperMoto Settings companion screens
- [ ] HyperMoto Control Center prototype
- [ ] HyperMoto Setup experience
- [ ] HyperMoto Keyboard with privacy-first input handling
- [ ] Icon and wallpaper package

## Phase 3 — Platform integration
- [ ] Integrate selected SystemUI changes
- [ ] Integrate settings overlays and default configuration
- [ ] Integrate setup flow with Android first-boot lifecycle
- [ ] Validate permissions, SELinux, signing, and compatibility
- [ ] Keep Google packages optional and properly licensed

## Phase 4 — Device bring-up
- [ ] Validate pinned hanoip source set
- [ ] Produce reproducible engineering build
- [ ] Run build-time checks
- [ ] Test boot and core hardware functions on a dedicated test device
- [ ] Document known issues and recovery limitations

## Phase 5 — Alpha
- [ ] Publish source revision and build provenance
- [ ] Publish checksums and known issues
- [ ] Invite testers only after device validation
- [ ] Collect bug reports and iterate

## Release policy

A milestone is not a release merely because code exists. Alpha requires a reproducible build; a device alpha requires verified boot and basic hardware testing. Stable requires sustained testing, security updates, and a documented recovery process.
