# Noah's Ark - Class UML Structure

I assume this is what you have been meaning on doing so I got AI to write it up for you, however if this was not what you were intending **please try and do it yourself**!


## Class Hierarchy

```
                          Animal (Interface)
                               △
                               |
                        AbstractAnimal
                         /    |    \
                        /     |     \
                   Mammal  NonMammal  (abstract classes)
                    /         \
                   /           \
        [Aquatic, Flying]  [Aquatic, Flying]
```

## Detailed Hierarchy

### Top Level

```
Animal (interface)
├── makeSound()
├── reproduce()
└── call()
```

### Abstract Classes

**AbstractAnimal** (implements Animal)
- `protected String name`
- Constructor: `AbstractAnimal(String name)`
- `call()`: prints `"<name> coming..."`
- `toString()`: returns name

**Mammal** (abstract, extends AbstractAnimal)
- Base class for all mammal types

**NonMammal** (abstract, extends AbstractAnimal)
- Base class for all non-mammal types

## Mammal Categories

### 1. Default/Land Mammals
**AbstractAnimal → Mammal**
- Dog
- Cat
- Bear
- Monkey
- Shark (special: aquatic mammal with mammal reproduction)

### 2. Aquatic Mammals
**AbstractAnimal → AquaticMammal** (extends AbstractAnimal)
- Inherits: `call()` prints `"<name> will not come..."`
- Whale
- Dolphin
- Shark (classified as aquatic but gives birth)

### 3. Flying Mammals
**AbstractAnimal → FlyingMammal** (extends AbstractAnimal)
- Inherits: `call()` prints `"<name> now flying, will come later when tired..."`
- Bat

## Non-Mammal Categories

### 1. Default/Land Non-Mammals
**AbstractAnimal → NonMammal**
- Snake
- Lizard

### 2. Aquatic Non-Mammals
**AbstractAnimal → AquaticNonMammal** (extends AbstractAnimal)
- Inherits: `call()` prints `"<name> will not come..."`
- Frog
- Crocodile
- Salmon

### 3. Flying Non-Mammals
**AbstractAnimal → FlyingNonMammal** (extends AbstractAnimal)
- Inherits: `call()` prints `"<name> now flying, will come later when tired..."`
- Eagle
- Owl
- Pigeon
- Fly
- Beetle

## Complete Class Diagram

```
                         ┌──────────────┐
                         │   Animal     │
                         │  (interface) │
                         └──────────────┘
                               △
                               │
                    ┌──────────────────────┐
                    │  AbstractAnimal      │
                    ├──────────────────────┤
                    │ - name: String       │
                    ├──────────────────────┤
                    │ + call(): void       │
                    │ + makeSound(): void  │
                    │ + reproduce(): void  │
                    │ + toString(): String │
                    └──────────────────────┘
                      △               △
           ┌──────────┘               └──────────┐
           │                                      │
    ┌─────────────┐                      ┌─────────────────┐
    │   Mammal    │                      │   NonMammal     │
    └─────────────┘                      └─────────────────┘
     △    △    △                          △        △
     │    │    │                          │        │
     │    │    │                          │        │
  Default Aquatic Flying             Aquatic   Flying
     │      │      │                   │          │
     │      │      │                   │          │
  [Dogs]  [Whale]  [Bat]          [Frog]    [Eagles]
  [Cats]  [Dolphin]               [Salmon]  [Pigeons]
  [Bears] [Shark]                 [Croc]    [Flies]
  [Monkey]                         [Shark]   [Owls]
                                            [Beetles]
```

## Method Inheritance - call()

| Class Type | call() Output |
|----------|--------------|
| AbstractAnimal (default land mammals/non-mammals) | `"<name> coming..."` |
| AquaticMammal, AquaticNonMammal | `"<name> will not come..."` |
| FlyingMammal, FlyingNonMammal | `"<name> now flying, will come later when tired..."` |

## Complete Animal List

### Mammals
- **Land Mammals**: Dog, Cat, Bear, Monkey
- **Aquatic Mammals**: Whale, Dolphin
- **Flying Mammals**: Bat

### Non-Mammals
- **Land Non-Mammals**: Snake, Lizard
- **Aquatic Non-Mammals**: Frog, Crocodile, Salmon, Shark
- **Flying Non-Mammals**: Eagle, Owl, Pigeon, Fly, Beetle

## Design Pattern

**Key Design Principle**: Method implementation is NOT duplicated in concrete classes. Instead, the `call()` method is implemented at the appropriate level in the class hierarchy:

- Base implementation in `AbstractAnimal` for default behavior
- Overridden in `AquaticMammal` and `AquaticNonMammal` for aquatic animals
- Overridden in `FlyingMammal` and `FlyingNonMammal` for flying animals

All concrete animal classes (Dog, Cat, Eagle, etc.) inherit the `call()` method from their parent class and do not reimplement it.
