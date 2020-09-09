package auth

import core.CommonRequest

class AuthRequest : CommonRequest<AuthRequest.Data?>() {
    class Data {
        var login: String? = null
        var password: String? = null
    }
}