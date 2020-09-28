package rest.core

import rest.ErrorCodes


class CommonError(
        var code: ErrorCodes? = null,
        var message: String? = null,
        var description: String? = null,
        extra:Any? = null
)