fun main() {
        print("Введите последовательность символов: ")
        val name = readln()?.toCharArray()
    if(name == null) println("Введены некорректные данные")
        name?.let {
            var countName: String = ""
            var count: Int = 1;
            for (i in 0..name.size - 1) {
                count = 1
                if (((0 <= (i - 1)) && (name[i] != name[i - 1]))) {
                    for (d in i..name.size - 1) {
                        if ((name.lastIndex > d) && (name[i] == name[d + 1])) {
                            count++
                        } else {
                            continue
                        }
                    }
                }
                if (count > 1) {
                    countName += name[i] + "$count"
                }
            }
            println(countName)
        }
}