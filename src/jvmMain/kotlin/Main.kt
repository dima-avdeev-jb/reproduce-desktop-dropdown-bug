import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        Column {
            val expanded = remember { mutableStateOf(false) }
            Row(verticalAlignment = Alignment.CenterVertically, ) {
                Text("menu")
                IconButton(
                    onClick = { expanded.value = !expanded.value }
                ) {
                    Icon(
                        imageVector = when (expanded.value) {
                            true -> Icons.Default.Close
                            false -> Icons.Default.Settings
                        },
                        contentDescription = null
                    )
                }
            }
            DropdownMenu(
                expanded = expanded.value,
                onDismissRequest = { expanded.value = false }
            ) {
                DropdownMenuItem(onClick = {}) {
                    Text("content")
                }
            }
        }
    }
}
