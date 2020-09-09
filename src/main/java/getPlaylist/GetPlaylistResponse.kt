package getPlaylist

import core.CommonResponse
import model.SongInfo

class GetPlaylistResponse : CommonResponse<GetPlaylistResponse.Response?>() {
    class Response {
        private val playlist: List<SongInfo>? = null
        private val updatedTimeTimestamp: Long? = null
    }
}