package kt.js.compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.renderComposable

fun main() {
    console.log("Hello, KotlinJSCompose!")
    renderComposable(rootElementId = "root") {
        Screen()
    }
}

@Composable
private fun Screen() {
    var clicks by remember { mutableStateOf(0) }
    Div {
        Text("KotlinJSCompose")
        Button(
            attrs = {
                onClick {
                    clicks++
                }
            }
        ) {
            Text("click me")
        }
        Text("clicks: $clicks")
    }
}
