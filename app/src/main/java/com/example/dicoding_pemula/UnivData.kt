package com.example.dicoding_pemula

object UnivData {
    private val data = arrayOf(
        arrayOf(
            "Universitas Atma Jaya Yogyakarta",
            "",
            ""
        ),

        arrayOf(
            "Universitas Bina Nusantara",
            "",
            ""
        ),
        arrayOf(
            "Universitas Pelita Harapan",
            "",
            ""
        ),
        arrayOf(
            "Universitas Gunadarma",
            "",
            ""
        ),
        arrayOf(
            "Universitas Sanata Dharma",
            "",
            ""
        ),
        arrayOf(
            "Universitas Kristen Duta Wacana",
            "",
            ""
        ),
        arrayOf(
            "Universitas Trisakti",
            "",
            ""
        ),
        arrayOf(
            "Universitas Telkom",
            "",
            ""
        ),
        arrayOf(
            "Universitas Ma Chung",
            "",
            ""
        ),
        arrayOf(
            "Universitas Kristen Petra",
            "",
            ""
        )
    )

    val listData: ArrayList<Universitas>
    get() {
        val list = arrayListOf<Universitas>()
        for(aData in data) {
            val univ = Universitas()
            univ.name = aData[0]
            univ.details = aData[1]
            univ.photo = aData[2]

            list.add(univ)
        }
        return list
    }
}