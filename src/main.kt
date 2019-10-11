fun main() {
    val service = ServiceImpl()

    val data = Data("xxx")

    with(service) {
        data.save()
    }

    service.run {
        data.save()
    }
}

data class Data(val value: String)

interface Service {
    fun doId(): String

    fun Data.save()

    fun Data.compute(num: Int): Int
}

class ServiceImpl : Service {
    override fun doId(): String {
        TODO("not implemented")
    }

    override fun Data.compute(num: Int): Int {
        TODO("not implemented")
    }

    override fun Data.save() {
        TODO("not implemented")
    }
}
