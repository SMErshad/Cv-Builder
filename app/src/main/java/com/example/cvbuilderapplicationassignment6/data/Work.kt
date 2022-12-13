package com.example.cvbuilderapplicationassignment6.data

data class Work(
    val companyName: String,
    val fromDate: String,
    val toDate: String,
    val location: String,
    val logo: String,
    val roles: String
) {
    companion object {
        fun getWorkList() : MutableList<Work> {
            return mutableListOf(
                Work(
                    "Spider Digital Securities",
                    "Jan 2019",
                    "December 2021",
                    "Dhaka, Bangladesh",
                    "https://i.pinimg.com/originals/7f/81/6b/7f816b63c6fcbfdcab6c52b8a079c040.png",
                    "AI Engineer for face identification project"
                ),
                Work(
                    "Smart Aspects",
                    "Feb 2015",
                    "Mar 2019",
                    "Dhaka, Bangladesh",
                    "https://scontent-ord5-2.xx.fbcdn.net/v/t39.30808-6/300781589_371560021821848_8628846474944480178_n.jpg?_nc_cat=105&ccb=1-7&_nc_sid=09cbfe&_nc_ohc=fc_A92MyinAAX-_Vwrs&tn=vuqywzIHUX55bfTJ&_nc_ht=scontent-ord5-2.xx&oh=00_AfAjY52zdqshh0utsYLCRSGvSj2XEyT90zD5oAG5DVor8w&oe=639A9B8B",
                    "ASP.net application development in C#"
                ),
                Work(
                    "IICT BUET",
                    "Jul 2008",
                    "December 2010",
                    "Dhaka, Bangladesh",
                    "https://iict.buet.ac.bd/wp-content/uploads/2022/03/IICT_2.png",
                    "System Engineer in Data Acquisition Project for Power Systems"
                ),
            )
        }
    }
}
