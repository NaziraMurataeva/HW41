package kg.tutorialapp.hw41

object Data {

    val items = listOf<Item>(
        Item(1, "Java", R.drawable.ic_baseline_favorite_24),
        Item(2, "Kotlin", R.drawable.ic_baseline_grade_24),
        Item(3, "Dart",R.drawable.ic_important_devices)
    )
    fun getlongListofItems() : MutableList<Any>{
        val list = mutableListOf<Any>()
        for (i in 0..100) {
            list.addAll(items)
            if (i % 3 == 0)
                list.add("https://www.coca-cola.ru")
        }
        return list
    }


}