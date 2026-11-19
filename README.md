# Reforged IME Support

A client-side NeoForge mod focused on reliable operating-system input method editor (IME) support in Minecraft.

## Goals

- Restore reliable IME activation and language switching in Minecraft text fields.
- Preserve native pre-edit/composition text and candidate selection behavior.
- Keep the native candidate window aligned with the active text caret.
- Test Windows 11 with Microsoft Pinyin and Rime (小狼毫) first.
- Keep platform-specific code isolated so Linux and macOS support can be added later.

## Compatibility target

- Minecraft: 26.3
- NeoForge: 26.3.x
- Java: 25
- Initial platform: Windows 11

## Engineering approach

This project will first reproduce and instrument the input path before applying invasive patches:

1. Record SDL text-input and composition events reaching Minecraft.
2. Verify how text-input activation follows the focused GUI widget.
3. Inspect candidate-window positioning and native window focus/IME association.
4. Prefer supported Minecraft/NeoForge and SDL APIs; use narrowly-scoped mixins only where required.
5. Keep a reproducible test matrix for chat, creative search, signs, anvils, and modded text fields.

The mod does **not** bundle an input method or replace Microsoft Pinyin/Rime. It aims to make the game's native IME integration work correctly.

## Build

Use JDK 25 and Gradle 9.2.1 or newer.

```powershell
gradle build
gradle runClient
```

A Gradle Wrapper will be added with the first verified local wrapper setup.

## Status

Early project scaffold. No IME fix is claimed yet. The first milestone is an instrumented client build that can capture and report text-input behavior without changing it.
