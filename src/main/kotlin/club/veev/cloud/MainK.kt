package club.veev.cloud

/**
 * Created by Veev on 2017/5/25
 */
object MainK {

    @JvmStatic fun main(args: Array<String>) {
        println("Hello Kotlin")

        val list = listOf(1, 2, 2, 3, 4, 6, 7, 8, 9)

        val isEven: (Int) -> Boolean = { it %2 == 0 }
        list.filter { it < 8 }.forEach { print(it %2 == 0) }
        println()
        println( list.any(isEven) )

        3.show()
    }

    fun Int . show() {
        println(this)
    }
}
