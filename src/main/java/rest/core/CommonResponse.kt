package rest.core

open class CommonResponse<T>(
        var responseBody: T? = null,
        var error: CommonError? = null
) {
    companion object

    class CommonError(
            var message: String? = null,
            var description: String? = null,
            var UIMessage: String? = null
    )
}