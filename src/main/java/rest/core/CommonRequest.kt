package rest.core

open class CommonRequest<T>(
        var data: T?=null,
        var lang: Language = Language.default()
)