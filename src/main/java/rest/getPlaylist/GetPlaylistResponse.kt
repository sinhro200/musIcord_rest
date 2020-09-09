package rest.getPlaylist

import rest.core.CommonResponse
import rest.model.SongInfo

class GetPlaylistResponse : CommonResponse<GetPlaylistResponse.ResponseBody>() {
    class ResponseBody(
            private val playlist: List<SongInfo>? = null,
            private val updatedTimeTimestamp: Long? = null
    )
}