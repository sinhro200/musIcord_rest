package rest

import rest.model.SongInfo

class OrderSongFromLinkReqData(
        var roomToken: String? = null,
        var songLink: String? = null
)

class RespBody(
        var songInfo: SongInfo? = null
)