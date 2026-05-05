# 🚀 JetPackDemo — Jetpack Compose UI Components

A comprehensive Android demo project showcasing **Material 3 UI components** built with **Jetpack Compose**.  
Each component lives in its own dedicated file with detailed inline documentation.

---

## 📁 Project Structure

```
app/src/main/java/com/example/jetpackdemo/
│
├── TextDemo.kt                  → Text styles, sizes, decorations
├── ButtonDemo.kt                → Button, OutlinedButton, TextButton
├── ImageAndIconDemo.kt          → Image (drawable) + Material Icons
├── TextFieldDemo.kt             → TextField, OutlinedTextField, password toggle
├── SelectionControlsDemo.kt     → Checkbox (TriState), RadioButton, Switch
├── SliderAndProgressDemo.kt     → Slider, RangeSlider, Circular & Linear Progress
├── DividerSpacerDemo.kt         → HorizontalDivider, VerticalDivider, Spacer
├── CardSurfaceBoxDemo.kt        → Card, ElevatedCard, OutlinedCard, Surface, Box
├── ArrangementAlignmentDemo.kt  → Arrangement (SpaceBetween etc.) + Alignment
├── ChipDemo.kt                  → FilterChip, AssistChip, InputChip
└── FABAndIconButtonDemo.kt      → FAB variants, IconButton variants, IconToggleButton
```

---

## 🧩 Components Covered

### 📝 Text — `TextDemo.kt`
| Feature | Description |
|--------|-------------|
| `fontSize` | Size in `sp` units |
| `fontWeight` | Bold, Normal, Light |
| `fontStyle` | Italic / Normal |
| `color` | Any Color value |
| `textDecoration` | Underline, LineThrough |
| `textAlign` | Start, Center, End |
| `maxLines` | Truncate overflow |

---

### 🔘 Buttons — `ButtonDemo.kt`
| Composable | Use Case |
|-----------|----------|
| `Button` | Primary filled action |
| `OutlinedButton` | Secondary action with border |
| `TextButton` | Minimal/tertiary action |

---

### 🖼️ Image & Icon — `ImageAndIconDemo.kt`
| Feature | Description |
|--------|-------------|
| `Image` | Display drawable resources |
| `ContentScale` | Crop, Fit, FillBounds |
| `Icon` | Material vector icons |
| `tint` | Color overlay on icons |

---

### ✏️ TextField — `TextFieldDemo.kt`
| Composable | Style |
|-----------|-------|
| `TextField` | Filled (background tint) |
| `OutlinedTextField` | Border only |

Features: `label`, `placeholder`, `leadingIcon`, `trailingIcon`, `isError`,  
`supportingText`, `PasswordVisualTransformation`, `singleLine`, `maxLines`

---

### ☑️ Selection Controls — `SelectionControlsDemo.kt`
| Composable | Description |
|-----------|-------------|
| `Checkbox` | Binary checked state |
| `TriStateCheckbox` | Indeterminate parent-child state |
| `RadioButton` | Single selection from a group |
| `Switch` | On/off toggle for settings |

---

### 🎚️ Slider & Progress — `SliderAndProgressDemo.kt`
| Composable | Description |
|-----------|-------------|
| `Slider` | Continuous value selection |
| `RangeSlider` | Two-thumb range selection |
| `CircularProgressIndicator` | Spinning circle (determinate & indeterminate) |
| `LinearProgressIndicator` | Horizontal bar (determinate & indeterminate) |

---

### ─ Divider & Spacer — `DividerSpacerDemo.kt`
| Composable | Description |
|-----------|-------------|
| `HorizontalDivider` | Horizontal separator line |
| `VerticalDivider` | Vertical separator line inside Row |
| `Spacer` | Invisible gap between elements |

---

### 🃏 Card / Surface / Box — `CardSurfaceBoxDemo.kt`
| Composable | Description |
|-----------|-------------|
| `Card` | Elevated grouped content container |
| `ElevatedCard` | Higher shadow variant |
| `OutlinedCard` | Border-only card |
| `Surface` | Flexible background/shape container |
| `Box` | Stack/overlap children (like FrameLayout) |

---

### 📐 Arrangement & Alignment — `ArrangementAlignmentDemo.kt`
| Concept | Options |
|--------|---------|
| `Row` horizontal arrangement | SpaceBetween, SpaceAround, SpaceEvenly, Center, Start, End, spacedBy |
| `Row` vertical alignment | Top, CenterVertically, Bottom |
| `Column` horizontal alignment | Start, CenterHorizontally, End |
| `Box` content alignment | TopStart, Center, BottomEnd + 9 total options |

---

### 🏷️ Chips — `ChipDemo.kt`
| Composable | Use Case |
|-----------|----------|
| `FilterChip` | Toggleable filter selection (single or multi) |
| `AssistChip` | Suggested quick actions |
| `InputChip` | User-entered tags (dismissible) |

---

### ➕ FAB & Icon Buttons — `FABAndIconButtonDemo.kt`
| Composable | Description |
|-----------|-------------|
| `FloatingActionButton` | Standard 56dp FAB |
| `SmallFloatingActionButton` | Compact 40dp FAB |
| `LargeFloatingActionButton` | Large 96dp FAB |
| `ExtendedFloatingActionButton` | FAB with text label |
| `IconButton` | Ripple-only icon button |
| `FilledIconButton` | Colored background icon button |
| `FilledTonalIconButton` | Tonal background variant |
| `OutlinedIconButton` | Bordered icon button |
| `IconToggleButton` | Togglable icon (Like, Favorite) |
| `FilledIconToggleButton` | Filled toggle variant |
| `OutlinedIconToggleButton` | Outlined toggle variant |

---

## 🛠️ Tech Stack

| Technology | Version |
|-----------|---------|
| Language | Kotlin |
| UI Toolkit | Jetpack Compose |
| Design System | Material Design 3 |
| Min SDK | 24 |
| Target SDK | 35 |

---

## 🚀 Getting Started

### Prerequisites
- Android Studio Hedgehog or later
- JDK 17+
- Android device / emulator (API 24+)

### Clone & Run
```bash
git clone https://github.com/21Anuradha/JetPackDemo.git
cd JetPackDemo
```
Open in **Android Studio** → Click **Run ▶**

---

## 📖 How to Navigate the Demo

Each file is self-contained and can be called from your `MainActivity` or a `NavHost`:

```kotlin
// In MainActivity.kt or NavHost
when (screen) {
    "text"        -> TextDemo()
    "button"      -> ButtonDemo()
    "image"       -> ImageAndIconDemo()
    "textfield"   -> TextFieldDemo()
    "selection"   -> SelectionControlsDemo()
    "progress"    -> SliderAndProgressDemo()
    "divider"     -> DividerSpacerDemo()
    "card"        -> CardSurfaceBoxDemo()
    "arrangement" -> ArrangementAlignmentDemo()
    "chip"        -> ChipDemo()
    "fab"         -> FABAndIconButtonDemo()
}
```

---

## 📸 Preview

Each composable has an `@Preview` annotation so you can see it directly in Android Studio's  
**Design** panel without running the app.

---

## 🤝 Contributing

Pull requests are welcome! If you find a bug or want to add a new component demo,  
feel free to open an issue or submit a PR.

---

## 📄 License

```
MIT License — Free to use, modify, and distribute.
```

---

> Built with ❤️ using Jetpack Compose & Material 3
