package rest.enterRoom

import rest.core.CommonResponse
import rest.model.RoomInfo

class EnterRoomResponse : CommonResponse<EnterRoomResponse.ResponseBody>() {
    class ResponseBody(
            var roomInfo: RoomInfo? = null
    )
    companion object
}