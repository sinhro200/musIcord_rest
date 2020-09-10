package rest.core

open class CommonRequest<T>(
        var data: T,
        var lang: Language = Language.RU
)