package eslam.emad.kotlinsealedclassesexample

object Util {

    fun takesBooleanReturnsResult(boolean: Boolean): Result<Any> {
        return if (boolean) {
            Result.Success("correct")
        } else {
            Result.Error("wrong")
        }
    }

    fun takesResultReturnsBoolean(result: Result<Any>): Boolean {
        return result is Result.Success
    }
}