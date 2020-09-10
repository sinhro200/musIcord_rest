package usage

import rest.auth.AuthResponse
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.node.ObjectNode
import rest.createRoom.CreateRoomResponse
import rest.register.RegistrationRequest
import rest.register.RegistrationResponse

class Main {
    private fun test() {
        val mapper = ObjectMapper()
        val on: ObjectNode = mapper.createObjectNode()

        val rr = RegistrationRequest()
        rr.data = RegistrationRequest.Data()
        rr.data?.login = "asd"

        val jsonNode: JsonNode = mapper.valueToTree(rr)

//        val rresp = RegistrationResponse().makeError()
//        on.set<>() .set("response", jsonNode)
        System.out.println(jsonNode)
    }

    fun test2() {
        val crr = CreateRoomResponse()
        val rr = RegistrationRequest()
        val ae = AuthResponse()
        ae.responseBody = AuthResponse.ResponseBody()
//        RegistrationRequest.Companion
        //        rr.sas();
//        crr.response = new CreateRoomResponse.Resp();
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            Main().test()
        }
    }
}