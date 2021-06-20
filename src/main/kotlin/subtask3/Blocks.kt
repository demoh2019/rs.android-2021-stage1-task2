package subtask3

import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit
import kotlin.reflect.KClass

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        return when(blockB){
            Int::class -> {
                blockA.filterIsInstance<Int>().sum()
            }
            String::class -> {
                blockA.filterIsInstance<String>().joinToString("")
            }
            LocalDate::class -> {
                val formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy")
                val now = LocalDate.now()
                val beetwinDay = blockA.filterIsInstance<LocalDate>().minBy { it.until(now, ChronoUnit.DAYS) }
                beetwinDay!!.format(formatter)
            }
            else -> throw NotImplementedError("Not implemented")
        }
    }
}
