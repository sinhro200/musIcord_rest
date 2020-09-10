package rest.core

open class CommonResponse<T>(
        var responseBody: T? = null,
        var error: CommonError? = null
){
    companion object{
        fun buildError(
                message: String,
                description: String? = null,
                uiMessage: String? = null,
                extra:Any? = null
        ): CommonResponse<Any> {
            return CommonResponse(error = CommonError(message, description,uiMessage,extra))
        }

        fun <T : Any>buildSuccess(
                responseBody:T
        ): CommonResponse<T> {
            val cr = CommonResponse(responseBody)
            cr.responseBody = responseBody
            return cr
        }
    }

    class CommonError(
            var message: String? = null,
            var description: String? = null,
            var UIMessage: String? = null,
            extra:Any? = null
    )
}