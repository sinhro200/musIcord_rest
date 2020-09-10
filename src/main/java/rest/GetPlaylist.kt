package rest

import rest.model.SongInfo
import rest.model.UserInfo

class GetPlaylistReqData(
        var roomToken: String? = null,
        var fromTime: Long? = null
)

class GetPlaylistRespBody(
        var playlist: List<SongInfo>? = null,
        var updatedTimeTimestamp: Long? = null
)