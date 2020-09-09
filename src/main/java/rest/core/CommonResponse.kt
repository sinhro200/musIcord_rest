package rest.core

open class CommonResponse<T>(
        var error: String? = null,
        var errorDescription: String? = null,
        var response: T? = null
){
    companion object
}