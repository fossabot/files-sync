package name.denyago

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import name.denyago.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureRouting()
        configureSecurity()
        configureMonitoring()
        configureTemplating()
        configureSerialization()
    }.start(wait = true)
}
