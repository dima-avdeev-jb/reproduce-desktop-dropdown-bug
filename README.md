## Reproduce bug https://github.com/JetBrains/compose-jb/issues/2586

Issue https://github.com/JetBrains/compose-jb/issues/2586

DropdownMenu(onDismiss={...}) should block another clicks while DropdownMenu is shown (like in Android)


https://user-images.githubusercontent.com/99798741/210183438-11cdb196-1015-458a-ad06-7f1167376252.mp4


```bash
./gradlew run
```

Check focusable and non focusable Popup's
Simplest fix - not send mouse up, if mouse down not appear.
