package eslam.emad.kotlinsealedclassesexample

sealed class Result<T>(
    val message: String? = null,
    val data: T? = null
) {
    class Success<T>(message: String? = null, data: T? = null) : Result<T>(message, data)
    class Loading<T>(message: String? = null, data: T? = null) : Result<T>(message, data)
    class Error<T>(message: String? = null, data: T? = null) : Result<T>(message, data)
}