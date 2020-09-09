package rest.register

import rest.core.CommonRequest

class RegistrationRequest : CommonRequest<RegistrationRequest.Data>() {
    class Data(
            var login: String? = null,
            private val password: String? = null,
            private val nickname: String? = null,
            private val email: String? = null
    )
    companion object
}