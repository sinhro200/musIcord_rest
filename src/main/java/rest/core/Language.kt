package rest.core

enum class Language {
    RU,
    EN;

    companion object{
        fun default(): Language {
            return Language.RU
        }
    }
}