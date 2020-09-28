package rest.core


class CommonError(
        var code: Int? = null,
        var message: String? = null,
        var description: String? = null,
        var uiMessage: String? = null,
        extra:Any? = null
)