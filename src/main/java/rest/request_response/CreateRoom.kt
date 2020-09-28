package rest.request_response

import rest.model.RoomInfo

class CreateRoomReqData(
    var title: String? = null
)

class CreateRoomRespBody(
    var roomInfo: RoomInfo? = null
)