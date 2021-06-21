package subtask1

import java.text.DateFormat
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

class DateFormatter {
    fun toTextDay(day: String, month: String, year: String): String {
        val simpleDateFormatValidator = SimpleDateFormat("dd.MM.yyyy", Locale("ru"))
        val simpleDateFormatResult = SimpleDateFormat("dd MMMM, EEEE", Locale("ru"))
        val dateResult: Date

        simpleDateFormatValidator.isLenient = false
        try {
            dateResult = simpleDateFormatValidator.parse("${day.toString()}.${month.toString()}.${year.toString()}")
        } catch ( e: ParseException ) {
            return "Такого дня не существует"
        }
        return simpleDateFormatResult.format(dateResult)
    }
}

fun main(args: Array<String>) {
    val date = Date()
    val calendar = Calendar.getInstance()

    calendar.time = date
    val dateFormat = DateFormat.getDateInstance(DateFormat.SHORT)

    val simpleDateFormat = SimpleDateFormat("dd/MM/yyyy")

    val newDate = simpleDateFormat.parse("05/12/1985")
    println(newDate)
}