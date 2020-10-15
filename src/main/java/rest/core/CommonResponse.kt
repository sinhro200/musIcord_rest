package rest.core

import rest.ErrorCodes

open class CommonResponse<T : Any>(
        var responseBody: T? = null,
        var error: CommonError? = null
){
    public companion object{
        fun buildError(
                code:ErrorCodes,
                message: String,
                description: String? = null,
                extra:Any? = null
        ): CommonResponse<Any> {
            return CommonResponse(error = CommonError(code,message, description,extra))
        }

        fun <T : Any>buildSuccess(
                responseBody:T
        ): CommonResponse<T> {
            val cr = CommonResponse(responseBody)
            cr.responseBody = responseBody
            return cr
        }
    }


}