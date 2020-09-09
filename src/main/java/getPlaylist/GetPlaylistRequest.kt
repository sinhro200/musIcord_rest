package getPlaylist

import core.CommonRequest

class GetPlaylistRequest : CommonRequest<GetPlaylistRequest.Data?>() {
    class Data(
            private val roomToken: String? = null,
            private val fromTime: Long? = null
    )
}