package com.example.homework2

class ConvertNumberToNames {

    private val units = arrayOf(
        "ნული", "ერთი", "ორი", "სამი", "ოთხი",
        "ხუთი", "ექვსი", "შვიდი", "რვა", "ცხრა", "ათი", "თერთმეტი", "თორმეტი",
        "ცამეტი", "თოთხმეტი", "თხუთმეტი", "თექვსმეტი", "ჩვიდმეტი",
        "თვრამეტი", "ცხრამეტი"
    )

    private val tens = arrayOf(
        "",  // 0
        "",  // 1
        "ოცდა",  // 2
        "ოცდა",  // 3
        "ორმოცდა",  // 4
        "ორმოცდა",  // 5
        "სამოცდა",  // 6
        "სამოცდა",  // 7
        "ოთხმოცდა",  // 8
        "ოთხმოცდა" // 9
    )

    private val hundreds = arrayOf(
        "","ას", "ორას", "სამას", "ოთხას", "ხუთას", "ექვსას", "შვიდას", "რვაას", "ცხრაას"
    )

    fun convert(n: Int): String {
        if (n < 0) {
            return "მინუს " + convert(-n)
        }
        if (n < 20) {
            return units[n]
        }
        if (n < 100) {
            return tens[n / 10] + units[n % 20]
        }
        return if (n < 1000) {
            hundreds[n / 100] + convert(n % 100)
        }else{
            "არასწორი ციფრი!!!"
        }
    }
}