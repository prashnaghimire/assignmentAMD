package np.edu.ismt.assignment_ad2024.dashboard

data class Product(
    var name: String,
    var price: String,
    var description: String,
    var image: String? = null,
    var category: String? = null,
    var storeLocationLast: String? = null,
    var storeLocationLng: String? = null,
    var markAsPurchased: Boolean = false
)
