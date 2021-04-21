@file:Suppress("SpellCheckingInspection", "unused", "ClassName")

package dependencies

object libs {
    object retrofit {
        private const val version = "2.9.0"
        const val runtime = "com.squareup.retrofit2:retrofit:$version"
        const val gson = "com.squareup.retrofit2:converter-gson:$version"
        const val moshi = "com.squareup.retrofit2:converter-moshi:$version"
        const val rx_adapter = "com.squareup.retrofit2:adapter-rxjava3:$version"
    }
}
