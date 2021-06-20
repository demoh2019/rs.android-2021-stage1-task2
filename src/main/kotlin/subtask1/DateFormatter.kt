package subtask1

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*


class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        return try {
            val formatter = DateTimeFormatter.ofPattern("dd MMMM, EEEE",Locale("ru"))
            val date = LocalDate.of(year.toInt(), month.toInt(), day.toInt())
            date.format(formatter)
        }catch (e: Exception) {
            "Такого дня не существует"
        }

    }
}
