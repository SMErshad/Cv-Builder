package com.example.cvbuilderapplicationassignment6.data

data class Certification(
    val logo: String,
    val name: String
) {
    companion object {
        fun getCertificateList(): MutableList<Certification> {
            return mutableListOf(
                Certification(
                    "https://matheus.dev/wp-content/uploads/2016/09/Salesforce-Certified-Platform-Developer-I_RGB.png",
                    "Salesforce Platform Developer Certification"
                ),
                Certification(
                    "https://th.bing.com/th/id/OIP.ScyfANLrdfCFY8AQ9B-jQQHaEK?pid=ImgDet&rs=1",
                    "AWS Cloud Solution Architect"
                )
            )
        }
    }
}
