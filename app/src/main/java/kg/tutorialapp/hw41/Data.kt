package kg.tutorialapp.hw41

object Data {

    val items = listOf<Item>(
        Item(1, "Java", R.drawable.ic_baseline_favorite_24),
        Item(2, "Kotlin", R.drawable.ic_baseline_grade_24),
        Item(3, "Dart",R.drawable.ic_important_devices)
    )

    val itemDetails = listOf<ItemDetails>(
        ItemDetails(1, "Java", R.drawable.ic_baseline_favorite_24,"James Gosling", "Java is a class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible"),
        ItemDetails(2, "Kotlin", R.drawable.ic_baseline_grade_24,"Kotlin has great support and many contributors in its fast-growing global community", " Kotlin as a language for writing build scripts."),
        ItemDetails(3, "Dart",R.drawable.ic_important_devices,"Google", "Dart is a client-optimized programming language for apps on multiple platforms")
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