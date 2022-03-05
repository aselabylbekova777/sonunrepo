/*
Выполнить сортировку массива {10, 2, 10, 3, 1, 2, 5, 2,-1, 3}
методом Простейшей сортировки (Bubble Sort) и загрузить свой
проект в git(Дз отправляете как ссылку на свой репозиторий)
 */


fun main(){
    var muz = arrayOf(10, 2, 10, 3, 1, 2, 5, 2,-1, 3)
    println(muz.toList())

    var swap = true
    while (swap) {
        swap = false
        for (i in 1 until muz.size) {
            if (muz[i] < muz[i - 1]) {
                val temp = muz[i - 1]
                muz[i - 1] = muz[i]
                muz[i] = temp
                swap = true
            }
        }
    }
    println(muz.toList())
}









