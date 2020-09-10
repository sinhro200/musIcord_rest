package rest.core

open class CommonResponse<T>(
        var responseBody: T? = null,
        var error: CommonError? = null
) {

    companion object

    fun makeError(
            message: String,
            description: String? = null,
            uiMessage: String? = null
    ): CommonResponse<T> {
        this.error = CommonError(message, description,uiMessage)
        return this
    }

    fun makeSuccess(
            responseBody: T
    ): CommonResponse<T> {
        this.responseBody = responseBody
        return this
    }

    class CommonError(
            var message: String? = null,
            var description: String? = null,
            var UIMessage: String? = null
    )
}