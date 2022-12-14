package subway.domain

import java.util.Collections


object LineRepository {
    private val lines: MutableList<Line> = ArrayList()
    fun lines(): List<Line> =
        Collections.unmodifiableList(lines)

    fun addLine(line: Line) {
        lines.add(line)
    }

    fun deleteLineByName(name: String): Boolean =
        lines.removeIf { line ->
            line.name.equals(name)
        }

    fun deleteAll() {
        lines.clear()
    }
}