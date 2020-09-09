package rest.createRoom

import rest.core.CommonResponse
import rest.model.RoomInfo

class CreateRoomResponse : CommonResponse<CreateRoomResponse.ResponseBody>() {
    class ResponseBody(
            var roomInfo: RoomInfo? = null
    )
    companion object
}