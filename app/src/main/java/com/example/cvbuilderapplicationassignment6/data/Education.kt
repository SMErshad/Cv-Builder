package com.example.cvbuilderapplicationassignment6.data

data class Education(
    val collegeName: String,
    val program: String,
    val logo: String
) {

    companion object {
        fun getEducationList() : MutableList<Education> {
            return mutableListOf(
                Education(
                    "Maharishi International University",
                    "Master's in Computer Science",
                    "https://mma.prnewswire.com/media/1043641/Maharishi_International_University_Logo.jpg?p=facebook"
                ),
                Education(
                    "Asian University of Bangladesh",
                    "Bachelor's in Computer Science and Engineering",
                    "https://www.aub.edu.bd/frontend/img/logo-footer.png"
                )
            )
        }
    }
}
