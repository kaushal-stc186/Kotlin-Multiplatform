package my.kmp.app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform