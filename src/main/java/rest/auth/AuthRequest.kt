package rest.auth

import rest.core.CommonRequest

class AuthRequest : CommonRequest<AuthRequest.Data>() {
    class Data(
            var login: String? = null,
            var password: String? = null
    )
}