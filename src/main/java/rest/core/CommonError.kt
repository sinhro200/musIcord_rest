package rest.core

import rest.ErrorCodes


class CommonError(
        var code: ErrorCodes,
        var message: String? = null,
        var description: String? = null,
        extra:Any? = null
)