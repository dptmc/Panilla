# Panilla
Panilla (the name) is a combination of the word Packet and Vanilla (as in Vanilla Minecraft).

[Support the development of this plugin and purchase a precompiled .jar file on SpigotMC](https://www.spigotmc.org/resources/65694/) (or compile your own for free)

## Supported Platforms
Currently Panilla supports:
- Bukkit
  - CraftBukkit*    1.8.8
  - CraftBukkit*    1.12.x
  - CraftBukkit*    1.13.x
  - CraftBukkit*    1.14.x
  - Glowstone       1.12.2 / 2018_9_0 (work in progress)
  
  **CraftBukkit includes any CraftBukkit derivatives (Spigot, Paper, etc)*
- Sponge
  - Forge           1.12.2 (work in progress)

If you would like support for a server platform or Minecraft version that is not listed, please make an issue on GitHub.  

## Overview
Panilla is software to prevent abusive NBT and packets on Minecraft servers.

With this software, you will be able to prevent:

- Unobtainable Enchantments (eg. Sharpness X)
- Unobtainable Potions (eg. Insta-kill)
- Unobtainable Fireworks
- Crash Books
- Crash Signs
- Crash Chests/Shulker Boxes
- Crash Potions (invalid CustomPotionColor\s)
- Oversized packets (which crash the client)
- Long item names/item lore
- Additional "AttributeModifiers" on items (eg. Speed)
- Unbreakable items
- and more abusive NBT

## Compiling
In order for you to compile Panilla, you will need to use [BuildTools, by SpigotMC](https://www.spigotmc.org/wiki/buildtools), and build each version of CraftBukkit which is supported by Panilla.
When you run BuildTools, it will add the dependencies required (CraftBukkit/Bukkit) to your local Maven repository.
From there, you can compile the project with `./gradlew build`. The output plugin jars file will located in the `target/` directory.
