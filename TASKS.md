# Git Training Tasks

Original repo: https://github.com/Seif-Ihab/git-training-lab

---

## Golden rule

> Replace the marked lines. Do NOT add a new line next to them.
> If you add instead of replace, there will be no conflict and the exercise fails.

---

## Steps for everyone

1. Fork the repo
2. Clone **your fork** in IntelliJ
3. Create your branch (see your task below)
4. Do your 3 changes
5. Commit
6. Push your branch
7. Open a Pull Request to `Seif-Ihab/git-training-lab` -> `main`
8. Wait for review

---

## Intern A - Multiply

Branch:

```text
feature/<your-name>-multiply
```

### Change 1 - `src/main/java/com/training/Calculator.java`

Replace:

```java
    // TODO: add your operation here
```

With:

```java
    public int multiply(int a, int b) {
        
    }
```

### Change 2 - `src/main/java/com/training/App.java`

Replace:

```java
        System.out.println("Welcome to Git Training Lab");
```

With:

```java
        System.out.println("Welcome from Intern A - <YourName>");
```

Replace:

```java
        System.out.println("Extra operation result = not implemented yet");
```

With:

```java
        System.out.println("4 * 5 = " + calculator.multiply(4, 5));
```

### Change 3 - `team.txt`

Replace:

```text
Owner: TBD
```

With:

```text
Owner: <YourName>
```

Replace:

```text
Current Feature Owner: nobody yet
```

With:

```text
Current Feature Owner: <YourName> - multiply
```

### Commit message

```text
feat: add multiply method and set owner name
```

---

## Intern B - Divide

Branch:

```text
feature/<your-name>-divide
```

### Change 1 - `src/main/java/com/training/Calculator.java`

Replace:

```java
    // TODO: add your operation here
```

With:

```java
    public int divide(int a, int b) {
        
    }
```

### Change 2 - `src/main/java/com/training/App.java`

Replace:

```java
        System.out.println("Welcome to Git Training Lab");
```

With:

```java
        System.out.println("Welcome from Intern B - <YourName>");
```

Replace:

```java
        System.out.println("Extra operation result = not implemented yet");
```

With:

```java
        System.out.println("20 / 4 = " + calculator.divide(20, 4));
```

### Change 3 - `team.txt`

Replace:

```text
Owner: TBD
```

With:

```text
Owner: <YourName>
```

Replace:

```text
Current Feature Owner: nobody yet
```

With:

```text
Current Feature Owner: <YourName> - divide
```

### Commit message

```text
feat: add divide method and set owner name
```

---

## Intern C - Power

Branch:

```text
feature/<your-name>-power
```

### Change 1 - `src/main/java/com/training/Calculator.java`

Replace:

```java
    // TODO: add your operation here
```

With:

```java
    public int power(int base, int exponent) {
        
    }
```

### Change 2 - `src/main/java/com/training/App.java`

Replace:

```java
        System.out.println("Welcome to Git Training Lab");
```

With:

```java
        System.out.println("Welcome from Intern C - <YourName>");
```

Replace:

```java
        System.out.println("Extra operation result = not implemented yet");
```

With:

```java
        System.out.println("2 ^ 5 = " + calculator.power(2, 5));
```

### Change 3 - `team.txt`

Replace:

```text
Owner: TBD
```

With:

```text
Owner: <YourName>
```

Replace:

```text
Current Feature Owner: nobody yet
```

With:

```text
Current Feature Owner: <YourName> - power
```

### Commit message

```text
feat: add power method and set owner name
```

---

## Rules

1. Never push to `main`
2. Work only on your own branch
3. Replace the marked lines exactly
4. One Pull Request per intern
5. Do not merge your own Pull Request

---

## What happens next

All three of you changed the SAME lines in:

- `Calculator.java`
- `App.java`
- `team.txt`

So:

- First Pull Request merges cleanly
- Second and third Pull Requests will CONFLICT
- We will resolve the conflicts together
