package rest.register

import rest.core.CommonRequest

class RegistrationRequest : CommonRequest<RegistrationRequest.Data>() {
    class Data(
            var login: String? = null,
            var password: String? = null,
            var nickname: String? = null,
            var email: String? = null
    )
    companion object
}