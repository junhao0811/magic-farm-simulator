# 🐄 Magic Farm Simulator

A text-based farm management game in Java. Run a farm of magical creatures: feed them, collect their produce, sell what you don't need and earn XP. But keep an eye on the sharks…

```
Farmer [Experience: 0 out of 100]
a: Feed this MagicDuck Name: Donald, Age: 3 days, Hunger Level: 12, Egg Quantity: 3
b: Collect from MagicDuck Name: Donald, Age: 3 days, Hunger Level: 12, Egg Quantity: 3
e: Feed this MagicCow Name: Moozy, Age: 5 days, Hunger Level: 12, Milk Quantity: 10
g: Sell this MagicCow Name: Moozy, Age: 5 days, Hunger Level: 12, Milk Quantity: 10
m: Feed this MagicShark Name: Storm, Age: 8 days, Hunger Level: 92
```

---

## ✨ Features

- **Magical creatures**, each with their own rules:
  - 🦆 **Ducks** lay eggs you can collect
  - 🐄 **Cows** produce milk, but they can fall sick: feeding gives a chance of recovery, and a neglected cow may stop producing milk for good
  - 🦈 **Sharks** can be sold for XP, but let one get too hungry and it ends your run
- **Context-aware menu**: each creature only offers the actions it supports (feed, collect, sell)
- **Inventory and selling**: collected eggs and milk go to your inventory and can be sold
- **Goal**: earn XP from your actions and reach 100 XP to win

---

## 🏗️ Design

Built step by step with a focus on clean object-oriented design and **SOLID** principles:

- **Capabilities as interfaces**: `Collectible`, `Sellable` and `ActionCapable` describe what a creature or item can do, so the menu is built from capabilities rather than `instanceof` checks
- **Actions as objects**: `FeedAction`, `CollectAction` and `SellAction` share a common `Action` abstraction, so new actions plug in without changing the menu
- **Open for extension**: adding a new creature means writing one class, not editing existing ones

```
src/
├── actions/       FeedAction, CollectAction, SellAction
├── capabilities/  Collectible, Sellable, ActionCapable
├── creatures/     MagicCow, MagicDuck, MagicShark
├── farm/          Farmer, MagicFarm
├── items/         Egg, Milk
└── ui/            Menu
```

UML diagrams for each stage of development and a design rationale are in [`design/`](./design). Generated Javadoc is in [`javadoc/`](./javadoc).

---

## 🚀 Run it

**Requires Java 17+.**

```bash
javac -d out $(find src -name "*.java")
java -cp out main.Application
```

Then pick actions by typing the letter next to them.

## 🌿 Branches
Each stage of development lives on its own branch (`week1`, `bootcamp-week-2` … `bootcamp-week-5`), so you can see the design evolve from a simple model to the final version.
